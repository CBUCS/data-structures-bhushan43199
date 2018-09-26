package com.data.tree;

public interface Tree {


    public int add(Object item);
    public int remove (Object item);
    public int contains (Object item);
    public int numItems ();
    public int height();
    public void print();
}