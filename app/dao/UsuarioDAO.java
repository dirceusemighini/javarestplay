package dao;

import modelo.Endereco;
import modelo.Usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dirceu on 10/23/14.
 */
public class UsuarioDAO {

    private static Map<Long,Usuario> map = new HashMap<Long,Usuario>();

    static{
       map.put(1l,new Usuario(1l,"Dirceu",new Endereco(1l,"Marques de São Vicente","3001","Sao Paulo","SP","Agua Branca","05036-040")));
        map.put(2l,new Usuario(2l,"Unip Paraiso",new Endereco(1l,"Rua Vergueiro","1211","Sao Paulo","SP","Paraiso","01504-000")));
    }
    public static List<Usuario> getUsuarios() {
        return  new ArrayList<Usuario>(map.values());
    }


    public static Usuario getUsuario(Long id) {
        return  map.get(id);
    }

    public static Usuario save(Usuario novoUsuario) {
        Usuario resultado = new Usuario((long)map.size()+1,novoUsuario);
        map.put((long)map.size()+1, resultado );
        return resultado;
    }

    public static Usuario updateUsuario(Long id, Usuario user) {
        deleteUsuario(id);
        map.put(id,user);
        return user;
    }

    public static void deleteUsuario(Long id) {
        map.remove(id);
    }
}
