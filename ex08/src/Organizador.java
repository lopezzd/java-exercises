import java.util.*;

public class Organizador {
    private String nome;
    private String email;

    public Organizador(String nome, String email) {
        setNome(nome);
        setEmail(email);
    }

    public Organizador(Organizador organizador) {
        setNome(organizador.nome);
        setEmail(organizador.email);
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome vazio!");

        nome = nome.trim();

        this.nome = nome;
    }

    public void setEmail(String email) {
        if(email == null || email.isBlank())
            throw new IllegalArgumentException("Email vazio!");

        if(!email.contains("@"))
            throw new IllegalArgumentException("Email inválido!");

        email = email.trim();

        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nEmail: " + getEmail();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Organizador organizador = (Organizador) o;

        return Objects.equals(nome, organizador.nome) &&
                Objects.equals(email, organizador.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}