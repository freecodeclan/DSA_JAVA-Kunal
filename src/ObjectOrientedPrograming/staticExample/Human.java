package ObjectOrientedPrograming.staticExample;

public class Human {
    //--> Properties
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    //--> Constructors
    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }


}
