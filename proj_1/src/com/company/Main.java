package com.company;
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