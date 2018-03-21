/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc_lab06_task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ABC
 */
public class Student {
    Connection con;
    public Student()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/universitysc", "root", "deutrium2");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void selectAll()
    {
        try
        {
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM student");
        
        while (rs.next()){
   
            // Correct!
            String id = rs.getString(1);
            String regNo = rs.getString(2);
            String name = rs.getString(3);
            String classes =rs.getString(4);
            String section = rs.getString(5);
            String content = rs.getString(6);
            String address = rs.getString(7);
           
            System.out.println("Id: " + id+"\nReg No: "+regNo + "\nName: " + name + "\nClass : " + classes +"\nSection: "+section+"\nContent: "+content+"\nAddress: "+address+ "\n");
         }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void select(String r)
    {
        try
        {
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM student where RegNo=" + r);
        
        while (rs.next()){
   
            // Correct!
            String id = rs.getString(1);
            String regNo = rs.getString(2);
            String name = rs.getString(3);
            String classes =rs.getString(4);
            String section = rs.getString(5);
            String content = rs.getString(6);
            String address = rs.getString(7);
           
            System.out.println("Id: " + id+"\nReg No: "+regNo + "\nName: " + name + "\nClass : " + classes +"\nSection: "+section+"\nContent: "+content+"\nAddress: "+address+ "\n");
         }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
     public void delete(String r)
    {
        try
        {
        Statement statement = con.createStatement();
        statement.executeUpdate("DELETE FROM student where RegNo=" + r);
        /*
        while (rs.next()){
   
            // Correct!
            String id = rs.getString(1);
            String regNo = rs.getString(2);
            String name = rs.getString(3);
            String classes =rs.getString(4);
            String section = rs.getString(5);
            String content = rs.getString(6);
            String address = rs.getString(7);
           
            System.out.println("Id: " + id+"\nReg No: "+regNo + "\nName: " + name + "\nClass : " + classes +"\nSection: "+section+"\nContent: "+content+"\nAddress: "+address+ "\n");
         }*/
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
}
