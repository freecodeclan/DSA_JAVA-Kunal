package ObjectOrientedPrograming.Inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }
    // Creating Cube
    Box(double side){
        this.width = side;
        this.length = side;
        this.height = side;
    }

    Box (double length, double height, double width){
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box (Box old){
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }
}

