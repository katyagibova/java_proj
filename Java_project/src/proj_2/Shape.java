package proj_2;

public class Shape {
    private int volume=4;
    private int perimeter=40;
    private int height=5;

    public Shape() {
        this.volume = volume;
        this.perimeter = perimeter;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "volume=" + volume +
                ", perimeter=" + perimeter +
                ", height=" + height +
                '}';
    }
}
