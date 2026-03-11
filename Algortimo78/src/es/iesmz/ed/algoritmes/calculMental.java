package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
/**
 * Clase que realiza operaciones de cálculo mental a partir de una cadena de texto.
 * La cadena contiene números y operadores separados por espacios.
 */

public class calculMental {
    /** Cadena que contiene la operación a realizar */
    private String n;
    /**
     * Constructor de la clase calculMental.
     *
     * @param n Cadena con la operación matemática (números y operadores separados por espacios)
     */
    public calculMental(String n) {
        this.n = n;
    }

    /**
     * Realiza la operación indicada en la cadena y guarda los resultados parciales.
     *
     * @return ArrayList con los resultados después de cada operación realizada
     */
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