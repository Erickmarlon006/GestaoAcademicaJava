import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa implements Autenticavel {
    private int matricula;
    private Curso curso;
    private String senha;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome, String cpf, String email, int matricula, Curso curso, String senha) {
        super(nome, cpf, email);
        this.matricula = matricula;
        this.curso = curso;
        this.senha = senha;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return this.curso;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Curso: " + getCurso().getNome());
    }

    @Override
    public boolean autenticar(String senhaDigitada) {
        if (senhaDigitada.equals(this.senha)) {
            System.out.println("Senha correta, bem-vindo Aluno : " + getNome());
            return true;
        } else {
            throw new IllegalArgumentException("Senha incorreta para o aluno.");
        }
    }

    public void matricularEm(Disciplina disciplina) {
        if (disciplinasMatriculadas.contains(disciplina)) {
            System.out.println(getNome() + " já está matriculado em " + disciplina.getNome());
            return;
        }
        disciplinasMatriculadas.add(disciplina);
        System.out.println(getNome() + " matriculado em " + disciplina.getNome());
    }

    public void cancelarMatricula(Disciplina disciplina) {
        if (disciplinasMatriculadas.remove(disciplina)) {
            System.out.println("Matrícula de " + getNome() + " cancelada em " + disciplina.getNome());
        } else {
            System.out.println(getNome() + " não está matriculado em " + disciplina.getNome());
        }
    }

    public void listarDisciplinasMatriculadas() {
        System.out.println("Disciplinas de " + getNome() + ":");
        if (disciplinasMatriculadas.isEmpty()) {
            System.out.println("- Nenhuma disciplina.");
            return;
        }
        for (Disciplina d : disciplinasMatriculadas) {
            System.out.println("- " + d.getNome());
        }
    }
}