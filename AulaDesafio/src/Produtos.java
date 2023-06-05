import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class Produtos extends Compra {
    public static String menu() {
        Scanner entrada = new Scanner(System.in);
        HashMap<String, String> loja = new HashMap<>();

        loja.put("Item 1 -","Maça");
        loja.put("Item 2 -","Banana");
        loja.put("Item 3 -", "Melancia");
        loja.put("Item 4 -", "Melao");
        loja.put("Item 5 -", "Uva");
        loja.put("Item 6 -", "Morango");
        loja.put("Item 7 -", "Alho-poró");
        loja.put("Item 8 -", "Brócolis");
        loja.put("Item 9 -", "Coentro");
        loja.put("Item 10 -", "Mostarda");
        loja.put("Item 11 -", "Erva-doce");
        loja.put("Item 12 -", "Espinafre");
        System.out.println(loja);

        System.out.println("Digite o item que deseja comprar: ");
        String item = entrada.nextLine();
        System.out.println("Item adicionado ao carrinho com sucesso!");

        return null;
    }
}
