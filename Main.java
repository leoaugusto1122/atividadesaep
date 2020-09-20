import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cria um cliente.
        Cliente cliente = new Cliente("José");

        // Cria três carros.
        Carro carro1 = new Carro("Fiat", "2015");
        Carro carro2 = new Carro("Hyundai", "2017");
        Carro carro3 = new Carro("Jeep", "2019");

        // Pega a lista de carros que pertence a classe Locacao que pertence a classe
        // Cliente.
        List<Carro> carros = cliente.getLocacao().getCarros();

        // Adiciona os três carros a lista.
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);

        System.out.printf("A locação do cliente %s possui %d carros.\n", cliente.getNome(), carros.size());

        // Faz um loop na lista de carros, mostrando cada carro com sua marca e ano.
        for (Carro carro : carros) {
            System.out.printf("Carro(marca=%s, ano=%s)\n", carro.getMarca(), carro.getAno());
        }
    }
}