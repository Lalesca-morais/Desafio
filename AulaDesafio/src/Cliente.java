import java.util.HashSet;
import java.util.Scanner;
public class Cliente {
    public static void cadastroCliente() {
        try {
        while (true) {
            Scanner entrada = new Scanner(System.in);
            HashSet<String> listaClientes = new HashSet<String>();

            //O sistema não permite cadastrar vendas para clientes nao cadastrados;
                System.out.println("Para cadastrar, informe seu nome: ");
                String nome = entrada.nextLine();
                listaClientes.add(nome);
                System.out.println();

                System.out.println("Informe seu e-mail (com o @): ");
                String email = entrada.nextLine();
                listaClientes.add(email);
                System.out.println();

            //O sistema não permite cadastrar clientes com CPFs repetidos;
                System.out.println("Informe seu CPF: ");
                int cpf = entrada.nextInt();
                 listaClientes.add(String.valueOf(cpf));


        }
        } catch (NumberFormatException  exception) {
            System.out.println("Entrada inválida" + exception.getMessage());
        } catch (IllegalArgumentException | UnsupportedOperationException exception) {
            System.out.println("Entrada não permitida/suportada " + exception.getMessage());
        } finally {
            System.out.println("Execução do finally!");
        }
    }
}
