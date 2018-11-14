import java.awt.Color;
import java.awt.Graphics;

public class OvalDemoPanel extends MyPanel
{
    public OvalDemoPanel()
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
        
        g.drawOval(startX, startY, endX, endY);
        
        int startX2 = 100;
        int startY2 = 100;
          
        int endX2 = 300;
        int endY2 = 300;
         
         g.drawLine(startX2, startY2, endX2, endY2);
         
         startX += 10;
         startY += 10;
         
         endX += 280;
         endY += 280;
         
         g.drawOval(startX, startY, endX, endY);

        
        
    }
}