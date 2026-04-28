package solid.lsp.solution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SquareSolution implements IShape {
    private int sideLength;


    @Override
    public int getArea() {
        return sideLength * sideLength;
    }
}
