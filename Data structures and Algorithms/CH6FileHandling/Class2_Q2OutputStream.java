package CH6FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Class2_Q2OutputStream {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("intro.txt")){
            String data = "Hello User, How are u....";
            fos.write(data.getBytes());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
