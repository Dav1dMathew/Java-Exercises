package Shapes;

public class Rectangle extends Shape {
    private double side1;
    private double side2;

    public Rectangle(String name, double side1, double side2) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    
    @Override
    public double getArea() {
        return side1 * side2;
    }

    public String toString() {
        return "Rectangle: " + super.getName();
    }

    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle rectangle = new Rectangle("A slightly more special square", 4.0, 5.0);

        // Testing getSide1() and getSide2() methods
        System.out.println("Side 1 of " + rectangle.getName() + " is " + rectangle.getSide1());
        System.out.println("Side 2 of " + rectangle.getName() + " is " + rectangle.getSide2());

        // Testing getArea() method
        System.out.println("Area of " + rectangle.getName() + " is " + rectangle.getArea());

        // Testing toString() method
        System.out.println(rectangle.toString());

        // Testing setName() method
        rectangle.setName("The square that was never meant to be");
        System.out.println(rectangle.toString());
    }
}
