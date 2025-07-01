package Util;

import java.io.*;
import java.util.ArrayList;
import Modelo.Financiamento;
import Modelo.Casa;
import Modelo.Apartamento;
import Modelo.Terreno;

public class Arquivos {

    public static void salvarFinanciamentosTxt(ArrayList<Financiamento> lista, String caminhoArquivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Financiamento f : lista) {
                StringBuilder linha = new StringBuilder();
                linha.append(f.getvalorImovel()).append(",");
                linha.append(f.getprazoFinanciamento()).append(",");
                linha.append(f.gettaxaJurosAnual()).append(",");

                if (f instanceof Casa) {
                    Casa c = (Casa) f;
                    linha.append("Casa,");
                    linha.append(c.getAreaConstruida()).append(",");
                    linha.append(c.getAreaTerreno());
                } else if (f instanceof Apartamento) {
                    Apartamento a = (Apartamento) f;
                    linha.append("Apartamento,");
                    linha.append(a.getVagasGaragem()).append(",");
                    linha.append(a.getNumeroAndar());
                } else if (f instanceof Terreno) {
                    Terreno t = (Terreno) f;
                    linha.append("Terreno,");
                    linha.append(t.getZonaTerreno());
                }
                bw.write(linha.toString());
                bw.newLine();
            }
            System.out.println("Dados salvos em texto com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    public static void lerFinanciamentosTxt(String caminhoArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            System.out.println("\nLendo financiamentos salvos no TXT:");
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }
    }
}
