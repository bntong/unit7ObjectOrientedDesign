import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;

/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        MouseListener clickListener = new MousePressListener();
        MouseMotionListener motionListener = new MouseMoveListener();
        
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(motionListener);
    }

    
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
}
