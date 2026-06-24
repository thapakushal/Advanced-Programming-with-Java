package gui_app;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Handler implements ActionListener{
    // 1. Fixed: Store the reference passed into the constructor
    PrintMessageOutsideClass mainApp;
    // 2. Fixed: Constructor must be public to be accessed properly if needed
    
    // Handler constructor accepts PrintMessageOutsideClass pm as a parameter
    public Handler(PrintMessageOutsideClass pm){
        this.mainApp = pm; // // Now We can actually keep a reference to the GUI!
    }
    @Override
    // Handler method - executes 
    public void actionPerformed(ActionEvent ae){
        System.out.println("I am clicked");
    }

}