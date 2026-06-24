
package rmi_string_op_gui;

import javax.swing.*;

import javax.swing.*;   // JFrame, JButton, JLabel, JOptionPane
import java.awt.event.*; // ActionListener, ActionEvent 
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

//import java.util.Scanner;


public class rmiClient implements ActionListener {
    
    JFrame frame;
    JButton btnLower;
    JButton btnUpper;
    JButton btnPalindrome;
    
    JLabel resultLower;
    JLabel resultUpper;
    JLabel resultPalindrome;
    
    RemoteMethods stub;
    
    // constructor
    rmiClient() throws Exception {
        // Connect to RMI registry 
        Registry rg = LocateRegistry.getRegistry("localhost", 8009);
        
        // lookup the remote method (casting to get only remote method)
       // RemoteMethods stub = (RemoteMethods) rg.lookup("skeleton");   // Wrong - local variable shadows instance variable
        
        // asign to instance variable 
        stub = (RemoteMethods) rg.lookup("skeleton");

        
        // Frame setup 
        frame = new JFrame();
        frame.setTitle("RMI Example");
        frame.setSize(500,300);
        frame.setLayout(null);
        
        // To Lowercase Button 
        btnLower = new JButton("To Lowercase");
        btnLower.setBounds(20,40,160,30);
        frame.add(btnLower);
        btnLower.addActionListener(this);
        
        // Result label for Lowercase(hidden initally)
        resultLower = new JLabel();
        resultLower.setBounds(200,40,260,30);
        resultLower.setVisible(false);
        frame.add(resultLower);
        
        // To Uppercase Button 
        btnUpper = new JButton("To Uppercase");
        btnUpper.setBounds(20,100,160,30);
        frame.add(btnUpper);
        btnUpper.addActionListener(this);
        
        // Result label for Uppercase(hidden initally only happens after event occurs ) 
        resultUpper = new JLabel();
        resultUpper.setBounds(200,100,260,30);
        resultUpper.setVisible(false);
        frame.add(resultUpper);
        
        // Check Palindrome Buton 
        btnPalindrome = new JButton("Check Palindrome");
        btnPalindrome.setBounds(20, 160, 160, 30);
        frame.add(btnPalindrome);
        btnPalindrome.addActionListener(this);
        
        // Result label for Palindrome 
        resultPalindrome = new JLabel();
        resultPalindrome.setBounds(200,160, 260, 30);
        resultPalindrome.setVisible(false);
        frame.add(resultPalindrome);
        
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        // For lowerCase 
        if(ae.getSource() == btnLower){
            String input = JOptionPane.showInputDialog(frame,
                    "Enter string to convert to Lowercase:", 
                    "To Lowercase", 
                    JOptionPane.PLAIN_MESSAGE
                    );
            
            if(input != null){
                try{
                    String result = stub.toLower(input);
                    resultLower.setText(result);
                    resultLower.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            } // end of if of stub from cleint 
                    
        } // end of if of first btn 
        
        
        
        // For upperCase
        if(ae.getSource() == btnUpper){
            String input = JOptionPane.showInputDialog(frame,
                    "Enter String to convert to Uppercase:",
                    "To Uppercase",
                    JOptionPane.PLAIN_MESSAGE
                    );
            
            if(input!=null){
                try{
                    String result = stub.toUpper(input);
                    resultUpper.setText(result);
                    resultUpper.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            } // end of if 
            
        } // end of if 
        
        
        
        // For Palindrome 
        if(ae.getSource() == btnPalindrome){
            String input = JOptionPane.showInputDialog(frame,
                    "Enter string to Check Palindrome:",
                    "Check Palindrome",
                    JOptionPane.PLAIN_MESSAGE
                    );
            
            if(input!=null){
                try{
                    String result = stub.toPalindrome(input);
                    resultPalindrome.setText(result);
                    resultPalindrome.setVisible(true);
                } catch(Exception e){
                    e.printStackTrace();
                }
            } // end of if 
        } // end of if 
        
          
    } // End of actionPerformed method 
    

    // since getRegistry and lookup throw checked exceptions, constructor needs throws Exception
    public static void main(String[] args) throws Exception{
        new rmiClient() ;
    }
}