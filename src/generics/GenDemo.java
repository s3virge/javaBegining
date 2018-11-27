package generics;

public class GenDemo {
    public static void main(String[] args) {
        Gen<String, Integer> genFirst = new Gen<>("Pufic", 123);
        genFirst.printValuesTypes();

        System.out.println("The length of value A is " + genFirst.getValueA().length());
        System.out.println(genFirst.getValueB().toString());

        Gen<Double, Double> genSecond = new Gen<>(12.3, 433.34);
        genSecond.printValuesTypes();

        System.out.println(genSecond.getValueA());
        System.out.println(genSecond.getValueB());
    }
}
