public class Persona {
    // atributos
    /// metodos

   /*
   public Integer nombreMetodo(){
   Integer numero = 7;
   return numero;
   }


      public void nombreMetodo(){

   }

    */
   //encapsulamiento
   private String nombre;
   private String apellido;
   private Double peso;
   private Integer DNI;


   public void modificarApellido(String apellido){
      this.apellido = apellido;
   }

   public String obtenerApellido(){
      return this.apellido;
   }

   public void modificarPeso(double peso){
      this.peso = peso;
   }

   public double obtenerPeso(){
      return this.peso;
   }

   public String nombreCompleto(){
      return this.nombre +" "+ this.apellido;
   }


   public Integer suma(Integer v1, Integer v2){
      return v1 * v2;
   }

   public String nombrePeso(){
      return this.nombre +" y "+ this.peso;
   }

   public Integer multiplicacionResta(Integer n1, Integer n2){

      Integer multiplicacion;
      multiplicacion = n1 * n2;

      Integer respuesta;
      respuesta = multiplicacion - 10;

      return respuesta;
   }
}