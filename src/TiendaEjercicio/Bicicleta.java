package TiendaEjercicio;

public class Bicicleta {

    public int rin;
    public int nvel;
    public String marca;

    public Bicicleta(int rin, int nvel, String marca) {
        this.rin = rin;
        this.nvel = nvel;
        this.marca = marca;
    }

    public String listar() {
        return "Bicicleta{" + "rin=" + rin + ", nvel=" + nvel + ", marca=" + marca + '}';
    }

}