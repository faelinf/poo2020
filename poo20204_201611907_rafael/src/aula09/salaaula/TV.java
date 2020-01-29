package aula09.salaaula;


public abstract class TV {
    protected int tamanho;
    protected int canal;
    protected int volume;


    public TV(int tamanho, int canal, int volume) {

        this.tamanho = tamanho;
        canal=0;
        volume=0;
    }


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
