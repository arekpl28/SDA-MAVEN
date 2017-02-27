package pl.sda.decorator;

import org.junit.Assert;
import org.junit.Test;
import sda.decorator.SortDecoratorWithReverse;
import sort.impl.BubbleSort;

public class DecoratorTest {
    @Test
    public void testDecorator() {
        int[] arrayToSort = {32, 432, -23, 32, 33, 3};
        SortDecoratorWithReverse decoratorSort = new SortDecoratorWithReverse(new BubbleSort());

        int[] result = decoratorSort.sort(arrayToSort);

        Assert.assertEquals(432, result[0]);
        Assert.assertEquals(33, result[1]);
        Assert.assertEquals(-23, result[result.length - 1]);
    }
}
