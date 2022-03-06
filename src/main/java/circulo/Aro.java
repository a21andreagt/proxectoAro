package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Andrea Gutierrez Torres
 */
public class Aro {

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public static final double MINIMO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    public Aro() {
    }

    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        establecerRadio(valorRadio);
    }

    public void establecerX(int valorX) {
        coordenadaX=valorX;
    }

    public int obterX() {
        return coordenadaX;
    }

    public void establecerY(int valorY) {
        coordenadaY=valorY;
    }

    public int obterY() {
        return coordenadaY;
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < LIMITERADIO ? LIMITERADIO : valorRadio);
    }
    static final double LIMITERADIO = 0.0;

    public double obterRadio() {
        return radio;
    }

    public double obterDiametro() {
        return radio * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    public void trasladarCentro(int trasladarX, int trasladarY){
        coordenadaX=coordenadaX + trasladarX;
        coordenadaY=coordenadaY + trasladarY;
    }
}