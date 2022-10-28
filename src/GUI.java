import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI(){
        JFrame frame = new JFrame();
        JButton button = new JButton("Test");
        JLabel label = new JLabel("Test Label");
        JComboBox comboBox = new JComboBox();
        JCheckBox checkBox = new JCheckBox("All Good");


        JPanel panel = new JPanel();
        panel.setBorder( BorderFactory.createEmptyBorder(30, 30, 10, 30) );
        panel.setLayout( new GridLayout(0, 1) );
        panel.add(button);
        panel.add(label);
        panel.add(comboBox);
        panel.add(checkBox);

        frame.add( panel, BorderLayout.CENTER );
        frame.setMinimumSize( new Dimension(200,200) );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "Test GUI" );
        frame.pack();
        frame.setVisible( true );

    }


    public static void main(String[] args) {
        new GUI();
    }
}
