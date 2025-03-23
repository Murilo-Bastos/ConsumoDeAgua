package service;
import models.ConsumoAgua;

public class RelatorioAgua {
	public static void emitirRelatorio(ConsumoAgua consumo) {
		System.out.println("\n Seu Relatório de consumo");
		
		System.out.println("Usuário: " + consumo.getNomeUsuario());
        System.out.println("Consumo Diário: " + consumo.getConsumoDiario() + " litros");
        System.out.println("Limite Diário: " + consumo.getLimiteDiario() + " litros");
        
        if (consumo.getConsumoDiario() > 200) {
            System.out.println(" ALERTA: O consumo diário ultrapassou 200 litros!");
        }
        else {
        	System.out.println(" Você está com o consumo dentro dos Limites! ");
        }
	}

}