public class Disciplina {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private Professor professor;

    public Disciplina(int codigo, String nome, int cargaHoraria, Professor professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void exibirInfo() {
        System.out.println("Nome da disciplina: " + getNome());
        System.out.println("Carga Horária: " + getCargaHoraria());
        System.out.println("Professor: " + getProfessor().getNome());
    }
}
