import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 200;
    
    private JFrame frame;
    private JButton button;
    private JButton button2;
    private JPanel panel;
    private JLabel label;

    public ButtonViewer()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.label = new JLabel();

        this.button = new JButton("A");
        this.panel.add(this.button);

        this.panel.add(this.label);

        this.button2 = new JButton("B");
        this.panel.add(this.button2);

        ClickListener listener = new ClickListener();
        button.addActionListener(listener);
        button2.addActionListener(listener);

        this.frame.add(panel);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        ButtonViewer view = new ButtonViewer();
    }

    public class ClickListener implements ActionListener
    {
        private String name;

        public void actionPerformed(ActionEvent event)
        {        
            label.setText("Button " + event.getActionCommand() + " was clicked");
        }
    }
}
