import java.util.HashMap;

public abstract class Personajes {
    private int ID;
    private String nombre;
    private int puntosVida;


    public Personajes(int ID, String nombre, int puntosVida) {
       this.ID = ID;
       this.nombre = nombre;
       this.puntosVida = puntosVida;
    }

    public String atacar(){
        return "estoy atacando";
    }

    public String defender(){
        return "me estoy defendiendo";
    }

    public int recibirDaño(int cantidadDaño){
        return puntosVida-cantidadDaño;
    }

    @Override
    public String toString() {
        return "Personajes{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", puntosVida=" + puntosVida +
                '}';
    }
}
