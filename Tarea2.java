import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args){ 

     int horaIngresada;



     System.out.println("Ingrese una hora");
     horaIngresada =Integer.parseInt(System.console().readLine());;

     if (horaIngresada>=6 && horaIngresada<=12){
          System.out.println("Buen dia");
        }else if(horaIngresada>=13 && horaIngresada<=20){
          System.out.println("buenas tardes");
        }else if (horaIngresada>24 || horaIngresada<0) {
           System.out.println("error");
        }else{
          System.out.println("buenas noches");
        }
       // }else if(horaIngresada>21 && horaIngresada<5){
        //  System.out.println("buenas noches");
        
  }
}
  

        







 


