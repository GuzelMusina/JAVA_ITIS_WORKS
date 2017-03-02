import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int sum = 0;
            int mult = 1;
            int arr_1[] = new int[5];
            for (int i = 0; i < arr_1.length; i++) {
                arr_1[i] = scanner.nextInt();
                if (arr_1[i] % 2 == 0) {
                    sum = sum + arr_1[i];
                } else {
                    mult = mult * arr_1[i];
                }
            }
            System.out.print("Сумма четных = " + sum +  " ; Произведение нечетных = " + mult);
        }
    }



