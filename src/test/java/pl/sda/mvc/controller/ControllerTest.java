package pl.sda.mvc.controller;
import org.junit.Test;
import sda.mvc.controller.Controller;

import static org.junit.Assert.assertEquals;
public class ControllerTest {
    @Test

    public void fibonnaciTest0() {
        Controller controller = new Controller();
        final int expected = 0;
        final int actual = controller.getFibonacci(0);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciTest1() {
        Controller controller = new Controller();
        final int expected = 1;
        final int actual = controller.getFibonacci(1);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciTest2() {
        Controller controller = new Controller();
        final int expected = 1;
        final int actual = controller.getFibonacci(2);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciTest3() {
        Controller controller = new Controller();
        final int expected = 2;
        final int actual = controller.getFibonacci(3);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciTest4() {
        Controller controller = new Controller();
        final int expected = 3;
        final int actual = controller.getFibonacci(4);
        assertEquals(expected, actual);
    }
}
