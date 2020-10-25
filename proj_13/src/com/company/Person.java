package com.company;

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
