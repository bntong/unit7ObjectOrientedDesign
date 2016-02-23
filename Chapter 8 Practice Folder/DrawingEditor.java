import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;

    private JFrame frame;
    private ControlPanel controls;
    private static DrawingEditor editor;
    public DrawingEditor()
    {
        this.controls = new ControlPanel();

        this.frame = new JFrame();

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.add(controls);
        this.frame.setTitle("Drawing Editor");
        this.frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        editor = new DrawingEditor();
    }
}
