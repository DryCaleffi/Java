public class Carro {

    // Atributos:
    private String marca;
    private String modelo;
    private String placa;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;


    }

    //imprimir
    public void imprimir() {
    System.out.println("Dados Carros:");
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Ano: " + ano);
    System.out.println("Placa: " + placa);
    System.out.println("-------------------");
    }
}
