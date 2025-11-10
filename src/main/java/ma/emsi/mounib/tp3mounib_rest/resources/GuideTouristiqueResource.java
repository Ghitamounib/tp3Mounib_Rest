package ma.emsi.mounib.tp3mounib_rest.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import ma.emsi.mounib.tp3mounib_rest.llm.LlmClient;

@Path("/guide")
public class GuideTouristiqueResource {
    @Inject
    LlmClient llmClient;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("lieu/{ville_ou_pays}")
    public String villeOuPays(@PathParam("ville_ou_pays") String ville_ou_pays) {
        return llmClient.getGuide().genererGuide(ville_ou_pays);
    }
}
