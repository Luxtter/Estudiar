/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapractica2_luismontalvan;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author luism
 */
public class PruebaPractica2_LuisMontalvan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner pochita= new Scanner(System.in);
        System.out.print("Cuantas figuras desea: ");
        Figura clase = new Figura();
        int numFiguras = pochita.nextInt();
        ArrayList figuras = new ArrayList();
        for (int i = 0; i < numFiguras; i++) {
            System.out.print("1)Cuadrado\n2)Triangulo\n3)Rectangulo\nQue figura desea ingresar: ");
            int fig= pochita.nextInt();
            figuras.add(fig);
            if(fig==1){
                System.out.print("Ingrese el largo: ");
                int largo= pochita.nextInt();
                figuras.add(largo);
                System.out.print("Ingrese el ancho: ");
                int ancho= pochita.nextInt();
                figuras.add(ancho);
            }else if(fig== 2){
                System.out.print("Ingrese el largo: ");
                int largo= pochita.nextInt();
                figuras.add(largo);
                System.out.print("Ingrese el alto: ");
                int alto= pochita.nextInt();
                figuras.add(alto);
            }else if(fig==3){
                System.out.print("Ingrese el largo: ");
                int largo= pochita.nextInt();
                figuras.add(largo);
                System.out.print("Ingrese el ancho: ");
                int ancho= pochita.nextInt();
                figuras.add(ancho);
            }else{
               System.out.println("Opcion no valida");
            }
        }
        for (int i = 0; i < numFiguras; i++) {
            clase = new Figura()
            figuras.remove(0);
            
            clase.toString();
        }
        
        
    }
    
}
