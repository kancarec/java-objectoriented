package objectoriented;

import java.util.Arrays;
import java.util.List;

public class EquilateralTriangle extends Triangle{
    Double side;
    static final String NAME="EQUILATERAL TRIANGLE";
    public EquilateralTriangle(List<Double> lengths) {
        super(lengths);
    }

    public EquilateralTriangle(Double side) {
        super(Arrays.asList(side,side,side));
        this.side=side;
    }
    public static void main(String[] args) {
        Triangle item = new EquilateralTriangle(8d);
        item.printName();
        item.printCalculations();
        System.out.print("Perimeter:"+item.calculatePerimeter());

    }

    @Override
    public void printName(){
        System.out.println(NAME);
    }
    @Override
    public Double calculatePerimeter() {
       return calculatePerimeter(this.side);
    }
    private Double calculatePerimeter(Double side) {
        return 3*side;
    }

}
