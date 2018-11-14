import javax.swing.JFrame;

public class MyFrame extends JFrame
{
    private final int WIDTH = 800;
    private final int HEIGHT = 800;
    private static MyPanel panel;
    
    public MyFrame(String title)
    {
        setTitle(title);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public void paintLine()
    {
        panel = new LineDemoPanel();
        add(panel);
        setVisible(true);
    }
    
    public void paintRectangle()
    {
        panel = new RectangleDemoPanel();
        add(panel);
        setVisible(true);
    }
    
    public void paintOval()
    {
        panel = new OvalDemoPanel();
        add(panel);
        setVisible(true);
    }
    

    public static void main(String[] args)
    {
        MyFrame frame = new MyFrame("Hello");
        frame.paintLine();
        
        MyFrame frame1 = new MyFrame("rectangle");
        frame1.paintRectangle();
        
        MyFrame frame2 = new MyFrame("Oval");
        frame2.paintOval();
        
    }

}
