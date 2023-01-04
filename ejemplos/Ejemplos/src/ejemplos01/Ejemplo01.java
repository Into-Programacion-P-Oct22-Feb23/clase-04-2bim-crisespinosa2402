/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena01 = "Loja";
                
        //String miCiudad = obtenerCiudadMayuscula("Loja");
        String miCiudad = obtenerCiudadMayuscula(cadena01);
        System.out.printf("%s\n", miCiudad);
        
        // opcion 1
        String nombre = obtenerNombre();
        System.out.printf("%s\n", nombre);
        
        //opcion 2
        System.out.printf("%s\n", obtenerNombre());
    }
    
    
    public static String obtenerCiudadMayuscula(String m){
        String m2 = m.toUpperCase();
        return m2;
    }
    
    public static void obtenerMultiplicacion(int tabla, int limite){
        
    }
    
    public static String obtenerNombre(){
        return "Luis";
    }
    
    
}
