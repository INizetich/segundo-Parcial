
import java.util.Random;


public class Enemigos extends Personajes{

public Enemigos(int ID, String nombre, int puntosVida) {
    super(ID, nombre, puntosVida);
}
    public int poderAtaque(){
        Random aleatorio = new Random();
        int poderAtaque = aleatorio.nextInt(1,10);
        return poderAtaque;
    }


    @Override
    public String toString() {
        return super.toString() + "Enemigos{" + "poderAtaque=" + poderAtaque() + '}';
    }
}
