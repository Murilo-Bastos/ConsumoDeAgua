package main;

import models.ConsumoAgua;
import service.RelatorioAgua;
import java.util.Scanner;

public class Monitoramento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entradndo o usuario :v
        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o limite diário de consumo (mínimo 10 litros): ");
        double limite = scanner.nextDouble();
        

        // Criando o usuário com limite diário.
        ConsumoAgua usuario = new ConsumoAgua(nome, limite);

        System.out.print("Digite o consumo diário de água: ");
        double consumo = scanner.nextDouble();
        usuario.setConsumoDiario(consumo);
        
        // Exibir relatório :3
        RelatorioAgua.emitirRelatorio(usuario);

        scanner.close();
    }
}