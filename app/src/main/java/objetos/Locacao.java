package objetos;

import java.time.LocalDate;

public class Locacao {
    public int id;
    public int id_carro;
    public int id_seguradora;
    public int id_cliente;
    public LocalDate dataLocacao;
    public LocalDate dataDevolucao;
    public LocalDate dataDevolvida;
    public Double valor;
    public Double valorDesconto;
    public Double valorTotal;
}
