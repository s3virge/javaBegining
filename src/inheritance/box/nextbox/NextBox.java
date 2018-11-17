package inheritance.box.nextbox;

import inheritance.box.Box;

public class NextBox extends Box {

    public void printBoxValue() {

//        super.printValues();
        printValues(); //call protected method of class from another package
    }
}
