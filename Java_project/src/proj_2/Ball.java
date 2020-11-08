package proj_2;

public class Ball {
    private int size=10;
    private String color;
    private int volume;

    public Ball(){
        this.size= size;
        this.color = color;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                '}';
    }
}
