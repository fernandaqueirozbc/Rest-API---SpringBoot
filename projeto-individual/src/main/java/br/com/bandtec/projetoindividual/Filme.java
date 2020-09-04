package br.com.bandtec.projetoindividual;

public class Filme extends Sessao {

    private Double valorIngresso;

    public Filme(String nome, Integer sala, String hora, String data, Integer codigo, Double valorIngresso) {
        super(nome, sala, hora, data, codigo);
        this.valorIngresso = valorIngresso;
    }

    @Override
    public Double calcValorIngresso() {
        return valorIngresso * 0.2;
    }

    @Override
    public String toString() {
        return "Filme:" +
                "\nnome:" + getNome() + '\'' +
                "\n sala:" + getSala() +
                "\n hora:" + getHora()+ '\'' +
                "\n data='" + getData() + '\'' +
                "\n codigo='" + getCodigo() + '\'' +
                "\nvalorIngresso:" + valorIngresso
                ;
    }

    public Double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(Double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}
