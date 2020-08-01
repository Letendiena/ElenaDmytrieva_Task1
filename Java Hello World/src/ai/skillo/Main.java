package ai.skillo;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        System.out.println(divisionTwoNumbers(100, 10));

        Printer myPrinter = new Printer();
        System.out.println(myPrinter.color);
        System.out.println(myPrinter.material);
        System.out.println(myPrinter.length);
        System.out.println(myPrinter.blackAndWhitInk);
        myPrinter.print("My first homework");

        Phone myPhone = new Phone();
        System.out.println(myPhone.getPrice());
        System.out.println(myPhone.color);
    }
    static int divisionTwoNumbers(int a, int b) {
        int c;
       c = a / b;
       return c;
    }
}
