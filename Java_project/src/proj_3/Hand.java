package proj_3;

public class Hand {
    int fingers;
    int a;

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }

    public int getFingers() {
        return fingers;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "fingers=" + fingers +
                ", a=" + a +
                '}';
    }
}
