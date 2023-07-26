import br.com.alura.cartao.Compra;
import br.com.alura.cartao.CartaoDeCredito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        CartaoDeCredito cartao=new CartaoDeCredito(input.nextDouble());
        int opcao=1;

        while(opcao!=0) {
            input.nextLine();
            System.out.println("Digite a descrição da compra: ");
            String descricao=input.nextLine();
            System.out.println("Digite o preco da compra: ");
            double preco=input.nextDouble();
            Compra itemCompra=new Compra(descricao,preco);

            if(cartao.realiazrCompra(itemCompra)){
                System.out.println("Digite 0 para sair ou 1 para continuar ");
                opcao=input.nextInt();
            }else if(!cartao.realiazrCompra(itemCompra)){
                opcao=0;
            }
        }
        cartao.comprasRealizadas();
    }
}