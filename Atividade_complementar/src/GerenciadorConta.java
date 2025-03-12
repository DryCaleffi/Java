import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorConta {
    private List<Conta> contaList = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        GerenciadorConta ger = new GerenciadorConta();
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Consultar Conta");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Listar Contas");
            System.out.println("6 - Excluir Conta");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma Opção:");
            opcao = ger.input.nextInt();
            ger.input.nextLine();

            switch (opcao) {
                case 1:
                    ger.cadastrarConta();
                    break;
                case 2:
                    ger.consultarConta();
                    break;
                case 3:
                    ger.sacar();
                    break;
                case 4:
                    ger.depositar();
                    break;
                case 5:
                    ger.listarConta();
                    break;
                case 6:
                    ger.excluirConta();
                    break;
                case 0:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);
    }

    public void cadastrarConta() {
        Conta cc = new Conta();
        System.out.println("Digite o nome do Cliente: ");
        cc.setNomeCliente(input.nextLine());
        System.out.println("Digite o nome da Agência: ");
        cc.setNomeAgencia(input.nextLine());
        System.out.println("Digite o número da Conta: ");
        cc.setNumeroConta(input.nextInt());
        input.nextLine();
        contaList.add(cc);
        System.out.println("Conta cadastrada com sucesso!");
    }

    public void consultarConta() {
        System.out.print("Digite o número da conta para consulta: ");
        int numero = input.nextInt();
        for (Conta cc : contaList) {
            if (cc.getNumeroConta() == numero) {
                cc.imprimir();
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    public void sacar() {
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

    public void depositar() {
        System.out.print("Digite o número da conta para depósito: ");
        int numero = input.nextInt();
        for (Conta c : contaList) {
            if (c.getNumeroConta() == numero) {
                System.out.print("Digite o valor a ser depositado: ");
                c.depositar(input.nextDouble());
                System.out.println("Valor do Saldo atual: " + c.getSaldo());
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    public void listarConta() {
        if (contaList.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (Conta c : contaList) {
                c.imprimir();
            }
        }
    }

    public void excluirConta() {
        System.out.print("Digite o número da conta para exclusão: ");
        int numero = input.nextInt();
        for (int i = 0; i < contaList.size(); i++) {
            if (contaList.get(i).getNumeroConta() == numero) {
                contaList.remove(i);
                System.out.println("Conta removida com sucesso.");
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }
}

