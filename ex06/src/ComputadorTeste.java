// Exercício presente em www.github.com/lopezzd/java-exercises

public class ComputadorTeste {
    public static void main(String[] args) {
        
        Processador ryzen = new Processador(2.4d, "AMD" );
        MemoriaRAM memoria = new MemoriaRAM(8, "DDR4");

        PlacaMae b450m = new PlacaMae("Aorus", ryzen, memoria);

        Computador computador = new Computador(b450m, "Samsung", "Book4");

        System.out.println(ryzen.toString());
        System.out.println(memoria.toString());
        System.out.println(b450m.toString());
        System.out.println(computador.toString());

        Computador outroComputador = new Computador(b450m, "Samsung", "Book4");

        System.out.println(outroComputador.equals(computador));

        Computador notebook = new Computador(computador);

        MemoriaRAM outraMemoria = new MemoriaRAM(4, "DDR3");

        notebook.getPlacaMae().setMemoriaRAM(outraMemoria);

        System.out.println(notebook.toString());
    }
}