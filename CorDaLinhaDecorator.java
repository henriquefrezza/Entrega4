import java.util.List;
import java.util.Random;

public class CorDaLinhaDecorator extends Figure {
    
    private Figure figure;
    private List<String> colors;

    public CorDaLinhaDecorator(Figure f, List<String> c){
        figure = f;
        colors = c;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    @Override
    public String draw() {
        Random r = new Random();
        var index = r.nextInt(colors.size());
        return figure.draw() + "\nCor da linha: " + colors.get(index);
    }
}