package sda.mvc.facade;

import sda.mvc.model.Model;

import java.util.List;

public class Facade  {

    public static List<Long> getValuesFacade() {
        return Model.getValues();
    }

    public static void addValueFacade(long newValue) {
        Model.addValue(newValue);
    }
}
