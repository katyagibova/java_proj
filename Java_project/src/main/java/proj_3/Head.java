package proj_3;

public class Head {
    String hair;

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getHair() {
        return hair;
    }

    @Override
    public String toString() {
        return "Head{" +
                "hair='" + hair + '\'' +
                '}';
    }
}
