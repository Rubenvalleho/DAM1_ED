public class Procesador {
    //Estados, atributos, propiedades
    public String marca;
    public String modelo;
    public Double precio;

    //Comportamiento o método (funciones)
    //public (+) método accesible desde cualquier clase
    //String: tipo devuelto por el método
    public String getNombreCompleto() {
        //Concatenar cademas con +
        // " " entre + y + para poner espacios
        return marca + " " + modelo + " " + precio;
        //También puedes poner return precio.toString();

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getPrecio() {
        return precio;
    }
}
