import java.util.ArrayList;
import java.util.List;

class GestorCuenta {
        private List<CuentaBancaria> cuentas;

        public GestorCuenta() {
    cuentas = new ArrayList<>();
}

public void agregarCuenta(CuentaBancaria cuenta) {
    cuentas.add(cuenta);
}

public void depositar(int indice, double cantidad) {
    if (indice >= 0 && indice < cuentas.size()) {
        cuentas.get(indice).depositar(cantidad);
    } else {
        System.out.println("Índice de cuenta inválido.");
    }
}

public void retirar(int indice, double cantidad) {
    if (indice >= 0 && indice < cuentas.size()) {
        cuentas.get(indice).retirar(cantidad);
    } else {
        System.out.println("Índice de cuenta inválido.");
    }
}

public double consultarSaldo(int indice) {
    if (indice >= 0 && indice < cuentas.size()) {
        return cuentas.get(indice).consultarSaldo();
    } else {
        System.out.println("Índice de cuenta inválido.");
        return -1;
    }
}
}

