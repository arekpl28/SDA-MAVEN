package sda.singletonFactory;


import sort.factory.SortTypeEnum;
import sort.impl.BubbleSort;
import sort.impl.CountSort;
import sort.impl.InsertSort;
import sort.impl.Sort;

public class SortSingletonFactory {
    private static SortSingletonFactory instance = new SortSingletonFactory();

    public SortSingletonFactory() {
    }

    public static SortSingletonFactory getInstance() {
        return instance;
    }

    public static Sort produce(SortTypeEnum type) {

        if (SortTypeEnum.BUBBLE.equals(type)) {
            return new BubbleSort();
        }
        if (SortTypeEnum.COUNT.equals(type)) {
            return new CountSort();
        }
        if (SortTypeEnum.INSERT.equals(type)) {
            return new InsertSort();
        }
        return null;
    }


}
