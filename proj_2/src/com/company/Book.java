package com.company;

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
