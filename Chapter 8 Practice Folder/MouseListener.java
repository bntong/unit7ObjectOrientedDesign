import java.awt.event.*;
import java.awt.*;

/**
 * Write a description of class MouseListener here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface MouseListener
{
    void mouseEntered(MouseEvent event);

    void mouseExited(MouseEvent event) ;

    void mousePressed(MouseEvent event) ;

    void mouseReleased(MouseEvent event);
    
    void mouseClicked(MouseEvent event);
}
