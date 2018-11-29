package generics;

public class Gen<TypeA, TypeB> {
    private TypeA valueA;
    private TypeB valueB;

    public Gen(TypeA a, TypeB b) {
        valueA = a;
        valueB = b;
    }

    public TypeA getValueA() {
        return valueA;
    }

    public TypeB getValueB() {
        return valueB;
    }

    public void printValuesTypes() {
        System.out.println("first value type is " + valueA.getClass().getTypeName());
        System.out.println("second value type is " + valueB.getClass().getTypeName());
    }

    public static <? extends Number> multiply(Gen<?, ?> t) {
        Integer i1 = 23, i2 = 2;
        System.out.println(i1 * i2);
    }

}
