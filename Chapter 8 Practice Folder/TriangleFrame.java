import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 * This frame contains a triangle
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private TriangleComponent scene;
    
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
            int x = event.getX();
            int y = event.getY();
            scene.addPoint(x, y);
            System.out.println(event.getX() + " " + event.getY());
            repaint();
        }
        public void mouseReleased(MouseEvent event)
        {
            
        }        
        public void mouseClicked(MouseEvent event)
        {
            
        }
    }
    
    public TriangleFrame()
    {
        scene = new TriangleComponent();
        add(scene);
        
        MouseListener listener = new MousePressListener();
        addMouseListener(listener);
        
        setSize(FRAME_WIDTH , FRAME_HEIGHT);
        
        setTitle("Triangle Frame Stuff");
    }
}
