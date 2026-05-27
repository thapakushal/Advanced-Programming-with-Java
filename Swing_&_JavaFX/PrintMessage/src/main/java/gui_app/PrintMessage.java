// Event Handling inside or Class Level Implementation
package gui_app;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrintMessage implements ActionListener{
    JFrame frame; // JFrame(class) frame(object or instance) 
    JButton click_btn;
    
    // Constructor 
    PrintMessage(){
        frame = new JFrame();
        frame.setTitle("Just Click Me");
        frame.setSize(400,400);
        frame.setLayout(null);
        
        click_btn = new JButton("Click Me");
        click_btn.setBounds(20,40,180,25);
        frame.add(click_btn);
        click_btn.addActionListener(this); // this - implements ActionListener(class) has this into addActionListener()
        frame.setVisible(true);
    } // end of constructor 
    
    @Override
    // Handler method - execution of event 
    public void actionPerformed(ActionEvent ae){ // ActionEvent-event type
        System.out.println("I am clicked");
    } // end of actionPerformed 
    
    public static void main(String[] args){
        new PrintMessage();
    }
    
}