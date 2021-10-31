package org.james;

public class CuentaGeneral implements Cuenta {
    private double saldo;
    private Cliente cliente;
    private Fecha fecApertura;

    public CuentaGeneral(double saldoini, Cliente cliente) {
    this.saldo = saldoini;
    this.cliente = cliente;
    this.fecApertura = new Fecha();
    }

    @Override
    public double saldo() {
        // TODO Auto-generated method stub
        return saldo;
    }

    @Override
    public void ingresar(double cantidad) {
        // TODO Auto-generated method stub
        
        //cantidad=saldo+cantidad;
        
    }

    @Override
    public void retirar(double cantidad) {
        // TODO Auto-generated method stub
        //cantidad=saldo-cantidad;
        
    }

    @Override
    public Cliente getCliente() {
        // TODO Auto-generated method stub
        return cliente;
    }

    @Override
    public Fecha getFecApe() {
        // TODO Auto-generated method stub
        return fecApertura;
    }

    @Override
    public void aplicaIntereses() {
        // TODO Auto-generated method stub
    
    }
    
}
