

package ec.edu.espoch.pract1;

import clases.Estudiante;
import java.util.ArrayList;

public class Pract1 {

    public static void main(String[] args) {
        
          /*Integer num1=0;
          Integer num2=2;
          Integer resultado=num1+num2;
        
        System.out.println("El resultado de la suma es: "+resultado);
        System.out.println("");
         */
          
         /*//Sistema numerico(hexadecimal(0x), binario(0b))
         var hex=0xa;
         var octal=012;
         var bin=0b1010;
         
         System.out.println("hexadecimal: "+hex);
         System.out.println("octal: "+octal);
         System.out.println("binario: "+bin);
         */
         
         /*int []numeros={10, 20, 30, 40, 50};
         
         System.out.println("El elemento del array");
         for(int i=0; i<numeros.length; i++){
             System.out.println("El elemento de la posicion: " +i+ "numeros [i]");
         }
         */
         
         /*int [] [] matriz={
             {1, 2, 3},
             {4, 5, 6},
             {7, 8, 9}
         };
         // recorrido de la matriz e impresion de sus elementos
         System.out.println("El elemento de la matriz: ");
         for (int i=0; i<matriz.length; i++){
             for (int j=0; j<matriz.length; j++){
                 System.out.print(matriz [i] [j] + " ");
             }
             System.out.println(); // salto de linea al termiar cada fila
         }
         */
         /*
         Estudiante[] estudiante=new Estudiante[4];
         
         estudiante[0]=new Estudiante("Carlos", 23, 7.8);
         estudiante[1]=new Estudiante("Maria", 20, 9.7);
         estudiante[2]=new Estudiante("Karla", 25, 9.5);
         estudiante[3]=new Estudiante("Luis", 19, 8.4);
         
         System.out.println("Informacion de los estudiantes");
         for (Estudiante e: estudiante){
             e.mostrarinfo(); 
         }
         */
         /*
         ArrayList<String> nombres = new ArrayList<>();
         
         nombres.add("Ana");
         nombres.add("Luis");
         nombres.add("Carlos");
         
         //Mostrar los elementos del ArrayList
         System.out.println("Nombre en la Lista");
         for (String nombre : nombres) {
             System.out.println(nombre);
        }
         
         //Eliminar un Elemento por valor
         nombres.remove("Carlos");
         System.out.println("Lista despues de Eliminar 'Carlos'");
         for (String nombre : nombres) {
             System.out.println(nombre);
        }
         System.out.println("Tamaño de Lista:"+nombres.size());
         System.out.println("Tamaño de Lista:"+nombres.size());
         */
         
         ArrayList <Estudiante> estudiantes = new ArrayList<>();
         
         estudiantes.add(new Estudiante ("Ana", 24, 9.3));
         estudiantes.add(new Estudiante ("Luis", 19, 7.5));
         estudiantes.add(new Estudiante ("Carlos", 20, 9.5));
         estudiantes.add(new Estudiante ("Maria", 23, 8.4));
         estudiantes.add(new Estudiante ("Alberto", 22, 8.5));
         
         System.out.println("Lista de Estudiantes");
         for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarinfo();
            estudiante.getEdad();
            estudiante.getPromedio();
            estudiante.getNombre();
        }
         
        //Modificar un atributo usando los setter
        System.out.println("Modificando el promedio de Luis"); //Obtener el estudiante
        Estudiante estudianteLuis = estudiantes.get(1);
        estudianteLuis.setPromedio(9.5); 
        estudianteLuis.setEdad(40);
        
        System.out.println("Lista de Estudiantes");
         for (Estudiante estudiante : estudiantes) {
             estudiante.mostrarinfo();
             
             
         }
         
        System.out.println("Modificando el promedio de Luis"); //Obtener el estudiante
        Estudiante estudianteCarlos = estudiantes.get(2);
        estudianteLuis.setPromedio(9.5); 
        estudianteCarlos.setEdad(100);
        
        System.out.println("Lista de Estudiantes");
         for (Estudiante estudiante : estudiantes) {
             estudiante.mostrarinfo();
             
         }
    }
}
