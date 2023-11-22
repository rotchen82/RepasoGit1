import Clases.Gato;

public class ProgramaGato{
   public static void main(String[] args) {
    Gato gato1=new Gato("macho","garfield","naranja","angora",15,150);
    Gato gato2=new Gato("hembra", "lisa","blanco","persa",7,15);

    
    gato1.come("sopa");
    System.out.println("Peso: "+ gato1.getPeso());
    gato1.come("pescado");
    System.out.println("Peso: "+ gato1.getPeso());
    gato1.come("pescado");
    System.out.println("Peso: "+ gato1.getPeso());
    gato1.come("pescado");
    System.out.println("Peso: "+ gato1.getPeso());

   System.out.println(gato1);
        
    }
}