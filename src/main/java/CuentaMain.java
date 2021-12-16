public class CuentaMain {
    public static void main(String[] args) {
        Cuenta cuentaTest = new Cuenta("Juanes",-500);
        cuentaTest.ingresar(400);
        cuentaTest.retirar(500);
        System.out.println(cuentaTest.getCantidad());


    }

}
