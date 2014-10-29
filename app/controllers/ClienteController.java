package controllers;

import play.libs.ws.WSResponse;

import play.libs.ws.WSRequestHolder;
import play.mvc.Controller;
import play.mvc.Result;
import static play.libs.F.Promise;
import play.libs.ws.WS;
/**
 * Created by dirceu on 10/28/14.
 */
public class ClienteController extends Controller {
    public static Promise<Result> getClientes(){
        WSRequestHolder holder = WS.url("http://api.geonames.org/citiesJSON");
        holder.setQueryParameter("north","-50");
        holder.setQueryParameter("south","10");
        holder.setQueryParameter("east","-20");
        holder.setQueryParameter("west","55");
        holder.setQueryParameter("lang","pt");
        holder.setQueryParameter("username","demo");
        Promise<WSResponse> promise = holder.get();
        return promise.map(f -> ok(f.asJson()));
    }
}
