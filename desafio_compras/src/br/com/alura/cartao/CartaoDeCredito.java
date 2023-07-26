package br.com.alura.cartao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    List<Compra> listaDeCompras;

    public CartaoDeCredito(double limite){
        this.limite=limite;
        this.saldo=limite;
        this.listaDeCompras=new ArrayList<>();
    }
    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    public boolean realiazrCompra(Compra item){
        if(this.saldo>item.getPreco()){
            this.saldo-=item.getPreco();
            System.out.println("Compra realizada");
            this.listaDeCompras.add(item);
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;
    }

    public void comprasRealizadas(){
        Collections.sort(listaDeCompras);
        System.out.println("***********************************\nCOMPRAS REALIZADAS:\n");
        for (Compra item:listaDeCompras){
            System.out.println(item);
        }
        System.out.println("\n***********************************\n\nSaldo do cartão: "+this.getSaldo());
    }

}
