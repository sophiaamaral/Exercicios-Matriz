import java.util.Scanner;

public class Exercicio2  {
    public static void exibeMatriz(int[][] matriz){
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[][] matriz1 = new int[2][3];
        int[][] matriz2 = new int[2][3];

        int[][] somaMatriz = new int[2][3];

        System.out.println("Matriz 1:");
        for (int linha = 0; linha < matriz1.length; linha++){
            for (int coluna = 0; coluna < matriz1[linha].length; coluna++){
                System.out.println("Digite o valor da matriz:[" + linha + "][" + coluna + "]");
                matriz1[linha][coluna] = leitor.nextInt();
            }
        }

        System.out.println("\nMatriz 2:");
        for (int linha = 0; linha < matriz2.length; linha++){
            for (int coluna = 0; coluna < matriz2[linha].length; coluna++){
                System.out.println("Digite o valor da matriz 1:[" + linha + "][" + coluna + "]");
                matriz2[linha][coluna] = leitor.nextInt();
            }
        }

        // Calculando a soma das duas matrizes
        for (int linha = 0; linha < somaMatriz.length; linha++){
            for (int coluna = 0; coluna < somaMatriz[linha].length; coluna++){
                somaMatriz[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }

        System.out.println("\nA soma das matrizes é:");
        exibeMatriz(somaMatriz);


    }
}
