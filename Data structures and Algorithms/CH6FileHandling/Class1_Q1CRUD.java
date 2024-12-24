package CH6FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Class1_Q1CRUD {
    static void createfile(String filepath){
        try{
        File file = new File(filepath);
        //file.getParentFile().mkdirs();

        if(file.createNewFile()){
            System.out.println("file created successfully::" + file.getName());
        }
        else{
            System.out.println("file already existed");

        } 
        }   
        catch(IOException e){
            System.out.println("some error has occured");
            e.printStackTrace();

        }        
    }
    static void Deletefile(String filepath){
      try {
        File file = new File(filepath);
        if (file.delete()) {
            System.out.println("file deleted successfully");
        }
        else{
            System.out.println("alredy deleted");
        }
     
      } catch (Exception e) {
        // TODO: handle exception
        System.out.println("some issue arrived");
        e.printStackTrace();
      }
    }
    static void Updatefile (String filepath,String content ){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filepath,true))) {

          writer.newLine();
          writer.write(content);
          System.out.println("updated succesfully");

        } catch (Exception e) {
           System.out.println("some problem arrived");
           e.printStackTrace();
        }
    
    }
    static void ReadeR(String filepath){
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            System.out.println("the lines are");
            while ((line=reader.readLine())!=null) {
                System.out.println(line);
                
            }
            
        } catch (Exception e) {
           System.out.println("some error occured");
           e.printStackTrace();
        }
    }

    
    public static void main(String[] args) {
        String filepath = "C:\\Users\\MOHD ALMAS HUSAIN\\Downloads\\DSA\\DSA\\Myfileaa";
        createfile(filepath);
        Deletefile(filepath);
        String content = "Print 1 to N";
        Updatefile(filepath, content);

        ReadeR(filepath);
        
        
        
    }
}
