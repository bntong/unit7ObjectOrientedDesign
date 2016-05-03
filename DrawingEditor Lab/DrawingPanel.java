import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;

/**
 * Contains the mouse listeners for each button, and also is a canvas in which each shape is drawn on.
 * 
 * @author (Brian Tong) 
 * @version (4 March 2016)
 */
public class DrawingPanel extends JPanel
{
    // the variable that tells the currently selected color
    private Color initialColor = Color.GREEN;
    
    // the variable that tells the preferred size of the canvas
    private Dimension preferredSize = new Dimension(500, 500);
    
    // the variable that initializes and assigns a colorChooser variable to a new JColorChooser.
    private JColorChooser colorChooser = new JColorChooser();
    
    // the variable that initializes an array list named shapes
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    
    // the variable that states the shape that is currently selected, or "active." Default is -1, stating that no shape is 
    // selected.
    private int activeShapeIndex = -1;
    
    // the variable that states that point in which the mouse is currently located.
    private Point2D.Double pressedPoint;
    
    // mouse listener that monitors the actions of the mouse when it is stationary
    class MousePressListener implements MouseListener
    {
        // a do nothing method
        public void mouseEntered(MouseEvent event)
        {

        }
        // a do nothing method        
        public void mouseExited(MouseEvent event)
        {

        }
        // a method that is triggered when the mouse is pressed
        public void mousePressed(MouseEvent event)
        {
            activeShapeIndex = -1;
            // assigns the instance varible pressedPoint to a new point that is the mouse's current location
            pressedPoint = new Point2D.Double(event.getX(), event.getY());
            // iterates through the shapes array list and sets the activeShapeIndex to the "i" value if the mouse is 
            // inside the shape.
            for(int i = 0; i < shapes.size(); i++)
            {
                if(shapes.get(i).isInside(pressedPoint) == true)
                {
                    activeShapeIndex = i;
                }
            }

        }

        public void mouseReleased(MouseEvent event)
        {

        }        
        // method which is triggered when the mouse is clicked
        public void mouseClicked(MouseEvent event)
        {
            activeShapeIndex = -1;
            // creates a local variable of type Point2D.Double and is the x and y coordinate of the mouse
            Point2D.Double point = new Point2D.Double(event.getX(), event.getY());
            // iterates through the shapes array list and sets the activeShapeIndex to the "i" value if the mouse is 
            // inside the shape.
            for(int i = 0; i < shapes.size(); i++)
            {
                if(shapes.get(i).isInside(point) == true)
                {
                    activeShapeIndex = i;
                }
            }
            // repaints the canvas
            repaint();
        }
    }
    
    // the mouse motion listener which monitors the actions done by the mouse when it is moving
    class MouseMoveListener implements MouseMotionListener
    {
        // a method that is triggered when the mouse is dragged
        public void mouseDragged(MouseEvent event)
        {
            // drags the shape selected
            if(activeShapeIndex >= 0)
            {
                shapes.get(activeShapeIndex).move(event.getX()-pressedPoint.getX(), event.getY()-pressedPoint.getY());
                pressedPoint = new Point2D.Double(event.getX(), event.getY());
                repaint();
            }
        }
        // a do nothing method
        public void mouseMoved(MouseEvent event)
        {

        }
    }

    /**
     * Constructor for the class DrawingPanel
     */
    public DrawingPanel()
    {
        // creates a mouse listener
        MouseListener listener = new MousePressListener();
        // adds the listener to the drawing panel
        addMouseListener(listener);
        
        // creates a mouse motion listener
        MouseMotionListener motionListener = new MouseMoveListener();
        // adds the listener to the drawing panel
        addMouseMotionListener(motionListener);
        
        // sets the size of the drawing panel to a preferred size of 500, 500
        this.setSize(this.preferredSize);

    }
    
    /**
     * returns the preferred size of the canvas
     */ 
    public Dimension getPreferredSize()
    {
        return preferredSize;
    }
    
    /**
     * returns the currently selected color
     */
    public Color getColor()          
    {
        return this.initialColor;
    }
    
    /**
     * changes the currently selected color to a chosen color
     */
    public void pickColor()
    { 
        Color color=JColorChooser.showDialog(this,"Select a color",this.initialColor);  
        this.initialColor = color; 
    }
    
    /**
     * adds a circle to the drawing panel
     */
    public void addCircle()
    {
        Random random = new Random();
        Point2D.Double point = new Point2D.Double((int)this.getWidth()/2, (int)this.getHeight()/2);        
        Circle circle = new Circle(point, random.nextInt(100), this.getColor());
        this.shapes.add(circle);
    }
    
    /**
     * / adds a square to the drawing panel
     */
    public void addSquare()
    {
        Random random = new Random();
        Point2D.Double point = new Point2D.Double((int)this.getWidth()/2, (int)this.getHeight()/2);      
        Square square = new Square(point, random.nextInt(100), this.getColor());
        this.shapes.add(square);
    } 
    
    @Override
    /**
     * draws the shapes
     * 
     * @param  g     a parameter of type Graphics
     */
    public void paintComponent(Graphics g)        
    {
        super.paintComponent(g);
        // iterates through the shapes list and draws a filled shape
        for(int i = 0; i < this.shapes.size(); i++)
        {
            if(i != activeShapeIndex)
                this.shapes.get(i).draw(g, true);
        }
        
        // checks to see if a shape is selected and draws only the outline of the shape
        if(activeShapeIndex >= 0)
        {
            this.shapes.get(activeShapeIndex).draw(g, false);
        }
    }

}
