package aula06.salaaula.endereco;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alunoinf_2 on 23/01/2020.
 */
public class Bairro {
    private String regiao;
    private String nome;
    private Municipio municipio;
    private List<Endereco>enderecos;

    public Bairro(String regiao, String nome, Municipio municipio) {
        this.regiao = regiao;
        this.nome = nome;
        this.municipio = municipio;
        this.enderecos = new ArrayList<Endereco>();
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public void adicionaEndereco(Endereco e){
        this.enderecos.add(e);
    }

    public Endereco consultapeloEndereco(String e) {
        Endereco novoEndereco = null;
        for (Endereco e : this.enderecos)
            if (this.enderecos.contains(e)) {
                novoEndereco = e;
            }
        return novoEndereco;
    }

    public void removeEndereco(Endereco e){
        this.enderecos.remove(e);
    }

}


