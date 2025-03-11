public class GerenciarEstac {
    public static void main(String[] args) {

        Cliente cliente1, cliente2, cliente3;
        Carro carro1, carro2, carro3;

        cliente1 = new Cliente();
        cliente1.setCodigoCliente(1);
        cliente1.setNomeCliente("Dry");
        cliente1.setEmailCliente("dry@gmail.com");

        carro1 = new Carro();
        carro1.setAno(1976);
        carro1.setMarca("Chevrolet");
        carro1.setModelo("Opala comodoro");
        carro1.setPlaca("ROCHA");

        carro2 = new Carro();
        carro2.setAno(1987);
        carro2.setMarca("VW");
        carro2.setModelo("Fusca");
        carro2.setPlaca("CALEFI");

        cliente1.imprimir();
        //Agora ligando carros aos cliente
        cliente1.adicionarCarro(carro1);
        cliente1.adicionarCarro(carro2);
        cliente1.imprimir();
    }
}
