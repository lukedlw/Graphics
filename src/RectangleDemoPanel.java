import java.awt.Color;
import java.awt.Graphics;

public class RectangleDemoPanel extends MyPanel
{
    public RectangleDemoPanel()
    {
        super();
    }
    
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.BLACK);
        
        
        int startX = 10;
        int startY = 10;
        
        int endX = 280;
        int endY = 280;
        
        g.drawRect(startX, startY, endX, endY);
        
         startX += 10;
         startY += 10;
          
         endX += 280;
         endY += 280;
         
         
        
        
    }
}
