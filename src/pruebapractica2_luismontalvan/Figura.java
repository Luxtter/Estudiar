/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebapractica2_luismontalvan;

/**
 *
 * @author luism
 */
public class Figura {
   public int largo;
   public int alto;
   public int ancho;
   public int figura1;
   public String figura2;
  
   
    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getFigura1() {
        return figura1;
    }

    public void setFigura(int figura) {
        this.figura1 = figura;
    }

    public void queFigura(int figura){
        if(figura==1){
            this.figura2="Cuadrado";
        }else if(figura==2){
            this.figura2="Triangulo";
        }else if(figura==3){
            this.figura2="Rectangulo";
        }
    }
   
   
   public double area(int figura){
       double area;
       if(figura==2){
         area= (1/2)*alto*largo;  
       }else{
           area= largo*ancho; 
       }
       return area;
    }
   public double volumen(int figura){
       double volumen;
       if(figura==1){
         volumen= largo*largo*largo;  
       }else if(figura==3){
           volumen= largo*ancho*alto;
       }else{
           volumen= largo*alto;
       }
       return volumen;
    } 

    @Override
    public String toString() {
        if(figura1!=2){
            return "Figura{" + "Tipo de figura=" + figura2 + ", con " + alto + ", de alto y " + ancho + ", de ancho " + figura2 + '}';
        }else{
            return "Figura{" + "Tipo de figura=" + figura2 + ", con " + alto + ", de alto y " + alto + ", de alto " + figura2 + '}';
        }
    }
   
}
