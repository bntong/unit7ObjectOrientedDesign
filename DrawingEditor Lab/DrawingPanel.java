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

    private Color initialColor = Color.GREEN;
    private Dimension preferredSize = new Dimension(500, 500);
    private JColorChooser colorChooser = new JColorChooser();
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    private int activeShapeIndex = -1;
    private Point2D.Double pressedPoint;
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
            activeShapeIndex = -1;
            pressedPoint = new Point2D.Double(event.getX(), event.getY());
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

        public void mouseClicked(MouseEvent event)
        {
            activeShapeIndex = -1;
            Point2D.Double point = new Point2D.Double(event.getX(), event.getY());
            for(int i = 0; i < shapes.size(); i++)
            {
                if(shapes.get(i).isInside(point) == true)
                {
                    activeShapeIndex = i;
                }
            }
            repaint();
        }
    }

    class MouseMoveListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
            if(activeShapeIndex >= 0)
            {
                shapes.get(activeShapeIndex).move(event.getX()-pressedPoint.getX(), event.getY()-pressedPoint.getY());
                pressedPoint = new Point2D.Double(event.getX(), event.getY());
                repaint();
            }
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

        this.setSize(this.preferredSize);

    }
    
    public Dimension getPreferredSize()
    {
        return preferredSize;
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

    public void addCircle()
    {
        Random random = new Random();
        Point2D.Double point = new Point2D.Double((int)this.getWidth()/2, (int)this.getHeight()/2);        
        Circle circle = new Circle(point, random.nextInt(100), this.getColor());
        this.shapes.add(circle);
    }

    public void addSquare()
    {
        Random random = new Random();
        Point2D.Double point = new Point2D.Double((int)this.getWidth()/2, (int)this.getHeight()/2);      
        Square square = new Square(point, random.nextInt(100), this.getColor());
        this.shapes.add(square);
    } 

    @Override
    public void paintComponent(Graphics g)        
    {
        super.paintComponent(g);
        for(int i = 0; i < this.shapes.size(); i++)
        {
            if(i != activeShapeIndex)
                this.shapes.get(i).draw(g, true);
        }

        if(activeShapeIndex >= 0)
        {
            this.shapes.get(activeShapeIndex).draw(g, false);
        }
    }
    //     
    // @Override
    //         public void paintComponent(Graphics g) {
    //             super.paintComponent(g);
    //             //rectangle originated at 10,10 and end at 240,240
    //             Random ran = new Random();
    //                int x = ran.nextInt(6) + 5;
    // 
    //             g.drawRect(10, 10, x, 240);
    //                     //filled Rectangle with rounded corners.    
    //             g.fillRoundRect(50, 50, 100, 100, 80, 80);
    //             
    //             
    //         }

}
