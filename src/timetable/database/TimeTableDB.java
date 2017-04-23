/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author RK
 */
public class TimeTableDB {
    private Connection conn = null;
    private Statement sttm = null;
    public void createDB(){
        try {
            conn = DriverManager.getConnection("jdbc:derby:timeTableDB;create=true");
             System.out.println("Connected to database");
        } catch (SQLException ex) {
            Logger.getLogger(TimeTableDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: "+ex.getErrorCode());
        }
    
    }
    
}
