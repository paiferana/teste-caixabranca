package login;

import java.sql.Connection; //(1)
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class user {
    public Connection conectarBD() {  // (2) Início do método conectarBD
        Connection conn = null;  // (3)
        try {
            Class.forName("com.mysql.Driver.Manager").newInstance();  // (4)
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";  // (5)
            conn = DriverManager.getConnection(url);  // (6)
        } catch (Exception e) { }  // (7)
        return conn;  // (8)
    }

    public String nome = "";  // (9)
    public boolean result = false;  // (10)

    public boolean verificarUsuario(String login, String senha) {  // (11) Início do método verificarUsuario
        String sql = "";  // (12)
        Connection conn = conectarBD();  // (13)
        sql += "select nome from usuarios ";  // (14)
        sql += "where login = '" + login + "'";  // (15)
        sql += " and senha = '" + senha + "';";  // (16)
        try {
            Statement st = conn.createStatement();  // (17)
            ResultSet rs = st.executeQuery(sql);  // (18)
            if (rs.next()) {  // (19)
                result = true;  // (20)
                nome = rs.getString("nome");  // (21)
            }
        } catch (Exception e) { }  // (22)
        return result;  // (23)
    }
}
//fim da classe
    

