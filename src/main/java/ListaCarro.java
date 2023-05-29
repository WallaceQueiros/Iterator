import java.util.ArrayList;
import java.util.List;

public class ListaCarro {
    private List<Carro> carros;

    public ListaCarro() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public CarroIterator criarIterator() {
        return new ListaCarroIterator(carros);
    }
}
