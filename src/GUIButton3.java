import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIButton3 implements ActionListener {
  private JFrame frame;
  private JButton button;

  public static void main(String[] args) {
    GUIButton3 guiButton = new GUIButton3();
    guiButton.start();
  }

  public void start(){
    frame = new JFrame("A GUI Button");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = frame.getContentPane();

    button = new JButton("Click me!!");
    button.addActionListener(this);
    contentPane.add(button);
    
    frame.pack();
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    button.setForeground(Color.red);
    button.setText("I've been clicked!?!?");
    frame.pack(); //needed to resize with new text
  }
}
