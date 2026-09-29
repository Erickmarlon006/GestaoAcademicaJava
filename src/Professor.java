public class Professor extends Pessoa implements Autenticavel {
    private static final int TAMANHO_MINIMO_SENHA = 8;

    private int registro;
    private String areaAtuacao;
    private String senha;

    public Professor(String nome, String cpf, String email, int registro, String areaAtuacao, String senha) {
        super(nome, cpf, email);
        this.registro = registro;
        this.areaAtuacao = areaAtuacao;
        this.senha = senha;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public int getRegistro() {
        return this.registro;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return this.areaAtuacao;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Email: " + getEmail());
        System.out.println("Registro: " + getRegistro());
        System.out.println("Área de Atuação: " + getAreaAtuacao());
    }

    @Override
    public boolean autenticar(String senhaDigitada) {
        return senhaDigitada != null
                && senhaDigitada.length() >= TAMANHO_MINIMO_SENHA
                && senhaDigitada.equals(this.senha);
    }
}