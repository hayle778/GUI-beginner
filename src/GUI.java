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
            JFrame bob = new JFrame( );
     // another object
          JButton button = new JButton( "Click me" );
           button.addActionListener( this );
          JLabel label = new JLabel( "Number of clicks: 0");


           JPanel merry = new JPanel( );
             // add any elements

             merry.setBorder( BorderFactory.createEmptyBorder(30, 30, 10, 30));
             merry.setLayout( new GridLayout(0, 1  ) );
             merry.add(button);
             merry.add(label);




    //    add merry as an element to bob
            bob.add(merry, BorderLayout.CENTER);
            bob.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            bob.pack();
            bob.setVisible( true );


    }



    public static void main (String[]args) {



}


@Override
    public void actionPerformed(ActionEvent e) {
  count++;
    label.setText( "Number of clicks:"+ count );


     }
}
