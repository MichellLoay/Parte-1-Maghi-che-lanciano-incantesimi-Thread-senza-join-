/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pentamester.maghichelancianoincantesimi;

/**
 *
 * @author shwak
 */
public class ScuolaDiMagiaConRisultati {

    public static void main(String[] args) {
        int tentativi = 5; // Numero di incantesimi per ogni mago

        IncantesimoConRisultato t1 = new IncantesimoConRisultato("Harry", "Expelliarmus", tentativi);
        IncantesimoConRisultato t2 = new IncantesimoConRisultato("Hermione", "Alohomora", tentativi);
        IncantesimoConRisultato t3 = new IncantesimoConRisultato("Ron", "Lumos", tentativi);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nRisultati finali:");
        System.out.println("Harry - Successi: " + t1.getSuccessi() + ", Fallimenti: " + t1.getFallimenti());
        System.out.println("Hermione - Successi: " + t2.getSuccessi() + ", Fallimenti: " + t2.getFallimenti());
        System.out.println("Ron - Successi: " + t3.getSuccessi() + ", Fallimenti: " + t3.getFallimenti());
    }
}
