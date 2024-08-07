//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//declaração de vetores

        int[] vetor = new int[5];

        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;

        //forma de mostrar o vetor de forma nativa:

        System.out.println("Elementos do array 'vetor': ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento na posição " + i + ":" + vetor[i]);
        }

        //soma dos valores do vetor:
        System.out.println("Soma do array 'vetor': ");
        int sum = 0;
        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[i];
        }
        int[] vetorInicializado = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(sum);

        //maior valor do vetor

        System.out.println("Maior valor do array 'vetor'");
        int max = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        System.out.println(max);

//reverter o array vetor

        System.out.println("O array revertido é: ");
        int start = 0;
        int end = vetor.length - 1;
        while (start < end) {
            int temp = vetor[start];
            vetor[start] = vetor[end];
            vetor[end] = temp;

            start++;
            end--;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + vetor[i]);
        }
// adicionando em um array (uma técnica de inclusão)
//

        System.out.println("Adicionando um valor ao array vetor: ");
        int[] newArray = new int[vetor.length + 1];

        for (int i = 0; i < vetor.length; i++) {
            newArray[i] = vetor[i];
        }

        newArray[vetor.length] = 1;

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + newArray[i]);
        }

//removendo elemento do array

        System.out.println("Removendo o ultimo termo do array vetor: ");
        int count = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 10) {
                count++;
            }
        }

        int[] newArray2 = new int[count];
        int index = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 10) {
                newArray2[index] = vetor[i];
                index++;
            }
        }

        for (int i = 0; i < newArray2.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + newArray2[i]);
        }

//pesquisando elementos
        System.out.println("Pesquisando o elemento 20 no array vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 20) {
                System.out.println("O valor 20 está na posição [" + i + "] do array vetor.");
            }
        }

//declaração de matrizes (arrays bidimensionais)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.println(value + "");
            }
            System.out.println();
        }

        //rotacão da matriz

        int n = matrix.length;
        int[][] rotacionada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotacionada[j][n - 1 - i] = matrix[i][j];
            }
        }

        System.out.println("Matriz rotacionada 90 graus: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(rotacionada[i][j] + "  ");
            }
            System.out.println();
        }

//soma matriz
        int soma = 0;
        int somaSecundario = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    soma += matrix[i][j];
                }
                if ((i + j) == matrix.length - 1) {
                    somaSecundario += matrix[i][j];
                }
            }
        }

        System.out.println("Soma principal: " + soma);
        System.out.println("Soma secundaria: " + somaSecundario);

// Pesquisar valor na matriz
        int searchValue = 5;
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchValue) {
                    found = true;
                    System.out.println("Valor " + searchValue + " encontrado na linha: " + i + ", coluna: " + j);
                }
            }
            if (!found) {
                System.out.println("Valor " + searchValue + " não encontrado na matriz!");
                break;
            }
        }
//declaração de string


  String[] palavras = {"teste"};




    }
}