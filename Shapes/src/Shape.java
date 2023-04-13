package Shapes;

public abstract class Shape
{
    private String name;

    public Shape(String name)
    {
        this.setName(name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public abstract double getArea();
    
    public double compareTo(Shape s) {
        double diff = this.getArea() - s.getArea();
        if (diff == 0) {
            return 0;
        } else if (diff > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString()
    {
        return name;
    }
}