import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print(fact(x));
    }

    public static int fact(int f) {

        if (f <= 1)
            return 1;
        else
            return f * fact(f - 1);
    }
}




