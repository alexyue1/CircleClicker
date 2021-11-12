import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import java.util.ArrayList;

public class CircleClick extends Applet implements MouseListener {
    
    private int[] xPositions = new int[10];
    private int[] yPositions = new int [10];
    private Color[] cols = new Color[10];
    private int[] sizes = new int[10];
    private int counter = 0;
    
    public void init() { addMouseListener(this); }
    
    public void mouseClicked(MouseEvent e) {
       
        xPositions[counter] = e.getX();
        yPositions[counter] = e.getY();
            
        int size = (int) (Math.random() * 256);
        int red = (int) (Math.random()*256);
        int green = (int) (Math.random()*256);
        int blue = (int) (Math.random()*256);
            
        cols[counter] = new Color(red, green, blue);
        sizes[counter] = size;
           
        counter++;
        if(counter == 10) {
           counter = 0;    
        }
        
        repaint();
    }
    
    public void mouseEntered(MouseEvent e) { }
    
    public void mouseExited(MouseEvent e) { }
    
    public void mousePressed(MouseEvent e) { }
    
    public void mouseReleased(MouseEvent e) { }
    
    public void paint(Graphics g) {
        for(int j = 0; j < 10; j++) {
            g.setColor(cols[j]);
            g.fillOval(xPositions[j] - sizes[j] / 2, yPositions[j] - sizes[j] / 2, sizes[j], sizes[j]);
        }
    }
}
