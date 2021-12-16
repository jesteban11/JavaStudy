public class Cuenta {

    String titular;
    double cantidad;


    public Cuenta(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        if(cantidad>0){
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad){
        double saldo = getSaldo(cantidad, this.cantidad);
        if(saldo>0){
            this.cantidad = saldo;
        }else{
            this.cantidad = 0;
        }

    }

    private double getSaldo(double cantidadRetirar, double cantidadActual){
        return cantidadActual-cantidadRetirar;
    }

}
