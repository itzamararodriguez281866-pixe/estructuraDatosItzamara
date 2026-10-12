/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradedatos22026.newpackage;

/**
 *
 * @author puma_
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Junito";
        System.out.println(nombre);
        
        
        String[] nombres = {"Juanito", "Luis", "María", "Lupita" };
        System.out.println(nombres[1]);
        nombres[1] = "Luisito";
        System.out.println(nombres[1]);
        
        System.out.println("- Imprimir todos los valores -");
        for(int i = 0; i<nombres.length; i++){
            System.out.println(i + ": " + nombres[1]);
        }
        for(String n :nombres){
            System.out.println("Nombre: " + n);
            
        }
        
        
        String[] carreras = new String[10];
        carreras[0] = "ISW";
        carreras[4] = "LDG";
        carreras[8] = "IIS";
        
        for(String carrera :carreras){
            System.out.println(carrera);
            
        }
    }
    
}
