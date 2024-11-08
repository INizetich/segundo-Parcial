import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
AlmacenamientoJugadores almacenamiento = new AlmacenamientoJugadores();
      Videojuego videojuego = new Videojuego("league of legends",GeneroVideojuego.MOBA,15);
           Colaboradores colaboradores = new Colaboradores(10294,"santiago",1700);
           Colaboradores colaboradores2 = new Colaboradores(40192,"ignacio",2500);
           Enemigos enemigos = new Enemigos(124,"roman",1500);
            Equipo<Personajes> equipo = new Equipo<>();
          Jugador jugador = new Jugador(45462201,15,1600);
          Jugador jugador2 = new Jugador(44109291,7,750);
          Jugador jugador3 = new Jugador(29102912,28,1900);


          almacenamiento.agregarJugador(jugador);
          almacenamiento.agregarJugador(jugador2);
          almacenamiento.agregarJugador(jugador3);
        System.out.println("--------TREEMAP DE JUGADORES-----------");
        AlmacenamientoJugadores.mostrarJugadores();


       ///AGREGO ARMAS AL HASHSET DE LOS COLABORADORES
        colaboradores.agregarArmas(Armas.ESPADA_FUEGO);
        colaboradores.agregarArmas(Armas.DAGA_ENVENENADA);
        colaboradores2.agregarArmas(Armas.HACHA_MAGICA);

        System.out.println("------------LISTA DE PERSONAJES DISPONIBLES------------");
        equipo.mostrarEquipo();

try{
    ///AGREGO PERSONAJES AL EQUIPO GENERICO
    equipo.agregarPersonaje(colaboradores);
    equipo.agregarPersonaje(colaboradores);
    equipo.agregarPersonaje(colaboradores);
    equipo.agregarPersonaje(colaboradores);
    equipo.agregarPersonaje(enemigos);
    ///LE PASO EL EQUIPO GENERICO AL VIDEOJUEGO Y LOS GUARDO EN 2 EQUIPOS DISTINTOS, 1 DE COLABORADORES Y OTRO DE ENEMIGOS
    videojuego.agregarEquipoRespectivo(equipo);
}catch (ExceptionCapacidadExcedida e){
    System.out.println(e.getMessage());
}finally {
    ///MUESTRO LA LISTA
    System.out.println("-----------LISTA DE EQUIPOS-----------");
    videojuego.mostrarEquiposRespectivos();

}



///SERIALIZACION JSON
        JSONArray jsonArray = GestionJSON.serializarTreemap(AlmacenamientoJugadores.getTreemapJugadores());
        JSONUtilities.GrabarJSON(jsonArray,"jugadores.json");


        ///DESCERIALIZACION JSON
        JSONArray jsonArray1 = new JSONArray(JSONUtilities.leerArchivo("jugadores.json"));

        TreeMap<Integer,Jugador>nuevoTreeJugador = GestionJSON.deserializarTreemap(jsonArray1);

        AlmacenamientoJugadores.setTreemapJugadores(nuevoTreeJugador);
        System.out.println("MAPA DESCERIALIZADO");
        AlmacenamientoJugadores.mostrarJugadores();

    }
}