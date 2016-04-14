/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;
import java.util.*;
import java.awt.*;
import java.io.*;
/**
 *
 * @author cistudent
 */
public class Password {

    public static String username;
    public static String password;
    /*
    public String getUsername()
    {
        return this.user.getText();
    }
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        //System.out.println("Create a username and password.");
        //System.out.println("Enter a username: ");
        //username = scan.nextLine();
        //System.out.println("Enter a password(Be sure password is 8 characters and has digits or symbols: ");
        //password = scan.nextLine();
        
        //System.out.println("\nusername = "+username+"\npassword = "+password);
      
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    
}
