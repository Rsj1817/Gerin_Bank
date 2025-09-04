import java.util.ArrayList;

public class Banco {
    private ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public CuentaBancaria buscarCuenta(String numeroCuenta) {
        for (CuentaBancaria c : cuentas) {
            if (c.getNumeroCuenta().equals(numeroCuenta)) {
                return c;
            }
        }
        return null; // no encontrada
    }

    public void mostrarCuentas() {
        for (CuentaBancaria c : cuentas) {
            c.mostrarInformacion();
        }
    }
}
