import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = b*b - 4*a*c;
        if(discriminant==0){
            System.out.printf("The equation has one root %.6f\n",-b/(2*a));
        }
        else if(discriminant>0)
        {
            double r1 = (-b + Math.pow(discriminant,0.5))/(2*a);
            double r2 = (-b - Math.pow(discriminant,0.5))/(2*a);
            System.out.printf("The equation has two roots %.6f and %.6f\n",r1,r2);
        }
        else
        {
            System.out.println("The equation has no real roots");
        }
    }
}


