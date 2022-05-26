/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProdutorConsumidor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Guilherme
 */
public class Main {

    public static void main(String[] args) {
        BlockingQueue<Integer> soja = new ArrayBlockingQueue<>(40);

        Agricultor produtor = new Agricultor(soja);
        Comprador consumidor = new Comprador(soja);
        
        produtor.start();
        consumidor.start();
    }
}
