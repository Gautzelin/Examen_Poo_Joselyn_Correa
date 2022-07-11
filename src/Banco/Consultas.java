package Banco;

public class Consultas extends procesos {
    @Override
    public void transacciones() {
        System.out.println("Saldo Actual: "+ getSaldo());
    }
}
