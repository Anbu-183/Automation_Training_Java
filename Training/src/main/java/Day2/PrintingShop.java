package Day2;


import java.util.Scanner;


public class PrintingShop {
//    static {
//        System.out.println("Hello");
//    }
    Scanner sc =new Scanner(System.in);
    String Size;
    int Piece;
    String Colour;
    PrintingShop(String Size,int Piece,String Colour){
//        System.out.println("Size of T shirt" +Size);
//        System.out.println("No of T shirt " +Piece);
//        System.out.println("Colur of T shirt"+Colour);
        this.Size= Size;
        this.Piece= Piece;
        this.Colour=Colour;
    }
    public void orderClothes(){
        Scanner m=new Scanner(System.in);
        System.out.println("Size of the Tshirt"+" ");
        m.next();
        System.out.println("No of the Tshirt"+" ");
        m.nextInt();
        System.out.println("Colour of the Tshirt"+" ");
        m.next();
//        System.out.println("Remaining Tshirts"+(Piece-);



    }

    public static void main(String[] args){
        PrintingShop p = new PrintingShop("M",100,"black");
        p.orderClothes();

    }

}
