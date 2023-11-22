public class Repaso5 {
    public static void main(String[] args){ 
        
        int[] numeros= new int[8];

      /*   for (int i=0; i< numeros.length; i++){ //CICLO FOR 
            System.out.println("ingrese numero");
             numeros[i]= Integer.parseInt(System.console().readLine());

            

        }
        for (int i=0; i< numeros.length; i++){
            if(numeros[i] % 2 == 0){
                System.out.println(numeros[i]+ " Par ");
            }else{
                System.out.println(numeros[i]+ " Impar");
            }
        }*/

        int i=0;
        while(i<numeros.length){ //CICLO WHILE
            System.out.println("ingrese numero");
            numeros[i]= Integer.parseInt(System.console().readLine());
            i++;
        }
        i=0;//se vuelve a inicializar pero no pongo int porque ya esta declarada antes, sino puedo poner j y cambio todo por j
        do{//CICLO DO WHILE
             if(numeros[i] % 2 == 0){
                System.out.println(numeros[i]+ " Par ");
            }else{
                System.out.println(numeros[i]+ " Impar");
            }


        }while(i<numeros.length);



       

    }  
}
