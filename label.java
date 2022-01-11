import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class label extends JLabel {

    Font font   = new Font("cursive", Font.PLAIN, 30);
    Color light = new Color(255, 250, 240);
    Color dark  = new Color(119, 136, 153);

    label(String s)
    {
        super(s);
    }

    void set(int x, int row)
    {
      setFont(font);
          setOpaque(true);
          setBackground((x+row)%2 == 0 ? dark : light);
          setHorizontalAlignment( SwingConstants.CENTER );
    }

}