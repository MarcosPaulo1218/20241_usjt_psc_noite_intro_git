/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;
import io.github.cdimascio.dotenv.Dotenv;

public class ConnectionFactory {
    // Método para criar a conexão
    public Connection conectar() throws Exception {
        // Carrega as variáveis de ambiente do arquivo .env
        Dotenv dotenv = Dotenv.load();

        // Recupera as variáveis de ambiente do arquivo .env
        String host = dotenv.get("HOST");
        String port = dotenv.get("PORT");
        String user = dotenv.get("USER");
        String password = dotenv.get("PASSWORD");
        String database = dotenv.get("DATABASE");

        // Monta a string de conexão
        String stringConexao = String.format(
            "jdbc:postgresql://%s:%s/%s",
            host, port, database
        );

        // Retorna a conexão
        return DriverManager.getConnection(stringConexao, user, password);
    }
}