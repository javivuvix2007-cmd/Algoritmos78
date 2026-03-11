package es.iesmz.ed.algoritmes;

public class Sudoku {
    private int[][] S;

    public Sudoku(int[][] s) {
        S = s;
    }
    public boolean esCorrecte() {
        for (int i = 1; i < 9; i++) {
            boolean[] v = new boolean[10];
            for (int j = 0; j < 9; j++) {
                int num = S[i][j];

                if(v[num]) {
                    return false;
                }
                v[num] = true;
            }
        } return true;
    }
}
