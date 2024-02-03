package objetos;

public class Gato extends Animal {

    private int vidas;

    @Override
    public void comunica() {
        System.out.println("MEOW");
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

}
