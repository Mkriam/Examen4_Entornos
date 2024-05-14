package huevoSorpresa;

/**
 * Clase que instancia el objeto HuevoSorpresa y todos sus métodos
 * 
 * @version 1.0
 * @author Miriam Rodriguez
 */

public class HuevoSorpresa {
    
    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_max;//precio máximo que puede tener un huevo sorpresa
    
    
public HuevoSorpresa(){}

/**
 * Metodo que crea el objeto huevoSorpresa habiendole pasado sus parámetros
 * 
 * @param unidades cantidad de huevos
 * @param precio precio que tendrá el huevo
 * @param sorpresa objeto que contendrá el huevo
 * @param precio_max preccio máximo que podrá tener
 */
public HuevoSorpresa(int unidades, double precio, String sorpresa, double precio_max){
    this.unidades=unidades;
    this.precio=precio;
    this.sorpresa=sorpresa;
    this.precio_max=precio_max;
}

/**
 * Método que devuelve la cantidad que hay del huevo introducido
 * @return dDevuelve el número de huevos que hay
 */
public int obtenerUnidades(){return this.getUnidades();}

/**
 * Método que devuelve el precio del huevo pasado como parámetro
 * @return 
 */
public double obtenerPrecio(){return this.getPrecio();}

/**
 * Método que cambia la cantidad de huevos que hay
 * @param unidades Cantidad de huevos a la que se quiere cambiar
 */
public void modificarUnidades(int unidades){this.setUnidades(unidades);}

/**
 * Método que permite sacar huevos
 * 
 * @param unidades cantidad de huevos que se quieren sacar
 * @param dinero dinero total que se introduce
 * @param sorpresa sorpresa que tendrá el huevo
 * @throws Exception lanza una excepción si no se introdujo dinero, si no hay suficiente dinero, 
 * si la cantidad de huevos es negativa o si no hay suficientes huevos
 * 
 */
public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresa) throws Exception{
   if (dinero <= 0) {
   	throw new Exception("Se necesita una cantidad de dinero positiva");
        }
   if (dinero <(unidades * getPrecio())) {
   	throw new Exception("No tiene suficiente dinero");
        }
   if (unidades<= 0){
        throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
    }
    if( this.getUnidades()<unidades){
        throw new Exception("No hay suficientes huevos sorpresa en la tienda");
    }
    this.modificarUnidades(this.obtenerUnidades()-unidades);
}

/**
 * Método que permite aumentar el precio de un huevo
 * 
 * @param aumento Cantidad de dinero que se quiere aumental el precio del huevo
 * @throws Exception Saltará una excepción si el aumento es igual o inferior a 0 o si el precio ya aumentado supera el precio máximo del huevo
 */
public void aumentarPrecio(double aumento) throws Exception{
    if(aumento <= 0) {
        throw new Exception("El aumento debe ser positivo");
    }
    if( getPrecio_max()<getPrecio() + aumento ){
        throw new Exception("No se puede superar el precio máximo");
    }
        setPrecio(getPrecio() + aumento);
}

    /**
     * Método que da las cantidad de unidades que tiene un huevo
     * @return Devuelve el número de unidaddes que tiene
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Método que permite modificar las unidaddes de un huevo
     * @param unidades La nueva cacntidad de unidades por la que se quiere cambiar
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * Método que permite obtener el precio de un huevo
     * @return El precio del huevo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método que permite cambiar el precio de un huevo
     * @param precio Nuevo precio del huevo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método que permite obtener la sorpresa del huevo
     * @return Sorpresa que tiene el huevo
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /**
     * Método que permite cambiar la sorpresa del huevo
     * @param sorpresa Sorpresa a la que se quiere cambiar
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /**
     * Método que da el precio máximo de un huevo
     * @return Precio Máximoo de un huevo
     */
    public double getPrecio_max() {
        return precio_max;
    }

    /**
     * Método que permite cambiar el precico máximo de un huevo
     * @param precio_max precio máximo al que se quiere cambiar
     */
    public void setPrecio_max(double precio_max) {
        this.precio_max = precio_max;
    }
}





































