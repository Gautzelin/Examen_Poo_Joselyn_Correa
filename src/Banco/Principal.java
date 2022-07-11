package Banco;


public class Principal {
    public static void main(String[] args) {

        procesos mensaje = new Consultas();
        mensaje.setSaldo(300);
        mensaje.Operaciones();
    }
}
