import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao = 0;

        ContaTeste gerenciar = new ContaTeste();

        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Consultar");
            System.out.println("9 - Imprimir");
            System.out.println("Escolha uma opcao:");
            opcao = Integer.parseInt(input.nextLine());
            switch (opcao) {
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execDepositar();
                    break;
                case 3:
                    gerenciar.execSacar();
                    break;
                case 4:
                    gerenciar.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        } while (opcao != 9);
    }

    public void execCadastrar() {
