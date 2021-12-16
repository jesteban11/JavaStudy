import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

class CuentaTest extends TestCase {

    @Test
    void testIngresarMasDineroDelQueSeRetira() {
        double expextedValue = 400;
        Cuenta cuentaTest = new Cuenta("Test 1");
        cuentaTest.ingresar(500);
        cuentaTest.retirar(100);
        assertEquals((long) expextedValue, (long) cuentaTest.getCantidad());
    }

    @Test
    void testRetirarMasDineroDelQueSeIngresa() {
        double expextedValue = 0;
        Cuenta cuentaTest = new Cuenta("Test 2");
        cuentaTest.ingresar(100);
        cuentaTest.retirar(200);
        assertEquals((long) expextedValue, (long) cuentaTest.getCantidad());
    }

    @Test
    public void testIngresarNegativoRetornarCero() {
        double expextedValue = 0;
        Cuenta cuentaTest = new Cuenta("Test 3");
        cuentaTest.ingresar(-100);
        assertEquals((long) expextedValue, (long) cuentaTest.getCantidad());
    }
}