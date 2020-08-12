package net.pixeleon.khpi.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysListsUtils {

    public static <E> void swapArrayNeighbourItems(E[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            E temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static <E> void swapListNeighbourItems(List<E> list) {
        for (int i = 0; i < list.size(); i += 2) {
            Collections.swap(list, i, i + 1);
        }
    }

    public static <E> E[] insertSubarray(E[] arr, E[] subarr, int insertPos) {
        List<E> tempList = new ArrayList<>(Arrays.asList(arr));
        tempList.addAll(insertPos, Arrays.asList(subarr));
        arr = tempList.toArray(arr);
        return arr;
    }

    public static <E> List<E> insertSublist(List<E> list, List<E> sublist, int insertPos) {
        List<E> tempList = new ArrayList<>(list);
        tempList.addAll(insertPos, sublist);
        list = tempList;
        return list;
    }

    public static <E> void replaceWithSubarray(E[] arr, E[] subarr, int replacePos) {
        for (int i = replacePos, j = 0; i < arr.length && j < subarr.length; i++, j++) {
            arr[i] = subarr[j];
        }
    }

    public static <E> void replaceWithSublist(List<E> list, List<E> sublist, int replacePos) {
        for (int i = replacePos, j = 0; i < list.size() && j < sublist.size(); i++, j++) {
            list.set(i, sublist.get(j));
        }
    }


    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(1, 6, 1, 8, 21, 7, 20, 20);
        Integer[] arrInt = listInt.toArray(new Integer[0]);
        List<Integer> sublistInt = Arrays.asList(3, 3, 3);
        Integer[] subarrInt = sublistInt.toArray(new Integer[0]);

        System.out.println("int array: " + Arrays.toString(arrInt));
        System.out.println("int list: " + listInt);

        swapArrayNeighbourItems(arrInt);
        swapListNeighbourItems(listInt);

        System.out.println("int array: " + Arrays.toString(arrInt));
        System.out.println("int list: " + listInt);

        listInt = insertSublist(listInt, sublistInt, 3);
        arrInt = insertSubarray(arrInt, subarrInt, 3);

        System.out.println("int array: " + Arrays.toString(arrInt));
        System.out.println("int list: " + listInt);

        replaceWithSubarray(arrInt, subarrInt, 0);
        replaceWithSublist(listInt, sublistInt, 6);

        System.out.println("int array: " + Arrays.toString(arrInt));
        System.out.println("int list: " + listInt);


    }
}
