package gui_app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Image Handling
import java.awt.Color;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.*;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;

public class AdditionGuiApp extends JFrame implements ActionListener {
    
    JLabel first_lbl, second_lbl, result_lbl;
    JLabel img_drop_lbl; 
    JTextField first_txt, second_txt, result_txt;
    JButton add_btn;


    public AdditionGuiApp() {
        setTitle("Addition App");

        setSize(550, 450); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 
        
        first_lbl = new JLabel("First Number");
        first_lbl.setBounds(20, 20, 200, 30);
        add(first_lbl);

        first_txt = new JTextField();
        first_txt.setBounds(20, 70, 200, 30);
        add(first_txt);

        second_lbl = new JLabel("Second Number");
        second_lbl.setBounds(20, 120, 200, 30); 
        add(second_lbl);

        second_txt = new JTextField();
        second_txt.setBounds(20, 170, 200, 30);
        add(second_txt);

        result_lbl = new JLabel("Result");
        result_lbl.setBounds(20, 220, 200, 30);
        add(result_lbl);

        result_txt = new JTextField();
        result_txt.setBounds(20, 270, 200, 30);
        result_txt.setEditable(false); // Prevents user typing directly into result
        add(result_txt);

        add_btn = new JButton("Addition");
        add_btn.setBounds(20, 320, 200, 30);
        add(add_btn);
        
        
        add_btn.addActionListener(this);

        // Right Side: Drag & Drop Image Component
        
        img_drop_lbl = new JLabel("Drag & Drop Image Here", JLabel.CENTER);
        img_drop_lbl.setBounds(260, 45, 240, 240); 
        img_drop_lbl.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        add(img_drop_lbl);

        // Connect the Drop Target logic to the label
        new DropTarget(img_drop_lbl, new DropTargetListener() {
            @Override
            public void dragEnter(DropTargetDragEvent dtde) { 
                dtde.acceptDrag(DnDConstants.ACTION_COPY); 
            }
            
            @Override
            public void dragOver(DropTargetDragEvent dtde) {}
            @Override
            public void dropActionChanged(DropTargetDragEvent dtde) {}
            @Override
            public void dragExit(DropTargetEvent dte) {}

            @Override
            public void drop(DropTargetDropEvent dtde) {
                try {
                    // Accept the drop action
                    dtde.acceptDrop(DnDConstants.ACTION_COPY);
                    Transferable t = dtde.getTransferable();
                    
                    // Check if the dropped item is a file from the file manager
                    if (t.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                        List<File> files = (List<File>) t.getTransferData(DataFlavor.javaFileListFlavor);
                        
                        if (files.size() > 0) {
                            File file = files.get(0);
                            String path = file.getAbsolutePath().toLowerCase();
                            
                            // Check file extension to ensure it's an actual image file
                            if (path.endsWith(".jpg") || path.endsWith(".png") || path.endsWith(".jpeg") || path.endsWith(".webp")) {
                                // Load the image
                                ImageIcon originalIcon = new ImageIcon(file.getAbsolutePath());
                                
                                // Automatically scale image down to smoothly match our 240x240 box boundaries
                                java.awt.Image scaledImage = originalIcon.getImage().getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
                                
                                // Remove text and display the graphic
                                img_drop_lbl.setText(""); 
                                img_drop_lbl.setIcon(new ImageIcon(scaledImage));
                            } else {
                                img_drop_lbl.setText("Error: Not a valid image!");
                                img_drop_lbl.setIcon(null);
                            }
                        }
                    }
                } catch (Exception ex) {
                    img_drop_lbl.setText("Failed to read file.");
                    ex.printStackTrace();
                }
            }
        });

        // Make the compiled window visible
        setVisible(true);
    }

    // 3. The Event handling method for Addition math
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            // Read input strings
            String n1 = first_txt.getText();
            String n2 = second_txt.getText();

            // Perform integer math conversion
            int sum = Integer.parseInt(n1) + Integer.parseInt(n2);

            // Display back to your result text box
            result_txt.setText(String.valueOf(sum));
            
        } catch (NumberFormatException e) {
            // Gracefully catch empty text or letter typos
            result_txt.setText("Please enter numbers!");
        }
    }

    // 4. The Main Method
    public static void main(String[] args) {
        new AdditionGuiApp();
    }
}