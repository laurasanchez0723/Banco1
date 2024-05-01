public class CuentaAhorro implements CuentaBancaria {
    private String usuario;
    private double saldo;
    private double interes;

    public CuentaAhorro (String usuario, double saldo_Inicial, double interes){
        this.usuario=usuario;
        this.saldo=saldo_Inicial;
        this.interes=interes;
    }
    public void depositar (double cantidad){
        saldo+= cantidad;
        System.out.println("Se deposito $ "+ cantidad + "en la cuenta de: " + usuario);
    }
    public void retirar(double cantidad){
        if (saldo>=cantidad){
            saldo-=cantidad;
            System.out.println("Se deposito $ "+ cantidad + "en la cuenta de: " + usuario);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    public double consultarSaldo() {
        return 0;
    }

    public double calcularInteres(int meses){
        double interesMensual =interes /12/100;
        double tasa =saldo*interesMensual*meses;
        return tasa;
    }
    public void actualizarInteres(int meses){
        double tasa =calcularInteres(meses);
        saldo+=tasa;
        System.out.println("se agrego $" + tasa + "de interes");
    }
    public String getUsuario(){
        return usuario;
    }

}
