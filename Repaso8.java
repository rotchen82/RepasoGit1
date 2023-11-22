public class Repaso8 {
    public static void main(String[] args){ 
        int[] numAleatorio=new int [10];

        for(int i=0; i< numAleatorio.length;i++){
            numAleatorio[i]=(int)(Math.random()*100);
            System.out.println(numAleatorio[i]+ " ");
        }
       /* System.out.print("Minimo: "+numAleatorio[0]);
        System.out.print(" Maximo: "+(numAleatorio.length-1));*/
        
        int max=0;
        int min=101;
        for(int i=0; i< numAleatorio.length; i++){
            if (numAleatorio[i]> max){
                max= numAleatorio[i];

            }else if(numAleatorio[i]<min);
            min=numAleatorio[i];
           
        }
        System.out.println();
         System.out.println("El numero mayor es: "+ max);
         System.out.println("El numero menor es: "+ min);



    }
}