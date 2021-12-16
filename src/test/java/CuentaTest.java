import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CuentaTest extends TestCase {

    @Test
    public void testIngresarMasDineroDelQueSeRetira() {
        double expextedValue = 400;
        Cuenta cuentaTest = new Cuenta("Test 1");
        cuentaTest.ingresar(500);
        cuentaTest.retirar(100);
        Assertions.assertEquals((long) expextedValue, (long) cuentaTest.getCantidad());
    }

    @Test
    public void testRetirarMasDineroDelQueSeIngresa() {
        Cuenta cuentaTest = new Cuenta("Test 2");
        cuentaTest.ingresar(100);
        cuentaTest.retirar(200);
        Assertions.assertEquals(0, (long) cuentaTest.getCantidad());
    }

    @Test
    public void testIngresarNegativoRetornarCero() {
        Cuenta cuentaTest = new Cuenta("Test 3");
        cuentaTest.ingresar(-100);
        Assertions.assertEquals(0, (long) cuentaTest.getCantidad());
    }

    @Test
    public void testValidarQueSePuedaCrearCuentaIngresandoCantidad() {
        long cantidadIngresada = 500;
        Cuenta cuentaTest = new Cuenta("Test 4",cantidadIngresada);
        Assertions.assertEquals(cantidadIngresada, (long) cuentaTest.getCantidad());
    }
}