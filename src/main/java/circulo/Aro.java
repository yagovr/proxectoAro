package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author A21YagoVR
 */
public class Aro {

    /**
     * @return Devolve a Coordenada X
 
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX Establece a Coordenada X
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return Devolve a Coordenada Y

     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY Establece a Coordenada Y

     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return Devolve o Radio

     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio Establece o Radio, "se o radio e negativo establecese o valor 0"

     */
    public void setRadio(double radio) {
        this.radio = radio < MINIMO ? MINIMO : radio;
    }
    public static final double MINIMO = 0.0;
    
    /**
     * Declaranse as variables e o tipo de dato de cada una
     */
    private int coordenadaX;
    private int coordenadaY;
    private double radio; 

    public Aro() {
    }
    
    /**
     * Declarase as variables do Aro e establecese que valorX e igual a coordenadaX,
     * valorY e igual a coordenadaY e que valorRadio e igual a radio
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        radio = valorRadio;
    }
    /**
     * @return Obtense o Radio e multiplicase por 2 para obter o diametro
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }
    /**
     * @return Obtense a circunferencia apartir do diametro
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }
    /**
     * @return Calculase a superficie do Aro, ,ultiplicando PI polo radio 2 veces
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }
    /**
     * @return Devolve o String cos datos do Aro
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }
    /**
     * Trasladase o centro obtendo as coordenadas X e Y e sumando o correspondente
     * valor trasladar X e Y
     * @param trasladarx
     * @param trasladary
     */
    public void trasladarCentro(int trasladarx, int trasladary){
        setCoordenadaX(getCoordenadaX() + trasladarx);
        setCoordenadaY(getCoordenadaY() + trasladary);
    }
    /**
     * @return Establecese que LIMITERADIO ten un valor de 0.0
     */
    private double LIMITERADIO = 0.0;

    /**
     * Get the value of LIMITERADIO
     *
     * @return Devolve o valor de LIMITERADIO
     */
    public double getLIMITERADIO() {
        return LIMITERADIO;
    }

    /**
     *
     * @param LIMITERADIO Establece o valor para LIMITERADIO
     */
    public void setLIMITERADIO(double LIMITERADIO) {
        this.LIMITERADIO = LIMITERADIO;
    }

}