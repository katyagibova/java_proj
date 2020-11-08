package proj_6;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Field field=new Field(in.nextInt());
        field.Filling();
        field.Output();
        System.out.println("Result: "+field.searchResult());
    }
}
