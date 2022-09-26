public class Multiplication{
    public static void main(String[] args) {
        int my_input, i;
        my_input = 16;
        System.out.println("The number is defined as " +my_input);
        System.out.println("The multiplication table of " +my_input + " is :");
        for(i = 1; i <= 10; ++i){
            System.out.printf("%d * %d = %d ", my_input, i, my_input * i);
        }
    }
}