package semana01;
/*
*Exercitando condicionais
* */

import java.util.Scanner;

public class Dia02Condicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("você é maior de idade!!");
        }else {
            System.out.println("você é menor de idade!");
        }

        //EXERCICIO 2:

        System.out.print("\nDigite sua nota: ");
        int nota = scanner.nextInt();

        if(nota >= 90){
            System.out.println("Aprovado com excelência!");
        } else if (nota >= 60) {
            System.out.println("Aprovado");
        }else {
            System.out.println("reprovado");
        }

        // EXERCICIO 3:

        System.out.print("\nDigite um numero de 1 a 7 para o dia da semana: ");
        int dia = scanner.nextInt();
        switch (dia){
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2 :
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido!");
        }
        //EXERCICIO 4:

        System.out.print("\nDigite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        //EXERCICIO 5:

        System.out.print("\nDigite seu salário mensal: ");
        double salario = scanner.nextDouble();
        System.out.println("Digite o numero de dependentes: ");
        int dependentes = scanner.nextInt();

        double baseCalculo = salario - (dependentes * 200);

        double imposto;
        if (baseCalculo <= 2000){
            imposto = 0;
        } else if (baseCalculo <= 3500) {
            imposto = baseCalculo * 0.1;
        } else if (baseCalculo <= 5000) {
            imposto = baseCalculo * 0.15;
        }else {
            imposto = baseCalculo * 0.2;
        }

        System.out.printf("Base de cálculo: R$ %.2f\n", baseCalculo);
        System.out.printf("Imposto devido: R$ %.2f\n", imposto);

        scanner.close();
    }
}
