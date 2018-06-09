package pessoas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe"
        try {
            Connection con = DriverManager.getConnection(url, "root", "123456");
            return con;
            // Para PostgreSQL: jdbc:postgresql://servidor:porta/nome_dp_banco
            // Para SQLServer: jdbc:sqlserver://servidor:porta;database
            // Para MySQL: jdbc:mysql://localhost:3306/nome_do_banco
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
