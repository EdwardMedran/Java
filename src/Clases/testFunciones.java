package Clases;

public class testFunciones {

//Calcular el área de un círculo:
    //pi
    //Radio
    //pi*radioalCuadro

    public Double areaCirculi(Double radioEnvaido){

        Double pi = 3.14;

        Double respuesta;

        Double radioCuadrado = radioEnvaido*radioEnvaido;

        respuesta = pi*radioCuadrado;
        return respuesta;


    }

    //area cuadrado
    public Double areaCuadrado(Double lado1){

        Double respuesta = lado1*lado1;
        return respuesta;
    }

    //area triangulo
    public Double areaTriangulo(Double baseEnv, Double alturaEnv){

        Double BaseAltura = baseEnv*alturaEnv;

        Double respuesta = BaseAltura/2;
        return respuesta;
    }

    //unir dos palabras
    public String unirPalabras(String pal1, String pal2){

        String respuesta = pal1+pal2;
        return respuesta;

    }

}