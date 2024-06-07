import java.util.Scanner;

public class Exercicio5 {
    public static boolean quadradoMagico(int[][] matriz){
        int tamanho = matriz.length;
        int somaReferencia = 0;

        // Calculando a soma da primeira linha como referência
        for (int j = 0; j < tamanho; j++){
            somaReferencia = somaReferencia + matriz[0][j];
        }

        // Verificando a soma de todas as linhas
        for (int i = 0; i < tamanho; i++){
            int somaLinha = 0;
            for (int j = 0; j < tamanho; j++){
                somaLinha = somaLinha + matriz[i][j];
            }
            if (somaLinha != somaReferencia) {
                return false;
            }
        }

        // Verificando a soma de todas as colunas
        for (int j = 0; j < tamanho; j++){
            int somaColuna = 0;
            for (int i = 0; i < tamanho; i++){
                somaColuna = somaColuna + matriz[i][j];
            }
            if (somaColuna != somaReferencia){
                return false;
            }
        }
        // Verificando a soma da diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < tamanho; i++){
            somaDiagonalPrincipal = somaDiagonalPrincipal + matriz[i][i];
        }
        if (somaDiagonalPrincipal != somaReferencia){
            return false;
        }
        // Verificando a soma da diagonal secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < tamanho; i++){
            somaDiagonalSecundaria = somaDiagonalSecundaria + matriz[i][tamanho - 1 - i];
        }
        if (somaDiagonalSecundaria != somaReferencia){
            return false;
        }
        // Se todas as somas conferem, a matriz é um quadrado mágico
        return true;
    }

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

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.println("matriz[" + linha + "][" + coluna + "]:");
                matriz[linha][coluna] = leitor.nextInt();
            }
        }
        exibeMatriz(matriz);
        boolean ehQuadradoMagico = quadradoMagico(matriz);

        if (ehQuadradoMagico){
            System.out.println("A matriz é um quadrado mágico.");
        }else {
            System.out.println("A matriz não é um quadrado mágico.");
        }
        leitor.close();
    }
}
