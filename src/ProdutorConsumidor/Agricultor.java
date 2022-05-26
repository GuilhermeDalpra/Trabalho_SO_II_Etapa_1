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
public class Agricultor extends Thread {
    private BlockingQueue<Integer> soja;

    public Agricultor(BlockingQueue<Integer> soja) {
        this.soja = soja;
    }

    public void run() {
        try {
            for (int i = 1; i < 31; i++) {
                soja.put(6000);
                System.out.println("Colhendo soja, dia " + i);
                Thread.sleep((int) Math.random() * 1000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
