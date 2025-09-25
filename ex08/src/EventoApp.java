import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class EventoApp {
    public static void main(String[] args)
    {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        List<Evento> eventos = new ArrayList<>();

        System.out.println("Cadastro de eventos");

        for (int i = 1; i <= 3; ) {
            System.out.println("\nEvento " + i + ":");

            try {
                System.out.print("Digite o nome do evento: ");
                String nomeEvento = leitor.readLine();

                System.out.print("Digite a data do evento: ");
                String dataEvento = leitor.readLine();

                System.out.print("Digite o nome do organizador: ");
                String nomeOrganizador = leitor.readLine();

                System.out.print("Digite o email do organizador: ");
                String emailOrganizador = leitor.readLine();

                Organizador organizador = new Organizador(nomeOrganizador, emailOrganizador);
                Evento evento = new Evento(nomeEvento, organizador, dataEvento);

                eventos.add(evento);
                i++;

            } catch (IOException e) {
                System.err.println("Erro ao ler entrada: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.err.println("Entrada inválida: " + e.getMessage());
                System.out.println("Por favor, tente novamente.");
            }
        }

        System.out.println("\nEventos cadastrados (ordem de criação):");
        for (Evento evento : eventos) {
            System.out.println(evento);
        }

        System.out.println("\nTotal de eventos criados: " + (eventos.isEmpty() ? 0 : eventos.get(0).getTotalCriados()));

        Collections.sort(eventos);

        System.out.println("\nEventos cadastrados (ordenados):");
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }
}