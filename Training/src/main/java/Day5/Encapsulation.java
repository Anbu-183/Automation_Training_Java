package Day5;

/** This the Example for Encapsulation>>>>>>>>>  Data hiding   EX:Capsule */

class Encapsulation{

        int length;
        int breadth;

        // constructor to initialize values
        Encapsulation(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        // method to calculate area
        public void getEncapsulation() {
            int area = length * breadth;
            System.out.println("Area: " +area);
        }
    }

    class Main {
        public static void main(String[] args) {

            Encapsulation rectangle = new Encapsulation(2, 16);
            rectangle.getEncapsulation();
        }
    }

