package Lemes.Pedro;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;
    private Conta conta;

    public void executar(){
        int opcao;
        while(executarSistema){
            exibirMenu();
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    private void avaliarOpcao(int opcao) {
        switch (opcao){
            case 0:
                System.out.println("Obrigado por ter utilizado o sistema!");
                this.executarSistema = false;
                break;
            case 1:
                System.out.println("Saldo: R$" + this.conta.getSaldo());
                break;
            case 2:
                System.out.println("Informe um valor para depositar:");
                double valorParaDepositar = scanner.nextDouble();
                this.conta.depositar(valorParaDepositar);
                System.out.println("Operação realizada com sucesso!");
                break;
            case 3:
                System.out.println("Informe o valor para sacar:");
                double valorParaSacar = scanner.nextDouble();
                if(this.conta.sacar(valorParaSacar)){
                    System.out.println("Operação realizada com Sucesso!");
                } else {
                    System.out.println("Algo de errado acontceu: Saldo");
                }
                break;
           default:
                System.out.println("Opção ainda não implementada!");
                break;
        }
    }

    public Sistema() {
        this.executarSistema = true;
        this.scanner = new Scanner(System.in);  //Cria um scanner para o teclado (entrada padrão)
        this.conta = new Conta("Luigi",1235, 1000);
    }

    private void exibirMenu() {
        System.out.println("Bem vindo ao MauaBank");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Depositar dinheiro");
        System.out.println("3 - Sacar dinheiro");
        System.out.println("4 - Transferir dinheiro");
        System.out.println("5 - Pagar conta (título)");
        System.out.println("0 - Encerrar Sistema");
    }
}