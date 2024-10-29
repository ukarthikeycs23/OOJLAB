import java.util.Scanner;
class Rectangle<A extends Number>
{
    A obj1;
    A obj2;

    Rectangle(A obj1, A obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    
    void printArea()
    {
        double area = obj1.doubleValue() * obj2.doubleValue();
        System.out.println("Area:"+area);
    }
}

class genericDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:");
        int length = sc.nextInt();
        System.out.print("Enter breadth:");
        int breadth = sc.nextInt();
        Rectangle<Integer> rect = new Rectangle<Integer>(length,breadth);
        rect.printArea();
    }
} 
