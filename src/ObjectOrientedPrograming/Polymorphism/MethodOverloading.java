/* Example of an Method Overloading */
package ObjectOrientedPrograming.Polymorphism;

public class MethodOverloading {
    int sum (int a, int b){
        return a + b;
    }

    int sum (int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

//        obj.sum(5,6);
//        obj.sum(10,20,30);

        System.out.println(obj.sum(5,6));
        System.out.println(obj.sum(10,20,30));
    }
}
/* This is method overloading the function name can be same but the arguments, return types need to be different. */
