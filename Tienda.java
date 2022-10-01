package clase05;

public class Tienda {
    private Cliente cliente[];

    private static String nombre;
    private int contadorCliente;

    private static String direccion;

    public Tienda()
    {
        this.cliente = new Cliente[4];

        this.contadorCliente = 0;
    }

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public static String getNombre() {return nombre;}

    public void setNombre() {this.nombre = nombre;}

    public static String getDireccion() {return direccion;}

}

