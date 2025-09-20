import java.util.Arrays;
import java.util.List;

// Exercício presente em www.github.com/lopezzd/java-exercises

public class AlunoTest {
    public static void main(String[] args) {
        Aluno joao = new Aluno("24000599", "João", 7);
        Aluno ana = new Aluno("21211097", "Ana", 10);
        Aluno marcos = new Aluno("24435699", "Marcos", 10);
        Aluno maria = new Aluno("22056595", "Maria", 6);
        Aluno julia = new Aluno("21211097", "Julia", 4);
        Aluno eduardo = new Aluno("24435699", "Eduardo", 6);

        List<Aluno> alunos = Arrays.asList(joao, ana, marcos, maria, julia, eduardo);

        System.out.println("João & Ana: " + joao.compareTo(ana));
        System.out.println("Ana & João: " + ana.compareTo(joao));

        System.out.println("Marcos & Ana: " + marcos.compareTo(ana));
        System.out.println("Ana & Marcos: " + ana.compareTo(marcos));

        System.out.println("maria & Eduardo: " + maria.compareTo(eduardo));
        System.out.println("Eduardo & maria: " + eduardo.compareTo(maria));

        System.out.println("Julia & João: " + julia.compareTo(joao));
        System.out.println("João & Julia: " + joao.compareTo(julia));

        alunos.stream().sorted().forEach(System.out::println);

    }
}