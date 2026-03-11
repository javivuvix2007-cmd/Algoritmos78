package es.iesmz.ed.algoritmes;

import java.util.ArrayList;

public class calculMental {
    private String n;

    public calculMental(String n) {
        this.n = n;
    }

    public ArrayList<Integer> Operacion() {
        ArrayList<Integer> resultados = new ArrayList<>();
        String[] partes = n.split(" ");
        int resultado = Integer.parseInt(partes[0]);

        for (int i = 0; i < partes.length; i++) {
            if(partes[i].equals(".")) {
                break;
            }
        String o = partes[i];
        int numero = Integer.parseInt((partes[i] + 1));

        if(n.equals("+")) {
            resultado += numero;
        } else if (n.equals("-")) {
            resultado -= numero;
        }
        resultados.add(resultado);
    }   return resultados;
}
}