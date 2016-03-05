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
    // instance variables - replace the example below with your own
    private DrawingPanel canvas;
    private ControlPanel controls;
    
    private static DrawingEditor editor;
    
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    /**
     * Constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        this.setTitle("Drawing Editor");
        this.setLayout(new BorderLayout());
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        canvas = new DrawingPanel();
        controls = new ControlPanel(canvas);
        
        this.add(canvas, BorderLayout.CENTER);
        this.add(controls, BorderLayout.SOUTH);
        
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        editor = new DrawingEditor();
    }
}
