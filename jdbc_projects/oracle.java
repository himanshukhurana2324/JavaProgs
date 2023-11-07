import java.sql.*;

class oracle {
    public static void main(String args[]) {
        try {
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@InspireMate-HK:1521:XE", "system", "123456");

            // step3 create the statement object
            Statement stmt = con.createStatement();

            // step4 execute query
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next())
                System.out.println(rs.getString(1) + "  " + rs.getInt(2));

            // step5 close the connection object
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}