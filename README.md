# Root du Rhum

## Description

Partir pour un tour du monde en solitaire à la voile est une aventure exaltante, mais la gestion des ressources est cruciale pour assurer votre survie et votre performance. L’un des aspects les plus importants est l’optimisation des vivres que vous emmenez à bord : vous devez maximiser l’apport énergétique tout en respectant la capacité de transport de votre bateau.

Vous avez le choix entre plusieurs rations, donc chacune a un certain apport énergétique et un certain poids. Vous voulez prendre les rations totalisant un grand apport énergétique : quelle est la liste de rations que vous pouvez prendre sans dépasser la capacité du bateau ?

Pour gagner du temps, vous décidez d'aller au plus simple : vous rangez toutes les rations par apport énergétique décroissant, et vous les chargez dans cet ordre dans votre bateau. Pour chaque ration qui entraînerait une surcharge du navire, ignorez-la et passez à la suivante.

## Entrée

L'entrée est composée de :

- **Ligne 1** : Deux nombres séparés par un espace :
  - Un entier **N** représentant le nombre de rations disponibles.
  - Un flottant **C** représentant la capacité maximale de stockage du bateau.

- **N lignes suivantes** :
  - Chaque ligne contient deux nombres flottants **E** et **P** séparés par un espace :
    - **E** représente la valeur énergétique de la ration.
    - **P** représente le poids de la ration.

## Sortie

La sortie consiste en une liste des indices (indexés à 0) des rations sélectionnées, un par ligne, comprenant les rations les plus énergétiques sans dépasser la capacité **C**.

## Contraintes

- **N ≤ 10^4**
- **C ≤ 10^6**
- **0 ≤ E, P ≤ 10^6**
- Les nombres flottants sont donnés avec 1 à 6 chiffres après la virgule.
- Toutes les valeurs énergétiques sont uniques.

## Exemple

### Entrée

