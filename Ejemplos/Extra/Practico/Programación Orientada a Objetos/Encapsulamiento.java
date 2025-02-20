package proyecto1;

class CuentaBancaria {
    private double saldo;

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(100);
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
}