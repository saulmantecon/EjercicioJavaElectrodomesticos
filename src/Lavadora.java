public class Lavadora extends Electrodomestico {

    private float precio;
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia) {
        super(marca, potencia);
        this.aguaCaliente=false;
    }

    public Lavadora(String marca, double potencia, float precio, boolean aguaCaliente) {
        super(marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }

    public double  getConsumo(int horas){
        if (!aguaCaliente){ //agua fria
            return horas*potencia;

        }else{ // agua caliente
            return horas*(potencia+potencia*0,20);
        }
    }
}
