import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private List<Disciplina> disciplinas;

    public Curso(int codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.disciplinas = new ArrayList<>();
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public Disciplina criarDisciplina(int codigo, String nome, int cargaHoraria, Professor professor) {
        Disciplina disciplina = new Disciplina(codigo, nome, cargaHoraria, professor);
        this.disciplinas.add(disciplina);
        return disciplina;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void removerDisciplina(String nomeDisciplina) {
        this.disciplinas.removeIf(d -> d.getNome().equals(nomeDisciplina));
    }

    public void listarDisciplinas() {
        System.out.println("Disciplinas do curso " + this.nome + ":");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("- " + disciplina.getNome());
        }
    }
}