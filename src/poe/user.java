/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;

import javax.swing.JOptionPane;


/**
 *
 * @author RC_Student_lab
 */
public class user {

    public user(String username1, String password1, String firstname1, String lastname1) {
    }
    
//username contains underscore and is not more than five charecters long
String firstname,lastname,username,password;
    boolean registered,loginvalid;
    private boolean usernameValid;

    user() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public boolean checkusername (String username) {
        return username.contains("_") &&username.length()<=5;
      Username=JOptionPane.showInputDialog("enter username");
   if(checkusername(username)){
            usernameValid=true;
        }else{
      JOptionPane.showMessageDialog(null, "username is invalid");
      String inputname =JOptionPane.showInputDialog("enter username");
    JOptionPane.showMessageDialog(null,"welcome user, enter username:"+inputname);
    
        
      //password must contain atleast 8 charecters ,a capital letter, a number and a spesial letter
      
     password  =([0-9],[A-Z],[%$#@^&*]);
     if (password.matches(password )) {
     System.out.println("password captured successfully");
     return true;
   }else{
         System.out.println("password is not correctly formulated, please double check your password");
         return false;
         
     }
   
              
             }
    }
}
  
          
          
        
       
             
    
            
    
    
