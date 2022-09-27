package Day4;
/** This is the Example for Method Overriding*/
 class Future {
    void Hello(){
        System.out.println("Hai");
    }


}

/** same method name and same type of signature*/
/** Method of the subclass class overrides the method of the superclass. This is known as method overriding.*/

class Present extends Future{
     @Override
     void Hello() {
         super.Hello();
     }

     public static void main(String args[]){
         Future n=new Future();
         n.Hello();

     }
 }
