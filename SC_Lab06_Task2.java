/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc_lab06_task2;
import java.util.Scanner;
/**
 *
 * @author ABC
 */
public class SC_Lab06_Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String regNo;
        Student s = new Student();
        s.selectAll();
        
         System.out.println("Enter Registration Number of student to select:");
         regNo = input.nextLine();
         s.select(regNo);
         
         System.out.println("Enter Registration Number of student to delete:");
         regNo = input.nextLine();
         s.delete(regNo);
         
         s.selectAll();
         
         
        
    }
    
}
