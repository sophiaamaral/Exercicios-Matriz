import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maxAluno;

        //Slicitar valor de maxAluno
        do {
            System.out.println("Digite o número de alunos (entre 5 e 15): ");
            maxAluno = leitor.nextInt();
        }while (maxAluno < 5 || maxAluno > 15);

        // Criar vetores e matrizes
        String[] aluno = new String[maxAluno];
        double[][] notas = new double[maxAluno][2];
        double[] media = new double[2];
        double[] mediaAluno = new double[maxAluno];

        //Ler os nomes dos alunos
        leitor.nextLine(); // Limpa o buffer
        for (int i = 0; i < maxAluno; i++){
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            aluno[i] = leitor.nextLine();
        }

        //Ler as notas dos alunos
        for (int i = 0; i < maxAluno; i++){
            System.out.println("Digite a nota AC1 de " + aluno[i] + ": ");
            notas[i][0] = leitor.nextDouble();
            System.out.println("Digite a nota AC2 de " + aluno[i] + ": ");
            notas[i][1] = leitor.nextDouble();
        }

        //Calcular a media das notas AC1 e AC2
        double somaAC1 = 0, somaAC2 = 0;
        for (int i = 0; i < maxAluno; i++){
            somaAC1 += notas[i][0];
            somaAC2 += notas[i][1];
        }
        media[0] = somaAC1 / maxAluno;
        media[1] = somaAC2 / maxAluno;

        //Calcular a media das notas de cada aluno
        for (int i = 0; i < maxAluno; i++){
            mediaAluno[i] = (notas[i][0] + notas[i][1]) / 2;
        }

        //Exibir os dados formatados
        System.out.printf("%-20s %15s %15s %20s%n", "NOME DO ALUNO", "NOTA AC1", "NOTA AC2", "MÉDIA DO ALUNO");
        for (int i = 0; i < maxAluno; i++){
            System.out.printf("%-20s%15.1f%15.1f%20.1f%n", aluno[i], notas[i][0], notas[i][1], mediaAluno[i]);
        }
        System.out.printf("%-20s%15.1f%15.1f%n", "MÉDIA DA AC", media[0], media[1]);

        leitor.close();
    }
}
