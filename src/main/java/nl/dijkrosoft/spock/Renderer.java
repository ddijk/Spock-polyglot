package nl.dijkrosoft.spock;

public class Renderer {

    private Palette palette;

    public Renderer(Palette palette) {
        this.palette = palette;
    }

    public void drawline() {}

    public String getPrimaryColor() {
        return palette.getPrimaryColor();
    }
}
