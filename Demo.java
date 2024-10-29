import java.util.Scanner;
abstract class Shape
{
    int length, breadth;
    abstract void printArea();
}
class Rectangle extends Shape
{
    void printArea()
    {
        System.out.println("Area:"+(length*breadth));
    }
}
class Triangle extends Shape
{
    void printArea()
    {
        System.out.println("Area:"+((length*breadth)/2));
    }
}
class Circle extends Shape
{
    void printArea()
    {
        System.out.println("Area:"+3.14*length*length);
    }
} 
class Demo
{
    public static void main(String args[])
    {
        Shape rect = new Rectangle();
        Shape tri = new Triangle();
        Shape circ = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("---MENU---");
        System.out.println("1.Rectangle");
        System.out.println("2.Triangle");
        System.out.println("3.Circle");
        System.out.print("Enter your choice:");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1: 
                System.out.print("Enter length:");
                rect.length = sc.nextInt();
                System.out.print("Enter breadth:");
                rect.breadth = sc.nextInt();
                rect.printArea();
                break;
            case 2:
                System.out.println("Enter height:");
                tri.length = sc.nextInt();
                System.out.println("Enter base:");
                tri.breadth = sc.nextInt();
                tri.printArea();
            case 3:
                System.out.println("Enter radius:");
                circ.length = sc.nextInt();
                circ.printArea();

            default:
                System.out.println("Error");

        }
    }
}
