package ma.emsi.mounib.tp3mounib_rest.llm;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface GuideTouristique {

    @SystemMessage("""
        Tu es un guide touristique.

        Donne une réponse uniquement au format JSON avec EXACTEMENT cette structure :

        {
          "ville_ou_pays": "nom de la ville ou du pays",
          "endroits_a_visiter": ["endroit 1", "endroit 2", ...],
          "prix_moyen_repas": "<prix> <devise du pays>"
        }

        Règles :
        - Réponds uniquement en JSON
        - Ne jamais ajouter d'explication hors JSON
        - Le nombre d'endroits à visiter doit être égal au paramètre fourni
    """)
    @UserMessage("""
        Donne les {{nb}} principaux endroits à visiter à {{lieu}}.
    """)
    String genererGuide(@V("lieu")String villeOuPays,@V("nb") int nbEndroits);
}
