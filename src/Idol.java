public class Idol {
    private int idol; //здоровье
    private int uron; // урон
    private String supperpuper;// суперспооб6ость

    public Idol(int idol, int uron) {
        this.idol = idol;
        this.uron = uron;
    }

    public int getIdol() {
        return idol;
    }

    public int getUron() {
        return uron;
    }

    public String getSupperpuper() {
        return supperpuper;
    }

    public Idol(int idol, int uron, String supperpuper) {
        this.idol = idol;
        this.uron = uron;
        this.supperpuper = supperpuper;
    }
}