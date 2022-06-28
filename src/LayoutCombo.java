import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutCombo implements ActionListener{
    private JFrame frame;

    public static void main(String[] args) {
        LayoutCombo guiLayout = new LayoutCombo();
        guiLayout.start();
    }

    private void start() {
        frame = new JFrame("C-c-c-combo layout!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }
}
