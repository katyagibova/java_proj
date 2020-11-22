package proj_12;
import static proj_12.SampleEnum.*;

public class Main {

    public static void main(String[] args) {
        colorDefinition("hello", GREEN);
        colorDefinition("love", WHITE);
    }

    public static void colorDefinition(String text, SampleEnum se){
        System.out.println(se.getColor() + text + SampleEnum.RESET.getColor());
    }
}
