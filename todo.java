package gui_swing;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrintMessage implements ActionListener{
    JFrame frame; // instance crated of JFrame Class 
    JButton click_btn1;
    JButton click_btn2;
    JButton click_btn3;
    // text field j level 
    JLabel lbl1;
    // for input j textfield 
    JTextField first_txt;

    
    // Constructor 
    PrintMessage(){
        frame = new JFrame();
        frame.setTitle("First Gui Application");
        frame.setSize(600,600);
        frame.setLayout(null);
        
        // Red Button 1 
        click_btn1 = new JButton("Red Button");
        click_btn1.setBounds(20,40,180,25);
        frame.add(click_btn1);
        click_btn1.addActionListener(this); // implemnets actionlistener
//        frame.setVisible(true);
        
        // Blue Button 1 
        click_btn2 = new JButton("Blue Button");
        click_btn2.setBounds(300,40,180,25);
        frame.add(click_btn2);
        click_btn2.addActionListener(this); // implemnets actionlistener
//        frame.setVisible(true);
        
        // Reset Button  
        click_btn3 = new JButton("Reset Button");
        click_btn3.setBounds(200,100,180,25);
        frame.add(click_btn3);
        click_btn3.addActionListener(this); // implemnets actionlistener
//        frame.setVisible(true);
        


        // text field bata input number line 
        first_txt = new JTextField();
        first_txt.setBounds(200,200,180,25);
        frame.add(first_txt); // level vanda mathi textfield 
        
        lbl1 = new JLabel("First Number");
        lbl1.setBounds(100,200,180,25);
        frame.add(lbl1);
        
        // action listener to textField
        first_txt.addActionListener(this); 
        
        frame.setVisible(true);
    } // end of constructor 
    
    @Override
    // Handler method - execution of event 
    public void actionPerformed(ActionEvent ae){
//        System.out.println("I am clicked");
//        
//           if(ae.getSource() == click_btn1){
//               click_btn2.setBackground(Color.BLUE);
//               System.out.println("First Button clicked");
//           }
//           if(ae.getSource() == click_btn2){
//               click_btn1.setBackground(Color.RED);
//               System.out.println("Second Button clicked");
//           }
//           if(ae.getSource() == click_btn3){
//               click_btn1.setBackground(null);
//               click_btn2.setBackground(null);
//               System.out.println("Reset Button clicked");
//           }
//           
           // number lai parse int garne 
            String n1 = first_txt.getText();
            int oddEven = Integer.parseInt(n1);
            
            boolean isEven = (oddEven % 2 == 0);
            
            // for red button 
             if (ae.getSource() == click_btn1) {
                if (!isEven) {
                    first_txt.setText("Correct! Your number is odd.");
                } else {
                    first_txt.setText("Wrong! Click on Blue button.");
                }
            }
             
             // for blue button 
              if (ae.getSource() == click_btn2) {
                if (!isEven) {
                    first_txt.setText("Correct! Your number is even.");
                } else {
                    first_txt.setText("Wrong! Click on Red button.");
                }
            }
            
            
            // if oddEven = 2(even) 3(odd) eg. 
            // if clicked on red btn - Your number is odd (if not click on blue ) 
            // if clicked on blue btn - Your number is eeven(if not click on red)
            // jlabel lai chai update garne 
            
            
           
           
    } // end of actionPerformed 
    
    public static void main(String[] args){
        new PrintMessage();
    }
}
