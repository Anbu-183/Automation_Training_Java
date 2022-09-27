package Day4;
/**The method have same name and & Different Parameter
          It is known as method overloading*/


public class Overloading {
    public static int hello(int a, int b){
        return a+b;
    }
   public static int hello(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String args[]){
        hello(1,2);
        hello(1,2,3);


    }
}
