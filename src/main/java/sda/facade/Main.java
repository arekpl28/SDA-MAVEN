package sda.facade;


import sort.impl.InsertSort;
import sort.impl.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort insertSort = new InsertSort();

        int[] tab = new int[]{231, 3421, 1, 21, 4,};
        SortFacade sort = new SortFacade();
        int [] result = sort.sortThroughFacade(tab);
        System.out.println(Arrays.toString(result));
    }
}
