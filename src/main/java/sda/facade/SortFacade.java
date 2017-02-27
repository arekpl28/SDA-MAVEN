package sda.facade;


import sda.observer.Observer;
import sort.impl.CountSort;
import sort.impl.InsertSort;
import sort.impl.Sort;

public class SortFacade {
    private Observer observer = null;

    public SortFacade() {
    }

    public SortFacade(Observer observer) {
        this.observer = observer;
    }

    public int[] sortThroughFacade(int[] arrayToSort) {
        Sort sort = new InsertSort();
        return sort.sort(arrayToSort);
    }

    public int[] sortUsingCountSort(int[] arrayToSort) {
        Sort sort = new CountSort();
        for (int i = 0; i < arrayToSort.length; i++) {
            if (arrayToSort[i] < arrayToSort.length && observer != null) {
                int tmp = arrayToSort[i];
                arrayToSort[i] = Math.abs(arrayToSort[i]);
                observer.react(tmp);
            }
        }
        return sort.sort(arrayToSort);
    }
}
