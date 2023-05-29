import org.junit.Test;

public class IteratorCarroTest {
    @Test
    public void testIteratorCarro() {

        ListaCarro listaCarro = new ListaCarro();
        listaCarro.adicionarCarro(new Carro("Toyota", "Corolla"));
        listaCarro.adicionarCarro(new Carro("Honda", "Civic"));
        listaCarro.adicionarCarro(new Carro("Ford", "Mustang"));

        CarroIterator iterator = listaCarro.criarIterator();
        
        while (iterator.hasNext()) {
            Carro carro = iterator.next();
            System.out.println("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo());
        }
    }
}
