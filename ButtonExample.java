import java.awt.*;
import java.awt.event.*;

public class ButtonExample
{
    public static void main (String args[])
    {
        Frame f=new Frame("button Example");
        TextField tf=new TextField();
        tf.setBounds(50,50,150,20);
        Button b=new Button("click Here");
        b.setBounds(50,100,60,30);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("Welcome to islamic university.");

            }
        });
        f.add(b);f.add(tf);
        f.setVisible(true);

    }
}