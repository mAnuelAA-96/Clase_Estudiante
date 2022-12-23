/**
 *
 * @author Manuel Flores Vilchez
 */

package clase_estudiante;


public class Estudiante {
    private String nombre;
    private double notaMedia;
    private int numNotas;
    
    
    Estudiante (String nombre, double notaMedia, int numNotas) throws Exception{
        if (nombre.equals("") || notaMedia < 0 || numNotas < 0){
            throw new Exception ("Datos iniciales erróneos.");
        }
        this.nombre = nombre;
        this.notaMedia = notaMedia;
        this.numNotas = numNotas;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getNotaMedia(){
        return notaMedia;
    }
    
    public int getNumNotas(){
        return numNotas;
    }
    
    public boolean actualizarNotaMedia(double nuevaNota){
        boolean notaCorrecta = false;
        if (nuevaNota >= 0){
            double notaAcumulada = 0;
            notaAcumulada = notaMedia*numNotas;
            numNotas++;
            notaMedia = (notaAcumulada + nuevaNota)/numNotas;
            notaCorrecta = true;
        }else if (nuevaNota < 0){
            notaCorrecta = false;
        }
        return notaCorrecta;
    }
    
    public char calificacionMedia(){
        char calificacion = 0;
        if (notaMedia < 5){
            calificacion = 'F';
        }
        if (notaMedia >= 5 && notaMedia < 6){
            calificacion = 'E';
        }
        if (notaMedia >= 6 && notaMedia < 7){
            calificacion = 'D';
        }
        if (notaMedia >= 7 && notaMedia < 8){
            calificacion = 'C';
        }
        if (notaMedia >= 8 && notaMedia < 9){
            calificacion = 'B';
        }
        if (notaMedia >= 9){
            calificacion = 'A';
        }
        return calificacion;
    }
    
    @Override
    public String toString(){
        String cadena = 
                "Estudiante: " + nombre + ", " +
                "nota media: " + (double)Math.round(notaMedia*100d)/100d + ", " +
                "número de notas: " + (double)Math.round(numNotas*100d)/100d + ".";
        return cadena;
    }
    
}//fin class
