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
    /** description of instance variable x (add comment for each instance variable) */ 
    
    private Color initialColor;
    private Dimension preferredSize = new Dimension(500, 500);
    private JColorChooser colorChooser = new JColorChooser();
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
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
        MouseListener listener = new MousePressListener();
        addMouseListener(listener);
        
        MouseMotionListener motionListener = new MouseMoveListener();
        addMouseMotionListener(motionListener);
       
    }
    
    public Color getColor()          
    {
         return this.initialColor;
    }
    
    public void pickColor()
    { 
        Color color=JColorChooser.showDialog(this,"Select a color",this.initialColor);  
        this.initialColor = color; 
    }
    
    public void addCircle(int x, int y)
    {
        Point2D.Double point = new Point2D.Double(x, y);
        Circle circle = new Circle(point, 50, this.initialColor);
        this.shapes.add(circle);
    }
    
    public void addSquare()
    {
        
    }
    
    public void paintComponent(Graphics g)        
    {
        Random random = new Random();
        g.drawOval(0, 0, random.nextInt(40), random.nextInt(40));
    }
    
    
}

