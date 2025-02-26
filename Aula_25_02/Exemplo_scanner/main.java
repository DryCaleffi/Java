import
public class Main {
    public static void main(String[] args) {
        int x,y;
        scanner leitor = new scanner(System.in);
        System.out.println("Digite um valor: ");
        x = leitor.nextInt();
        System.out.println("Digite um valor: ");
        y = Integer.parseInt(leitor.nextline());
        int soma = x + y;
        System.out.println("Resultado: " + soma);
    }
}