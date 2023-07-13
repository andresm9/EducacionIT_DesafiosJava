package com.educacionit;
public class Calculadora {
    public static void main(String[] args) {

        try {

            float valorA = Float.parseFloat(args[0]);
            float valorB = Float.parseFloat(args[1]);
            String operacion = args[2].toUpperCase();

            switch (operacion) {
                case "SUM":
                    System.out.printf("%.0f + %.0f = %.0f%n", valorA, valorB, (valorA+valorB));
                    break;
                case "RES":
                    System.out.printf("%.0f - %.0f = %.0f%n", valorA, valorB, (valorA-valorB));
                    break;
                case "MUL":
                    System.out.printf("%.0f x %.0f = %.0f%n", valorA, valorB, (valorA*valorB));
                    break;
                case "DIV":
                    if (valorB == 0) {
                        System.out.println("Operacion invalida");
                    } else {
                        System.out.printf("%.0f / %.0f = %.2f%n", valorA, valorB, (valorA / valorB));
                    }
                    break;
                default:
                    System.out.println("Operacion invalida");
                    break;
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}