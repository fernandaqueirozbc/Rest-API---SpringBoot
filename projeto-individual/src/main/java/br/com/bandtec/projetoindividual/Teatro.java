package br.com.bandtec.projetoindividual;

public class Teatro extends Sessao {

    private Double valorIngresso;

    public Teatro(String nome, Integer sala, String hora, String data, Integer codigo, Double valorIngresso) {
        super(nome, sala, hora, data, codigo);
        this.valorIngresso = valorIngresso;
    }

    @Override
    public Double calcValorIngresso() {
        return valorIngresso * 0.15;
    }

    @Override
    public String toString() {
        return "Teatro{" +
                "valorIngresso=" + valorIngresso +
                '}';
    }

    public Double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(Double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}
