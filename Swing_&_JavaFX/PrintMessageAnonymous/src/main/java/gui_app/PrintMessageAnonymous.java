// Event Handling - Anonymous Class Implementation or Inside class Anonymously
package gui_app;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrintMessageAnonymous{
    JFrame frame; // JFrame(class) frame(object or instance) 
    JButton click_btn;
    
    // Constructor 
    PrintMessageAnonymous(){
        frame = new JFrame();
        frame.setTitle("Just Click Me");
        frame.setSize(400,400);
        frame.setLayout(null);
        
        click_btn = new JButton("Click Me");
        click_btn.setBounds(20,40,180,25);
        frame.add(click_btn);
        click_btn.addActionListener(new ActionListener(){
                @Override
                // handler method - execution of event 
                public void actionPerformed(ActionEvent ae){
                    System.out.println("I am clicked");
                } // end of action performed 
                
        });
        frame.setVisible(true);
    } // end of constructor 
    
    
    public static void main(String[] args){
        new PrintMessageAnonymous();
    }
    
}