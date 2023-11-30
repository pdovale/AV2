import java.util.Date;

class Evento {
    private String nomeEvento;

    private Date dataEvento;
    private double precoEvento;

    private String descEvento;
    private int qtdIngresso;
    private Categoria categoria;

    public Evento(String nomeEvento, Date dataEvento, double precoEvento, String descEvento, int qtdIngresso, Categoria categoria) {

        this.nomeEvento = nomeEvento;


        this.dataEvento = dataEvento;


        this.precoEvento = precoEvento;


        this.descEvento = descEvento;


        this.qtdIngresso = qtdIngresso;


        this.categoria = categoria;
    }
    public boolean buscarEvento(PedidoItem outroEvento) {

        return this.nomeEvento.equals(outroEvento.nomeEvento);
    }

    public Object getQtdIngresso() {
        return null;
    }

    public void setQtdIngresso(int i) {
    }
}






