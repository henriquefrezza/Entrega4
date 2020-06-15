import java.util.Arrays;
import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        
        var lineColors = Arrays.asList("verde", "vermelho", "azul", "roxo");
        var fillColors = Arrays.asList("azul", "prata", "preto", "amarelo");

        Figure figure = null;

        var r = new Random();
        var index = r.nextInt(3);
        
        switch (index) {
            case 0 :
                figure = new Quadrado();
                break;
            case 1 :
                figure = new Retangulo();
                break;
            case 2 :
                figure = new Circulo();
                break;        
        }
        
        index = r.nextInt(3);

        switch (index) {
            case 1:
                var r2 = new Random();
                var index2 = r2.nextInt(2);
                    switch (index2) {
                        case 0:
                            figure = new CorDaLinhaDecorator(figure, lineColors);
                            break;
                        case 1:
                            figure = new CorDePreenchimentoDecorator(figure, fillColors);
                    }
                break;
            case 2:
                figure = new CorDaLinhaDecorator(figure, lineColors);
                figure = new CorDePreenchimentoDecorator(figure, fillColors);
        }
        System.out.println(figure.draw());
    }
}