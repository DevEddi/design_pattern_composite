 public abstract class Transportadora {
    private String  descricao;

    public Transportadora(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public abstract String getTransportadora();
}
