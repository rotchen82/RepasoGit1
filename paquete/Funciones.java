package paquete;
public class Funciones {
  public static void muestra (int[] array,int minmax){
    for (int i=0; i<array.length;i++){
      if(array[i]== minmax){
        System.out.print("**"+ array[i]+ "** ");
        }else{
        System.out.print(array[i]+ " ");
      }
    }
  }
  public static boolean esCapicua(int x){
      return x== voltea(x);
  }

 
 public static int voltea(int x){
    int inverso=0;
    while(x>0){
      inverso=(inverso*10)+(x%10);
      x=x/10;
    }
    return inverso;
 }
 public static boolean esPrimo(int n){
    if(n<2){
      return false;
    }else{
      for(int i = n / 2; i>=2 ;i--){
        if(n % i==0){
          return false;
        }
      }
    }
    return true;
 }
 public static int siguientePrimo(int x){
  while(!esPrimo(++x)){

  }
    return x;
  }
  public static int potencia(int base,int exponente){
    if(exponente == 0){
       return 1;
    }
    int acumulador=1;
    for (int i=0; i<exponente;i++){
      acumulador= acumulador* base;

    }
    return acumulador;
  }
 
  public static int digitos(int x){ //devuelve la cantidad de digitos
     if(x == 0){
        return 1;
     }
     int i =0;
     while (x> 0) {
       x= x/10;
       i++;
      
     }
     return i;
  }

}


