/**
 *
 * @author Manuel Flores Vilchez
 */
package clase_estudiante;

public class Clase_Estudiante_MFV {

    public static void main(String[] args) {
        
        Estudiante est1 = null;
        Estudiante est2 = null;
        Estudiante est3 = null;
        
        
        System.out.println ("Intento crear estudiante de nombre Ricardo.");
        try{
            est1 = new Estudiante ("Ricardo", -1, 0);
        }catch (Exception e){
            System.out.println ("Error al intentar crear: " + e.getMessage());
        }
        System.out.println ("");
        
        System.out.println ("Vamos a crear dos objetos estudiante");
        System.out.println ("Mostramos la información de los dos objetos estudiante");
        try{
            est2 = new Estudiante ("Antonio Bernal Campillo", 0, 0);
            System.out.println (est2.toString());
        }catch (Exception e){
            System.out.println (e.getMessage());
        }
        
        try{
            est3 = new Estudiante ("Francisco Cucharas Gómez", 2, 1);
            System.out.println (est3.toString());
        }catch (Exception e){
            System.out.println (e.getMessage());
        }
        System.out.println ("");
        
        
        System.out.println ("Actualizamos la nota de Antonio con una nueva nota de 7.7");
        est2.actualizarNotaMedia(7.7);
        System.out.println (est2.toString());
        System.out.println ("");
        
        
        System.out.println ("Actualizamos la nota de Francisco con una nueva nota de 7.5");
        est3.actualizarNotaMedia(7.5);
        System.out.println (est3.toString());
        System.out.println ("");
        
        
        System.out.println ("Mostramos la calificación media de Antonio");
        System.out.println ("La calificación media de " + est2.getNombre() + " es " + est2.calificacionMedia());
        System.out.println ("");
        
    }// fin main
}// fin class
