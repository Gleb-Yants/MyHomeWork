package task_1;

import java.sql.*;

/**
 * Created by Gleb_Yants on 09.07.2016.
 */
public class MyJDBC {
    private static Connection con = null;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestSQL", "root", "servitut411");
            //addRecord("Гена", "Феоктистов");
            refresh2Records("Чичикова", "Белов");
            //deleteTable();
            //System.out.println(getRecord("Феоктистов"));
            showAllRecords();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
            }

        }
    }

    public static void addRecord(String name, String surname) {
        try {
            String sql = "INSERT INTO students(firstName, surName) VALUES(?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);

            ps.setString(2, surname);

            ps.executeUpdate();

        } catch (SQLException e) {
        }
    }

    public static void showAllRecords() throws SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(
                    "SELECT firstName, surName FROM students ");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public static String getRecord(String surname) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("SELECT firstName FROM students WHERE surName = ?");
        stmt.setString(1, surname);
        ResultSet rs = stmt.executeQuery();
        String name = null;
        if (rs.next()) {
            name = rs.getString(1);
        }
        rs.close();
        stmt.close();
        return name;
    }

    public static void deleteTable() throws SQLException {
        Statement st = con.createStatement();
        st.executeUpdate("DROP TABLE students");
        System.out.println("Table Deletion process is completly successfully!");
    }

    public static void refresh2Records(String surname1, String surname2) throws SQLException {
        //spherical horse in vacuum
        PreparedStatement stmt = con.prepareStatement("UPDATE students SET firstName=? WHERE surName = ? OR surName=?");
        stmt.setString(1, "NoName");
        stmt.setString(2, surname1);
        stmt.setString(3, surname2);
        stmt.execute();
        stmt.close();
    }
}


