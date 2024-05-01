public class Main {
    public static void main(String[] args) {

        CuentaCorriente cuentaCorriente = new CuentaCorriente("Juan", 1000.0, 500.0);
        CuentaAhorro cuentaAhorro = new CuentaAhorro("María", 2000.0, 5.0);


        GestorCuenta gestor = new GestorCuenta();


        gestor.agregarCuenta(cuentaCorriente);
        gestor.agregarCuenta(cuentaAhorro);


        gestor.depositar(0, 200.0);
        gestor.retirar(1, 300.0);


        double saldoJuan = gestor.consultarSaldo(0);
        double saldoMaria = gestor.consultarSaldo(1);

        System.out.println("Saldo de la cuenta corriente de Juan: $" + saldoJuan);
        System.out.println("Saldo de la cuenta de ahorro de María: $" + saldoMaria);
    }
}
