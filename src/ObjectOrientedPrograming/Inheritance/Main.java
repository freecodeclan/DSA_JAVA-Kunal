package ObjectOrientedPrograming.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 7.9, 8.5 );

        System.out.println(box1.length + " " + box1.height + " " + box1.width);

        BoxWeight box2 = new BoxWeight();
        System.out.println(box2.height + " " + box2.weight);

        BoxWeight box3 = new BoxWeight(5, 2, 8, 10);
        System.out.println(box3.length + " " + box3.height + " " + box3.width + " " + box3.weight);

        BoxPrice box4 = new BoxPrice(5,10,200);
        System.out.println(box4.cost);
        System.out.println(box4.length + " " + box4.height + " " + box4.width+ " " + " " + box4.cost + " " + box4.weight);
    }
}
