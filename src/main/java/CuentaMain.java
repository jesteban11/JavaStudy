public class CuentaMain {
    public static void main(String[] args) {
        Cuenta cuentaTest = new Cuenta("Juanes");
        System.out.println("Hola");
        cuentaTest.ingresar(400);
        cuentaTest.retirar(100);
        System.out.println(cuentaTest.getCantidad());
    }

}
