package ai.skillo;

public class Printer {
    String color;
    String material;
    int length;
    boolean blackAndWhitInk;

   public Printer() {
        color = "grey";
        material = "plastic";
        length = 40;
        blackAndWhitInk = true;
    }

    String print(String text) {
        System.out.println(text);
        return text;
    }
}
