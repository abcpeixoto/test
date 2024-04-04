package letsburn;

import java.time.LocalDateTime;

public class Requisicao {

    private final Cliente cliente;

    private Mesa mesa;

    private final Integer quantidadePessoas;

    public String getId() {
        return "1";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Integer getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public Requisicao(Cliente cliente, Mesa mesa, Integer quantidadePessoas) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.quantidadePessoas = quantidadePessoas;
    }

    public Requisicao(Cliente cliente, Integer quantidadePessoas) {
        this.cliente = cliente;
        this.quantidadePessoas = quantidadePessoas;
    }

    public void encerrar() {
        this.saida = LocalDateTime.now();
        this.mesa.desocupar();
    }
}
