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
        return "Sessao:" +
                "\nnome:" + nome + '\'' +
                "\n sala:" + sala +
                "\n hora:" + hora + '\'' +
                "\n data:" + data + '\'' +
                "\n codigo='" + codigo + '\'';
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
