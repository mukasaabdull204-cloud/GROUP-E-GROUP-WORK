/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ourfirstbankuganda;


/**
 *
 * @author NORMZ
 */


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        try {

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            String url =
                "jdbc:ucanaccess://D:/EL-Tx/FirstBankUganda.accdb";

            return DriverManager.getConnection(url);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
    

