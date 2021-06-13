package objectoriented;

public class Square extends Shape implements IShape{
    Double side;

    public Square(String name,Double side) {
        super(name);
        this.side=side;
    }
    public static void main(String [] args){
        Square item=new Square("Square", 5d);
        item.printName();
        item.printCalculations();
    }

    @Override
    public Double calculateArea() {
        return side*side;
    }

    @Override
    public Double calculatePerimeter() {
        Double perimeter=side*4;
        System.out.println("Perimeter:"+perimeter);
        return perimeter;
    }
}
