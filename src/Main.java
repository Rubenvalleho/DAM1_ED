public class Main {
    public static void main(String[] args) {
        //Procesador
        Procesador procesador = new Procesador();
        procesador.marca = "AMD";
        procesador.modelo = "AM456";
        procesador.precio = 200.0;
        System.out.println("Procesador");

        //Placa base
        PlacaBase placabase = new PlacaBase();
        placabase.marca = "Gigabyte";
        placabase.modelo = "B550 AORUS ELITE V2";
        placabase.socket = "AMD AM4";
        placabase.precio = 144.99;
        System.out.println("PlacaBase");
    }
}