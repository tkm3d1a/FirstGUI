import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutBorder implements ActionListener{
    private JFrame frame;
    private JButton button;
    private int count = 0;

    public static void main (String[] args){
        LayoutBorder guiLayout = new LayoutBorder();
        //guiLayout.start();
        //guiLayout.startBox();
        //guiLayout.startFlow();
        guiLayout.startGrid();
    }

    private void startGrid() {
        frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();

        button = new JButton(" ");
        button.addActionListener(this);
        contentPane.setLayout(new GridLayout(3,3));

        for(int i = 0; i < 9; i++){
            makeButton(contentPane);
        }


        frame.pack();
        frame.setVisible(true);
    }

    private void makeButton(Container contentPane) {
        button = new JButton(" ");
        button.addActionListener(this); //This doesn't seem to connect to the actionListener
        contentPane.add(button);
    }

    private void startFlow() {
        frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JButton("First Button"));
        contentPane.add(new JButton("Second Button"));
        contentPane.add(new JButton("Thirst Button"));
        contentPane.add(new JButton("Fourthend Button"));
        contentPane.add(new JButton("lolwut Button"));

        frame.pack();
        frame.setVisible(true);
    }

    private void startBox() {
        frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(new JButton("First Button"));
        contentPane.add(new JButton("Second Button"));
        contentPane.add(new JButton("Thirst Button"));
        contentPane.add(new JButton("Fourthend Button"));
        contentPane.add(new JButton("lolwut Button"));

        frame.pack();
        frame.setVisible(true);
    }

    public void start(){
        frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new JButton("North Button"), BorderLayout.NORTH);
        contentPane.add(new JButton("South Button"), BorderLayout.SOUTH);
        contentPane.add(new JButton("East Button"), BorderLayout.EAST);
        contentPane.add(new JButton("West Button"), BorderLayout.WEST);
        contentPane.add(new JButton("Center Button"), BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        JButton b = (JButton) e.getSource();
        if(count%2 == 0){
            b.setForeground(Color.red);
            b.setText("X");
        } else {
            b.setForeground(Color.blue);
            b.setText("O");
        }
        count++;
        System.out.println("Button clicked");
        frame.pack(); //needed to resize with new text
    }
}
