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
        IncantesimoConRisultato t1 = new IncantesimoConRisultato("Harry", "Expelliarmus");
        IncantesimoConRisultato t2 = new IncantesimoConRisultato("Hermione", "Alohomora");
        IncantesimoConRisultato t3 = new IncantesimoConRisultato("Ron", "Lumos");
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

        System.out.println("Risultati degli incantesimi:");
        System.out.println("Harry successo: " + t1.getSuccesso());
        System.out.println("Hermione successo: " + t2.getSuccesso());
        System.out.println("Ron successo: " + t3.getSuccesso());
    }
}
