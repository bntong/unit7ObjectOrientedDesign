import java.awt.*;
import javax.swing.*;

/**
 * Creates a drawing panel and a control panel and attaches it to itself. Also creates a new drawing editor frame.
 * 
 * @author (Brian Tong) 
 * @version (4 March 2016)
 */
public class DrawingEditor extends JFrame
{
    // The variables that determine the width and height of the frame
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    
    // The variables that initialize a drawing panel, a drawing editor, and a control panel
    private DrawingPanel canvas = new DrawingPanel();
    private ControlPanel controls;
    private static DrawingEditor editor;
    
    // Constructor for the objects of class DrawingEditor
    public DrawingEditor()
    {
        // Assigning controls to a control panel
        this.controls = new ControlPanel(this.canvas);
        
        // Setting the layout of the frame
        this.setLayout(new BorderLayout());
        
        // Sets the size of the frame
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        // sets the frame so that it closes when the "x" button is pressed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // adds the canvas to the center of the frame
        this.add(canvas, BorderLayout.CENTER);
        
        // adds the control panel to the south of the frame
        this.add(controls, BorderLayout.SOUTH);
        
        // sets the title of the frame
        this.setTitle("Drawing Editor");
        
        // setting the frame so that it is visible 
        this.setVisible(true);
    }
    
    // your everyday standard main method which assigns editor to a new drawing editor.
    public static void main(String[] args)
    {
        editor = new DrawingEditor();
    }
    
    
}
