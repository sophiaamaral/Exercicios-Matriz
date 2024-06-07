import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n;

        do {
            System.out.println("Digite um valor para n (maior que 1 e menor que 6): ");
            n = leitor.nextInt();

        }while (n <= 1 || n >= 6);

        int[][] matriz = new int[n][n];

        System.out.println("Digite os valores para a matriz " + n + "x" + n + ":");
        for (int linha = 0; linha < n; linha++){
            for (int coluna = 0; coluna < n; coluna++){
                System.out.println("matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = leitor.nextInt();
            }
        }
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < n; i++){
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][n - 1 - i];
        }
        leitor.close();

        System.out.println("\nMatriz " + n + "x" + n + ":");
        for (int linha = 0; linha < n; linha++){
            for (int coluna = 0; coluna < n; coluna++){
                System.out.print   (matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nSoma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("\nSoma da diagonal secundária: " + somaDiagonalSecundaria);
    }
}
