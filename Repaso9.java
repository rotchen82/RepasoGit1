import paquete.Funciones;
public class Repaso9 {
    public static void main(String[] args){ 
      int []numeros= new int[100];
      int max=0;
      int min=501;
      int opcion;

      for (int i=0;i<numeros.length;i++){
        numeros[i]=(int)(Math.random()*501);
        if (numeros[i]> max){
            max= numeros[i];
        }else if (numeros[i]<min){
            min=numeros[i];
        }
         System.out.print(numeros[i]+ " ");
        }
        System.out.println("Que desea destacar? (1:minimo 2:maximo)");
        opcion=Integer.parseInt(System.console().readLine());
        switch(opcion){
            case 1:
            Funciones.muestra(numeros,min);
             /*  for(int i=0;i< numeros.length;i++){
                if(numeros[i]==min){
                  System.out.println("**"+numeros[i]+ "**");

                }else{
                    System.out.print(numeros[i]+ " ");
                }
              }*/
            break;
            case 2:
            Funciones.muestra(numeros,max);
            /*for(int i=0;i< numeros.length;i++){
                if(numeros[i]==max){
                  System.out.println("**"+numeros[i]+ "**");

                }else{
                    System.out.print(numeros[i]+ " ");
                }
              }*/
            break;
            default:
            System.out.println("Opcion incorrecta");
          }

    }
     /*  public static void muestra (int[] array,int minmax){
        for (int i=0; i<array.length;i++){
          if(array[i]== minmax){
          System.out.print("**"+ array[i]+ "** ");
         }else{
          System.out.print(array[i]+ " ");
        }
      }*/
    
}
