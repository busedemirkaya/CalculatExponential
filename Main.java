import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int base,exponent;
        Scanner input = new Scanner(System.in);
        System.out.print("Base number: ");
        base = input.nextInt();
        System.out.print("Exponent number: ");
        exponent = input.nextInt();
        int multiple = 1;
        // 2^3 = 2*2*2
        for (int i = 1; i <= exponent; i++ ) {
            multiple *= base;
        }
        System.out.print(multiple);
    }
}