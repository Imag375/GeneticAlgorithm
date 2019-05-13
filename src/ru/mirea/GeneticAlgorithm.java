package ru.mirea;

import java.util.LinkedList;

public class GeneticAlgorithm {

    LinkedList<Chromosome> population = new LinkedList<Chromosome>();

    GeneticAlgorithm(int num) {
        for(int i = 0; i < num; i++) {
            population.add(new Chromosome());
        }
    }

    public void runGeneticAlgorithm() {

    }

    public void showPopulation() {
        System.out.println("\n_№_|__g1__|__g2__|__g3__|__f(x)__|");
        for(Chromosome x : population) {
            System.out.format(" %2d |%5.2f |%5.2f |%5.2f |%7.3f |\n", population.indexOf(x), x.x, x.y, x.z, x.getF());
        }
    }
}
