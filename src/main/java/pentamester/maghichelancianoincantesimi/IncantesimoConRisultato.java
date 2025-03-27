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
    private int tentativi;
    private int successi = 0;
    private int fallimenti = 0;

    public IncantesimoConRisultato(String mago, String incantesimo, int tentativi) {
        this.mago = mago;
        this.incantesimo = incantesimo;
        this.tentativi = tentativi;
    }

    public void run() {
        for (int i = 0; i < tentativi; i++) {
            System.out.println(mago + " lancia " + incantesimo + " (tentativo " + (i + 1) + ")...");
            try {
                Thread.sleep(1000); //simula il tempo di lancio
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (Math.random() > 0.5) { //50/50
                successi++;
                System.out.println(mago + " ha successo con " + incantesimo + "!");
            } else {
                fallimenti++;
                System.out.println(mago + " ha fallito con " + incantesimo + "!");
            }
        }
    }
    public int getSuccessi() {
        return successi;
    }

    public int getFallimenti() {
        return fallimenti;
    }
}

