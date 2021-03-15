package Lemes.Pedro;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Título {

    private double valor;
    private String nome;
    private double jurosPorDia;
    private LocalDate dataPagamento;
    private String Titulo;

    public Título(double valor, String nome, double jurosPorDia, LocalDate dataPagamento) {
        this.valor = valor;
        this.nome = nome;
        this.jurosPorDia = jurosPorDia;
        this.dataPagamento = dataPagamento;
    }

    public double geatValorPagamento(){
        if(!contaAtrasada()){
            return this.valor;
        } else{
            return calcularValorComJuros();
        }
    }

    private double calcularValorComJuros() {
        return this.valor + this.valor * this.jurosPorDia * dataPagamento.until(LocalDate.now(), DAYS);
    }

    private boolean contaAtrasada() {
        return LocalDate.now().isAfter(dataPagamento);
    }
}

