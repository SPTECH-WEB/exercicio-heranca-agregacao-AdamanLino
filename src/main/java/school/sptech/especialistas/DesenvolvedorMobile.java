package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorMobile extends Desenvolvedor {
    private String plataforma;
    private String linguagem;
    private Integer horasPrototipacao;

    public Double calcularSalario() {
        return (qtdHoras * valorHora) + horasPrototipacao * 200;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public Integer getHorasPrototipacao() {
        return horasPrototipacao;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public void setHorasPrototipacao(Integer horasPrototipacao) {
        this.horasPrototipacao = horasPrototipacao;
    }
}
