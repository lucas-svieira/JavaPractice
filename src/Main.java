import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorUm;
        double valorDois;
        double resultado;
        int operador;


    System.out.print("Digite o primeiro numero da operação: ");
        valorUm = teclado.nextDouble();
    System.out.print("Digite o segunddo numero da operação: ");
        valorDois = teclado.nextDouble();
        System.out.println("Escolha a operção que deseja: ");
        System.out.println("1 - soma ");
        System.out.println("2 - multiplicação ");
        System.out.println("3 - divisão ");
        System.out.println("4 - subtração ");
        operador = teclado.nextInt();

        switch (operador){
            case 1:
                resultado = valorUm + valorDois;
                System.out.println(resultado);
                break;

            case 2:
                resultado = valorUm * valorDois;
                System.out.println(resultado);
                break;

            case 3:
                resultado = valorUm / valorDois;
                if (valorDois == 0);
                System.out.println("Segundo valor imcompátivel com operação desejada");
                System.out.println(resultado);

                break;

            case 4:
                resultado = valorUm - valorDois;
                System.out.println(resultado);
                break;


        }




    }
}