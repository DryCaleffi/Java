public class Conta {
//1. Atributos (encapsulados, escondidos, privados)//
    private String nomeCliente;
    private double saldo;
    private String agencia;
    private String conta;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    //3. Métodos - funções,m ações
    public int sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return 1; // Ok ele tem dinheiro e sacou

        }
        return 0;// deu merda ele não sacou
    }

    public void depositar(double valor) {
        saldo += valor; //
    }

    public void imprimir() {
        System.out.println("Dados Conta");
        System.out.println("Num Conta: " + conta);
        System.out.println("Saldo R$: " + saldo);
        System.out.println("Agencia: " + agencia);
        System.out.println("Nome Cliente: " +nomeCliente);

    }
}
