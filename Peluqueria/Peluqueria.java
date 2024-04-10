package Peluqueria;

public class Peluqueria {
    public void cortarPelo(Perro p) {
        if(p.tienePelo()){
            p.setPelo(false);
            System.out.println("Perro pelado :D");
        } else{
            System.out.println("Nada que cortar :()");
        }
    }
}
