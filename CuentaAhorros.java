public class CuentaAhorros {
    private String numeroCuenta;
    private double saldo;
    private double tasaInteresAnual;
    public CuentaAhorros(String numeroCuenta, double saldo, double tasaInteresAnual) {
        this.numeroCuenta = numeroCuenta;
        if(saldo >= 0){
            this.saldo = saldo;
        } else
        {
            this.saldo = 0;
        }
        if(tasaInteresAnual >= 0){
            this.tasaInteresAnual = tasaInteresAnual;
        } else {
            this.tasaInteresAnual = 0;
        }
    }
    public void  depositar(double monto) {
        if(monto > 0){
            saldo += monto;
            System.out.println("deposito realizado: $" + monto);
        } else {
            System.out.println("no se puede realizar el retiro");
        }
    }
    public void aplicarIntresMensaual () {
        double interes = saldo * (tasaInteresAnual / 12) / 100;
        saldo += interes;
        System.out.println("interes mensual aplicado: $" + interes);
    }
    public void mostrarSaldo() {
        System.out.println("numero de cuenta: " + numeroCuenta);
        System.out.println("saldo actualizado: $" + saldo);
    }
}