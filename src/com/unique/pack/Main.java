package com.unique.pack;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
/*      1) Есть интерфейс IntList:

           public interface IntList {
           void add(int value);
           int get(int index);
           void set(int index, int value);
           int size();
           int[] toArray();
        }

         Реализовать класс IntArrayList который реализует этот интерфейс.
         В качестве демонстрации с его помощю реализовать сортировку пузырьком IntList.
         Логика метода add: создаем временный массив на 1 элемент больше чем arr, копируем в него все элементы из arr,
         на последнюю позицию записываем новый элемент и заменяем arr на временный массив.

     2*) Добавить в IntList методы которые позволяют вставить в средину и удалить по индексу.
*/
        IntList list = new IntArrayList();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Изначальный массив:\n" + list + "\n");

        list.add(999, 4);
        System.out.println("Добавили значение 999 на 4-й индекс массива.");
        System.out.println(list + "\n");

        System.out.println("4-й элемент массива: " + list.get(4) + "\n");

        list.remove(4);
        System.out.println(list);
        System.out.println("4-й элемент массива \"" + list.get(4) + "\" удален.\n");

        list.set(0, 999);
        System.out.println("Установили значение 999 в 0 ячейку массива.");
        System.out.println(list + "\n");

        System.out.println("Длина массива - " + list.size() + "\n");

        int[] array = list.toArray();
        System.out.println("Преобразовали объект list в int массив.");
        System.out.println(Arrays.toString(array) + "\n");

        System.out.println("Неотсортированный массив:\n" + list);
        bubbleSort(list);
        System.out.println("Результат сортировки:\n" + list);

    }

    private static void bubbleSort(IntList list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    swap(list, j);
                }
            }
        }
    }

    private static void swap(IntList list, int j) {
        int temp = list.get(j);
        list.set(j, list.get(j + 1));
        list.set(j + 1, temp);
    }

}
