package Banco;

import java.util.Scanner;

public abstract class procesos {
    protected int retiros, depositos, transacciones;
    private int saldo;
    Scanner entrada = new Scanner(System.in);
    public void Operaciones(){
        int n1=0;
        int seleccion =0;
        //menu de opciones
        do {
            do {
                System.out.println("Elija una opcion:");
                System.out.println("1. Retiros");
                System.out.println("2. Depositos");
                System.out.println("3. Consultar Saldo");
                System.out.println("4. Salir");

                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    n1 = 1;
                } else {
                    System.out.println("Opcion Incorrecta, intente nuevamente");
                }

            } while (n1 == 0);
            if(seleccion == 1){
                procesos mensaje = new Retiros();

            }else if(seleccion ==2 ){
                procesos mensaje = new Depositos();

            }else if(seleccion ==3 ){
                procesos mensaje = new Consultas();

            }else if(seleccion == 4 ){
                System.out.println("Proceso finalizado");
            }
            n1=2;
        }while(n1 != 2);
    }

    //solicutud de dinero a retirar
    public void Retiro(){
        retiros = entrada.nextInt();
    }
    public void Deposito(){
        depositos = entrada.nextInt();
    }

    public abstract void transacciones();

    public int getRetiros() {
        return retiros;
    }

    public void setRetiros(int retiros) {
        this.retiros = retiros;
    }

    public int getDepositos() {
        return depositos;
    }

    public void setDepositos(int depositos) {
        this.depositos = depositos;
    }

    public int getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }
}
