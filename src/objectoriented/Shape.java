package objectoriented;

public  abstract class Shape {
    String name;
    public Shape(String name){
        this.name=name;
    }
    public abstract Double calculateArea();
    public String getName(){
        return this.name;
    }

    public void printName(){
        System.out.println(this.name);
    }
    public void printCalculations(){
        System.out.println("Area:"+this.calculateArea());

    }

}
