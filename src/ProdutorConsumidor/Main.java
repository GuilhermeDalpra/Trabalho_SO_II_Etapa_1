package ProdutorConsumidor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Guilherme
 */
public class Main {

    public static void main(String[] args) {
        BlockingQueue<Integer> soja = new ArrayBlockingQueue<>(32);

        Agricultor produtor = new Agricultor(soja);
        Comprador consumidor = new Comprador(soja);
        
        produtor.start();
        consumidor.start();
    }
}
