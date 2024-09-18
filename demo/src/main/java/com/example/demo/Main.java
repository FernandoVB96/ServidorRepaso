package com.example.demo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\fvaquero\\2 DAW\\SERVIDORES";
        // Crear un objeto File con la ruta
        File archivo = new File(rutaArchivo);
        // Verificar si el archivo existe
        if (archivo.exists()) {
            // Usar BufferedReader para leer el archivo línea por línea
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                
                // Leer cada línea del archivo y mostrarla por consola
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
                
            } catch (IOException e) {
                System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo no existe en la ruta especificada.");
        }

    }
}