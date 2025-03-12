import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorConta {
        public Conta cc = new Conta();
        private List<Conta> contaList = new ArrayList<>();

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            GerenciadorConta ger = new GerenciadorConta();

            // Iniciando opção como 0
            int opcao = 0;



        do{
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Consultar Conta");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Listar Constas");
            System.out.println("6- Excluir Conta");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma Opção:");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    ger.cadastrarConta(input);
                    break;
                case 2:
                    ger.consultarConta(input);
                    break;
                case 3:
                    ger.sacar(input);
                    break;
                case 4:
                    ger.(input);
                    break;
                case 5:
                    ger.listarConta();
                    break;
                case 6:
                    ger.excluirConta(input);
                    break;
                case 0:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;

            }
        }
 }
    public void cadastrarConta(){
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o nome do Cliente: ");
            cc.setNomeCliente(input.nextLine());
            System.out.println("Digite o nome da Agencia: ");
            cc.setNomeAgencia(input.nextLine());
            System.out.println("Digite o número da Conta: ");
            cc.setNumeroConta(input.nextInt());

            contaList.add(new Conta);
            System.out.println("Conta cadastrada com sucesso!");

        }
    public void consultarConta(){
     // Pedir numero da conta
        System.out.print("Digite o número da conta para consulta: ");
        int Numero = (input.nextInt());
        // condição para achar conta
        for (Conta cc : contaList) {
        if (cc.getNumeroConta() == Numero) {
            cc.imprimir();
            return;
        }
    }
        System.out.println("Conta não encontrada.");
}
    public void sacar(){
        System.out.print("Digite o número da conta para saque: ");
        int numero = input.nextInt();

        for (Conta cc : contaList) {
            if (cc.getNumeroConta() == numero) {
                System.out.print("Digite o valor a ser sacado: ");
                double valor = input.nextDouble();
                if (cc.sacar(valor) == 1) {
                    System.out.println("Saque realizado com sucesso.");
                } else {
                    System.out.println("Saldo insuficiente.");
                }
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

        }
    public void execDeposito(){
        System.out.print("Digite o número da conta para depósito: ");
        int numero = input.nextInt();

        for (Conta c : contaList) {
            if (c.getNumeroConta() == numero) {
                System.out.print("Digite o valor a ser depositado: ");
                c.depositar(input.nextDouble());
                System.out.println("Depósito efetuado com sucesso.");
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

public void listarConta(){
    if (contaList.isEmpty()) {
        System.out.println("Nenhuma conta cadastrada.");
    } else {
        for (Conta c : contaList) {
            c.imprimir();
        }
    }
}
    public void excluirConta(){

    }


}

