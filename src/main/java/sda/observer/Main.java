package sda.observer;


import sda.facade.SortFacade;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Observer observer = new Observer();
        SortFacade sortFacade = new SortFacade(observer);
        int[] input = new int[]{321, 32, 44, 32, -32, -54, 32, -7};
        int[] result = sortFacade.sortUsingCountSort(input);
        System.out.println(Arrays.toString(result));
    }
}
