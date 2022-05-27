package ProdutorConsumidor;

import java.util.concurrent.BlockingQueue;

/**
 * A classe Comprador é utilizada para comprar a soja armazenda na fila pelo
 * agricultor
 *
 *
 * @author Guilherme
 */
public class Comprador extends Thread {

    private BlockingQueue<Integer> soja;

    /**
     *
     * @param soja que será comprada pelo consumidor
     */
    public Comprador(BlockingQueue<Integer> soja) {
        this.soja = soja;
    }

    public void run() {
        try {

            for (int i = 1; i < 31; i++) {
                soja.take();
                System.out.println("Vendendo soja dia: " + i + "\n");
                Thread.sleep((int) Math.random() * 500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
