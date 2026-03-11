package es.iesmz.ed.algoritmes;

public class Sudoku {
    private int[][] S;

    public Sudoku(int[][] s) {
        S = s;
    }

    public boolean esCorrecte() {
        for (int i = 0; i < 9; i++) {
            boolean[] fila = new boolean[10];
            boolean[] columna = new boolean[10];
            boolean[] bloque = new boolean[10];

            for (int j = 0; j < 9; j++) {
                int numFila = S[i][j];
                if (numFila < 1 || numFila > 9 || fila[numFila]) return false;
                fila[numFila] = true;

                int numCol = S[j][i];
                if (numCol < 1 || numCol > 9 || columna[numCol]) return false;
                columna[numCol] = true;

                int bi = 3 * (i / 3) + j / 3;
                int bj = 3 * (i % 3) + j % 3;
                int numBloque = S[bi][bj];
                if (numBloque < 1 || numBloque > 9 || bloque[numBloque]) return false;
                bloque[numBloque] = true;
            }
        }
        return true;
    }
}