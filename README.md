# Exercicios-Matriz

<h3>Estrutura de Dados</h3>

Crie um novo projeto chamado exercicio-matriz.

1. Escreva um programa que cria uma matriz 2x3 de inteiros, solicite que o usuário digite os
valores para preencher a matriz, leia os valores, preencha a matriz e depois exiba os valores
em forma de matriz.

3. Elabore um método exibeMatriz, que recebe uma matriz de inteiros e exibe seus valores em
forma de matriz. Escreva no main o código que leia os valores de duas matrizes 2x3 de
inteiros. Depois calcule a soma dessas duas matrizes, armazenando a soma em uma terceira
matriz e exiba os valores dessa terceira matriz (chame o método exibeMatriz para exibir a
matriz).

5. Elabore um programa em Java que leia os valores de uma matriz 3x3 de inteiros. Crie um vetor
de 3 elementos, contendo o total de cada coluna e exiba os valores desse vetor.

Exemplo: Suponha a matriz abaixo com os valores de 1 a 9 inseridos:
1 2 3
4 5 6
7 8 9

O vetor contendo os totais de cada coluna seria:

12 15 18

7. Elaborar um programa que solicita que o usuário digite um número n, que deve ser maior do
que 1 e menor do que 6. Em seguida, crie uma matriz n x n de números inteiros e solicite que
o usuário digite os valores para preencher a matriz. Em seguida, calcule e exiba a soma dos
elementos da diagonal principal da matriz e a soma dos elementos da diagonal secundária da
matriz.

Exemplo: neste exercício, o usuário que define o tamanho da matriz.
Vamos supor que o usuário digitou n = 3. Então a matriz será 3 x 3
Vamos supor que o usuário digitou os valores conforme o desenho abaixo:

1 2 3
4 5 6
7 8 9

Os elementos da diagonal principal são: 1, 5 e 9. Soma: 15

Os elementos da diagonal secundária são 3, 5, 7. Soma: 15

9. Elaborar um método quadradoMagico, que recebe uma matriz de inteiros e devolve true se ela
for um quadrado mágico e false caso contrário. Para que seja considerado um quadrado
mágico, a soma dos elementos de cada linha deve ser a mesma, e deve ser igual à soma dos
elementos de cada coluna, e igual à soma dos elementos de cada diagonal.

No main, leia os valores de uma matriz 3x3 e chame o método quadradoMagico para verificar
se essa matriz é um quadrado mágico.

Por exemplo, a matriz abaixo é considerada um quadrado mágico, pois a soma de cada linha
é igual a 15, assim como a soma de cada coluna e de cada diagonal:

2 7 6
9 5 1
4 3 8

10. Escreva o código para:
    
- Solicitar que o usuário digite o valor maxAluno, que deverá ser um número inteiro maior ou
igual a 5 e menor ou igual a 15. Enquanto o usuário não digitar um valor válido, solicitar que
digite novamente.

- Criar um vetor aluno de maxAluno posições, do tipo String.
- Criar uma matriz notas de maxAluno linhas e 2 colunas, do tipo double.
- Criar um vetor media de 2 posições, do tipo double.
- Criar um vetor mediaAluno de maxAluno posições, do tipo double.
- Solicitar que o usuário digite os nomes dos alunos, que serão armazenados no vetor aluno.
- Solicitar que o usuário digite as notas dos alunos, que deverão ser armazenados na matriz
notas (1ª coluna: nota AC1, 2ª coluna: nota AC2). O nome do 1º aluno estará no vetor aluno,
índice zero. As notas do 1º aluno estarão na matriz notas, na linha zero.
- Calcular a média das notas da AC1 (de todos os alunos) e colocar no vetor media, índice
zero.
- Calcular a média das notas de AC2 (de todos os alunos) e colocar no vetor media, índice 1.
- Calcular a média das notas da AC1 e AC2 do 1º aluno (índice zero) e colocar no vetor
mediaAluno, índice zero, e assim sucessivamente.
- Exibir os dados em forma de tabela, com os títulos das colunas, de forma que na 1ª coluna,
apareçam os nomes dos alunos. Na 2ª coluna, as notas AC1 de cada aluno, na 3ª coluna, as
notas AC2, na 4ª coluna a média dos alunos. Utilize a saída formatada para isso, alinhando o
nome à esquerda e as notas à direita.
- Na última linha, exiba as médias das notas (das colunas) AC1 e AC2.
  
A exibição deverá usar a Saida Formatada e ser algo do tipo:

NOME DO ALUNO       NOTA AC1       NOTA AC2       MÉDIA DO ALUNO
Amanda                   5,0            7,5                  6,3
José                     3,0            6,0                  4,5
Mário                    4,5            5,0                  4,8
Fulano                   6,0            8,5                  7,3
Beltrano                 5,5            6,5                  6,0
MÉDIA DA AC              4,8            6,7
