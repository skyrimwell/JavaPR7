package Flyweight;

public class AngryBird implements Bird {
    private String color;


    public AngryBird(String color){
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Angry Bird's 'Color : " + color);
    }
}
