package controllers;

import dao.UsuarioDAO;
import modelo.Usuario;
import play.libs.Json;

import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static dao.UsuarioDAO.save;

/**
 * Created by dirceu on 10/23/14.
 */
public class UsuarioController extends Controller {
    private static UsuarioDAO usuarioDao = new UsuarioDAO();
    
    public static Result getUsuarios()
    {
        List<Usuario> users = UsuarioDAO.getUsuarios();
        return ok(Json.toJson(users));
    }

    public static Result getUsuario(Long id)
    {
        Usuario user = UsuarioDAO.getUsuario(id);
        return user == null ? notFound() : ok(Json.toJson(user));
    }

    public static Result createUsuario()
    {
        Usuario newUsuario = Json.fromJson(request().body().asJson(), Usuario.class);
        Usuario inserted = save(newUsuario);
        return created(Json.toJson(inserted));
    }

    public static Result updateUsuario(Long id)
    {
        Usuario user = Json.fromJson(request().body().asJson(), Usuario.class);
        Usuario updated = UsuarioDAO.updateUsuario(id, user);
        return ok(Json.toJson(updated));
    }

    public static Result deleteUsuario(Long id)
    {
        UsuarioDAO.deleteUsuario(id);
        return noContent();
    }
}
