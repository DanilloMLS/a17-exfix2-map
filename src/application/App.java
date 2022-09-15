package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import entities.Urna;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o caminho completo do arquivo:");
        String arquivo = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            
            Map<Urna, Integer> votos = new TreeMap<>();
            String linha = br.readLine();

            while (linha != null) {
                
                String[] dado = linha.split(",");
                votos.put(new Urna(dado[0], Integer.parseInt(dado[1])), Integer.parseInt(dado[1]));
                linha = br.readLine();

            }

            for (Urna key : votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
