import java.util.Objects;

public class Jugador implements Comparable<Jugador>{
    private int id;
    private int nivelJuego;
    private int puntajePartida;


    public Jugador(){
        this.id = 0;
        this.nivelJuego = 0;
        this.puntajePartida = 0;
    }
    public Jugador(int id, int nivelJuego, int puntajePartida) {
        this.id = id;
        this.nivelJuego = nivelJuego;
        this.puntajePartida = puntajePartida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuntajePartida() {
        return puntajePartida;
    }

    public void setPuntajePartida(int puntajePartida) {
        this.puntajePartida = puntajePartida;
    }

    public int getNivelJuego() {
        return nivelJuego;
    }

    public void setNivelJuego(int nivelJuego) {
        this.nivelJuego = nivelJuego;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nivelJuego=" + nivelJuego +
                ", puntajePartida=" + puntajePartida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return id == jugador.id && nivelJuego == jugador.nivelJuego && puntajePartida == jugador.puntajePartida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nivelJuego, puntajePartida);
    }

    @Override
    public int compareTo(Jugador o) {
        int id = this.id - o.id;
        if (id == 0) {
            return this.nivelJuego - o.nivelJuego;
        }else {
            return id - o.id;
        }
    }
}
