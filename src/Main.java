import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Professor p1 = new Professor("Erick", "12345678901", "erickmbs006@gmail.com", 120, "Pesquisa Científica",
                "senhaProfessor");
        Professor p2 = new Professor("Bianca", "12045608950", "bianca@gmail.com", 121, "Educação", "senhaProfessor");

        Curso programacao = new Curso(1, "Programação", 200);

        Disciplina m1 = programacao.criarDisciplina(1, "Matemática Computacional", 80, p1);
        Disciplina m2 = programacao.criarDisciplina(2, "Back-end", 60, p2);
        Disciplina m3 = programacao.criarDisciplina(3, "Processos de Engenharia de Software", 100, p1);
        Disciplina m4 = programacao.criarDisciplina(4, "Banco de Dados e SQL", 150, p1);

        Aluno a1 = new Aluno("Lucas", "111222333", "lucas@gmail.com", 2024001, programacao, "senhaAluno");
        Aluno a2 = new Aluno("Marina", "222333444", "marina@gmail.com", 2024002, programacao, "senhaAluno");
        Aluno a3 = new Aluno("Rafael", "333444555", "rafael@gmail.com", 2024003, programacao, "senhaAluno");

        a1.matricularEm(m1);
        a1.matricularEm(m2);
        a2.matricularEm(m2);
        a3.matricularEm(m3);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(a1);
        pessoas.add(a2);
        pessoas.add(a3);

        for (Pessoa pessoa : pessoas) {
            pessoa.exibirDados();
            System.out.println("---");
        }
        programacao.removerDisciplina("Banco de Dados e SQL");
        programacao.adicionarDisciplina(m4);
        programacao.listarDisciplinas();

        a1.listarDisciplinasMatriculadas();
        a1.cancelarMatricula(m1);
        a1.listarDisciplinasMatriculadas();

        System.out.println(a1.autenticar("senhaAluno"));
        System.out.println(p1.autenticar("senhaProfessor"));
    }
}