import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.TreeMap;

public class GestionJSON {
    public static JSONObject SerializarJugador(Jugador jugador){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", jugador.getId());
        jsonObject.put("nivelJuego", jugador.getNivelJuego());
        jsonObject.put("puntajePartida", jugador.getPuntajePartida());

        return jsonObject;
    }

    public static JSONArray serializarTreemap(TreeMap<Integer,Jugador> treemap){
        JSONArray jsonArray = new JSONArray();
        try{
            JSONObject jsonObject = new JSONObject() ;
            for (Jugador jugador : treemap.values()) {
                jsonObject = SerializarJugador(jugador);
                jsonArray.put(jsonObject);
            }
        }catch (JSONException e){
            e.printStackTrace();
        }


        return jsonArray;
    }


    public static Jugador deserializarJugador(JSONObject jsonObject){
        Jugador jugador = new Jugador();

        jugador.setId(jsonObject.getInt("id"));
        jugador.setNivelJuego(jsonObject.getInt("nivelJuego"));
        jugador.setPuntajePartida(jsonObject.getInt("puntajePartida"));

        return jugador;
    }


    public static TreeMap<Integer,Jugador> deserializarTreemap(JSONArray jsonArray){
        JSONTokener jsonTokener = JSONUtilities.leerArchivo("jugadores.json");
        jsonArray = new JSONArray(jsonTokener);
        TreeMap<Integer,Jugador> treemap = new TreeMap<>();
        try{
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Jugador jugador = deserializarJugador(jsonObject);
                treemap.put(jugador.getId(), jugador);

            }
        }catch (JSONException e){
            e.printStackTrace();
        }


        return treemap;
    }

    }

