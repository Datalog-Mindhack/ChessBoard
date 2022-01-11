import java.awt.*;
import javax.swing.JFrame;


public class board extends JFrame {

    private label[] labels = new label[] {

    // white
    new label("\u2656"), new label("\u2658"), new label("\u2657"), 
    new label("\u2655"), new label("\u2654"), new label("\u2657"), 
    new label("\u2658"), new label("\u2656"), new label("\u2659"), 
    new label("\u2659"), new label("\u2659"), new label("\u2659"),
    new label("\u2659"), new label("\u2659"), new label("\u2659"), 
    new label("\u2659"), 
    
    // empty
    new label(" "), new label(" "), new label(" "), 
    new label(" "), new label(" "), new label(" "), 
    new label(" "), new label(" "), new label(" "), 
    new label(" "), new label(" "), new label(" "), 
    new label(" "), new label(" "), new label(" "), 
    new label(" "), new label(" "), new label(" "), 
    new label(" "), new label(" "), new label(" "), 
    new label(" "), new label(" "), new label(" "),
    new label(" "), new label(" "), new label(" "), 
    new label(" "), new label(" "), new label(" "), 
    new label(" "), new label(" "),
    
    // black
    new label("\u265F"), new label("\u265F"), new label("\u265F"), 
    new label("\u265F"), new label("\u265F"), new label("\u265F"), 
    new label("\u265F"), new label("\u265F"), new label("\u265C"), 
    new label("\u265E"), new label("\u265D"), new label("\u265B"), 
    new label("\u265A"), new label("\u265D"), new label("\u265E"), 
    new label("\u265C")
    };

    void display()
    {
        setTitle("Chess board");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container contentPane = getContentPane();
        GridLayout gridLayout = new GridLayout(8, 8);

        contentPane.setLayout(gridLayout);

        int row = -1;
        for (int i = 0; i < labels.length; i++) 
        {
            if(i % 8 == 0) 
                   row ++; 
            labels[i].set(i, row);
            contentPane.add(labels[i]);
        } 

        setSize(700, 700);
        setLocationRelativeTo(null);
        setVisible(true);
     }

} 
