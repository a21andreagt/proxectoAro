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
     * @param valorRadio
     */
    public void setRadio(double valorRadio) {
        radio= (valorRadio<LIMITERADIO ? LIMITERADIO : valorRadio);
    }

    /**
     * Atribuye minimo impidiendo el uso de negativos.
     */
    public static final double MINIMO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     *Inicializa Aro()
     */
    public Aro() {
    }

    /**
     * Atribuye a Aro 
     * @param valorX de tipo int
     * @param valorY de tipo int
     * @param valorRadio de tipo double
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }





    static final double LIMITERADIO = 0.0;

    /**
     * Calcula el diametro de Aro
     * @return radio*2
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     * Calcula la circunferencia de Aro por medio de la funcion Math.PI
     * @return
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     *Calcula la superficie de ARO con  la funcion MATH.PI
     * @return
     */
    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     * Calcula trasladarCentro añadiendo a las coordenadas iniciales
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        coordenadaX=coordenadaX + trasladarX;
        coordenadaY=coordenadaY + trasladarY;
    }
}