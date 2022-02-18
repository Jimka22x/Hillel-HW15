package com.unique.pack;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] array = new int[0];

    @Override
    public void add(int value) {
        int[] temp = new int[array.length + 1];
        System.arraycopy(array, 0, temp, 0, array.length);
        temp[temp.length - 1] = value;
        array = temp;
    }

    @Override
    public void add(int value, int index) {
        try {
            int[] temp = new int[array.length + 1];
            System.arraycopy(array, 0, temp, 0, index);
            System.arraycopy(array, index, temp, index + 1, temp.length - 1 - index);
            temp[index] = value;
            array = temp;
        } catch (Exception e) {
            System.out.println("Something went wrong. Probably Index is out of the array length");
        }
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= array.length) {
            throw new InvalidParameterException(("Index is out of the array length"));
        }
        return array[index];
    }

    @Override
    public void set(int index, int value) {
        try {
            array[index] = value;
        } catch (Exception e) {
            System.out.println("Something went wrong. Probably Index is out of the array length");
        }
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public int[] toArray() {
        return array;
    }

    @Override
    public void remove(int index) {
        try {
            int[] tempArray = new int[array.length - 1];
            System.arraycopy(array, 0, tempArray, 0, index);
            System.arraycopy(array, index + 1, tempArray, index, tempArray.length - index);
            array = tempArray;
        } catch (Exception e) {
            System.out.println("Something went wrong. Probably Index is out of the array length");
        }
    }

    @Override
    public String toString() {
        return "IntArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

}
