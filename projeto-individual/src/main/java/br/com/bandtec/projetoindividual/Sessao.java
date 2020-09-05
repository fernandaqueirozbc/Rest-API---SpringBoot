package br.com.bandtec.projetoindividual;

public abstract class Sessao {

    private String nome;
    private Integer sala;
    private String hora;
    private String data;
    private Integer codigo;

    public Sessao(String nome, Integer sala, String hora, String data, Integer codigo) {
        this.nome = nome;
        this.sala = sala;
        this.hora = hora;
        this.data = data;
        this.codigo = codigo;
    }

    public abstract Double calcValorIngresso();

    @Override
    public String toString() {
        return "Sessao{" +
                "nome='" + nome + '\'' +
                ", sala=" + sala +
                ", hora='" + hora + '\'' +
                ", data='" + data + '\'' +
                ", codigo=" + codigo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getSala() {
        return sala;
    }

    public String getHora() {
        return hora;
    }

    public String getData() {
        return data;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
