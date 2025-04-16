package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        IsoContest isoContest = new IsoContest();
        List<String> lines = new ArrayList<>();
        List<String> ressource = new ArrayList<>();
        String[] capacity;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("FIN")) {  // Tape FIN pour terminer l'entrée
                break;
            }
            lines.add(input);
        }
        sc.close();
        capacity = lines.get(0).split(" ");

        for (int i = 1; i < lines.size(); i++) {
            ressource.add(lines.get(i));
        }

        List<String> result = isoContest.calculRessource(Integer.parseInt(capacity[0]), Double.parseDouble(capacity[1]), ressource);

        if (result.isEmpty()) {
            System.out.println("Aucune ressource sélectionnée.");
        } else {
            for (String res : result) {
                System.out.println("mes resulta : " + res);
            }
        }

    }
}