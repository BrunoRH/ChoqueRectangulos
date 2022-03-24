import java.awt.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Variables para los 2 rectangulos
        int x1,x2,w1,h1;
        int y1,y2,w2,h2;

        // Utilizando   metodos de java
        System.out.println("DATOS DEL PRIMER RECTANGULO : ");
        System.out.println("Ingrese el valor del punto x del rectangulo 1");
        x1 = in.nextInt();
        System.out.println("Ingrese el valor del punto y del rectangulo 1 ");
        y1 = in.nextInt();
        System.out.println("Ingrese el valor del ancho del rectangulo 1 ");
        w1 = in.nextInt();
        System.out.println("Ingrese el valor de la altura del rectangulo 1 ");
        h1 = in.nextInt();
        System.out.println("-------------------------------");

        System.out.println("DATOS DEL SEGUNDO RECTANGULO : ");
        System.out.println("Ingrese el valor del punto x del rectangulo 2");
        y1 = in.nextInt();
        System.out.println("Ingrese el valor del punto y del rectangulo 2 ");
        y2 = in.nextInt();
        System.out.println("Ingrese el valor del ancho del rectangulo 2 ");
        w2 = in.nextInt();
        System.out.println("Ingrese el valor de la altura del rectangulo 2 ");
        h2 = in.nextInt();

        // Creando objetos de la clase Java Rectangle
        Rectangle r1 = new Rectangle(x1,y1,w1,h1);
        Rectangle r2 = new Rectangle(y1,y2,w2,h2);

        // Creando objetos de nuestra clase creada Rectangulo
        Rectangulo R1 = new Rectangulo(x1,y1,w1,h1);
        Rectangulo R2 = new Rectangulo(y1,y2,w2,h2);

        boolean respuesta = R1.existeColision(R1,R2);
        System.out.println("\nHaciendo uso de  un algoritmo se determina que : ");
        if(respuesta)
            System.out.println("Los rectangulos estan colisionando");
        else
            System.out.println("Los rectangulos no estan colisionando");

        System.out.println("----------------------------");
        System.out.println("\nHaciendo uso de la clase Rectangle de Java se determina que : ");
        if(r1.intersects(r2))
        {
            System.out.println("Los rectangulos han colisionado");
        }else{
            System.out.println("Los rectangulos no han colisionado");
        }


    }


}
