// Event Handling inside Class or Class Level Implementation
package gui_app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdditionGuiProjectA extends JFrame implements ActionListener{
    JLabel first_lbl, second_lbl, result_lbl;
    JTextField first_txt,second_txt,result_txt;
    JButton add_btn;
    // constructor - same name as class
    AdditionGuiProjectA(){
        setTitle("Addition App");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        first_lbl = new JLabel("First Number");
        first_lbl.setBounds(20,20,200,30);
        add(first_lbl);
        first_txt = new JTextField();
        first_txt.setBounds(20,70,200,30);
        add(first_txt);
        
        second_lbl = new JLabel("Second Number");
        second_lbl.setBounds(20,120,200,30);
        add(second_lbl);
        second_txt = new JTextField();
        second_txt.setBounds(20,170,200,30);
        add(second_txt);
        
        result_lbl = new JLabel("Result");
        result_lbl.setBounds(20,220,200,30);
        add(result_lbl);
        result_txt = new JTextField();
        result_txt.setBounds(20,270,200,30);
        add(result_txt);
        
        add_btn = new JButton("Addition");
        add_btn.setBounds(20,320,200,30);
        add(add_btn);
        add_btn.addActionListener(this); // button - generates event 
        
        setLayout(null);
        setVisible(true);
    }
    @Override
    // handler method or event handler or call back
    public void actionPerformed(ActionEvent ae){
        // System.out.println("Clicked...");
        String n1 = first_txt.getText();
        String n2 = second_txt.getText();
        
        // System.out.println("First number: "+n1);
        // System.out.println("Second number: "+n2);
        int sum = Integer.parseInt(n1) + Integer.parseInt(n2);
        // System.out.println("Sum: " + sum);
        result_txt.setText(String.valueOf(sum));
        
    }
    public static void main(String[] args){
        new AdditionGuiProjectA();
    }

}