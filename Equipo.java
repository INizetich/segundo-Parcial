
import java.util.ArrayList;



public class Equipo <T extends Personajes> {
ArrayList<T> listaPersonajes;
private int capacidadMaxima = 5;
public Equipo() {
    listaPersonajes = new ArrayList<>();
}

public Equipo(int capacidadMaxima) {
    this.capacidadMaxima = capacidadMaxima;
    this.listaPersonajes = new ArrayList<>();
}

    public ArrayList<T> getListaPersonajes() {
        return listaPersonajes;
    }

    public void setListaPersonajes(ArrayList<T> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }



    @Override
    public String toString() {
        return "Equipo{" +
                "listaPersonajes=" + listaPersonajes +
                '}';
    }

    public void agregarPersonaje(T personaje) throws ExceptionCapacidadExcedida {
    if (capacidadMaxima <= listaPersonajes.size()) {
        listaPersonajes.add(personaje);
    }else {
        throw new ExceptionCapacidadExcedida("CAPACIDAD MAXIMA ALCANZADA PARA EL EQUIPO");
    }
    }



    public void mostrarEquipo(){

    for (T personaje : listaPersonajes){
        System.out.println(personaje);
    }

    }
}
