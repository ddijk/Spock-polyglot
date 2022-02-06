package nl.dijkrosoft.spock;

import java.util.stream.Stream;

public class Polygon {
    private final int numberOfSides;
    private Renderer renderer;

    public Polygon(int numberOfSides, Renderer renderer) {
        this.renderer = renderer;
        if (numberOfSides <= 2) {
            throw new TooFewSidesException("You can't have fewer than 3 sides for a polygon", numberOfSides);
        }
        this.numberOfSides = numberOfSides;
    }

    public void draw() {

        Stream.of(1,2,3,4).forEach(
                (i)->   renderer.drawline()
        );
    }
}