package models;

public class ConsumoAgua {
	
	
    private String nomeUsuario;
    private double consumoDiario;
    private double limiteDiario;

    public ConsumoAgua(String nomeUsuario, double limiteDiario) {
        this.nomeUsuario = nomeUsuario;
        this.limiteDiario = limiteDiario;
        this.consumoDiario = 0; 
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public double getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(double consumo) {
        if (consumo < 0) {
            System.out.println("Erro: O consumo não pode ser 0 ou menor.");
        } 
        
        else {
            this.consumoDiario = consumo;
        }
    }

    public double getLimiteDiario() {
        return limiteDiario;
    }

    public void setLimiteDiario(double limiteDiario) {
        if (limiteDiario >= 10) { // O limite mínimo é 10 litroes
            this.limiteDiario = limiteDiario;
        } else {
            System.out.println("Erro: O limite mínimo de consumo deve ser 10 litros.");
        }
        }
}