package com.company;
import practis_4.company.Circle;

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

