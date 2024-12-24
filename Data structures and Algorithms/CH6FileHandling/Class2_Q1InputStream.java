package CH6FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class Class2_Q1InputStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("intro.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Some error occured");
            e.printStackTrace();
        }
    }
    
}
