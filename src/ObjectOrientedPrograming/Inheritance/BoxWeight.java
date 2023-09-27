package ObjectOrientedPrograming.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -2;
    }

    public BoxWeight(double length, double height, double width, double weight){
        super(length, height, width);
        this.weight = weight;
    }

   BoxWeight (BoxWeight other){
        super(other);
        weight = other.weight;
   }

   BoxWeight (double side, double weight){
        super(side);
        this.weight = weight;
   }
}
