/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pentamester.maghichelancianoincantesimi;

/**
 *
 * @author shwak
 */
public class IncantesimoConRisultato extends Thread {

    private String mago;
    private String incantesimo;
    private boolean successo;

    public IncantesimoConRisultato(String mago, String incantesimo) {
        this.mago = mago;
        this.incantesimo = incantesimo;
    }

    public void run() {
        System.out.println(mago + " lancia " + incantesimo + "...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        successo = Math.random() > 0.2; // 80% di successo 
        System.out.println(mago + " ha " + (successo ? "successo" : "fallito") + " con " + incantesimo + "!");
    }

    public boolean getSuccesso() {
        return successo;
    }
}
