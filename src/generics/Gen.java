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
        System.out.println("first value type is " + valueA.getClass().getSimpleName());
        System.out.println("second value type is " + valueB.getClass().getSimpleName());
    }

    public static <E extends Number, T extends  Number> Double multiply(E val1, T val2) {
        System.out.println("val1 = " + val1 + "[" + val1.getClass().getSimpleName() + "]," +
                " val2 = " + val2 + "[" + val2.getClass().getSimpleName() + "]");
        return val1.doubleValue() * val2.doubleValue();
    }

    public static Double multiply(Gen<? extends Number,?  extends Number> obj) {
        return obj.valueA.doubleValue() * obj.valueB.doubleValue();
    }
}
