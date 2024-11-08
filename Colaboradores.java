import java.util.HashSet;

public class Colaboradores extends Personajes {
    HashSet<Armas> cantidadArmas;

    public Colaboradores(int ID, String nombre, int puntosVida) {
        super(ID, nombre, puntosVida);
        cantidadArmas = new HashSet<>();
    }

    public HashSet<Armas> getCantidadArmas() {
        return cantidadArmas;
    }

    public void setCantidadArmas(HashSet<Armas> cantidadArmas) {
        this.cantidadArmas = cantidadArmas;
    }

    public void agregarArmas(Armas armas) {
        cantidadArmas.add(armas);
    }

    @Override
    public String toString() {
        return super.toString() +" Colaboradores{" +
                "cantidadArmas=" + cantidadArmas +
                '}';
    }

    public void mostrarListaArmas(){
        for (Armas armas : cantidadArmas) {
            System.out.println(armas);
        }


    }
}
