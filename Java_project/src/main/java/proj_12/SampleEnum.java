package proj_12;
import com.sun.org.apache.xpath.internal.objects.XString;

public enum SampleEnum {
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    BLACK("\u001B[30m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),
    RESET("\u001B[0m");

    String color;

    SampleEnum(String color){
        this.color=color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
