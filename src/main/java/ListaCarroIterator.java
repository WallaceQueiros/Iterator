import java.util.List;

public class ListaCarroIterator implements CarroIterator {
    private List<Carro> carros;
    private int posicao;

    public ListaCarroIterator(List<Carro> carros) {
        this.carros = carros;
        this.posicao = 0;
    }

    @Override
    public boolean hasNext() {
        return posicao < carros.size();
    }

    @Override
    public Carro next() {
        if (hasNext()) {
            Carro carro = carros.get(posicao);
            posicao++;
            return carro;
        }
        return null;
    }
}
