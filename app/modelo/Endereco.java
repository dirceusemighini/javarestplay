package modelo;

/**
 * Created by dirceu on 10/23/14.
 */
public class Endereco {
    private Long id;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String bairro;
    private String cep;

    public Endereco(Long id, String rua, String numero, String cidade, String estado, String bairro, String cep) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco)) return false;

        Endereco endereco = (Endereco) o;

        if (bairro != null ? !bairro.equals(endereco.bairro) : endereco.bairro != null) return false;
        if (cep != null ? !cep.equals(endereco.cep) : endereco.cep != null) return false;
        if (cidade != null ? !cidade.equals(endereco.cidade) : endereco.cidade != null) return false;
        if (estado != null ? !estado.equals(endereco.estado) : endereco.estado != null) return false;
        if (id != null ? !id.equals(endereco.id) : endereco.id != null) return false;
        if (numero != null ? !numero.equals(endereco.numero) : endereco.numero != null) return false;
        if (rua != null ? !rua.equals(endereco.rua) : endereco.rua != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (rua != null ? rua.hashCode() : 0);
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        result = 31 * result + (cidade != null ? cidade.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (bairro != null ? bairro.hashCode() : 0);
        result = 31 * result + (cep != null ? cep.hashCode() : 0);
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
