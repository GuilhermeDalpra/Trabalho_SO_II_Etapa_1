package ProdutorConsumidor;

import java.util.concurrent.BlockingQueue;

/**
 * Agicultor é a classe responsável por adicionar a soja colhida de cada dia em
 * uma fila para ser vendida
 *
 * @author Guilherme
 */
public class Agricultor extends Thread {

    private BlockingQueue<Integer> soja;

    /**
     * 
     * @param soja será armazenda e vendida
     */
    public Agricultor(BlockingQueue<Integer> soja) {
        this.soja = soja;
    }

    public void run() {
        try {
            for (int i = 1; i < 31; i++) {
                soja.put(6000);
                System.out.println("Colhendo soja, dia " + i);
                Thread.sleep((int) Math.random() * 500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
