import com.sun.source.tree.Tree;
import java.util.HashMap;
import java.util.TreeMap;

public class AlmacenamientoJugadores {
    public static TreeMap<Integer,Jugador> TreemapJugadores;

    public AlmacenamientoJugadores() {
        this.TreemapJugadores = new TreeMap<>();
    }


    public static void agregarJugador(Jugador jugador){
        TreemapJugadores.put(jugador.getId(),jugador);
    }

    public static void mostrarJugadores(){
        for (Jugador jugador : TreemapJugadores.values()) {
            System.out.println(jugador);
        }
    }

    public static TreeMap<Integer, Jugador> getTreemapJugadores() {
        return TreemapJugadores;
    }

    public static void setTreemapJugadores(TreeMap<Integer, Jugador> treemapJugadores) {
        TreemapJugadores = treemapJugadores;
    }
}
