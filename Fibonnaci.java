import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale um número para saber se está na sequencia de Fibonnaci:");
        int num = scanner.nextInt();
        scanner.close();

        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonnacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonnacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0;
        int b = 1;
        while (a < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return num == a;
    }
}
