package solid.lsp.solution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RectangleSolution implements IShape {
    private int width;
    private int height;

    @Override
    public int getArea() {
        return width * height;
    }
}
