package practis_4.company;

public class Circle extends Shape{
    protected double radius;
    public Circle(){}
    public Circle(double radius){}
    public Circle(double radius, String color, Boolean filled){}

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {

        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
