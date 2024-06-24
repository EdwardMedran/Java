public class App {
    public static void main(String[] args) throws Exception {

        Persona Pedro = new Persona();
        Persona Javier = new Persona();
        Perro Sam = new Perro();
        Carro Volvo = new Carro();
        Televisor Samsung = new Televisor();

        Pedro.modificarNombre("Javier");
        System.out.println("El nombre de la persona es "+Pedro.obtenerNombre());

        Pedro.modificarApellido("Huertas");
        System.out.println("El apellido de la persona es "+ Pedro.obtenerApellido());

        Pedro.modificarPeso(50);
        System.out.println("El peso de la persona es "+ Pedro.obtenerPeso());

        System.out.println("El nombre completo de la persona es "+ Pedro.nombreCompleto());

        System.out.println("La suma de numero 5 y 2 es "+ Pedro.suma(5,2));

        System.out.println("El nombre y el peso es "+ Pedro.nombrePeso());

        System.out.println("El nombre de la persona es "+ Pedro.obtenerNombre()+" y el peso es "+ Pedro.obtenerPeso());

        System.out.println("La multiplicacion de 4 y 5 - 10 es "+ Pedro.multiplicacionResta(4,5));
    }
}