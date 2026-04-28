package solid.lsp.problem;

import lombok.Setter;

public class Rectangle {
    @Setter
    protected int width;
    @Setter
    protected int height;

    public int getArea() {
        return width * height;
    }
}
