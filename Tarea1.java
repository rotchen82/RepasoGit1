import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args){ 
    

int numeroDeDia;

Scanner s = new Scanner(System.in);

System.out.println("Ingrese numero");
 numeroDeDia =Integer.parseInt(s.nextLine()) ;

switch(numeroDeDia){
    case 1: 
    numeroDeDia= 1;
    System.out.print("lunes");
    break;
    case 2:
    System.out.print("martes");
    break;
    case 3:
    System.out.print("miercoles");
    break;
    case 4:
    System.out.print("jueves");
    break;
    case 5:
    System.out.print("viernes");
    break;
    case 6:
    System.out.print("sabado");
    break;
    case 7:
    System.out.print("domingo");
    break;
    default:
            System.out.println("El numero es incorrecto");
            break;

        
   }

}
}