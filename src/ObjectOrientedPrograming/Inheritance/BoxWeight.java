package ObjectOrientedPrograming.Inheritance;

//--> BoxWeight is inheriting properties from Box class (length, breadth, height)
public class BoxWeight extends Box{
    double weight;      //--> Property

    public BoxWeight(){
        this.weight = -2;
    }

    public BoxWeight(double length, double height, double width, double weight){
        super(length, height, width);   //--> Super is the keyword used to initialise the values of Parent class
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
