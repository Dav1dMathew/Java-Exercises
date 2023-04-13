package Shapes;

public class Square extends Shape {
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return super.getName() + " (Square)";
    }
    
    @Override
    public double compareTo(Shape s) {
        if (s instanceof Square) {
            Square otherSquare = (Square) s;
            return this.getSide() - otherSquare.getSide();
        } else {
            return -1.0; // default value for non-Square shapes
        }
    }

    public static void main(String[] args) {
        Square square = new Square("A SqUaRe", 5.0);
        System.out.println("Side length of " + square.getName() + " is " + square.getSide());
        System.out.println("Area of " + square.getName() + " is " + square.getArea());
        System.out.println(square.toString());
        square.setName("The good square");
        System.out.println(square.toString());
    }
}
