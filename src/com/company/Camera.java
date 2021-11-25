package com.company;

public class Camera {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Camera(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {return x + ", " + y;}
}
