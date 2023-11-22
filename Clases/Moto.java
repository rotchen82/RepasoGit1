package Clases;

public class Moto extends Vehiculo {
    int cilindrada;

    public Moto(String ma,String mo,String pa){
     super(ma,mo,pa);
    }
    
    @Override //Significa que este metodo va a ser sobreescrito de la clase padre
    public void arranca(){
        System.out.println("wiiii Arranca la moto");
        super.encendido= false;
    }
}
