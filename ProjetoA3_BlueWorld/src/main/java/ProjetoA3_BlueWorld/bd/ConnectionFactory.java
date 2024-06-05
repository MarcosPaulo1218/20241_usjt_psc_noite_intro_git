/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author saulo
 */
package ProjetoA3_BlueWorld.bd;
import java.sql.Connection;
import java.sql.DriverManager;
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.SQLException;

public class ConnectionFactory {
    // Método para criar a conexão
    public Connection conectar() throws SQLException {
        // Carregando as variáveis de ambiente do arquivo .env
        Dotenv dotenv = Dotenv.load();

        // Buscando as variáveis de ambiente do arquivo .env
        String host = dotenv.get("HOST");
        String port = dotenv.get("PORT");
        String user = dotenv.get("USER");
        String password = dotenv.get("PASSWORD");
        String database = dotenv.get("DATABASE");

        // Montando a string de conexão
        String stringConexao = String.format(
            "jdbc:postgresql://%s:%s/%s",
            host, port, database
        );

        // Registrando o driver JDBC do PostgreSQL
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC do PostgreSQL não encontrado.", e);
        }

        // Retornando a conexão
        return DriverManager.getConnection(stringConexao, user, password);
    }
}