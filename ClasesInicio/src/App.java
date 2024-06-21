public class App {
    public static void main(String[] args) throws Exception {

        Persona Pedro = new Persona();
        Persona Javier = new Persona();
        Perro Sam = new Perro();
        Carro Volvo = new Carro();
        Televisor Samsung = new Televisor();
        Pedro.modificarNombre("Javier");



        System.out.println("El nombre de la persona es "+Pedro.obtenerNombre());



    }
}
