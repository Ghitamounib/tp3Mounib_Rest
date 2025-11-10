package ma.emsi.mounib.tp3mounib_rest.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/guide")
public class GuideTouristiqueResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("lieu/{ville_ou_pays}")
    public String[] guide(@PathParam("ville_ou_pays") String lieu) {
        return new String[]{lieu};
    }
}
