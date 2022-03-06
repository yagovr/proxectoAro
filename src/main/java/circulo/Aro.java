package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author A21YagoVR
 */
public class Aro {

    /**
     * Devolve a coordenada X
     * @return 
 
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Establece a Coordenada X
     * @param coordenadaX 
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Devolve a Coordenada Y
     * @return 

     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Establece a Coordenada Y
     * @param coordenadaY 

     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Devolve o Radio
     * @return 
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece o Radio, "se o radio e negativo establecese o valor 0"
     * @param radio 
     */
    public void setRadio(double radio) {
        this.radio = radio < MINIMO ? MINIMO : radio;
    }
    /**
     * Establecese que o dato MINIMO de tipo double e igual a 0.0     */
    public static final double MINIMO = 0.0;
    
    /**
     * Declaranse as variables e o tipo de dato de cada una
     * @return
     */
    private int coordenadaX;
    private int coordenadaY;
    private double radio; 
    /**
     * Constructor por defecto
     */
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
     * Obtense o Radio e multiplicase por 2 para obter o diametro
     * @return 
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }
    /**
     * Obtense a circunferencia apartir do diametro
     * @return 
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }
    /**
     * Calculase a superficie do Aro, ,ultiplicando PI polo radio 2 veces
     * @return 
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }
    /**
     * Devolve o String cos datos do Aro
     * @return 
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
     * Devolve o valor de LIMITERADIO
     * @return 
     */
    public double getLIMITERADIO() {
        return LIMITERADIO;
    }

    /**
     *Establece o valor para LIMITERADIO
     * @param LIMITERADIO 
     */
    public void setLIMITERADIO(double LIMITERADIO) {
        this.LIMITERADIO = LIMITERADIO;
    }

}