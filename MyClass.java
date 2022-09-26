import java.util.Scanner;
public class MyClass {
    static void main(String[] args){
        int numberOne, numberTwo, largest;
        Scanner scan= new Scanner(System.in);
        System.out.println("Emter the first number");
        numberOne=scan.nextInt();
        System.out.println("Enter the second number");
        numberTwo=scan.nextInt();
        if(numberOne>numberTwo)
            largest= numberOne;
        else
            largest=numberTwo;
        System.out.println("\n largest=" +largest);
    }
}
