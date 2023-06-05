import java.util.HashSet;
import java.util.Scanner;
public class Vendedor {
    public static void cadastrarVendedor() {
    Scanner entrada = new Scanner(System.in);
    HashSet<String> listaVendedores = new HashSet<String>();

      // pegar um vendedor aleatorio (usando o randon)para atender o cliente

        System.out.println("Informe nome do vendedor para cadastro: ");
        String nomeVendedor = entrada.nextLine();
        listaVendedores.add(nomeVendedor);
        System.out.println("Vendedor cadastrado com sucesso!");
    }
}
