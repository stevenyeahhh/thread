package objetos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Testigo {

    private int orden = 1;

    public synchronized void correr(int idAtleta) {
        while (true) {
            if (this.orden == idAtleta) {
                if (idAtleta == 1) {
                    SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MMMM/dd hh:mm:ss");
                    System.out.println("Inicia : " + (fmt.format(new Date(System.currentTimeMillis()))));
                }
                try {
                    System.out.println("Empieza el atleta : " + idAtleta);
                    Thread.sleep(((int) (Math.random() * 3) + 9) * 1000);
                    System.out.println("Llega el atleta : " + idAtleta);
                    if (idAtleta == 4) {
                        SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MMMM/dd hh:mm:ss");
                        System.out.println("Finaliza : " + (fmt.format(new Date(System.currentTimeMillis()))));
                    }
                    this.orden++;
                    if (this.orden > 4) {
                        this.orden = 1;
                    }
                    notifyAll();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Testigo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Testigo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            notifyAll();
        }

    }

}
