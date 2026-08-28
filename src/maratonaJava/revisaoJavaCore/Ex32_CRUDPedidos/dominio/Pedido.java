package maratonaJava.revisaoJavaCore.Ex32_CRUDPedidos.dominio;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private double valor;

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", cliente='" + cliente + '\'' +
                ", valor=" + valor +
                '}';
    }

    public Pedido(int numeroPedido, String cliente, double valor) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.valor = valor;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
