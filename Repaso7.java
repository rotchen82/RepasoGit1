public class Repaso7 {
    public static void main(String[] args){ 
     int[] numAleatorio=new int [100];
     int[] cuadrados=new int [100];
     int[] cubos=new int [100];

        System.out.println("numeros|cuadrados|cubos\n");
        for(int i=0; i< numAleatorio.length;i++){
         numAleatorio[i]=(int)(Math.random()*100);
         cuadrados[i]=numAleatorio[i]*numAleatorio[i];
         cubos[i]=numAleatorio[i]*numAleatorio[i]*numAleatorio[i];
         System.out.printf("%d     %d      %d \n", numAleatorio[i], cuadrados[i], cubos[i]);
        }
             
    }
}
