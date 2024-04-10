package Peluqueria;

public class PruebaPeluqueria {
    public static void main(String[] args) {
        Perro p1 = new Perro("Snoopy", true);
        Peluqueria pel = new Peluqueria();
        pel.cortarPelo(p1);
        pel.cortarPelo(p1);
    }
}
