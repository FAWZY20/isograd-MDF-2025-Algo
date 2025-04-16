package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsoContest {

    static class Ration {
        private double energy;
        private double weight;
        private int index;

        Ration(double energy, double weight, int index) {
            this.energy = energy;
            this.weight = weight;
            this.index = index;
        }

        public double getEnergy() {
            return energy;
        }

        public void setEnergy(double energy) {
            this.energy = energy;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
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

                Collections.sort(rations, (r1, r2) -> Double.compare(r2.getEnergy(), r1.getEnergy()));

                for (Ration r : rations) {
                    if (r.getEnergy() >= 0 && r.getWeight() <= capacity) {
                        lastEnergy = r.getEnergy();

                        if (totalWeight + r.getWeight() <= capacity) {
                            totalWeight += r.getWeight();
                            resulta.add(String.valueOf(r.getIndex()));
                        }
                    } else {
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
