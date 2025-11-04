package school.sptech;

import school.sptech.especialistas.DesenvolvedorMobile;
import school.sptech.especialistas.DesenvolvedorWeb;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores = new ArrayList<>();

    public void contratar(Desenvolvedor desenvolvedor) {
        if (vagas > desenvolvedores.size()) {
            desenvolvedores.add(desenvolvedor);
        }
    }

    public void contratarFullstack(DesenvolvedorWeb desenvolvedor) {
        if (vagas > 0 && desenvolvedor.isFullstack()) {
            desenvolvedores.add(desenvolvedor);
        }
    }

    public Double getTotalSalarios() {
        Double totalSalario = 0.0;

        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            totalSalario += desenvolvedor.calcularSalario();
        }
        return totalSalario;
    }

    public Integer qtdDesenvolvedoresMobile() {
        Integer soma = 0;
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if (desenvolvedor instanceof DesenvolvedorMobile) {
                soma++;
            }
        }

        return soma;
    }

    public List<Desenvolvedor> buscarPorSalarioMaiorIgualQue(Double salario) {
        ArrayList<Desenvolvedor> maiorSalario = new ArrayList<>();
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if (desenvolvedor.calcularSalario() >= salario) {
                maiorSalario.add(desenvolvedor);
            }
        }

        return maiorSalario;
    }

    public Desenvolvedor buscarMenorSalario() {
        if (!desenvolvedores.isEmpty()) {
            Desenvolvedor desenvolvedorMenorSalario = desenvolvedores.get(0);

            Double salarioAtual = desenvolvedorMenorSalario.calcularSalario();

            for (Desenvolvedor desenvolvedor : desenvolvedores) {
                if (desenvolvedor.calcularSalario() < salarioAtual) {
                    salarioAtual = desenvolvedor.calcularSalario();
                    desenvolvedorMenorSalario = desenvolvedor;
                }
            }

            return desenvolvedorMenorSalario;
        }

        return null;
    }

    public List<Desenvolvedor> buscarPorTecnologia(String tecnologia) {
        List<Desenvolvedor> buscaTecnologia = new ArrayList<>();
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if (desenvolvedor instanceof DesenvolvedorWeb) {
                DesenvolvedorWeb devWeb = (DesenvolvedorWeb) desenvolvedor;
                if (tecnologia.equals(devWeb.getBackend()) || tecnologia.equals(devWeb.getFrontend()) || tecnologia.equals(devWeb.getSgbd())) {
                    buscaTecnologia.add(desenvolvedor);
                }
            } else if (desenvolvedor instanceof DesenvolvedorMobile) {
                DesenvolvedorMobile devMobile = (DesenvolvedorMobile) desenvolvedor;
                if (tecnologia.equals(devMobile.getPlataforma())) {
                    buscaTecnologia.add(desenvolvedor);
                }
            }
        }

        return buscaTecnologia;
    }

    public Double getTotalSalariosPorTecnologia(String tecnologia) {
        Double totalSalario = 0.0;
        for (Desenvolvedor desenvolvedor : buscarPorTecnologia(tecnologia)) {
            totalSalario += desenvolvedor.calcularSalario();
        }

        return totalSalario;
    }

    public String getNome() {
        return nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public List<Desenvolvedor> getDesenvolvedores() {
        return desenvolvedores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public void setDesenvolvedores(List<Desenvolvedor> desenvolvedores) {
        this.desenvolvedores = desenvolvedores;
    }
}