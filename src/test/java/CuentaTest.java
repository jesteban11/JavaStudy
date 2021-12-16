import junit.framework.TestCase;

public class CuentaTest extends TestCase {

    public void testIngresarMasDineroDelQueSeRetira() {
        double expextedValue = 400;
        Cuenta cuentaTest = new Cuenta("Test 1");
        cuentaTest.ingresar(500);
        cuentaTest.retirar(100);
        assertEquals(expextedValue, cuentaTest.getCantidad());
    }

    public void testRetirarMasDineroDelQueSeIngresa() {
        double expextedValue = 0;
        Cuenta cuentaTest = new Cuenta("Test 2");
        cuentaTest.ingresar(100);
        cuentaTest.retirar(200);
        assertEquals(expextedValue, cuentaTest.getCantidad());
    }

    public void testIngresarNegativoRetornarCero() {
        double expextedValue = 0;
        Cuenta cuentaTest = new Cuenta("Test 3");
        cuentaTest.ingresar(-100);
        assertEquals(expextedValue, cuentaTest.getCantidad());
    }
}