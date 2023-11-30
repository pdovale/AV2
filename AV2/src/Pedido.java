import java.util.ArrayList;
import java.util.Date;

class Pedido {


    private int numeroPedido;


    private Date dataHoraPedido;


    private double precoTotal;


    private int statusPedido;

    private ArrayList<PedidoItem> itensPedido;

    public Pedido(int numeroPedido) {


        this.numeroPedido = numeroPedido;


        this.dataHoraPedido = new Date();
        this.precoTotal = 0.0;


        this.statusPedido = 1;
        this.itensPedido = new ArrayList<>();
    }

    public void inserirItensPedido(PedidoItem item) {


    }


    public void excluirItensPedido(PedidoItem item) {

    }


    public void calcularTotalPagar() {

    }

    public PedidoItem[] getItensPedido() {
        return new PedidoItem[0];
    }

    public void alterarStatus(int i) {
    }

    public String getNumeroPedido() {
        return null;
    }

    public String getStatusPedido() {
        return null;
    }

    public String getPrecoTotal() {
        return null;
    }
}

