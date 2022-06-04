import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIButton1 {
  private JFrame frame;

  public static void main(String[] args) {
    GUIButton1 guiButton = new GUIButton1();
    guiButton.start();
  }

  public void start(){
    frame = new JFrame("A GUI Button");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = frame.getContentPane();

    JButton button = new JButton("Click me!");
    contentPane.add(button);
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.pack();
  }
}
