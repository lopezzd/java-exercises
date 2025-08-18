import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Exercício presente em www.github.com/lopezzd/java-exercises

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Seja bem-vindo(a) ao Exercício 01!");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Poderia digitar seu nome: ");
        String nome = bufferedReader.readLine();
        nome.trim();

        while (true) {
            System.out.println("Você digitou: " + nome);

            System.out.print("Gostaria de alterar? (S/N): ");
            String res = bufferedReader.readLine();

            res.trim().toLowerCase();

            if ( res.equalsIgnoreCase("n")) {
                break;
            }

            System.out.print("Poderia digitar seu nome: ");
            nome = bufferedReader.readLine();
            nome.trim();
        }

        System.out.println("Você digitou: " + nome);


        String invertedName[] = nome.split(" ");

        int lastName = invertedName.length - 1;

        System.out.print("Nome invertido: " + invertedName[lastName].toUpperCase() + " " + invertedName[0].substring(0, 1).toUpperCase() + invertedName[0].substring(1));

    }
}
