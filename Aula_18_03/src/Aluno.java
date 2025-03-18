public class Aluno {
    private String nome;
    private String login;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    // Método construtor onde o método tem três parametros em um método só,
    // mas ai no main não posso chamar e criar um novo objeto com;
    // ( Aluno = new, pois agora preciso de um nome , login e senha para ele criar o objeto)



    // Método com dois valores// Método com dois valores
    public Aluno(String nome, String login) {
        this.nome = nome;
        this.login = login;


    }
    // Método com um valor que chama os demais.
    public Aluno(String senha){
        this(nome,login);
        this.senha = senha;

    }
    public Aluno() {

    }
}
