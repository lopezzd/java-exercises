import java.util.ArrayList;
import java.util.Collections;

public class AppImovel {
    public static void main(String[] args) {

        // Endereços
        Endereco end1 = new Endereco("Rua das Flores", 100, "Jardim Primavera", "São Paulo", UF.SP, "01234-567");
        Endereco end2 = new Endereco("Avenida Paulista", 1500, "Bela Vista", "São Paulo", UF.SP, "01234-567");
        Endereco end3 = new Endereco("Rua das Flores", 50, "Jardim Primavera", "São Paulo", UF.SP, "01234-567");
        Endereco end4 = new Endereco("Avenida Copacabana", 700, "Copacabana", "Rio de Janeiro", UF.RJ, "22345-001");
        Endereco end5 = new Endereco("Rua Augusta", 900, "Consolação", "São Paulo", UF.SP, "01305-100");
        Endereco end6 = new Endereco("Rua dos Inconfidentes", 550, "Savassi", "Belo Horizonte", UF.MG, "30140-120");
        Endereco end7 = new Endereco("Rua Fictícia", 550, "Centro", "Cidade Inventada", UF.MG, "30140-120");
        Endereco end8 = new Endereco("Rua Barata Ribeiro", 300, "Copacabana", "Rio de Janeiro", UF.RJ, "22040-001");
        Endereco end9 = new Endereco("Rua das Flores", 100, "Jardim Primavera", "São Paulo", UF.SP, "01234-567");
        Endereco end10 = new Endereco("Alameda dos Anjos", 9999, "Paraíso", "São Paulo", UF.SP, "00111-000");

        // Imóveis
        Casa casa1 = new Casa("COD123", 789900.00d, 350.5d, end1, 3, true);
        Casa casa2 = new Casa("COD456", 320000.00d, 195.0d, end2, 2, false);
        Casa casa3 = new Casa("COD789", 123000.00d, 550.75d, end3, 4, true);
        Casa casa4 = new Casa("COD123", 310000.00d, 110.5d, end1, 3, true);
        Apartamento apartamento1 = new Apartamento("COD156", 250000.00d, 150.5d, end1, 3, true, false);
        Apartamento apartamento2 = new Apartamento("COD636", 190000.00d, 95.0d, end2, 2, false, true);
        Apartamento apartamento3 = new Apartamento("COD789", 530000.00d, 220.75d, end3, 4, true, true);
        Apartamento apartamento4 = new Apartamento("COD159", 550000.00d, 150.5d, end1, 3, true, true);
        Terreno terreno1 = new Terreno("COD790", 290000.00d, 220.75d, end3, TipoTerreno.Arenoso, Zoneamento.Comercial);
        Terreno terreno2 = new Terreno("COD890", 310000.00d, 440.75d, end3, TipoTerreno.Argiloso, Zoneamento.Residencial);

        ArrayList<Imovel> imoveis = new ArrayList<Imovel>();

        imoveis.add(casa1);
        imoveis.add(casa2);
        imoveis.add(casa3);
        imoveis.add(casa4);
        imoveis.add(apartamento1);
        imoveis.add(apartamento2);
        imoveis.add(apartamento3);
        imoveis.add(apartamento4);
        imoveis.add(terreno1);
        imoveis.add(terreno2);

        System.out.println("\n\ntoString de cada imóvel");
        System.out.println("--------------------------------------------------");

        for(Imovel imovel: imoveis){
            System.out.println(imovel.toString() + "\n");
        }

        System.out.println("\n\nIPTU de cada imóvel");
        System.out.println("--------------------------------------------------");

        for(Imovel imovel: imoveis){
            System.out.println("R$ " + imovel.calcularIPTU() + "\n");
        }

        Collections.sort(imoveis);

        System.out.println("\n\nArray List Ordenada");
        System.out.println("--------------------------------------------------");

        for(Imovel imovel: imoveis){
            System.out.println("R$ " + imovel.toString() + "\n");
        }
    }
}