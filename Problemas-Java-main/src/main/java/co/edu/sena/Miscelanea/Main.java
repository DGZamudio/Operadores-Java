package co.edu.sena.Miscelanea;
import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    {
        Scanner src = new Scanner (System.in);
        double d1;
        double d2;
        double d3;
        double result;
    
        System.out.println( "Problema 1:Area de un triangulo." );
        System.out.println( "Ingresa la base:" );
        d1 = src.nextDouble();
    
        System.out.println( "Ingresa la altura:" );
        d2 = src.nextDouble();
    
        result = (Ejercicios.areaTriangulo()) ;
    
        System.out.println( "El area del triangulo es:" + result);
    
        System.out.println( "Problema 2:Suma de dos numeros." );
        System.out.println( "Ingresa el primer numero:" );
        d1 = src.nextDouble();
    
        System.out.println( "Ingresa el segundo numero:" );
        d2 = src.nextDouble();
    
        result= d1+d2; 
    
        System.out.println( "La suma de estos numeros es:" + result);
        System.out.println( "Problema 3:Numero elevado al cuadrado." );
        System.out.println( "Ingresa un numero:" );

        d1 = src.nextDouble();

        result = d1*d1;

        System.out.println( "El numero al cuadrado es:" + result);

        System.out.println( "Problema 4:Euros a dolares." );
        System.out.println( "Ingresa el valor en euros:" );

        d1 = src.nextDouble();

        result = d1* 1.08;

        System.out.println( "El valor en dolares es:" + result);

        System.out.println( "Problema 5:Area y perimetro cuadrado." );
        System.out.println( "Ingresa el lado de un cuadrado:" );

        d1 = src.nextDouble();

        result = d1 * d1;

        System.out.println( "El area del cuadrado es:" + result);

        result = d1*4;

        System.out.println( "El perimetro del cuadrado es:" + result);

        System.out.println( "Problema 6:Area y volumen de un cilindro." );
        System.out.println( "Ingresa el radio del cilindro." );

        d1 = src.nextDouble();

        System.out.println( "Ingresa la altura del cilindro." );

        d2 = src.nextDouble();

        result = (3.14 * (d1 * d1)) * d2;

        System.out.println( "El volumen del cilindro es:" + result);

        result = 2*3.14*d1*(d1 + d2);

        System.out.println( "El area del cilindro es:" + result);

        System.out.println( "Problema 7:Area y longitud de una circunferencia." );
        System.out.println( "Ingresa el radio de la circunferenia:");

        d1 = src.nextDouble();

        result = 3.14 * ( d1 * d1 );

        System.out.println( "El area de la circunferencia es:" + result);

        result = 2*3.14*d1;

        System.out.println( "La longitud de la circunferencia es:" + result);

        System.out.println( "Problema 8:Promedio." );
        System.out.println( "Ingresa el primer numero:");
        d1 = src.nextDouble();
        System.out.println( "Ingresa el segundo numero:");
        d2 = src.nextDouble();
        System.out.println( "Ingresa el tercer numero:");
        d3 = src.nextDouble();

        result= (d1+d2+d3)/3;

        System.out.println( "El promedio de estos tres numeros es:" + result);
    }
}
