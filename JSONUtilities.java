import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;

public class JSONUtilities {


    public static void GrabarJSON(JSONArray jsonArray,String nombreArchivo){

        try(FileWriter fileWriter = new FileWriter(nombreArchivo)){
            fileWriter.write(jsonArray.toString());
            fileWriter.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void GrabarJSON(JSONObject jsonObject, String nombreArchivo){

        try(FileWriter fileWriter = new FileWriter(nombreArchivo)){
            fileWriter.write(jsonObject.toString());
            fileWriter.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static JSONTokener leerArchivo(String nombreArchivo){
        JSONTokener jsonTokener = null;
        try{
            jsonTokener = new JSONTokener(new FileReader(nombreArchivo));
        }catch (IOException e){
            e.printStackTrace();
        }

        return jsonTokener;
    }
}
