package Shapes;

import java.util.LinkedList;

public class Whiteboard {
    private LinkedList<Shape> shapes;

    public Whiteboard() {
        this.shapes = new LinkedList<>();
    }

    public Whiteboard(LinkedList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }
    
    public void remove(String name) {
    	for(Shape shape: shapes) {
    		if(shape.getName().equals(name)) {
    			shapes.remove(shape);
    			break;
    		}
    	}
    }

    public Shape getLargest() {
        Shape largest = shapes.getFirst();
        for (Shape shape : shapes) {
            if (shape.getArea() > largest.getArea()) {
                largest = shape;
            }
        }
        return largest;
    }

    public int size() {
        return shapes.size();
    }

    @Override
    public String toString() {
        return "Whiteboard{" +
                "shapes=" + shapes +
                '}';
    }
    
    public static void main(String[] args) {
        Whiteboard whiteboard = new Whiteboard();
        
        Square square1 = new Square("Square 1", 5.0);
        Rectangle rectangle1 = new Rectangle("Rectangle 1", 3.0, 7.0);
        whiteboard.add(square1);
        whiteboard.add(rectangle1);
        
        System.out.println("Shapes on the whiteboard:");
        System.out.println(whiteboard.toString());
        
        whiteboard.remove("Square 1");
        System.out.println("Removed Square 1 from the whiteboard.");
        System.out.println("Shapes on the whiteboard:");
        System.out.println(whiteboard.toString());
        
        System.out.println("The largest shape on the whiteboard is:");
        System.out.println(whiteboard.getLargest().toString());

        // Get the number of shapes on the whiteboard
        System.out.println("There are " + whiteboard.size() + " shapes on the whiteboard.");
    }
}
