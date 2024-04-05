

package com.mycompany.faunasalvaje;

/**
 *
 * @author Brian Guerra C.
 */
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
        

public class FaunaSalvaje {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a nuestra tienda virtual");
        //JOptionPane.showMessageDialog(null, "Escoge ahora entre las siguientes opciones que es lo que deseas realizar: ");
        // Mostrar el menú y obtener la opción seleccionada
        String[] opciones = new String[]{"1.Alquilar Coche", "2.Consultar Modelo y precio", "3.Salir"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(
                null,
                "Escoge ahora entre las siguientes opciones que es lo que deseas realizar: ", //Se muestra en el cuadro de diálogo
                "Menú", //título del cuadro
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        switch (opcionSeleccionada) {
            case 1:
                alta();
                break;
            case 2:
                tratamiento;
                break;
            case 3:
                liberacion();
                break;
            case 4:
                listado();
                break;
            case 5:
                baja();
                break;
            case 6:
                salir();
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 6);
        
    }
    
    
private static void mostrarMenu(){

        System.out.println("--- Fauna Salvaje ---");
        System.out.println("1. Alta del paciente");
        System.out.println("2. Tratamiento del paciente");
        System.out.println("3. Liberación del paciente");
        System.out.println("4. Listado de pacientes");
        System.out.println("5. Baja del paciente");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
private static void alta(){

}
private static void tratamiento(){

}
private static void liberacion(){

}
private static void listado(){

}
private static void baja(){

}

private static void salir(){

}
}