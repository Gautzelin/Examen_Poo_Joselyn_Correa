public class Retiros extends Procesos {
    @Override
    public void transacciones() {
        System.out.print("Cuanto desea retirar: ");
        Retiro();
        if(retiros <= getSaldo()){
            transacciones = getSaldo();
            setSaldo(transacciones - retiros);
            System.out.println("Tu retiro fue de: "+ retiros);
            System.out.println("Saldo actual: "+ getSaldo());

        }else{
            System.out.println("Saldo Insuficiente");
        }
    }
}
