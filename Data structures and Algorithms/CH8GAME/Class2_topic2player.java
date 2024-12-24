package Chapter8GAME;


import javax.swing.ImageIcon;

public class Class2_topic2player extends  Class2_topic1Sprites {
     public Player(){
        w = 150;
        h = 250;
        x = 10; 
        y=300;
        speed = 1;
        imageIcon = new ImageIcon(Player.class.getResource("dude.gif"));
    }

    public void move(){
        x = x + speed;
    }
    
}
