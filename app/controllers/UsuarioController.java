package controllers;

import dao.UsuarioDAO;
import modelo.Usuario;

import java.util.List;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import static dao.UsuarioDAO.save;

/**
 * Created by dirceu on 10/23/14.
 */
public class UsuarioController extends Controller {
    private static UsuarioDAO usuarioDao = new UsuarioDAO();
    
    public static Result list()
    {
        List<Usuario> users = UsuarioDAO.list();
        return ok(Json.toJson(users));
    }

    public static Result get(Long id)
    {
        Usuario user = UsuarioDAO.get(id);
        return user == null ? notFound() : ok(Json.toJson(user));
    }



    public static Result update(Long id)
    {
        Usuario user = Json.fromJson(request().body().asJson(), Usuario.class);
        Usuario updated = UsuarioDAO.update(id, user);
        return ok(Json.toJson(updated));
    }
    public static Result create()
    {
        Usuario newUsuario = Json.fromJson(request().body().asJson(), Usuario.class);
        Usuario inserted = save(newUsuario);
        return created(Json.toJson(inserted));
    }
    public static Result delete(Long id)
    {
        UsuarioDAO.delete(id);
        return noContent();
    }
}
