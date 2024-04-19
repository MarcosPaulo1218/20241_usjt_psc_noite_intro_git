-- Active: 1712273957933@@pg-33ad0904-professorbossini.a.aivencloud.com@12956@defaultdb@public

CREATE TABLE Blue_World(
  cod_usuario SERIAL PRIMARY KEY,
  login VARCHAR(200) NOT NULL,
  senha VARCHAR(200) NOT NULL
);
--cadastrar um usuário
INSERT INTO Blue_World
(login, senha) VALUES
('comum', 'comum');

SELECT  *
FROM Blue_World;

UPDATE Blue_World SET
login='Admin',senha='Admin'
WHERE cod_usuario = 1;

DELETE FROM Blue_World
WHERE cod_usuario = 2;

UPDATE Blue_World SET
senha='' WHERE cod_usuario = 1;