/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * ClickSystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class login {
     boolean exit=false;
 //display welcome message
      JOptionPane.showMessageDialog(null, "welcome to easyKanBan" );
      Scanner scanner= new Scanner(System.in);
 int choice = 0;
 while(true){
     //prompt user to choose an option
     switch(choice) {
         case 1:
             
      JOptionPane.showMessageDialog(null, "please choose an option:" );
      JOptionPane.showInputDialog("1.add task , 2.show report, 3.quit"); 
  
      JOptionPane.showMessageDialog(null, "add task" );
      JOptionPane.showInputDialog("how many tasks do u wanna add"); 
      JOptionPane.showInputDialog("enter task name");
      JOptionPane.showInputDialog("enter description the the task");
      JOptionPane.showInputDialog("enter developers details");
      JOptionPane.showInputDialog("enter duration");
      JOptionPane.showInputDialog("enter the ID for the task");
      JOptionPane.showInputDialog("enter the status of the task", "ToDo,Done,Doing");
          
     if (input==null)
     
          JOptionPane.showMessageDialog(null, "exiting");
          break;
         case 2:
          JOptionPane.showInputDialog("show report"); 
          JOptionPane.showMessageDialog(null, "coming soon" );
          break;
          case 3:
          JOptionPane.showInputDialog("Thank you,Bye"); 
          break;
      
      }

}
}


    
 


    

