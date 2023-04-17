/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricad;

/**
 *
 * @author Alumno
 */
public class Matricad {
    private java.util.ArrayList<String> cadenes; 	// refer�ncia a la llista de cadenes, un camp
    /**
     * Constructor de Matricad.
     * @param dada matriu amb les cadenes per a la llista
     */
    public Matricad(String[] dada) {
        if ((dada == null) || (dada.length == 0)) {	// Verifiquem que la llista tinga valors  
            throw new IllegalArgumentException();
        }
        this.cadenes = new java.util.ArrayList<>();
        for (String element : dada) {
            cadenes.add(element);
        }
    }
    /**
     * @return la cadena que t� m�s car�cters. La primera si hi ha diverses amb la mateixa longitud
     */
    public String getMaxCad() {
        String max = "";
        for (String element : cadenes) {
            if (element.length() > max.length()) {
                max = element;
            }
        }
        return max;
    }
    /**
     * @return la suma total de car�cters de totes les cadenes.
     */
    public int getSumaCaracters() {
        int total = 0;
        for (String d : cadenes) {
            total += d.length();
        }
        return total;
    }
    /**
     * Retorna l'�ndex de la cadena buscada.
     *
     * @param unaCadena Cadena buscada
     * @return Retorna la posici� d'un element dins de l�array
     * @throws java.util.NoSuchElementException Si l'element no existeix en la llista
     */
    public int getIndexDe(String unaCadena) throws java.util.NoSuchElementException {
        if (unaCadena == null) { 	// Comprovem que l'argument siga v�lid  
            throw new IllegalArgumentException();
        }
        int pos = 0;
        for (String d : cadenes) { 	// Recorrem la informaci� fins a trobar l'element
            if (d.equals(unaCadena)) {
                return pos;
            }
            pos++;
        }
        throw new java.util.NoSuchElementException(unaCadena); 	// L'element no existeix, llancem l'excepci�
    }
}
