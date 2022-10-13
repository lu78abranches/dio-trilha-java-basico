public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligada() {
        ligada = false;
    }

    public int mudarCanal(int novoCanal) {
        return canal = novoCanal;
    }

    public void mudarCanalAcima() {
        canal++;
    }

    public void mudarCanalAbaixo() {
        canal--;
    }
}
