package school.sptech;

public class Desenvolvedor {
    protected String nome;
    protected Integer qtdHoras;
    protected Double valorHora;

    public Double calcularSalario() {
        return qtdHoras * valorHora;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
