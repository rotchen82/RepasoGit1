package Clases;

public abstract class Vehiculo {
    //Atributos de la clase entera
    private static int kilometrajeTotal=0;
    //Metodos de la clase entera
    public static int getKilometrajeTotal(){
        return kilometrajeTotal;
    }
    
    //ATRIBUTOS
    private String marca;
    private String modelo;
    private int kilometraje;
    private String patente;
    protected boolean encendido;

     // Constructor x defecto
     public Vehiculo(){

     }
     //Constructor
     public Vehiculo(String ma, String mo, String pa){
        this.marca = ma;
        this.modelo = mo;
        this.patente = pa;
        this.kilometraje = 0;
        this.encendido = false;
    }
    // Getters
    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getPatente(){
        return this.patente;
    }

    public int getKilometraje(){
        return this.kilometraje;
    }

    // Metodos
    public void tocaBocina(){
        if(encendido){
            System.out.println("HONK!");
        }else{
            System.out.println("el vehiculo esta apagado");
        }
        
    }

    public void arranca(){
        System.out.println("BRUUMMM! arranca el vehiculo");
        this.encendido = true;
    }
    public void apaga(){
        this.encendido = false;
    }

    public void recorre(int kilometrosRecorridos){
        if(encendido){
            System.out.println("El vehiculo recorrio " + kilometrosRecorridos + " km");
            this.kilometraje += kilometrosRecorridos; //+= que tome el valor actual y le sume lo que viene  */
            kilometrajeTotal+=kilometrosRecorridos; 
        }else{
            System.out.println("Primero encienda el vehiculo");
        }

    }
    public String toString(){
        return "Marca: " + getMarca() + "\n" +
               "Modelo: " + getModelo() + "\n" +
               "Patente: " + getPatente() + "\n" +
               "Kilometraje: " + getKilometraje() + "\n";
    }
}
    

