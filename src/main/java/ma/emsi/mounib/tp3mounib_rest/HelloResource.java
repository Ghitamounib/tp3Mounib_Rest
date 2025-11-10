package ma.emsi.mounib.tp3mounib_rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    @Path("personnes/{nom}")
    public Response hello(@PathParam("nom") String nom) {
        return Response.ok("Hello, " + nom).build();
        // return "Hello," + nom;
    }
}