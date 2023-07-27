package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean executando = true;
        Conta conta = new Conta();
        do{
            System.out.println("================= BEM VINDO AO VINEJI BANK =================\n");
            System.out.println("======== Selecione a operação que deseja fazer:");
            if(conta.isValida()){
                System.out.println("( 1 ) - Criar conta");
            }else{
                System.out.println("( 2 ) - Ver saldo");
                System.out.println("( 3 ) - Depósito");
                System.out.println("( 4 ) - Saque");
            }
            System.out.println("- Digite o número da operação:");

            Scanner input = new Scanner(System.in);
            int opc = input.nextInt();

            System.out.println("\n\n\n\n\n\n\n");

            switch (opc){
                case 1:
                    System.out.println("- Digite o nome completo do titular:");
                    String nomeTitular = input.nextLine();
                    conta.setNomeTitular(nomeTitular);
                    break;
                case 2:
                    System.out.println("Saldo");
                    break;
                case 3:
                    System.out.println("Depósito");
                    break;
                case 4:
                    System.out.println("Saque");
                    break;
                default:
                    System.out.println("Inválido");
                    break;
            }
        }while (executando);
    }

}