package ai.skillo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println(sumTwoValues(90, 22));

        Pen myPen = new Pen();
        System.out.println(myPen.color);
        System.out.println(myPen.material);
        System.out.println(myPen.length);
        System.out.println(myPen.isWithClip);
        myPen.write( "It was the second lesson of TA Java");

        Car myCar = new Car ();
        myCar.move();
    }

   static int sumTwoValues(int a, int b) {
        int c;

        c = a + b;
        return c;
    }
}
