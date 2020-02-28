import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
// this is a method


   private int count = 0;
    private  JLabel label;
     public GUI(){

    //the object format
            JFrame frame = new JFrame( );
     // another object
          JButton button = new JButton( "Click me" );
           button.addActionListener( this );
          JLabel label = new JLabel( "Number of clicks: 0");


           JPanel panel = new JPanel( );
             // add any elements

             panel.setBorder( BorderFactory.createEmptyBorder(30, 30, 10, 30));
           panel.setLayout( new GridLayout(0, 1  ) );
            panel.add(button);
             panel.add(label);




    //    add merry as an element to bob
           frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            frame.pack();
            frame.setVisible( true );


    }



    public static void main (String[]args) {



}


@Override
    public void actionPerformed(ActionEvent e) {
  count++;
    label.setText( "Number of clicks:"+ count );


     }
}
