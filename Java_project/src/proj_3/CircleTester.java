package proj_3;
import java.util.Scanner;

public class CircleTester {
    public static void main(String[] args) {
        Circle obj = new Circle();
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        obj.setX(x);
        obj.setY(y);
        obj.setRadius(radius);
        System.out.println(obj.toString());
        System.out.println(obj.getRadius()+ " " + obj.getX() + " " + obj.getY());
    }
}
