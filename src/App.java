import controllers.SortPersonaMethods;
import models.Persona;
import models.Resultado;
import utils.Benchmarking;

public class App {
    public static void main(String[] args) throws Exception {
        public static Persona[] generarPersonas(int cantidad){
        Persona[] personas = new Persona[cantidad];
        for (int i =0;i<cantidad;i++){
            String nombre= "Persona"+(i+1);
            int edad = (int) (Math.random()*101);
            personas[i]=new Persona(nombre,edad);
        }
        return personas;

    }
}