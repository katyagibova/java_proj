package practis_4.company;

public class Square extends Retangle {

    public Square(){}
    public Square(double side){}
    public Square(double side, String color, boolean filled){}

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
