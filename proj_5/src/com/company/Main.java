package com.company;

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
