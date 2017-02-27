package sda.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    public static List<Long> values = new ArrayList<>();

    public static List<Long> getValues() {
        return values;
    }

    public static void addValue(long newValue) {
        values.add(newValue);
    }
}
