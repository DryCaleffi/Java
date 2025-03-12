//Adryelle Caroline de Souza Calefi
public class Conta {

    // Atributos
    private String nomeCliente;
    private String nomeAgencia;
    private int numeroConta;
    private double saldo;

    // Construtor iniciando conta com saldo zerado
    public Conta() {
        this.saldo = 0.0;
    }

    // Métodos Getters e Setters
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

    public int sacar(double valor) {
        if (valor <= saldo && valor > 0)  {
            saldo -= valor;
            return 1;
        }
        return 0;
    }

    public void depositar(double valor)
    {
        if (valor > 0)  {
        saldo += valor;
            System.out.println("Valor Depositado com sucesso!");
    }else{
            System.out.println("Valor de Deposito Inválido");
        }
    }

    public void imprimir() {
        System.out.println("Dados Conta");
        System.out.println("Num Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Agencia: " + nomeAgencia);
        System.out.println("Nome Cliente: " + nomeCliente);
        System.out.println("------------------------");
    }
}
