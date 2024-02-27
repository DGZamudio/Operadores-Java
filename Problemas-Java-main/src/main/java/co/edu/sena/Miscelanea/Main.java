package co.edu.sena.Miscelanea;
import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    {
        Scanner src = new Scanner (System.in);
        double Num1;
        double Num2;
        double Num3;
        double result;
    
        System.out.println( "Problema 1:Area de un triangulo." );
        System.out.println( "Ingresa la base:" );
        Num1 = src.nextDouble();
    
        System.out.println( "Ingresa la altura:" );
        Num2 = src.nextDouble();
    
        result = Ejercicios.areaTriangulo(Num1,Num2) ;
    
        System.out.println( "El area del triangulo es:" + result);
    
        System.out.println( "Problema 2:Suma de dos numeros." );
        System.out.println( "Ingresa el primer numero:" );
        Num1 = src.nextDouble();
    
        System.out.println( "Ingresa el segundo numero:" );
        Num2 = src.nextDouble();
    
        result= Ejercicios.SumaDeDosNum(Num1,Num2) ;; 
    
        System.out.println( "La suma de estos numeros es:" + result);
        System.out.println( "Problema 3:Numero elevado al cuadrado." );
        System.out.println( "Ingresa un numero:" );

        Num1 = src.nextDouble();

        result = Ejercicios.NumeroAlCuadrado(Num1);

        System.out.println( "El numero al cuadrado es:" + result);

        System.out.println( "Problema 4:Euros a dolares." );
        System.out.println( "Ingresa el valor en euros:" );

        Num1 = src.nextDouble();

        result = Ejercicios.EuroADolar(Num1);

        System.out.println( "El valor en dolares es:" + result);

        System.out.println( "Problema 5:Area y perimetro cuadrado." );
        System.out.println( "Ingresa el lado de un cuadrado:" );

        Num1 = src.nextDouble();

        result =Ejercicios.AreaCuadrado(Num1);

        System.out.println( "El area del cuadrado es:" + result);

        result = Ejercicios.PerimetroCuadrado(Num1);

        System.out.println( "El perimetro del cuadrado es:" + result);

        System.out.println( "Problema 6:Area y volumen de un cilindro." );
        System.out.println( "Ingresa el radio del cilindro." );

        Num1 = src.nextDouble();

        System.out.println( "Ingresa la altura del cilindro." );

        Num2 = src.nextDouble();

        result = Ejercicios.VolumenCilindro(Num1,Num2);

        System.out.println( "El volumen del cilindro es:" + result);

        result = Ejercicios.AreaCilindro(Num1,Num2);

        System.out.println( "El area del cilindro es:" + result);

        System.out.println( "Problema 7:Area y longitud de una circunferencia." );
        System.out.println( "Ingresa el radio de la circunferenia:");

        Num1 = src.nextDouble();

        result = Ejercicios.AreaCirc(Num1);

        System.out.println( "El area de la circunferencia es:" + result);

        result = Ejercicios.LongitudCirc(Num1);

        System.out.println( "La longitud de la circunferencia es:" + result);

        System.out.println( "Problema 8:Promedio." );
        System.out.println( "Ingresa el primer numero:");
        Num1 = src.nextDouble();
        System.out.println( "Ingresa el segundo numero:");
        Num2 = src.nextDouble();
        System.out.println( "Ingresa el tercer numero:");
        Num3 = src.nextDouble();

        result= Ejercicios.PromedioTresNumeros(Num1,Num2,Num3);

        System.out.println( "El promedio de estos tres numeros es:" + result);
    }
}
