package src.login;

// Importa as bibliotecas necessárias para trabalhar com conexões e consultas ao banco de dados
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe User
 * 
 * Responsável por realizar a conexão com o banco de dados e validar credenciais de login.
 */

public class user {
    /**
     * Método conectarBD
     * 
     * Estabelece a conexão com o banco de dados MySQL.
     * 
     * @return Connection Retorna o objeto de conexão com o banco de dados.
     */
    public Connection conectarBD() {
        Connection conn = null; // Declaração inicial da conexão
        try {
            // Carrega o driver JDBC para o MySQL
            Class.forName("com.mysql.Driver.Manager").newInstance();
            
            // URL de conexão ao banco
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";

            // Estabelece a conexão
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Tratamento de exceção caso ocorra erro na conexão
        }
        return conn;
    }

    // Variável para armazenar o nome do usuário
    public String nome = "";

    // Variável para indicar se o login foi bem-sucedido ou não
    public boolean result = false;

    /**
     * Método verificarUsuario
     * 
     * Realiza a validação de login e senha de um usuário.
     * 
     * @param login Nome de login do usuário.
     * @param senha Senha do usuário.
     * @return boolean Retorna true se o login for válido, caso contrário, false.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = ""; // Variável para armazenar a instrução SQL
        Connection conn = conectarBD(); // Estabelece a conexão com o banco de dados

        // Construção da instrução SQL
        sql = "select nome from usuarios ";
        sql += "where login = '" + login + "'";
        sql += " and senha = '" + senha + "';";

        try {
            // Criação do objeto Statement
            Statement st = conn.createStatement();

            // Execução da consulta SQL
            ResultSet rs = st.executeQuery(sql);

            // Verifica se o usuário existe
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            // Tratamento de exceções durante a execução da consulta
        }
        return result;
    }
}

