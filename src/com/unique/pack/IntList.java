package com.unique.pack;

public interface IntList {

    void add(int value);

    void add(int value, int index);

    int get(int index);

    void set(int index, int value);

    int size();

    int[] toArray();

    void remove(int index);

}
