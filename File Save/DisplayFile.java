//Displays the file

import java.util.Scanner;
import java.io.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.JTextComponent;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DisplayFile
{
//  Opens a file chooser dialog, reads the selected file and
//  loads it into a text area.
   public static void main(String[] args) throws IOException
   {
	  String info = " ";
	  
	  //Creates frame named "display file"
      JFrame frame = new JFrame("Display File");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //Creates text area
      JTextArea ta = new JTextArea(20, 30);
      JFileChooser chooser = new JFileChooser();
      
      
      int status = chooser.showOpenDialog(null);
      if (status != JFileChooser.APPROVE_OPTION)
          ta.setText("You selected to cancel the process.");
       else
       {
          //Selects chosen file
    	  File file = chooser.getSelectedFile();
    	  
    	  //Reads chosen file
          Scanner scan = new Scanner(file);

          while (scan.hasNext())
          {
        	  //Places text from the file in info
        	  info += scan.nextLine() + "\n";
          }
          //Place String from info into ta
          ta.setText (info);
       }
      
       //Adds String from ta to the frame
       frame.getContentPane().add(ta);
  
       //Creates a button named "save"
       JButton btnNewButton = new JButton("Save");
       btnNewButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{
				//Gets text from text area and places it in the String text
				String text = ta.getText();		
				
				//Gets the File the user selected
				File file = chooser.getSelectedFile();
				
				//Writes String from text to the selected file
				try {
					WriteToFile.write(file, text);
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}			
		        
			}
		});
       frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
       frame.pack();
       frame.setVisible(true);
       
    }
 }
