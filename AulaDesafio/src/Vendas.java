import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
public class Vendas {
    private String cliente, vendedorResponsavel, valorASerPago;
    private LocalDate dataRegistro;
    public Vendas() {
        this.cliente = cliente;
        this.vendedorResponsavel = vendedorResponsavel;
        this.valorASerPago = valorASerPago;
        this.dataRegistro = dataRegistro;
    }
    public String getCliente() {
        return cliente;
    }
    public String getVendedorResponsavel() {
        return vendedorResponsavel;
    }
    public String getValorASerPago() {
        return valorASerPago;
    }
    public LocalDate getDataRegistro() {
        return dataRegistro;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public void setVendedorResponsavel(String vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }
    public void setValorASerPago(String valorASerPago) {
        this.valorASerPago = valorASerPago;
    }
    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    public static void cadastrarVendas() {
        Scanner entrada = new Scanner(System.in);
        HashSet<String> vendas = new HashSet<String>();

        while (true) {
            System.out.println("");
        }
    }
}
