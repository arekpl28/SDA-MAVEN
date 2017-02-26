package sda.singletonFactory;


import sort.factory.SortTypeEnum;
import sort.impl.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortSingletonFactory factory = SortSingletonFactory.getInstance();

        Sort sort = factory.produce(SortTypeEnum.BUBBLE);
        int[] sortedArray = sort.sort(new int[]{313, 3213, 321, 3, 4, 32, 3, 2});
        System.out.println(Arrays.toString(sortedArray));

    }
}
