package ObjectOrientedPrograming.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();    // Creating an object of Shapes
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}
