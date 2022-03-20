package com.netcracker.oop1;

public class MyPoint {

    private int x = 0;

    private int y = 0;

    public MyPoint(){}

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{x, y};
    }

    public void setXY(int x, int y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(){
        return 0;//for MyPoint(0,0)
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.getY() - y, 2));
    }

}
