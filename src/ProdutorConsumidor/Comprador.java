/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProdutorConsumidor;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Guilherme
 */
public class Comprador extends Thread {
    private BlockingQueue<Integer> soja;

    public Comprador(BlockingQueue<Integer> soja) {
        this.soja = soja;
    }

    public void run() {
        try {
            for (int i = 1; i < 31; i++) {
                //System.out.println("Vendendo soja, dia " +i);
                soja.take();
                //System.out.println("Soja colhido: " + this.soja.peek() + "\n");
                System.out.println("Vendendo soja dia: " + i + "\n");
                Thread.sleep((int) Math.random() * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
