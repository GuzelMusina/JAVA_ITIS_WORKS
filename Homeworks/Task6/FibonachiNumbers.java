import java.util.Scanner;

class FibonachiNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.print(numb(i) + " ");
        }
        System.out.println();
        System.out.print(numb2(1, 1, 10) + " ");
    }

    public static int numb(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        else
            return numb(n - 1) + numb(n - 2);
    }

    public static int numb2(int x, int y, int n) {
        int z;
        if (n > 1) {
            z = x + y;
            x = y;
            y = z;
            return numb2(x, y, n - 1);
        } else {
            return y;
        }
    }
}