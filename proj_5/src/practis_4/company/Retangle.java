package practis_4.company;

public class Retangle extends Shape{
    protected double width;
    protected double length;
    public Retangle(){}
    public Retangle(double width, double length){}
    public Retangle(double width, double length, String color, boolean filled){}

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double getLength() {

        return length;
    }

    public void setLength(double length) {

        this.length = length;
    }

    @Override
    public double getArea() {

        return width*length;
    }

    @Override
    public double getPerimeter() {

        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
