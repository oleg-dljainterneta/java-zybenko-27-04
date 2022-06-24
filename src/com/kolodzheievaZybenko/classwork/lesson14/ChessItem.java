package com.kolodzheievaZybenko.classwork.lesson14;
public abstract class ChessItem implements Drawable {

    protected int x, y;
    protected int value;

    public int getValue() {
        return value;
    }

    public abstract void print();

}