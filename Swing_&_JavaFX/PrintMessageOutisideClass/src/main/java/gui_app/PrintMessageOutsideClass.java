// Event Handling - Outside class (event listner and handler method) 
package gui_app;
import javax.swing.JFrame;
import javax.swing.JButton;


public class PrintMessageOutsideClass{
    JFrame frame;
    JButton click_btn;
    // constructor y 
   PrintMessageOutsideClass(){
        frame = new JFrame();
        frame.setTitle("Just Click Me");
        frame.setSize(400,400);
        frame.setLayout(null);
        
        click_btn = new JButton("Click Me");
        click_btn.setBounds(20,40,180,20);
        frame.add(click_btn);
        
        Handler handler = new Handler(this);
        click_btn.addActionListener(handler);
        frame.setVisible(true);
    }    
    
    
    public static void main(String[] args){
        new PrintMessageOutsideClass(); // Initialize Constructor 
    }
        
}    
