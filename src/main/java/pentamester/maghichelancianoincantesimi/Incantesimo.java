/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pentamester.maghichelancianoincantesimi;

/**
 *
 * @author shwak
 */
public class Incantesimo extends Thread {

    private String mago;
    private String incantesimo;

    public Incantesimo(String mago, String incantesimo) {
        this.mago = mago;
        this.incantesimo = incantesimo;
    }

    public void run() {
        System.out.println(mago + " lancia " + incantesimo + "...");
        try {
            Thread.sleep(1000); // Simula il tempo di lancio dell'incantesimo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(mago + " ha completato " + incantesimo + "!");
    }
}



