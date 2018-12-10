package generics;

public class GenDemo {
    public static void main(String[] args) {
        Gen<String, Integer> genFirst = new Gen<>("Pufic", 123);
        genFirst.printValuesTypes();

        System.out.println("The length of value A is " + genFirst.getValueA().length());
        System.out.println(genFirst.getValueB().toString());

        Gen<Long, Double> genSecond = new Gen<>(12L, 433D);
        genSecond.printValuesTypes();

        System.out.println(genSecond.getValueA());
        System.out.println(genSecond.getValueB());

        System.out.println(Gen.multiply(genSecond));

        System.out.println("----------------------------");
        System.out.println(Gen.multiply(2L, 3D));
        System.out.println(Gen.multiply(2.34345, 2));
        System.out.println(Gen.multiply(2, 1.4));
    }
}
