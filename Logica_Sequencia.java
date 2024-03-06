public class Logica_Sequencia {
    public static void main(String[] args) {
        // Sequência a) 1, 3, 5, 7, ___
        int a = 1;
        System.out.println("Sequência a):");
        for (int i = 0; i < 5; i++) {
            System.out.println(a);
            a += 2;  // Cada número é 2 unidades maior que o anterior
        }

        // Sequência b) 2, 4, 8, 16, 32, 64, ____
        int b = 2;
        System.out.println("\nSequência b):");
        for (int i = 0; i < 7; i++) {
            System.out.println(b);
            b *= 2;  // Cada número é o dobro do anterior
        }

        // Sequência c) 0, 1, 4, 9, 16, 25, 36, ____
        System.out.println("\nSequência c):");
        for (int i = 0; i < 8; i++) {
            System.out.println(i * i);  // Cada número é o quadrado de um número natural
        }

        // Sequência d) 4, 16, 36, 64, ____
        System.out.println("\nSequência d):");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i * i);  // Cada número é o quadrado de um número par
        }

        // Sequência e) 1, 1, 2, 3, 5, 8, ____
        int e1 = 1, e2 = 1;
        System.out.println("\nSequência e):");
        System.out.println(e1);
        System.out.println(e2);
        for (int i = 0; i < 5; i++) {
            int temp = e1 + e2;
            System.out.println(temp);
            e1 = e2;
            e2 = temp;  // Cada número é a soma dos dois anteriores
        }
    }
}
