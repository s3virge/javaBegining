package inheritance.box;

public class Box {
    private double width;
    private double height;
    private double depth;
    int color;

    //create clone of object
    Box(Box box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    //constructor if exists all values
    Box(double width, double height, double depth) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    //constructor if creates cube
    Box(double length) {
        width = height = depth = length;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //calculate and return volume
    double volume() {
        return width * height * depth;
    }
}
