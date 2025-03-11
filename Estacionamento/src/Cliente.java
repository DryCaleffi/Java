import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int codigoCliente;
    private String nomeCliente;
    private String emailCliente;

    //Associação
    private List<Carro> carros = new ArrayList<Carro>();

    //gets and sets
    // Métodos
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    //imprimir
    public void imprimir(){
        System.out.println("Dados do cliente: ");
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Email: " + getEmailCliente());
        if (carros.isEmpty())
        {
            System.out.println("Cliente não possui carros cadastrados.");

        }else {
            System.out.println("Lista de carros:.");
            for (Carro carro : carros){
                carro.imprimir();
            }
        }

    }
    // método para adicionar carro cliente

    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }
}


