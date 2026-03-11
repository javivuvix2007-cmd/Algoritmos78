package es.iesmz.ed.algoritmes;

/**
 * Clase que representa un Sudoku y permite comprobar si es correcto.
 * Un Sudoku es correcto si cada fila, columna y bloque 3x3 contiene
 * los números del 1 al 9 exactamente una vez.
 */
public class Sudoku {
    private int[][] S;

    /**
     * Constructor de la clase Sudoku.
     * @param s Matriz 9x9 que representa el Sudoku a comprobar.
     */
    public Sudoku(int[][] s) {
        S = s;
    }

    /**
     * Comprueba si el Sudoku es correcto.
     * Revisa filas, columnas y bloques 3x3.
     * @return true si el Sudoku es válido, false si hay repeticiones o números fuera de rango.
     */
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