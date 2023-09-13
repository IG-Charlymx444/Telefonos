/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.telefonos.ui;

import java.util.Scanner;
import mx.itson.telefonos.numeros.Operacion;

/**
 *
 * @author alumnog
 */
public class Main {
    public static void main(String[] args) {
         System.out.println("Escriba los numeros a separar");
        Scanner Scanner = new Scanner(System.in); 
        String oracion= Scanner.nextLine();

   String nuevaOracion =oracion.replace("(", "").replace(")", "");
        System.out.println(nuevaOracion);

 String oracionNueva =oracion.replace("-", "")
       System.out.println(oracionNueva);

        String[] resultado = new Operacion().separar(oracion);
        for(String s : resultado){
        System.out.print(s);}
   String [] telefono = s.split(",");
       String Guaymas = telefono [622];
       String Hermosillo = telefono [662];
       String Tijuana = telefono [664]; 
