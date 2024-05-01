public class CuentaCorriente implements CuentaBancaria {
private String usuario;
 private double saldo;
private double limite;

 public CuentaCorriente(String usuario, double saloInical, double limite){
  this.usuario=usuario;
  this.saldo=saloInical;
    this.limite=limite;
 }
   public void depositar(double cantidad){
     saldo += cantidad;
     System.out.println("Se deposito $ "+ cantidad + "en la cuenta de: " + usuario);
  }
 public void retirar (double cantidad){
     if (saldo + limite >= cantidad){
          saldo -= cantidad;
         System.out.println("Se retiraron $ " + cantidad + "de la cuenta de: " + usuario );
     }else {
        System.out.println("Saldo insuficiente");
     }
   }
   public double consultarSaldo(){
      return saldo;
  }
  public String getUsuario(){
      return usuario;
   }
}