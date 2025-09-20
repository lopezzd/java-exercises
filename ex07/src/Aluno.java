import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String ra;
    private String nome;
    private double mediaFinal;

    public Aluno(String ra, String nome, double mediaFinal) {
        setRa(ra);
        setNome(nome);
        setMediaFinal(mediaFinal);
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        if(ra == null || ra.isBlank())
            throw new IllegalArgumentException("Nome inválido!");
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome inválido!");

        this.nome = nome;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        if(mediaFinal < 0 || mediaFinal > 100)
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");

        this.mediaFinal = mediaFinal;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(ra, aluno.ra);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ra);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra='" + ra + '\'' +
                ", nome='" + nome + '\'' +
                ", mediaFinal=" + mediaFinal +
                '}';
    }

    @Override
    public int compareTo(Aluno outro) {
        int compMedia = Double.compare(outro.mediaFinal, this.mediaFinal);
        if (compMedia != 0) return compMedia;

        int compNome = this.nome.compareToIgnoreCase(outro.nome);
        if (compNome != 0) return compNome;

        return this.ra.compareTo(outro.ra);
    }
}
