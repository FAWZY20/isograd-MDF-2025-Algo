package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsoContest {

    static class Ration {
        double energy;
        double weight;
        int index;  // indice d'origine

        Ration(double energy, double weight, int index) {
            this.energy = energy;
            this.weight = weight;
            this.index = index;
        }
    }

    public List<String> calculRessource(Integer nbRation, Double capacity, List<String> ressource) {
        Double totalWeight = 0.0;
        Double lastEnergy = null;
        List<String> resulta = new ArrayList<>();

        try {
            if (nbRation <= 10000 && capacity <= 1000000) {
                List<Ration> rations = new ArrayList<>();
                for (int i = 0; i < ressource.size(); i++) {
                    String[] rsr = ressource.get(i).split(" ");
                    double energy = Double.parseDouble(rsr[0].trim());
                    double weight = Double.parseDouble(rsr[1].trim());
                    rations.add(new Ration(energy, weight, i));
                }

                Collections.sort(rations, (r1, r2) -> Double.compare(r2.energy, r1.energy));

                for (Ration r : rations) {
                    // Vérification de la validité des valeurs
                    if (r.energy >= 0 && r.weight <= capacity) {
                        lastEnergy = r.energy;

                        // Vérification que l'ajout du poids n'excède pas la capacité
                        if (totalWeight + r.weight <= capacity) {
                            totalWeight += r.weight;
                            resulta.add(String.valueOf(r.index));
                        }
                    } else {
                        // Si une erreur se produit, on renvoie une liste vide (ou une exception si vous préférez)
                        return new ArrayList<>();
                    }
                }
            }

            return resulta;  // Retourne les ressources sélectionnées

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erreur lors du calcul des ressources: " + e);
            return new ArrayList<>();  // En cas d'exception, retour d'une liste vide
        }
    }
}
