package ro.training.java.c07;

import ro.training.java.c07.Human;

import java.util.ArrayList;


public class Box <T>
{
    private T t;


    public T getT() {
        return t;
    }

    public Box(T t)
    {
        this.t = t;
    }



}
