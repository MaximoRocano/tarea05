package clase05;

public class Main {

    public static void main(String args[])
    {
        Tienda tienda = new Tienda("Freddy", "jr tiendita");
        System.out.println("la tienda se llama: "+Tienda.getNombre()+" ubicada en la direccion: "+Tienda.getDireccion());

        //tienda.agregarClienteNombre(new Cliente("pedrito"));
        Cliente cliente = new Cliente();
        cliente.setDni(1111111);
        cliente.setNombre("pedrito");
        cliente.setApellido("guzman");
        System.out.println("cliente 1 : "+cliente.getNombre()+" Apellido:"
                +cliente.getApellido()+ " DNI:"+cliente.getDni());

        Cliente cliente2 = new Cliente();
        cliente2.setDni(222222);
        cliente2.setNombre("esteban");
        cliente2.setApellido("quito");
        System.out.println("cliente 2 : "+cliente2.getNombre()+" Apellido:"
                +cliente2.getApellido()+ " DNI:"+cliente2.getDni());

        Cliente cliente3 = new Cliente();
        cliente3.setDni(3333333);
        cliente3.setNombre("paco");
        cliente3.setApellido("el flaco");
        System.out.println("cliente 2 : "+cliente3.getNombre()+" Apellido:"
                +cliente3.getApellido()+ " DNI:"+cliente3.getDni());

        Cliente cliente4 = new Cliente();
        cliente4.setDni(4444444);
        cliente4.setNombre("ice");
        cliente4.setApellido("froge");
        System.out.println("cliente 4 : "+cliente4.getNombre()+" Apellido:"
                +cliente4.getApellido()+ " DNI:"+cliente4.getDni());


    }
}
