public class ej9 {
    public static void main(String[] args) {
        int[][] array;
        array = new int[10][10];
        int countFil = 0, countCol = 0, countOnes = 0;

        for (int fila = 0; fila < array.length; fila++) {
            for (int col = 0; col < array[0].length; col++) {
                array[fila][col] = 1;
            }
        }

        array[0][4] = 8;
        array[2][6] = 8;
        array[3][1] = 8;
        array[8][6] = 8;
        for (int fila = 0; fila < array.length; fila++) {
            for (int col = 0; col < array[0].length; col++) {
                System.out.print(array[fila][col] + " ");
            }
            System.out.println();
        }
        for (int fila = 0; fila < array.length; fila++) {
            countOnes = 0;
            for (int col = 0; col < array[0].length; col++) {
                if (array[fila][col] == 1) {
                    countOnes++;
                }
            }
            if (countOnes == array[0].length) {
                countFil++;
            }
        }
        for (int col = 0; col < array[0].length; col++) {
            countOnes=0;
            for (int fila = 0; fila < array.length; fila++) {
                if (array[fila][col] == 1) {
                    countOnes++;
                }
            }
            if (countOnes == 10) {
                countCol++;
            }
        }
        System.out.println("Filas de 1= " + countFil);
        System.out.println("Columnas de 1 = " + countCol);
    }
}