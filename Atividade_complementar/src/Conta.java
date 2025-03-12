public class Conta {
//1. Atributos como pedido no exercício
    private String nomeCliente;
    private String nomeAgencia;
    private int numeroConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // inciando conta com saldo zerado
    public Conta(){
        this.saldo = 0.0;
    }

    public int sacar(double valor){
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
        System.out.println("Num Conta: " + numeroConta);
        System.out.println("Saldo R$: " + saldo);
        System.out.println("Agencia: " + nomeAgencia);
        System.out.println("Nome Cliente: " + nomeCliente);

    }
}


