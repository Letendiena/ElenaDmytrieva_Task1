package ai.skillo;

public class Pen {

    String color; //text
    String material;
    int length;
    boolean isWithClip;

    Pen() {
        color = "blue";
        material = "plastic";
        length = 15;
        isWithClip = true;
    }

    String write(String text) {
        System.out.println(text);
        return text;
    }
}
