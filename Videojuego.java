import java.util.ArrayList;
import java.util.HashSet;

public class Videojuego {
    private String nombre;
    private GeneroVideojuego generoVideojuego;
    private int cantidadNiveles;
    Equipo<Colaboradores> equipoColaboradores = new Equipo(5);
    Equipo<Enemigos> equipoEnemigos = new Equipo(5);

    public Videojuego() {
        this.nombre = "";
        this.generoVideojuego = null;
        this.cantidadNiveles = 0;
    }

    public Videojuego(String nombre, GeneroVideojuego generoVideojuego, int cantidadNiveles) {
        this.nombre = nombre;
        this.generoVideojuego = generoVideojuego;
        this.cantidadNiveles = cantidadNiveles;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GeneroVideojuego getGeneroVideojuego() {
        return generoVideojuego;
    }

    public void setGeneroVideojuego(GeneroVideojuego generoVideojuego) {
        this.generoVideojuego = generoVideojuego;
    }

    public int getCantidadNiveles() {
        return cantidadNiveles;
    }

    public void setCantidadNiveles(int cantidadNiveles) {
        this.cantidadNiveles = cantidadNiveles;
    }



    public void agregarEquipoRespectivo(Equipo<Personajes> equipoRespectivo) {
      for (Personajes personajes : equipoRespectivo.getListaPersonajes()) {
          if (personajes instanceof Colaboradores) {
              equipoColaboradores.agregarPersonaje((Colaboradores)personajes);
          }else if (personajes instanceof Enemigos) {
              equipoEnemigos.agregarPersonaje((Enemigos)personajes);
          }
      }

    }

    public void mostrarEquiposRespectivos() {
        System.out.println("LISTA DE EQUIPOS DE COLABORADORES");
        for (Personajes personaje : equipoColaboradores.getListaPersonajes()) {
            System.out.println(personaje);
        }
        System.out.println("LISTA DE EQUIPO DE ENEMIGOS");
        for (Personajes personaje : equipoEnemigos.getListaPersonajes()) {
            System.out.println(personaje);
        }

    }
}










