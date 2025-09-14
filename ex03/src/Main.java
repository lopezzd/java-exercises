import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Exercício presente em www.github.com/lopezzd/java-exercises

public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println("Seja bem-vindo(a) ao Exercício 03!");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            try{
                System.out.print("Digite um número inteiro: ");
                int firstNumber = Integer.parseInt(bufferedReader.readLine());

                System.out.print("Digite outro número inteiro: ");
                int secondNumber = Integer.parseInt(bufferedReader.readLine());

                int result = firstNumber / secondNumber;

                System.out.println("Divisão de " + firstNumber + " por " + secondNumber + " é igual a " + result);

                break;
            }catch (NumberFormatException err){
                System.err.println("Valor errado, digite novamente!");
            }catch (ArithmeticException err){
                System.err.println("Divisão por zero, digite outros números!");
            } catch (Exception e) {
                System.err.println("Erro ocorreu!");
            }
        }

        while (true){
            try{
                System.out.print("Digite uma palavra: ");
                String word = new String(bufferedReader.readLine());

                System.out.println("Lembrando que inicia-se no 0");
                System.out.print("Agora digite um indice a ser acessado: ");
                int index = Integer.parseInt(bufferedReader.readLine());

                System.out.println("Letra do do indice " + index + " é " + word.charAt(index));

                break;
            }catch (NumberFormatException err){
                System.err.println("Valor errado, digite novamente!");
            }catch (StringIndexOutOfBoundsException err){
                System.err.println("Indice inválido, digite novamente!");
            }catch (NullPointerException err){
                System.out.println("Palavra inválida!");
            }catch (Exception err) {
                System.err.println("Erro ocorreu!");
            }

            try{
                String word = null;

                System.out.println(word.length());

            }catch (NullPointerException err){
                System.out.println("Palavra inválida!");
            }catch (Exception err) {
                System.err.println("Erro ocorreu!");
            }
        }
    }
}