package modelo;

/**
 * Created by dirceu on 10/23/14.
 */
public class Usuario {
    private Long id;
    private String nome;
    private Endereco endereco;

    public Usuario(Long id, Usuario usuario) {
        this.id = id;
        this.endereco = usuario.endereco;
        this.nome = usuario.nome;

    }
    public Usuario(Long id, String nome, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;

        Usuario usuario = (Usuario) o;

        if (endereco != null ? !endereco.equals(usuario.endereco) : usuario.endereco != null) return false;
        if (id != null ? !id.equals(usuario.id) : usuario.id != null) return false;
        if (nome != null ? !nome.equals(usuario.nome) : usuario.nome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        return result;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void save(Usuario usuario) {
    }
}
