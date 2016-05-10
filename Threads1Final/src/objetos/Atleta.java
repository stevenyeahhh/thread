package objetos;

public class Atleta implements Runnable {

    private Testigo testigo;
    private int id;

    public Atleta(Testigo testigo, int id) {
        this.testigo = testigo;
        this.id = id;
    }

    @Override
    public void run() {
        this.testigo.correr(id);
    }

}
