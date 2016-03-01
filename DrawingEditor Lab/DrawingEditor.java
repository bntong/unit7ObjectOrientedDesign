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
    
    private DrawingPanel canvas;
    private ControlPanel controls;
    private static DrawingEditor editor;
    public DrawingEditor()
    {
        this.canvas = new DrawingPanel();
        this.controls = new ControlPanel(this.canvas);

        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(controls);
        this.setTitle("Drawing Editor");
        
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        editor = new DrawingEditor();
    }
    
    
}
