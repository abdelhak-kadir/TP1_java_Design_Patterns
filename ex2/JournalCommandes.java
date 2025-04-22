package ex2;

import java.util.ArrayList;
import java.util.List;

public class JournalCommandes {
    private static JournalCommandes instance;
    private List<String> commandes = new ArrayList<>();

    private JournalCommandes() {}

    public static JournalCommandes getInstance() {
        if (instance == null) {
            instance = new JournalCommandes();
        }
        return instance;
    }

    public void ajouterCommande(String details) {
        commandes.add(details);
        System.out.println("Order added: " + details);
    }
}
