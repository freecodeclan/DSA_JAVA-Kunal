package ObjectOrientedPrograming.staticExample;

public class Main {
    public static void main(String[] args) {
        Human harsh = new Human(31, "Harsh Mehra", 20000, false);
        Human manna = new Human(22, "Manish Adhikari", 10000, true);
        Human vandana = new Human(28, "Vandana Mehra", 25000, true);

        System.out.println(harsh.name);
        System.out.println(manna.salary);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
