package com.beans;
import java.util.*;

public class Registrodeestudiantes {
    public static void main(String[] args){
        HashSet<String> estudiantes = new HashSet<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese la cantidad de estudiantes a registrar: ");
            int cantidadestudiantes = scanner.nextInt();
            scanner.nextLine();

            // solicitar nombre de estudiantes
            for (int i = 0; i < cantidadestudiantes; i++) {
                System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
                String nombre = scanner.nextLine();
                estudiantes.add(nombre);
            }

            //mostra estudiantes 

            System.out.println("\n lista de estudiantes registrados: ");
            for (String estudiante : estudiantes) {
                System.out.println(estudiante);
            }
            // verificar si un estudiante esta registrado
            System.out.println("\nIngrese el nombre del estudiante a buscar: ");
            String buscar = scanner.nextLine();

            if(estudiantes.contains(buscar)){
                System.out.println("El estudiante " + buscar + " si se encuentra registrado");
            }else{
                System.out.println("El estudiante " + buscar + " no se encuentra registrado");
            }
        } 
    }
}