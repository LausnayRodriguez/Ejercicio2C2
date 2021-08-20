package TiendaEjercicio;



public class Carreras extends Bicicleta {

    public int peso;

    public Carreras(int rin, int nvel, String marca, int peso) {
        super(rin, nvel, marca);
        this.peso = peso;
    }

    @Override
    public String listar() {//polimorfismo

        return  "\tBicicleta Carreras - Marca: " + marca + "\n"
                + "\trin: " + nvel + " pulgadas" + "\n"
                + "\tvelocidades: " + rin + "\n"
                + "\tpeso: " + peso + "kg";

    }
}