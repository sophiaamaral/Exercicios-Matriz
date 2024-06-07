import java.util.Scanner;

public class Exercicio3 {

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

        int[][] matriz = new int[3][3];
        int[] somaColuna = new int[3];

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.println("matriz[" + linha + "][" + coluna + "]:");
                matriz[linha][coluna] = leitor.nextInt();
            }
        }
        for (int coluna = 0; coluna < matriz[0].length;coluna++){
            for (int linha = 0; linha < matriz.length; linha++){
                somaColuna[coluna] += matriz[linha][coluna];
            }
        }
        leitor.close();
        System.out.println("\nMatriz 3x3:");
        exibeMatriz(matriz);

        System.out.println("Soma das colunas:");
        for (int soma : somaColuna){
            System.out.println(soma + "\t");
        }
        System.out.println();
    }

}
