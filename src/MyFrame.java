import javax.swing.JFrame;

public class MyFrame extends JFrame
{
    private final int WIDTH = 300;
    private final int HEIGHT = 400;
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

    public static void main(String[] args)
    {
        MyFrame frame = new MyFrame("Hello");
        frame.paintLine();
        
    }

}
