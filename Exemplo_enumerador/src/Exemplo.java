public class Exemplo {
    public static void main(String[] args) {

        DiasSemana dia = DiasSemana.Quinta;
        System.out.println(dia);

        for(DiasSemana d : DiasSemana.values()) {
            System.out.println(d);
        }

    }
}