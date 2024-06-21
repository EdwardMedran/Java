public class App {
    public static void main(String[] args) throws Exception {

        Persona Pedro = new Persona();
        Persona Javier = new Persona();
        Perro Sam = new Perro();
        Carro Volvo = new Carro();
        Televisor Samsung = new Televisor();



        Volvo.TamañoMotor = 2200;
        Volvo.Llantas = 4;
        Volvo.Marca = "Volvo";
        Volvo.Modelo = 850;

        Samsung.Marca = "Samsung";
        Samsung.Pulgadas = 50;

    }
}
