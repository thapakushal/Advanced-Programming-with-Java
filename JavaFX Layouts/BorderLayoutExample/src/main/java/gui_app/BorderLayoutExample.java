// Implementation of Border Layout 
// Multiple Event Handling 

package gui_app;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BorderLayoutExample implements ActionListener{
    // instance 
    JButton btn1,btn2,btn3,btn4,btn5;
    JFrame frame;
    
    // Constructor - Only one type in Border Layout 
    BorderLayoutExample(){
        frame = new JFrame();
        frame.setTitle("Borderlayout Example ");
        frame.setSize(400,400);
        frame.setLayout(new BorderLayout());
        
        btn1 = new JButton("NORTH Button");
        frame.add(btn1,BorderLayout.NORTH);
        
        btn2 = new JButton("SOUTH Button");
        frame.add(btn2,BorderLayout.SOUTH);
        
        btn3 = new JButton("EAST Button");
        frame.add(btn3,BorderLayout.EAST);
        
        btn4 = new JButton("West Button");
        frame.add(btn4,BorderLayout.WEST);
        
        btn5 = new JButton("Center Button");
        frame.add(btn5,BorderLayout.CENTER);
        
        // Event generate
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this); 
       // Tells your button that this specific class wants to be notificed when the button is clicked 
        
        
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){ // When btn clicked Java AWT/Swing framework 
        if(ae.getSource().equals(btn1)){         // detect the click and automaticaly create an ActionEvent obj.
            System.out.println("North Btn Clicked..");
        }
        if(ae.getSource()==(btn2)){ // ae.getSource() - Find the exact button clicked 
            System.out.println("South btn Clicked..");
        }
        if(ae.getSource()==(btn3)){
            System.out.println("East btn Clicked..");
        }
        if(ae.getSource()==(btn4)){ 
            System.out.println("West btn Clicked..");
        }
        if(ae.getSource()==(btn5)){
            System.out.println("Center btn Clicked..");
        }
        
    }
            

    public static void main(String[] args){
        new BorderLayoutExample();
        
    }
} // End of class 