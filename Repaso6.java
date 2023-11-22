public class Repaso6 {
    public static void main(String[] args){ 
        
        int[] numeros= new int[10];

        for(int i=0; i<numeros.length;i++){
        System.out.println("Ingrese un numero");
        numeros[i]= Integer.parseInt(System.console().readLine());
        }
        System.out.println("El orden inverso es: ");
        for(int i=numeros.length-1;i>=0;i--){
            System.out.print(numeros[i]+ " ");

        }
    }
    
}
