package TiendaEjercicio;


import TiendaEjercicio.Bicicleta;



public class Bicicross extends Bicicleta {

    public String material;

    public Bicicross(int rin, int nvel, String marca, String material) {
        super(rin, nvel, marca);
        this.material = material;
    }

    @Override
    public String listar() {//polimorfismo
        return "\tBicicleta Bicicross - Marca: " + marca + "\n"
                + "\trin: " + nvel + " pulgadas" + "\n"
                + "\tvelocidades: " + rin + "\n"
                + "\tmaterial: " + material;

    }

}