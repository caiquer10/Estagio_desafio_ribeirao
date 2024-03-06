import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma string
        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();

        // Chama a função para inverter a string
        String strInvertida = inverterString(str);

        // Imprime a string invertida
        System.out.println("String invertida: " + strInvertida);
    }

    // Função para inverter uma string
    public static String inverterString(String str) {
        // Cria um array de caracteres com o mesmo tamanho da string
        char[] caracteres = new char[str.length()];

        // Preenche o array de trás para frente
        for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
            caracteres[j] = str.charAt(i);
        }

        // Cria uma nova string com o array de caracteres
        return new String(caracteres);
    }
}
