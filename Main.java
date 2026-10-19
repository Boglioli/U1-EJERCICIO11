public static void main(String[] args) {
    CuentaAhorros cuenta = new CuentaAhorros("CA-001", 100000, 12);
    cuenta.depositar(50000);
    cuenta.aplicarIntresMensaual();
    cuenta.mostrarSaldo();
}
