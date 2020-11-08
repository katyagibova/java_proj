Next project: Main.java
```java
package proj_1;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        num1();
        num2(args);
        num3();
        num4();
        num5();

    }
    public static void num1() {
        int sum = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }
        System.out.println(sum);

        sum = 0;
        int i = 0;
        while (i != arr.length) {
            sum = sum + arr[i];
            i++;
        }
        System.out.println(sum);

        sum = 0;
        i = 0;
        do {
            sum = sum + arr[i];
            i++;
        }
        while (i != arr.length);
        System.out.println(sum);
    }

    public static void num2(String[] args){
        System.out.println();
        for(int i=0; i<args.length; i++)
        {
            System.out.print(args[i]+" ");
        }


    }

    public static void num3() {
        System.out.println();
        float a=1;
        for (int k=1; k<=10; k++ )
        {
            System.out.printf("%f", a/k);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void num4()
    {
        //1
        System.out.println("Random array1: ");
        double[] arr= new double[10];
        for (int e=0; e<10; e++)
        {
            arr[e]= Math.random()*5;
            System.out.print(arr[e]);
            System.out.print(" ");
        }
        int e=0;
        int n=0;

        while(true) {
            if (arr[e] > arr[e + 1])
            {
                double q = arr[e];
                arr[e] = arr[e + 1];
                arr[e + 1] = q;
                n = 0;
            }
            else {
                n++;
            }
            e++;
            if (e == arr.length - 1) {
                e = 0;
            }
            if (n == arr.length - 1) break;
        }
        System.out.println();
        System.out.println("Sorted array1: ");
        for (int z=0; z<10; z++)
        {
            System.out.print(arr[z]);
            System.out.print(" ");
        }
        //2
        System.out.println();
        System.out.println("Random array2: ");
        Random random = new Random();

        int[] arr2= new int[10];
        for (int i=0; i<10; i++)
        {
            arr[i]= random.nextInt();
            System.out.print(arr[i]);
            System.out.print(" ");
        }

        int i=0;
        int m=0;

        while(true) {
            if (arr2[i] > arr2[i + 1])
            {
                int q = arr2[i];
                arr2[i] = arr2[i + 1];
                arr2[i + 1] = q;
                m = 0;
            }
            else {
                m++;
            }
            i++;
            if (i == arr2.length - 1) {
                i = 0;
            }
            if (m == arr2.length - 1) break;
        }
        System.out.println();
        System.out.println("Sorted array2: ");
        for (int j=0; j<10; j++)
        {
            System.out.print(arr2[j]);
            System.out.print(" ");
        }


    }

    public static void num5()
    {
        factorial();
    }

    public static int factorial()
    {
        System.out.println();
        int f=1;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while(num!=0)
        {
            f=f*num;
            num--;
        }
        System.out.println("Factorial = " + f);

        return 0;
    }

}
```
Next project: Main.java
```java
package proj_10;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MySwingApp app = new MySwingApp();
            app.setVisible(true);
        });
    }
}
```
Next project: MySwingApp.java
```java
package proj_10;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class MySwingApp extends JFrame {
    private int clickCount = 0;
    public MySwingApp() {
        setTitle("Simple calculator");
        setSize(600, 500);
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton split = new JButton("/");

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JLabel answer = new JLabel();
        JLabel numA=new JLabel();
        JLabel numB=new JLabel();
        JLabel result=new JLabel();
        add(num1);
        add(num2);
        add(answer);
        add(plus);
        add(minus);
        add(multiply);
        add(split);
        add(numA);
        add(numB);
        add(result);

        answer.setForeground(Color.MAGENTA);
        answer.setBorder(new CompoundBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.CYAN), BorderFactory.createEmptyBorder()));
        numA.setForeground(Color.magenta);
        numB.setForeground(Color.magenta);
        result.setForeground(Color.magenta);
        numA.setText("Number A");
        numB.setText("Number B");
        result.setText("result");
        num1.setBounds(120, 50, 100, 50);
        num2.setBounds(380, 50, 100, 50);
        answer.setBounds(150, 282, 300, 50);
        plus.setBounds(120, 180, 50, 50);
        minus.setBounds(225, 180, 50, 50);
        multiply.setBounds(325, 180, 50, 50);
        split.setBounds(430, 180, 50, 50);
        numA.setBounds(162,25,70,10);
        numB.setBounds(425,25,70,10);
        result.setBounds(280,260,80,15);
        num1.setHorizontalAlignment(SwingUtilities.RIGHT);
        num2.setHorizontalAlignment(SwingUtilities.RIGHT);
        answer.setHorizontalAlignment(SwingUtilities.LEFT);

        minus.addActionListener(action -> {
            try {
                answer.setText(String.format("%.4f", Double.parseDouble(num1.getText()) - Double.parseDouble(num2.getText())));
            } catch (Exception E) {
                JOptionPane.showMessageDialog(null, "Incorrect input");
            }
        });

        plus.addActionListener(action -> {
            try {
                answer.setText(String.format("%.4f", Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText())));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Incorrect input");
            }
        });

        split.addActionListener(action -> {
            try {
                if (Double.parseDouble(num2.getText())==0)
                {
                    answer.setText("Error");
                    JOptionPane.showMessageDialog(null, "It is impossible");
                }
                else
                    answer.setText(String.format("%.4f", Double.parseDouble(num1.getText()) / Double.parseDouble(num2.getText())));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Incorrect input");
            }
        });

        multiply.addActionListener(action -> {
            try {
                answer.setText(String.format("%.4f", Double.parseDouble(num1.getText()) * Double.parseDouble(num2.getText())));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Incorrect input");
            }
        });
    }
}
```
Next project: Main.java
```java
package proj_11;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    static int totalSum;
    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            final int localI = i;
            Thread thread = new Thread(() -> hardFunction(localI));
            thread.start();
            threads.add(thread);
        }

        for (Thread t : threads) {
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        System.out.println("total sum: " + totalSum);
    }

    private synchronized static long doHardWork(int start, int count) {
        long a = 0;
        for (int i = 0; i < count; i++) {
            a += (start + i) * (start + i) * Math.sqrt(start + i) * (start*start + i*i);
            totalSum++;
        }
        return a;
    }

    private static void hardFunction(int a) {
        for (int i = 0; i < 10; i++) {
            long startTime = System.currentTimeMillis();
            long result = doHardWork(a * 10000, 100_000_000);
            long endTime = System.currentTimeMillis();
            System.out.println(a + ": " + result + " | time: " + (endTime - startTime));
        }

    }
}
```
Next project: Main.java
```java
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
```
Next project: SampleEnum.java
```java
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
```
Next project: Main.java
```java
package proj_13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person man = new Person();

        try {
            int age = Integer.parseInt(new Scanner(System.in).nextLine());
            man.addAge(age);
        }catch (PersonalException pex){
            System.out.println("A person's age cannot be <0");
        }catch (NumberFormatException nex){
            System.out.println("An error has occurred");
        }finally {
            System.out.println(man);
        }

        boolean error;
        System.out.println("Throw an error?");
        error=new Scanner(System.in).nextBoolean();
        if(error)
        {
            throw new MyRuntimeException();
        }
    }
}


```
Next project: MyRuntimeException.java
```java
package proj_13;

public class MyRuntimeException extends RuntimeException{
}
```
Next project: Person.java
```java
package proj_13;

public class Person {
    private int age;

    public void addAge(int age) throws PersonalException
    {
        if(age<0 )
            throw new PersonalException();
        this.age+=age;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
```
Next project: PersonalException.java
```java
package proj_13;

public class PersonalException extends RuntimeException {
}
```
Next project: Main.java
```java
package proj_14;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] principle = new String[Integer.parseInt(scanner.nextLine())];
        int N = principle.length;

        for (int i = 0; i < N; i++) {
            principle[i] = scanner.nextLine();
        }
        String line = scanner.nextLine();

        String str ="";
        for (int i = 0; i < principle.length; i++) {
            str+=principle[i].split(" ")[0];
            if (i != principle.length - 1)
                str+="|";
        }
        HashMap<String, String> replaceMap = new HashMap<>();
        for (String s : principle) {
            replaceMap.put(s.split(" ")[0], s.split(" ")[1]);
        }

        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(line);
        //System.out.println(matcher.replaceAll(mchr -> replaceMap.get(mchr.group())));

    }
}
```
Next project: Methods.java
```java
package proj_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Methods {
    int N;
    private String[] principle;
    String line;

    public Methods(int N, String[] principle, String line) {
        N = N;
        this.principle = principle;
        this.line = line;
    }

    public void First (int N){
        String finalLine;
        String[] src = new String[N];
        String[] ptr = new String[N];
        finalLine = line;
        for (int i = 0; i < N; i++) {
            src[i] = principle[i].split(" ")[0];
            ptr[i] = principle[i].split(" ")[1];

            if (finalLine.contains(src[i])) finalLine = finalLine.
                    replaceAll(src[i], " " + ptr[i] + " ");
        }
        System.out.println("First: " + finalLine.replace(" ", ""));
    }

    public void Second (int N){
        String finalLine;
        String[] src = new String[N];
        String[] ptr = new String[N];
        finalLine = line;
        Pattern pattern = Pattern.compile("(?<src>\\w+) (?<ptr>\\w+)");
        for (int i = 0; i < N; i++) {
            Matcher matcher = pattern.matcher(principle[i]);
            if (matcher.find()) finalLine = finalLine.
                    replaceAll(matcher.group("src"),
                            " " + matcher.group("ptr") + " ");
        }
        System.out.println("Second: " + finalLine.replace(" ", ""));

    }
}
```
Next project: Graph.java
```java
package proj_15_16;

public class Graph {
    private SystemSetup s1 = new SystemSetup();
    private SystemSetup s2 = new SystemSetup();
    private SystemSetup s3 = new SystemSetup();
    private SystemSetup s4 = new SystemSetup();
    private SystemSetup s5 = new SystemSetup();
    private SystemSetup firstState = s1;

    public Graph() {
        s1.addition(0, "create_project", s2);
        s1.addition(1, "add_library", s5);
        s2.addition(0, "test", s3);
        s2.addition(1, "drop_db", s4);
        s3.addition(0, "drop_db", s4);
        s3.addition(1, "add_library", s5);
        s4.addition(0, "restart", s3);
        s4.addition(1, "deploy", s5);
        s5.addition(0, "deploy", s1);
        s5.addition(1, "restart", s3);
    }

    public void employeeWork(int a) {
        for (int i = 0; i < firstState.getNumber().size(); i++) {
            if (firstState.getNumber().get(i) == a) {
                System.out.println(firstState.getAction().get(a));
                firstState = firstState.getNextState().get(a);
                break;
            }
        }
    }
}
```
Next project: Main.java
```java
package proj_15_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if (a == -1) {
                break;
            }
            graph.employeeWork(a);
        }
    }
}
```
Next project: SystemSetup.java
```java
package proj_15_16;
import java.util.ArrayList;

public class SystemSetup {
    private final ArrayList<Integer> number = new ArrayList<>();
    private final ArrayList<String> action = new ArrayList<>();
    private final ArrayList<SystemSetup> nextState = new ArrayList<>();

    public void addition(Integer num, String act, SystemSetup nextSt) {
        number.add(num);
        action.add(act);
        nextState.add(nextSt);
    }

    public ArrayList<Integer> getNumber() {
        return number;
    }

    public ArrayList<String> getAction() {
        return action;
    }

    public ArrayList<SystemSetup> getNextState() {
        return nextState;
    }
}
```
Next project: Main.java
```java
package proj_17_18;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public void check() {
        File file = new File("src/proj_17_18/File.md");
        file.delete();
        File mainFile = new File("src");
        searchFiles(mainFile);
    }

    public void searchFiles(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            for (String str : list) {
                searchFiles(new File(String.valueOf(Paths.get(file.getAbsolutePath(), str).toAbsolutePath())));
            }
        } else if (file.getAbsolutePath().endsWith(".java")) {
            readAndWrite(file);
        }
    }

    public void readAndWrite(File file) {

        String mainFilePath = file.getAbsolutePath();
        try {
            try (
                    BufferedReader reader = new BufferedReader(new FileReader(mainFilePath));
                    FileWriter writer = new FileWriter("src/proj_17_18/File.md", true);

            ) {
                writer.write("Next project: " + file.getName() + "\n");
                writer.write("```java\n");
                String line = reader.readLine();
                while (line != null) {
                    writer.write(line);
                    writer.write('\n');
                    line = reader.readLine();
                }
                writer.write("```\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Incorrect file path");
        } catch (IOException e) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.check();
    }
}








```
Next project: Ball.java
```java
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
```
Next project: Book.java
```java
package proj_2;

public class Book {
    private String name;
    private int year;
    private int pages;

    public Book(){
        this.name = name;
        this.year = year;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}
```
Next project: Dog.java
```java
package proj_2;

public class Dog {
    private String nickname;
    private int age;

    public Dog(String nickname,int age) {
        this.age=age;
        this.nickname=nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }
    public int ageTransformation()
    {
        return age*7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
```
Next project: DogHome.java
```java
package proj_2;

public class DogHome {
    public static void main(String[] args) {
        Dog[] sobaka=new Dog[5];
        for(int i=0;i<sobaka.length;i++)
        {
            sobaka[i]=new Dog("Jora"+i,7);
            System.out.println(sobaka[i].toString());
        }
    }
}
```
Next project: Main.java
```java
package proj_2;

public class Main {

    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball.toString());
    }
}
```
Next project: Shape.java
```java
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
```
Next project: ShapeTest.java
```java
package proj_2;

public class ShapeTest {
    public static void main(String[] args){
        Shape obj = new Shape();
        System.out.println(obj.toString());
    }
}
```
Next project: Book.java
```java
package proj_3;

public class Book {
    String name;
    String author;
    int pages;
    int year;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", year=" + year +
                '}';
    }
}
```
Next project: BookTest.java
```java
package proj_3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Katya");
        book.setName("My life");
        book.setPages(100);
        book.setYear(2020);
        System.out.println(book.getAuthor() + " " + book.getYear());
    }
}
```
Next project: Circle.java
```java
package proj_3;

public class Circle {
    private int radius;
    private int x;
    private int y;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
```
Next project: CircleTester.java
```java
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
```
Next project: Hand.java
```java
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
```
Next project: Head.java
```java
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
```
Next project: Human.java
```java
package proj_3;

public class Human {
    String name;
    int age;
    int growth;
    Hand hand;
    Head head;
    Leg leg;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrowth() {
        return growth;
    }

    public Hand getHand() {
        return hand;
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeg() {
        return leg;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", growth=" + growth +
                ", hand=" + hand +
                ", head=" + head +
                ", leg=" + leg +
                '}';
    }
}
```
Next project: HumanTest.java
```java
package proj_3;

public class HumanTest {
    public static void main(String[] args){
        Human person = new Human();
        person.setAge(25);
        Hand hand = new Hand();
        hand.setFingers(5);
        person.setHand(hand);
        System.out.println(person.getAge() + " " + hand.getFingers() + " " + person.getHand());
    }
}
```
Next project: Leg.java
```java
package proj_3;

public class Leg {
    int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "size=" + size +
                '}';
    }
}
```
Next project: Circle.java
```java
package proj_4;

public class Circle extends Shape{
    protected double radius;
    public Circle(){}
    public Circle(double radius){}
    public Circle(double radius, String color, Boolean filled){}

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {

        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
```
Next project: Main.java
```java
package proj_4;

public class Main {

    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.setRadius(5);
        System.out.println(obj.getRadius());
        Square obj2 = new Square();
        obj2.setLength(3);
        System.out.println(obj2.getLength());
    }
}
```
Next project: Retangle.java
```java
package proj_4;

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
```
Next project: Shape.java
```java
package proj_4;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){}
    public Shape(String color, boolean filled){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public  abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
```
Next project: Square.java
```java
package proj_4;

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
```
Next project: Circle.java
```java
package proj_5;

public class Circle extends Shape{
    protected double radius;
    public Circle(){}
    public Circle(double radius){}
    public Circle(double radius, String color, Boolean filled){}

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {

        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
```
Next project: Main.java
```java
package proj_5;

public class Main {

    public static void main(String[] args) {
        Movable point = new MovablePoint(1,1);
        point.move(4,5);
        System.out.println(point.toString());
        point.move(7,10);
        System.out.println(point.toString());
        Movable circle = new MovableCircle();
        circle.move(9,2);
        System.out.println(circle.toString());
        circle.move(-2,9);
        System.out.println(circle.toString());
        MovableRectangle obj = new MovableRectangle(4,4,8,2);
        System.out.println(obj.toString());
        obj.move(4,4);
        System.out.println(obj.toString());
        obj.setWidth(obj.getWidth()*2);
        System.out.println(obj);
        obj.setLength(obj.getLength()*2);
        System.out.println(obj);
    }

}
```
Next project: Main2.java
```java
package proj_5;

public class Main2 {

    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.setRadius(5);
        System.out.println(obj.getRadius());
        Square obj2 = new Square();
        obj2.setLength(3);
        System.out.println(obj2.getLength());
    }
}
```
Next project: Movable.java
```java
package proj_5;

interface Movable {
    public void move(int right, int up);
}
```
Next project: MovableCircle.java
```java
package proj_5;
//import practis_4.company.Circle;

public class MovableCircle extends Circle implements Movable{
    int xCenter;
    int yCenter;


    @Override
    public void move(int right, int up) {
        xCenter += right;
        yCenter += up;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                ", radius=" + radius +
                '}';
    }
}

```
Next project: MovablePoint.java
```java
package proj_5;

public class MovablePoint implements Movable{
    private int x;
    private int y;

    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void move(int right, int up) {
        x += right;
        y += up;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
```
Next project: MovableRectangle.java
```java
package proj_5;
//import practis_4.company.Retangle;

public class MovableRectangle extends Retangle implements Movable{

    MovablePoint TopLeft;
    MovablePoint BottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2){
        TopLeft = new MovablePoint(x1, y1);
        BottomRight = new MovablePoint(x2, y2);
        width = y1-y2;
        length = x2-x1;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        int length1 = (int) length;
        BottomRight.setX(TopLeft.getX()+length1);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        int width1 = (int) width;
        TopLeft.setY(BottomRight.getY()+width1);
    }

    public void Check(){
        if (width== TopLeft.getY() - BottomRight.getY() && length== BottomRight.getX() - TopLeft.getX()) {
            System.out.println("Okay");
        }
        else {
            System.out.println("Not okay");
        }
    }

    @Override
    public void move(int right, int up) {
        TopLeft.setX(TopLeft.getX() + right);
        TopLeft.setY(TopLeft.getY() + up);
        BottomRight.setX(BottomRight.getX() + right);
        BottomRight.setY(BottomRight.getY() + up);
        Check();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "TopLeft=" + TopLeft +
                ", BottomRight=" + BottomRight +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
```
Next project: Retangle.java
```java
package proj_5;

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
```
Next project: Shape.java
```java
package proj_5;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){}
    public Shape(String color, boolean filled){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public  abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
```
Next project: Square.java
```java
package proj_5;

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
```
Next project: Field.java
```java
package proj_6;
import java.util.Arrays;
import java.util.stream.Stream;

public class Field {
        private int arr[][];
        private int dop_arr[][];
        private int n;

        public Field(int n) {
            this.n = n;
            arr = new int[n][n];
            dop_arr = new int[n][n];
        }

        public void Filling() {
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) {
                    arr[i][j] = -10 + (int) (Math.random() * 100);
                }
            dop_arr[0][0] = arr[0][0];
        }

        public void Output() {
            System.out.println("Field:");
            Stream.of(arr).map(Arrays::toString).forEach(System.out::println);
        }

        public int searchResult() {

            for (int i = 1; i < n; i++) {
                dop_arr[i][0] = arr[i][0] + dop_arr[i - 1][0];
            }

            for (int j = 1; j < n; j++) {
                dop_arr[0][j] = arr[0][j] + dop_arr[0][j - 1];
            }

            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    dop_arr[i][j] = Math.max(dop_arr[i - 1][j], dop_arr[i][j - 1]) + arr[i][j];
                }
            }
            return dop_arr[n - 1][n - 1];
        }
    }

```
Next project: Main.java
```java
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
```
Next project: Company.java
```java
package proj_7_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    ArrayList<Employee> employeeList = new ArrayList<>();
    public double income=0;

    public List<Employee> getTopSalaryStaff(int count)
    {
        if(!(count<=0 && count>employeeList.size())){
            employeeList.sort(Comparator.comparing(Employee::getFinalSalary).reversed());
            return employeeList.subList(0,count);
        }
        return null;
    }
    public List<Employee> getLowestSalaryStaff(int count)
    {
        if(!(count<=0 && count>employeeList.size())){
            employeeList.sort(Comparator.comparing(Employee::getFinalSalary));
            return employeeList.subList(0,count);
        }
        return null;
    }

    public void hire(Employee stager){
        employeeList.add(stager);
    }

    public void hireAll(List<Employee> stagers){
        for(Employee stg: stagers)
        {
            hire(stg);
        }
    }

    public void fire(Employee exWorker){
        employeeList.remove(exWorker);
    }

    public void calcIncome(){
        for(Employee worker: employeeList){
            if(worker.getPosition().getJobTitle().equals("Manager")) {
                worker.setFinalSalary(worker.getPosition().calcSalary(worker.getFixSalary()));
                income += (worker.getFinalSalary() - worker.getFixSalary()) * 20;
            }
        }
        for(Employee worker: employeeList){
            if(!worker.getPosition().getJobTitle().equals("Manager")){
                worker.setFinalSalary(worker.getPosition().calcSalary(worker.getFixSalary()));
            }
        }
    }

    public void dismissal(int count){
        if(!(count <= 0 && count > employeeList.size())) {
            for (int i = 0; i < count; i++) {
                fire(employeeList.get(employeeList.size()-1));
            }
        }
        else {
            System.out.println("Impossible to dismiss");
        }
    }

    public double getIncome(){
        return income;
    }
}
```
Next project: Employee.java
```java
package proj_7_8;

public class Employee {
    double fixSalary;
    String name;
    String surname;
    EmployeePosition position;
    double finalSalary;

    public Employee(String name,String surname, double fixSalary, EmployeePosition position){
        this.name=name;
        this.surname=surname;
        this.fixSalary=fixSalary;
        this.position=position;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFixSalary(double fixSalary) {
        this.fixSalary = fixSalary;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public double getFixSalary() {
        return fixSalary;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public String getSurname() {
        return surname;
    }
}
```
Next project: EmployeePosition.java
```java
package proj_7_8;

public interface EmployeePosition {
    public String getJobTitle();
    public double calcSalary(double baseSalary);
}
```
Next project: Main.java
```java
package proj_7_8;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Company topCompany = new Company();
        topCompany.hire(new Employee("Bob","Green", 25000, new Operator()));
        topCompany.hire(new Employee("Karl","Black", 100000, new TopManager(topCompany)));
        topCompany.hire(new Employee("Ann","White", 75000, new Manager()));

        List<Employee> stagerList = new ArrayList<>();
        for(int i=0;i<9;i++) {
            stagerList.add(new Employee("Karl " + i, "Black " + i, (int) (90000 + Math.random() * 110000), new TopManager(topCompany)));
        }
        for(int i=0;i<79;i++) {
            stagerList.add(new Employee("Ann " + i, "White " + i, (int) (45000 + Math.random() * 55000), new Manager()));
        }
        for(int i=0;i<179;i++) {
            stagerList.add(new Employee("Bob " + i, "Green " + i, (int) (15000 + Math.random() * 15000), new Operator()));
        }

        topCompany.hireAll(stagerList);
        topCompany.calcIncome();
        System.out.println("List of high salaries:");
        for(Employee emp : topCompany.getTopSalaryStaff(15)) {
            System.out.println(emp.getFinalSalary());
        }
        System.out.println();
        System.out.println("low salary list:");
        for(Employee emp : topCompany.getLowestSalaryStaff(30)) {
            System.out.println(emp.getFinalSalary());
        }
        System.out.println();

        topCompany.dismissal(-5);

        System.out.println();
        System.out.println("List of high salaries after dismissal:");
        for(Employee emp : topCompany.getTopSalaryStaff(15)) {
            System.out.println(emp.getFinalSalary());
        }
        System.out.println();
        System.out.println("low salary list after dismissal:");
        for(Employee emp : topCompany.getLowestSalaryStaff(30)) {
            System.out.println(emp.getFinalSalary());
        }


    }
}
```
Next project: Manager.java
```java
package proj_7_8;

public class Manager implements EmployeePosition {

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
     return baseSalary+0.05*(115000+(Math.random()*25000));
    }

}
```
Next project: Operator.java
```java
package proj_7_8;

public class Operator implements EmployeePosition {

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
```
Next project: TopManager.java
```java
package proj_7_8;

public class TopManager implements EmployeePosition {
    Company company;

    public TopManager(Company company){
        this.company=company;
    }

    @Override
    public String getJobTitle() {
        return "Top Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        if(company.getIncome() >= 10000000){
            return baseSalary*2.5;
        }
        return baseSalary;
    }
}
```
Next project: Company.java
```java
package proj_9;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    ArrayList<Employee> employeeList = new ArrayList<>();

    public void hire(Employee stager){
        employeeList.add(stager);
    }

    public void hireAll(List<Employee> stagers){
        for(Employee stg: stagers)
        {
            hire(stg);
        }
    }

    public void fire(Employee exWorker){
        employeeList.remove(exWorker);
    }

    public void dismissal(int count){
        if(!(count <= 0 && count > employeeList.size())) {
            for (int i = 0; i < count; i++) {
                fire(employeeList.get(employeeList.size()-1));
            }
        }
        else {
            System.out.println("Impossible to dismiss");
        }
    }

    public void someMethod(SelectorCompany selector, HeandlerCompany heandler){
        int count = 0;
        for( Employee employee: employeeList) {
            if (selector.selectCom(employee)) {
                heandler.handleComp(employee, count);
                count++;
            }
        }
        System.out.println(count);
    }

}
```
Next project: Employee.java
```java
package proj_9;

import java.time.LocalDate;

public class Employee {
        double fixSalary;
        String name;
        String surname;
        LocalDate date;
        String phone;
        String location;

        public Employee(String name, String surname, LocalDate date, String location, String phone, double fixSalary){
            this.name=name;
            this.surname=surname;
            this.date=date;
            this.location=location;
            this.phone=phone;
            this.fixSalary=fixSalary;
        }

    public double getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(double fixSalary) {
        this.fixSalary = fixSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fixSalary=" + fixSalary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
```
Next project: HeandlerCompany.java
```java
package proj_9;

public interface HeandlerCompany {
    void handleComp(Employee emp, int index);
}
```
Next project: Main.java
```java
package proj_9;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Company topCompany = new Company();
        int a = (int) (Math.random()*70);
        Random r = new Random();
        for(int i=0; i<45; i++) {
            topCompany.hire(new Employee("Bob", "Black", LocalDate.of(r.nextInt(70) + 1930, r.nextInt(11) + 1, r.nextInt(28) + 1), "City" + r.nextInt(70), "8949912" + r.nextInt(78), r.nextInt(100000)));
        }

        topCompany.someMethod(new SelectorFixSalary(70000, 80000), (emp, index) -> System.out.println("fix salary " + index + ":" + emp));

        System.out.println();
        topCompany.someMethod(new SelectorCompany() {
            @Override
            public boolean selectCom(Employee emp) {
                return emp.getFixSalary() < 40_000;
            }
        }, new HeandlerCompany() {
            @Override
            public void handleComp(Employee emp, int index) {
                System.out.println("------" + index + "------");
                System.out.println(emp);
            }
        });
        System.out.println();

        SelectorCompany s = emp -> emp.getFixSalary() > 90000;
        topCompany.someMethod(s, Main::function);


    }
    static void function(Employee emp, int index){
        System.out.println("++++++" + index + "++++++");
        System.out.println(emp);
    }
}
```
Next project: SelectorCompany.java
```java
package proj_9;

public interface SelectorCompany {
    public boolean selectCom(Employee emp);
}
```
Next project: SelectorFixSalary.java
```java
package proj_9;

public class SelectorFixSalary implements SelectorCompany {
    private double salaryStart;
    private double salaryEnd;

    public SelectorFixSalary(double salaryStart, double salaryEnd) {
        this.salaryStart = salaryStart;
        this.salaryEnd = salaryEnd;
    }

    @Override
    public boolean selectCom(Employee emp) {
        return emp.getFixSalary() >= salaryStart && emp.getFixSalary() <= salaryEnd;
    }
}
```
