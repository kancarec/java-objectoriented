package objectoriented;

import java.util.Arrays;
import java.util.List;

public class IsoscelesTriangle extends Triangle {
    static final String NAME = "ISOSCELESTRIANGLE";

    public IsoscelesTriangle(List<Double> lengths) {
        super(lengths);
    }

    public static void main(String[] args) {
        Triangle item = new IsoscelesTriangle(Arrays.asList(4d, 4d, 6d));
        Triangle secondItem = new Triangle(Arrays.asList(4d, 4d, 6d));
        item.printName();
        secondItem.printName();
        item.printCalculations();
    }
    @Override
    public void printName() {
        System.out.println(NAME);
    }

}
