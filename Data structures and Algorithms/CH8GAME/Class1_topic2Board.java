package CH8GAME;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.print.Paper;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.text.html.parser.Entity;

public class Class1_topic2Board extends JPanel {
    BufferedImage bgImg;
    Paper player;
    Entity enemy;
    Timer timer;
    Entity enemies[] = new Enemy[3];
    
    public Class1_topic2Board() {
        // setSize(400, 600);
        showBackGround();
        player = new Player();
        loadEnemies();
        gameLoop();
        setFocusable(true);
    
    }
    private void loadEnemies(){
        int initialLocation = 250;
        int gap = 150;
        int speed = 3;
        for(int i=0;i<enemies.length;i++){
            enemies[i] = new Enemy(initialLocation,speed);
            initialLocation = initialLocation + gap;
            speed = speed +3;
        }
    }
    private void loadEnemies(){
        int initialLocation = 250;
        int gap = 150;
        int speed = 3;
        for(int i=0;i<enemies.length;i++){
            enemies[i] = new Enemy(initialLocation,speed);
            initialLocation = initialLocation + gap;
            speed = speed +3;
        }
    }

    private void paintEnemies(Graphics brush){
        for(Enemy enemy  : enemies){
            enemy.draw(brush);
            enemy.move();
        }
    }
    private void gameLoop(){
        timer = new Timer(30 , (e) -> repaint());
        timer.start();
    }

    public void showBackGround() {
        URL image = Class1_topic2Board.class.getResource("logo.jpg");
        try {
            bgImg = ImageIO.read(image);
        } catch (IOException e) {
            System.out.println("BackGroundImage not found");
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics brush){
        super.paintComponent(brush);
        brush.drawImage(bgImg, 0, 0, 800, 600 ,null);
        player.draw(brush);
        player.move();
        paintEnemies(brush);
    }
    
}

    public void showBackground(){
        URL image = Class1_topic2Board.class.getResource("backgroundImage.jpg");
          try {
            bgImg = ImageIO.read(image);
        } catch (IOException e) {
            System.out.println("BackGroundImage not found");
            e.printStackTrace();
        }


    }
    private void paintEnemies(Graphics brush) {
        for (Enemy enemy : enemies) {
            enemy.draw(brush);
            enemy.move();

            // Check for collision with player
            if (player.collidesWith(enemy)) {
                handleCollision();
            }
        }
    }

    public void paintComponent(Graphics brush) {
        super.paintComponent(brush);
        brush.drawImage(bgImg, 0, 0, 800, 600, null);
        player.draw(brush);
        player.move();
        paintEnemies(brush);
    }

    private void handleCollision() {
        
        System.out.println("Game Over!");
        
        timer.stop();
    }

}





    
