public abstract class Electrodomestico { // de las clases abstractas no se pueden crear objetos

    protected String tipo;
    protected String marca;
    protected double potencia;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public Electrodomestico(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }


    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }

   public abstract double  getConsumo(int horas);

    public double getCosteConsumo(int horas, double costeHora){
        return horas*costeHora;
    }




}
