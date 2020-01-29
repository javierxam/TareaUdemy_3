/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamtastic.tarea3;

import java.util.Scanner;

/**
 *
 * @author Xavi
 */
public class Tarea3 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        boolean envio;
                
        System.out.println("Proporciona el nombre:");
        String nombre =scanner.nextLine();
                
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
                
        System.out.println("Proporciona el precio:");
        float precio = Float.parseFloat(scanner.nextLine());
                
        System.out.println("Proporciona el simbolo:");
        char simbolo =scanner.nextLine().charAt(0);
                
        System.out.println("Proporciona el envio gratuito:");
        envio = scanner.nextLine().equalsIgnoreCase("true");
        
        System.out.println(nombre + " #" + id);
        System.out.println("nombre = " + nombre);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: "+envio); 

    }

}
