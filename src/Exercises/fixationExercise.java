package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class fixationExercise {


    /*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos*/
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*     int x = sc.nextInt();
        int y = sc.nextInt();

        // aqui vamos fazer o calculo para a sulução
            int sum = x + y;
        System.out.println("Total sum:" + sum); // contatena com a varavel para ter o resultado
        */

        /* valor da raiz quadrada  */

       /* double x = sc.nextDouble();
        double a;

       a = Math.sqrt(x);
        System.out.println(" valor da raiz quadrada = " + x + " = " + a);*/

        /*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
         casas decimais conforme exemplos*/
          /*  double R, A, pi = 3.14159;

        R = sc.nextDouble();

        A = pi * R * R;

        System.out.printf("A=%.4f%n", A);*/

      /*  Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)*/

       /* int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sum = a * b - c * d;

        System.out.println("a diferencça entre eles é : " + sum);*/

      /*  Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais*/

       /* int id = sc.nextInt();
        double horasT = sc.nextDouble();
        double salary = sc.nextDouble();

        int  number = id ;
        double  resultado = horasT * salary;

        System.out.println(" Number : " + number);
        System.out.printf(" Salary U$  %.2f%n ", + resultado);*/

        /*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

       /* int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = sc.nextInt();
        qte1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qte2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);*/

       /* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura. // formúla =  A = b.h / 2
        b) a área do círculo de raio C. (pi = 3.14159) // FORMULA A = π * r²
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
                e) a área do retângulo que tem lados A e B*/

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);


        sc.close();

    }
}
