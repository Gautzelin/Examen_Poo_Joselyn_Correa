public class Depositos extends Procesos {
    @Override
    public void transacciones() {
        System.out.println("Cantidad a depositar: ");
        Deposito();

        transacciones = getSaldo();
        setSaldo(transacciones + depositos);
        System.out.println("La cantidad depositada es: " + depositos);
        System.out.println("Saldo actual: " + getSaldo());
    }
}
