import Clases.*;
public class App {


    public static void main(String[] args) throws Exception {

//        Persona Pedro = new Persona();
//        Persona Javier = new Persona();
//        Perro Sam = new Perro();
//        Carro Volvo = new Carro();
//        Televisor Samsung = new Televisor();
//
//        Pedro.modificarNombre("Javier");
//        System.out.println("El nombre de la persona es "+Pedro.obtenerNombre());
//
//        Pedro.modificarApellido("Huertas");
//        System.out.println("El apellido de la persona es "+ Pedro.obtenerApellido());
//
//        Pedro.modificarPeso(50);
//        System.out.println("El peso de la persona es "+ Pedro.obtenerPeso());
//
//        System.out.println("El nombre completo de la persona es "+ Pedro.nombreCompleto());
//
//        System.out.println("La suma de numero 5 y 2 es "+ Pedro.suma(5,2));
//
//        System.out.println("El nombre y el peso es "+ Pedro.nombrePeso());
//
//        System.out.println("El nombre de la persona es "+ Pedro.obtenerNombre()+" y el peso es "+ Pedro.obtenerPeso());
//
//        System.out.println("La multiplicacion de 4 y 5 - 10 es "+ Pedro.multiplicacionResta(4,5));
testFunciones pr1 = new testFunciones();

Double var = pr1.areaCirculi(20.0);
System.out.println("El area de un circulo de 20 es "+var);

testFunciones pr2 = new testFunciones();

Double var2 = pr2.areaCuadrado(2.0);
System.out.println("El area del cuadrado lado 2 es "+var2);

testFunciones pr3 = new testFunciones();

Double var3 = pr3.areaTriangulo(4.0, 5.0);
System.out.println("El area de triangulo base 4 y altura 5 es "+var3);

    }

}
