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


