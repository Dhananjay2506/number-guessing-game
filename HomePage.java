import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {

    static HomePage frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new HomePage();
                frame.setVisible(true);
            }
        });
    }

    public HomePage() {
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(185, 60, 910, 590);
        setTitle("Number Guessing Game");

        
        getContentPane().setBackground(new Color(173, 216, 230));

        
        JLabel headingLabel = new JLabel("Number Guessing Game");
        headingLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        headingLabel.setForeground(Color.BLACK);
        headingLabel.setBounds(175, 50, 600, 50); 
        add(headingLabel);

        JButton btnHome = new JButton("Play");
        btnHome.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        btnHome.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        btnHome.setBackground(new Color(210, 125, 45));
        btnHome.setBounds(320, 350, 185, 65);
        add(btnHome);

        btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GamePage.main(new String[]{});
                frame.dispose();
            }
        });
    }
}
