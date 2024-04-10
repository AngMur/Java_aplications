package Peluqueria;

public class Perro {
    private String nombre;
    private boolean pelo;

    public Perro(String nombre, boolean pelo) {
        this.nombre = nombre;
        this.pelo = pelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean tienePelo() {
        return pelo;
    }

    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", pelo=" + (pelo ? "tiene pelo" : "no tiene pelo") +
                '}';
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro("Firulais", true);
        System.out.println(miPerro);
    }
}
