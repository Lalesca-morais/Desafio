import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Vendedor vendedor = new Vendedor();
        Produtos produto = new Produtos();
        Cliente cliente = new Cliente();
        Vendas venda = new Vendas();

        System.out.println("==========MENU DE OPÇÕES==========");
        System.out.println("Digite a opção desejada!");
        System.out.println("1 - Cadastrar Cliente ");
        System.out.println("2 - Cadastrar Vendedor");
        System.out.println("3 - Venda");
        System.out.println("4 - Compra");
        System.out.println("5 - Sair");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                Cliente.cadastroCliente();
                break;
            case 2:
                Vendedor.cadastrarVendedor();
                break;
            case 3:
                Vendas.cadastrarVendas();
                break;
            case 4:
                Produtos.menu();
                break;
            case 5:

                break;
            default:

        }
    }
}
