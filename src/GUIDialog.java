import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIDialog implements ActionListener{

  private JFrame frame;
  private JButton button;
  
  public static void main(String[] args) {
    GUIDialog dialog = new GUIDialog();
    dialog.start();
  }

  public void start(){
    frame = new JFrame("A GUI Button");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    System.out.println("start command run");

    Container contentPane = frame.getContentPane();

    button = new JButton("Click me!!");
    button.addActionListener(this);
    contentPane.add(button);
    
    frame.pack();
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    String textToShow;
    textToShow = JOptionPane.showInputDialog(frame,
    "Enter the text you want to display: ",
    "Input Dialog",
    JOptionPane.QUESTION_MESSAGE);

    if(textToShow != null){
      button.setForeground(Color.red);
      button.setText(textToShow);
      frame.pack();
    }
  }
  
}
