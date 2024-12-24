package CH3OOPs.FUNCTION;
class Bird{
void fly(){
    System.out.println("if birds can fly");
}
void type(){
    System.out.println("if birds are migratory");
}
void color(){
    System.out.println("what is the color of the bird");
}
}
class Parrot extends Bird{
   void fly(){
    System.out.println("yes parrot can fly");
   }
   void type(){
    System.out.println("no, parrots are not migratory");
}
void color(){
    System.out.println("green is the color of parrot");
}

}
class Sparrow extends Bird{
void fly(){
    System.out.println("yes Sparrow  can fly");
   }
   void type(){
    System.out.println("no, Sparrows are not migratory");
}
void color(){
    System.out.println("brown is the color of Sparrow");
}


}
class Penguin extends Bird{
void fly(){
    System.out.println("yes Penguin can fly");
   }
   void type(){
    System.out.println("yes, Penguins are migratory");
}
void color(){
    System.out.println("Black is the color of Penguin");
}

}

public class Class8_LSPhw {

 public static void func(Bird bi){
    bi.color();
    bi.fly();
    bi.type();
    System.out.println("--------------------------------------------");
 }
    public static void main(String[] args) {
        Bird parr = new Parrot();
       func(parr); 
       Bird peng = new Penguin();
       func(peng);
       Bird spa = new Sparrow();
       func(spa);
        
    }
}
