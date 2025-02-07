import java.util.Scanner;

class Quadratic
   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double D = b * b - 4 * a * c;

        System.out.println("Discriminant (D): " + D);
        if (D > 0) 
	{
            double root1 = (-b + Math.pow(D,0.5)) / (2 * a);
            double root2 = (-b - Math.pow(D,0.5)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } 
	else if (D == 0) 
	{
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        }
	 else
	 {
		System.out.print("Roots are imaginary");

        }

        scanner.close();
    }
}
