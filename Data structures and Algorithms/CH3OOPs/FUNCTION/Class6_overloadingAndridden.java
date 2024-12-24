package CH3OOPs.FUNCTION;
class A{
A(){
    System.out.println("constructor : A()");
}

int pic (int a , int b){
    return a+b;
}


void add(){
    System.out.println("almas is the baddest mofo on the planet");
}

}

class B extends A{
    B(){
        System.out.println("constructor : B()");
    }
    /* 

    //// OVELOADING --> same name but diff components, variable etc
    int pic (int c){
        return 2;
    }
    void pic (){
        System.out.println("class B :: void");
    }
    */

    void stt(){
    System.out.println("dacwvece");
}
    @Override  ////////  OVERIDDDING --> same name with differnt work

    void add(){
        System.out.println("B: Mohd Almas Husain is the baddest mofo on the palnet");
    }
}
public class Class6_overloadingAndridden {
    public static void main(String[] args) {
        B as = new B();
       // as.add();
      //  as.stt();
     System.out.println(as.pic(12,4));
     System.out.println(as.pic(12));
     as.pic();

        

       



    }
}
