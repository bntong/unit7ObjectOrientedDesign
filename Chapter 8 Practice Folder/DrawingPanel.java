import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */ 
    
    private Color color;
    
    class MousePressListener implements MouseListener
    {
        public void mouseEntered(MouseEvent event)
        {
            
        }
        public void mouseExited(MouseEvent event)
        {
            
        }
        public void mousePressed(MouseEvent event)
        {
            
        }
        public void mouseReleased(MouseEvent event)
        {
            
        }        
        public void mouseClicked(MouseEvent event)
        {
            
        }
    }
    
    class MouseMoveListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
            
        }
        public void mouseMoved(MouseEvent event)
        {
            
        }
    }
    
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        ArrayList<Shape> shapes;
        DrawingPanel scene = new DrawingPanel();
        
        MouseListener listener = new MousePressListener();
        addMouseListener(listener);
        
        MouseMotionListener motionListener = new MouseMoveListener();
        addMouseMotionListener(motionListener);
        
    }
    
    public Color getColor()          
    {
         return this.color;
    }
    
    public Dimension getPreferredSize()
    {
        
    }
    
    public void pickColor()
    {
        
    }
    
    public void addCircle()
    {
        
    }
    
    public void addSquare()
    {
        
    }
    
    public void paintComponent(Graphics g)        
    {
        
    }
    
    
}
