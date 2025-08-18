import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Exercício presente em www.github.com/lopezzd/java-exercises

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Seja bem-vindo(a) ao Exercício 02!");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Largura da sala (m): ");
        float largura = Float.parseFloat(bufferedReader.readLine());

        System.out.print("Comprimento da sala (m): ");
        float comprimento = Float.parseFloat(bufferedReader.readLine());

        System.out.print("Quantidade de pilares da sala: ");
        byte pilares = Byte.parseByte(bufferedReader.readLine());

        System.out.print("Raio de cada pilar: ");
        float raio = Float.parseFloat(bufferedReader.readLine());

        System.out.print("Cobertura de cada caixa de piso (m²): ");
        float cobertura = Float.parseFloat(bufferedReader.readLine());

        System.out.print("Preço de cada caixa de piso: ");
        float preco = Float.parseFloat(bufferedReader.readLine());

        System.out.print("Percentual de desperdício: ");
        float desperdicio = Float.parseFloat(bufferedReader.readLine());

        System.out.print("| -------------------------------- |\n");


        float areaSala = largura * comprimento;
        System.out.println("Área da sala: " + areaSala + "m²");

        float areaPilares = Math.PI * Math.pow(raio, 2) * pilares;
        System.out.println("Área total dos pilares: " + areaPilares);

        float areaLiquida = areaSala - areaPilares;
        System.out.println("Área líquida: " + areaLiquida);

        float areaDisperdico = areaLiquida * (1 + desperdicio);
        System.out.println("Área com desperdício: " + areaDisperdico);

        float qtdCaixas = areaDisperdico / 2.2;
        System.out.println("Caixas necessárias: " + qtdCaixas);

        float custoPiso = qtdCaixas * preco;
        System.out.println("Custo do piso: " +  custoPiso);

        System.out.println("Perímetro útil: ");
        System.out.println("Custo do rodapé: ");
        System.out.println("Custo total: ");
    }
}