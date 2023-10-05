public class PlacaBase {
    //Marca, modelo, socket y precio
    public String marca;
    public String modelo;
    public String socket;
    public Double precio;

    //Comportamiento
    public String getNombreCompleto() {
        return marca + " " + modelo + " " + socket + " " + precio;
    }
}
