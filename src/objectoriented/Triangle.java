package objectoriented;

import java.util.Arrays;
import java.util.List;

public class Triangle extends Shape implements IShape{
    public static final String NAME="TRIANGLE";
    List<Double> sideLengths;
    public Triangle(String name,List<Double>lengths) {
        super(name);
        this.sideLengths=lengths;
    }
    public Triangle(List<Double>lengths) {
        super(NAME);
        this.sideLengths=lengths;
    }
    public static void main(String [] args){
        /*
        Triangle item=new Triangle("Triangle", Arrays.asList(3d,4d,5d));
        Triangle secondItem=new Triangle( Arrays.asList(5d,12d,13d));
        item.printName();
        item.printCalculations();
        secondItem.printName();
        secondItem.printCalculations();*/
        Shape thirdItem=new Triangle("Triangle", Arrays.asList(5d,12d,13d));
        thirdItem.printName();
        thirdItem.printCalculations();;


    }

    @Override
    public Double calculateArea() {
        Double area=calculatePerimeter()/2;
        Double perimeter=area;
        for( Double side:this.sideLengths){
            area=area*(perimeter-side);
        }
        return Math.sqrt(area);
    }

    @Override
    public Double calculatePerimeter() {
        Double perimeter=0d;
        for( Double side:this.sideLengths){
            perimeter=perimeter+side;
        }
        System.out.println("Perimeter:"+perimeter);
        return perimeter;
    }
    @Override
    public void printName(){
        System.out.println(NAME);
    }

}
