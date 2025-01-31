import java.util.Scanner;

class SimpleClass
{
    void Area_of_rectangle(Scanner input)
    {
        System.out.println("Enter length of Rectangle:");
        int l = input.nextInt();
        System.out.println("Enter width of Rectangle:");
        int w = input.nextInt();
        int area = l * w;
        System.out.println("Area of rectangle: " + area);
    }
    
    
    void Area_of_triangle(Scanner input)
    {
        System.out.println("Enter base of triangle:");
        double b = input.nextDouble();
        System.out.println("Enter height of triangle:");
        double h = input.nextDouble();
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle: " + area);
    }
}

class Main
{
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        SimpleClass obj = new SimpleClass();
        
        
        obj.Area_of_rectangle(input);
        obj.Area_of_triangle(input);
        
        input.close(); 
    }
}
