import java.util.Objects;

public class Evento implements Comparable<Evento> {
    private String titulo;
    private Organizador organizador;
    private String data;
    private static int totalCriados = 0;

    public Evento(String titulo, Organizador organizador, String data) {
        setTitulo(titulo);
        setOrganizador(organizador);
        setData(data);
        totalCriados++;
    }

    public Evento(Evento outro) {
        this(outro.titulo, new Organizador(outro.organizador), outro.data);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Título não pode ser nulo ou vazio.");
        }
        this.titulo = titulo.trim();
    }

    public Organizador getOrganizador() {
        return new Organizador(organizador);
    }

    public void setOrganizador(Organizador organizador) {
        if (organizador == null) {
            throw new IllegalArgumentException("Organizador não pode ser nulo.");
        }
        this.organizador = new Organizador(organizador);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (data == null || data.isBlank() || !data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            throw new IllegalArgumentException("Data inválida! Use o formato dd/MM/yyyy.");
        }

        this.data = data.trim();
    }

    public static int getTotalCriados() {
        return totalCriados;
    }

    @Override
    public String toString() {
        return String.format("Evento: %s | Data: %s | Organizador: %s",
                titulo, data, organizador);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return titulo.equalsIgnoreCase(evento.titulo)
                && data.equals(evento.data)
                && organizador.equals(evento.organizador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo.toLowerCase(), data, organizador);
    }

    @Override
    public int compareTo(Evento outro) {
        return this.titulo.compareToIgnoreCase(outro.titulo);
    }
}