package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean executando = true;
        Conta conta = new Conta();
        do{
            int sair = 1;
            System.out.println("================= BEM VINDO AO VINEJI BANK =================\n");
            System.out.println("======== Selecione a operação que deseja fazer:");
            if(!conta.isValida()){
                System.out.println("( 1 ) - Criar conta");
            }else{
                System.out.println("( 2 ) - Ver saldo");
                System.out.println("( 3 ) - Depósito");
                System.out.println("( 4 ) - Saque");
                System.out.println("( 5 ) - Investir");
                System.out.println("( 6 ) - Ver investimentos");
            }
            System.out.println("\n( 0 ) - SAIR\n");
            System.out.println("- Digite o número da operação:");

            Scanner input = new Scanner(System.in);
            int opc = input.nextInt();
            if(sair == 0 || opc == 0){
                executando = false;
                break;
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
            switch (opc){
                case 1:
                    sair = 1;
                    System.out.println("=========== CRIAR CONTA");
                    System.out.println("- Digite o nome completo do titular:");
                    input.nextLine();
                    String nomeTitular = input.nextLine();
                    conta.setNomeTitular(nomeTitular);
                    System.out.println("\n\n\n");
                    System.out.println("- Deseja retornar ao menu?");
                    System.out.println("- ( 0 ) Sair");
                    System.out.println("- ( 1 ) Voltar ao menu");
                    System.out.println("- Digite o número da operação:");
                    sair = input.nextInt();
                    System.out.println((sair));
                    if(sair == 0){
                        executando = false;
                    }
                    break;
                case 2:
                    sair = 1;
                    System.out.println("=========== Seu saldo é: " + conta.getSaldo());
                    System.out.println("\n\n\n");
                    System.out.println("- Deseja retornar ao menu?");
                    System.out.println("- ( 0 ) Sair");
                    System.out.println("- ( 1 ) Voltar ao menu");
                    System.out.println("- Digite o número da operação:");
                    sair = input.nextInt();
                    break;
                case 3:
                    sair = 1;
                    System.out.println("=========== Depósito");
                    System.out.println("Digite o valor que você deseja DEPOSITAR");
                    double valor = input.nextDouble();
                    conta.depositar(valor);
                    System.out.println("\n\n\n");
                    System.out.println("- Deseja retornar ao menu?");
                    System.out.println("- ( 0 ) Sair");
                    System.out.println("- ( 1 ) Voltar ao menu");
                    System.out.println("- Digite o número da operação:");
                    sair = input.nextInt();
                    break;
                case 4:
                    sair = 1;
                    System.out.println("Saque");
                    System.out.println("Digite o valor que você deseja SACAR");
                    Scanner scanner1 = new Scanner(System.in);
                    valor = scanner1.nextDouble();
                    conta.resgatar(valor);
                    System.out.println("\n\n\n");
                    System.out.println("- Deseja retornar ao menu?");
                    System.out.println("- ( 0 ) Sair");
                    System.out.println("- ( 1 ) Voltar ao menu");
                    System.out.println("- Digite o número da operação:");
                    sair = input.nextInt();
                    break;
                case 5:
                    sair = 1;
                    System.out.println("=========== Investir");
                    System.out.println("- Digite o valor que você deseja INVESTIR:");
                    valor = input.nextDouble();
                    conta.investir(valor);
                    System.out.println("\n\n\n");
                    System.out.println("- Deseja retornar ao menu?");
                    System.out.println("- ( 0 ) Sair");
                    System.out.println("- ( 1 ) Voltar ao menu");
                    System.out.println("- Digite o número da operação:");
                    sair = input.nextInt();
                    break;
                case 6:
                    sair = 1;
                    System.out.println("=========== Ver investimento");
                    System.out.println("Seu saldo em investimento é de: " + conta.getValorInvestido());
                    System.out.println("\n\n\n");
                    System.out.println("- Deseja retornar ao menu?");
                    System.out.println("- ( 0 ) Sair");
                    System.out.println("- ( 1 ) Voltar ao menu");
                    System.out.println("- Digite o número da operação:");
                    sair = input.nextInt();
                    break;
                default:
                    System.out.println("Inválido");
                    break;
            }
            conta.rendimento(5);
        }while (executando);
    }

}