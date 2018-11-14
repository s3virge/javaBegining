package inheritance.box;

import inheritance.box.nextbox.NextBox;

public class BoxTest {

    public static void main(String[] args) {

        BoxWeight boxWeight = new BoxWeight(3, 4, 5, 23.8);
        BoxWeight boxWeight1 = new BoxWeight(2, 7, 45, 0.348);

        System.out.println("Volume of boxWeight = " + boxWeight.volume());
        System.out.println("weight of boxWeight = " + boxWeight.weight);
        System.out.println();

        System.out.println("Volume of boxWeight1 = " + boxWeight1.volume());
        System.out.println("weight of boxWeight = " + boxWeight1.weight);
        System.out.println();

        NextBox nb = new NextBox();
        nb.printBoxValue();
    }
}
