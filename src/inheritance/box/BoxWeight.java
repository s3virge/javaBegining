package inheritance.box;

public class BoxWeight extends Box {
    double weight;
    int color; //value with the same name as value of super class

    BoxWeight(double width, double depth, double height, double weight) {
        super(width, depth, height); //call super class constructor
        this.weight = weight;
    }

    BoxWeight(double width, double depth, double height, double weight, int color) {
        super(width, depth, height); //call super class constructor
        this.weight = weight;
        super.color = color; //save color to open value of super class with name color
    }
}
