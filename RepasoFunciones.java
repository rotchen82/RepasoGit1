import paquete.Funciones;
public class RepasoFunciones {
    public static void main(String[] args){ 
        boolean salida=true;
        int numeroUsuario;
        
       
        do{
            System.out.println("*********");
            System.out.println("1:esCapicua");
            System.out.println("2:esPrimo");
            System.out.println("3:siguientePrimo");
            System.out.println("4:Potencia");
            System.out.println("5:Voltea");
            System.out.println("6:Digitos");

            
            System.out.println("0:salir");
            switch(System.console().readLine()){ //opcion= integer switch(opcion) pero los case con numero sin comillas
              case "1":
                System.out.println("ingrese un numero positivo");
                numeroUsuario= Integer.parseInt(System.console().readLine());
                   if(Funciones.esCapicua(numeroUsuario)){
                      System.out.println("Es capicua");
                    }else{
                       System.out.println("No es capicua");
                    }
                    break;
              case "2":
              System.out.println("ingrese un numero positivo");
                numeroUsuario= Integer.parseInt(System.console().readLine());
                   if(Funciones.esPrimo(numeroUsuario)){
                      System.out.println("Es primo");
                    }else{
                       System.out.println("No es primo");
                    }
                
                break;
              case "3":
                 System.out.println("ingrese un numero positivo");
                numeroUsuario= Integer.parseInt(System.console().readLine());
                System.out.println("El siguiente numero primo es: ");
                System.out.println(Funciones.siguientePrimo(numeroUsuario));
                break;
              case "4":
                int exponente;
                System.out.println("ingrese un numero de base");
                numeroUsuario= Integer.parseInt(System.console().readLine());
                System.out.println("ingrese la potencia");
                exponente= Integer.parseInt(System.console().readLine());
                System.out.println(Funciones.potencia(numeroUsuario, exponente));
               break;

               case "5":
                 System.out.println("ingrese un numero positivo");
                 numeroUsuario= Integer.parseInt(System.console().readLine());
                 System.out.println("El numero inverso es: "+Funciones.voltea(numeroUsuario));
                 break;

                 case "6":
                 System.out.println("ingrese un numero positivo");
                 numeroUsuario= Integer.parseInt(System.console().readLine());
                 System.out.println("la cantidad de digitos es:" + Funciones.digitos(numeroUsuario));
                 break;
              
              case "0":
                salida=false;
                break;
        
              default:
                  System.out.println("opcion incorrecta");
                break;
            }
        }while(salida);
    }     

}
