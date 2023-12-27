package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gift {
    private List<Sweet> sweets;

    public Gift() {
        sweets = new ArrayList<>();
    }

    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    public double calculateTotalWeight() {
        return sweets.stream().mapToDouble(Sweet::getWeight).sum();
    }

    public void sortByWeight() {
        Collections.sort(sweets, (o1, o2) -> Double.compare(o1.getWeight(), o2.getWeight()));
    }

    public List<Sweet> findCandyWithChocolateContent(double min, double max) {
        List<Sweet> found = new ArrayList<>();
        for (Sweet s : sweets) {
            if (s.getChocolateContent() >= min && s.getChocolateContent() <= max) {
                found.add(s);
            }
        }
        return found;
    }
}
