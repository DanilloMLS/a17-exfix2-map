package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o caminho completo do arquivo:");
        String arquivo = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            
            Map<String, Integer> votos = new TreeMap<>();
            String linha = br.readLine();

            while (linha != null) {
                
                String[] dado = linha.split(",");
                
                if (votos.containsKey(dado[0])) {
                    votos.put(dado[0], Integer.parseInt(dado[1]) + votos.get(dado[0]));
                } else {
                    votos.put(dado[0], Integer.parseInt(dado[1]));
                }

                linha = br.readLine();

            }

            for (String chave : votos.keySet()) {
                System.out.println(chave + ": " + votos.get(chave));
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
