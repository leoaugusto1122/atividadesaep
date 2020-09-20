import java.util.List;
import java.util.ArrayList;

public class Locacao {
    // Lista de carros.
    private List<Carro> carros;

    // Cria uma locacao com uma lista de carros vazia.
    public Locacao() {
        this.carros = new ArrayList<>();
    }

    // Métodos acessores

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}