package com.mycompany.faunasalvaje;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FaunaSalvaje {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<String> nombre = new ArrayList<>();
    static ArrayList<Double> tamaño = new ArrayList<>();
    static ArrayList<Double> peso = new ArrayList<>();
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a nuestra clínica de rehabilitación \"FAUNA SALVAJE\" ");

        int opcionSeleccionada;
        do {
            opcionSeleccionada = mostrarMenu();

            switch (opcionSeleccionada) {
                case 1:
                    alta();
                    break;
                case 2:
                    tratamiento();
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
            }
        } while (opcionSeleccionada != 6);
    }

    private static int mostrarMenu() {
        String[] opciones = new String[]{"1.Alta del paciente", "2.Tratamiento del paciente", "3.Liberación del paciente", "4.Listado de pacientes", "5.Baja del paciente", "6.Salir"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(
                null,
                "Escoge ahora entre las siguientes opciones que es lo que deseas realizar: ", //Se muestra en el cuadro de diálogo
                "Menú", //título del cuadro
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        return opcionSeleccionada + 1; // Agregar 1 para que coincida con los casos del switch
    }

    private static void alta() {
        System.out.println("Introduce el nombre del animal:");
        String nombres = entrada.nextLine();

        System.out.println("Introduce el tamaño del animal:");
        double tamaños = entrada.nextDouble();

        System.out.println("Introduce el peso del animal:");
        double pesos = entrada.nextDouble();
        entrada.nextLine();
        //Guarda los datos de los animales en una lista
        nombre.add(nombres);
        tamaño.add(tamaños);
        peso.add(pesos);
    }

    private static void tratamiento() {
   
    }

    private static void liberacion() {
        
    }

    private static void listado() {
        System.out.println("¿Qué animal estás buscando?");
        String animalBuscado = entrada.nextLine();

        for (int i = 0; i < nombre.size(); i++) {
            if (nombre.get(i).equalsIgnoreCase(animalBuscado)) {
                System.out.printf("El animal %s tiene un tamaño de %.2f y un peso de %.2f\n",
                        nombre.get(i), tamaño.get(i), peso.get(i));
                return;
            }
        }
        System.out.println("Animal no encontrado.");
    }

    private static void baja() {
        System.out.println("¿Qué animal estás buscando?");
        String animalBuscado = entrada.nextLine();

        for (int i = 0; i < nombre.size(); i++) {
            if (nombre.get(i).equalsIgnoreCase(animalBuscado)) {
                nombre.remove(i);
                tamaño.remove(i);
                peso.remove(i);
                System.out.println("Sentimos la pérdida de: " + nombre);
                return;
            }
        }
        System.out.println("Animal no encontrado");
    }

    private static void salir() {
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestra aplicación. ¡Hasta luego!");
        System.exit(0); // Finaliza la ejecución del programa
    }
}