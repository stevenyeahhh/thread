package objetos;

public class Carrera {

    public Carrera() {
        Testigo t = new Testigo();
        Atleta atleta1 = new Atleta(t, 1);
        Atleta atleta2 = new Atleta(t, 2);
        Atleta atleta3 = new Atleta(t, 3);
        Atleta atleta4 = new Atleta(t, 4);
        Thread t1 = new Thread(atleta1, "Atleta 1");
        Thread t2 = new Thread(atleta2, "Atleta 2");
        Thread t3 = new Thread(atleta3, "Atleta 3");
        Thread t4 = new Thread(atleta4, "Atleta 4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
