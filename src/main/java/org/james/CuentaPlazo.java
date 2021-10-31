package org.james;

public class CuentaPlazo extends Decorador {
    // interés aplicado a la cuenta a plazo
    private double interes;
    // plazo en años
    private int plazo;

    public CuentaPlazo(Cuenta c, double interes, int plazo) {
        super(c);
        this.interes = interes;
        this.plazo = plazo;
    }

    public void aplicaIntereses() {
        double saldoActual = super.saldo();
        System.out.print("Su saldo después del plazo será de: " + (saldoActual + (saldoActual*(interes / 100) * plazo)));
    }

    public double getInteres() {
        return this.interes;
    }

    public int getPlazo() {
        return this.plazo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInterés: " + interes + " - Plazo: " + plazo;
    }
}
