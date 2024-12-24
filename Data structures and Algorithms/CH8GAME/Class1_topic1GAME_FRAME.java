package CH8GAME;
import javax.swing.JFrame;

public class Class1_topic1GAME_FRAME extends JFrame  {
    public Class1_topic1GAME_FRAME(){
        setTitle("GAME");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        add(new Class1_topic2Board());
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public static void main(String[] args) {
         // JFrame = a GUI window to add new components
        Class1_topic1GAME_FRAME frame = new Class1_topic1GAME_FRAME();        
    }
    
}
