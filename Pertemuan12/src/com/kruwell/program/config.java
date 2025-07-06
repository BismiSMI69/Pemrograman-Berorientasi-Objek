package com.kruwell.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bismi
 */

public class config {
    private static Connection mysqlconfig;

    public static Connection configDB() throws SQLException {
        if (mysqlconfig == null || mysqlconfig.isClosed()) {
            try {
                // Load driver MySQL versi 8 ke atas (termasuk 9.3.0)
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // URL koneksi + timezone
                String url = "jdbc:mysql://localhost:3306/latihanjavadatabase?serverTimezone=UTC";
                String user = "root";
                String pass = ""; // Kosong sesuai default XAMPP
                
                mysqlconfig = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi berhasil.");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("Koneksi Gagal: " + e.getMessage());
            }
        }
        return mysqlconfig;
    }
}
