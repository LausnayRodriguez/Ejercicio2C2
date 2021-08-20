package TiendaEjercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {

    public List<Bicicleta> lista;

    public Tienda() {

    }

    public void agregarBici(List<Bicicleta> lista) {
        this.lista = lista;
    }

    public List<Bicicleta> listar() {
        return lista;
    }

    public void menu() {
        System.exit(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Tienda inventarioBicicleta = new Tienda();

        List<Bicicleta> convertirLista = new ArrayList<Bicicleta>();

        while (true) {

            //System.out.println("Ingrese Datos: ");
            String entrada = sc.nextLine();
            String[] convertirEntrada = entrada.split("&");

            if (convertirEntrada[0].equalsIgnoreCase("1") && convertirEntrada[1].equalsIgnoreCase("Carreras")) {

                convertirLista.add(new Carreras(Integer.parseInt(convertirEntrada[2]), Integer.parseInt(convertirEntrada[3]), convertirEntrada[4], Integer.parseInt(convertirEntrada[5])));
                inventarioBicicleta.agregarBici(convertirLista);
            }

            if (convertirEntrada[0].equalsIgnoreCase("1") && convertirEntrada[1].equalsIgnoreCase("Bicicross")) {
                convertirLista.add(new Bicicross(Integer.parseInt(convertirEntrada[2]), Integer.parseInt(convertirEntrada[3]), convertirEntrada[4], convertirEntrada[5]));

                inventarioBicicleta.agregarBici(convertirLista);
            }

            if (convertirEntrada[0].equalsIgnoreCase("2")) {
                System.out.println("###Almacen Naironman###");
                List<Bicicleta> stockTienda = inventarioBicicleta.listar();

                for (Bicicleta bicicleta : stockTienda) {
                    System.out.println(bicicleta.listar());
                }

            }

            if (convertirEntrada[0].equalsIgnoreCase("3")) {
                inventarioBicicleta.menu();

            }

        }
    }
}
