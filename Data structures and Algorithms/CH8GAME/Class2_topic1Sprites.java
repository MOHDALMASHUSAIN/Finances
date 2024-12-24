package Chapter8GAME;
import java.awt.Graphics;

import javax.swing.ImageIcon;


public class Class2_topic1Sprites {
      public int x , y, w,h ,speed;
    ImageIcon imageIcon;
    public boolean collidesWith( Class2_topic1Sprites otherSprite) {
        
        return this.x < otherSprite.x + otherSprite.w &&
               this.x + this.w > otherSprite.x &&
               this.y < otherSprite.y + otherSprite.h &&
               this.y + this.h > otherSprite.y;
    }

    
    public void draw(Graphics brush){
        brush.drawImage(imageIcon.getImage(),x,y,w,h,null);
    }
}
