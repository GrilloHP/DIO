package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = sc.nextInt();

        int somar = somar(a,b);
        int subtrair = subtrair(a,b);
        int multiplicar = multiplicar(a,b);
        int dividir = dividir(a,b);

        System.out.println("Somar: " + somar);
        System.out.println("Subtrair: " + subtrair);
        System.out.println("Multiplicar: " + multiplicar);
        System.out.println("Dividir: " + dividir);

    }

    private static int somar(int a, int b)
    {
        return a + b;
    }

    private static int subtrair(int a, int b) {
        return a - b;
    }

    private static int multiplicar(int a, int b) {
        return a * b;
    }

    private static int dividir(int a, int b) {
        return a / b;
    }






}
