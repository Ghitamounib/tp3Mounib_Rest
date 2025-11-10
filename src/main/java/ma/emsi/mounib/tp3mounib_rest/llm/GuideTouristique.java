package ma.emsi.mounib.tp3mounib_rest.llm;

import dev.langchain4j.service.SystemMessage;

public interface GuideTouristique {

    @SystemMessage("""
        Tu es un guide touristique.

        Donne une réponse uniquement au format JSON, avec exactement cette structure :

        {
          "ville_ou_pays": "nom de la ville ou du pays",
          "endroits_a_visiter": ["endroit 1", "endroit 2"],
          "prix_moyen_repas": "<prix> <devise du pays>"
        }

        Règles :
        - Réponds uniquement en JSON
        - Donne les 2 principaux endroits à visiter
        - Indique un prix moyen du repas dans la devise locale
        - NE PAS AJOUTER de texte hors JSON
        - NE PAS expliquer ta réponse
    """)
    String genererGuide(String villeOuPays);
}
