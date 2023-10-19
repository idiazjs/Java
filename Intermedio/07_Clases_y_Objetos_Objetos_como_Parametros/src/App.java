public class App {
    public static void main(String[] args) throws Exception {
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("Jesus", "Diaz", "Lara", "1314",
                CuentaBancaria.tipoCuenta.AHORROS);
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria("Carlos", "Santana", "Juarez", "1413",
                CuentaBancaria.tipoCuenta.CORRIENTE);
        cuentaBancaria1.depositar(1000);
        System.out.println(cuentaBancaria1.getSaldo());
        cuentaBancaria2.depositar(500);
        System.out.println(cuentaBancaria1.compararMayorSaldo(cuentaBancaria2));
        cuentaBancaria1.transferencia(cuentaBancaria2, 100);
        System.out.println(cuentaBancaria1.saldo);
        System.out.println(cuentaBancaria2.saldo);
        cuentaBancaria1.retirar(1000);
    }
}

class CuentaBancaria {
    private String nomTitular;
    private String appTitular;
    private String apmTitular;
    private String numCuenta;

    enum tipoCuenta {
        AHORROS, CORRIENTE
    }

    tipoCuenta cuenta;
    float saldo = 0;

    public CuentaBancaria(String nomTitular, String appTitular, String apmTitular, String numCuenta,
            tipoCuenta cuenta) {
        this.nomTitular = nomTitular;
        this.appTitular = appTitular;
        this.apmTitular = apmTitular;
        this.numCuenta = numCuenta;
        this.cuenta = cuenta;
    }

    public String getNomTitular() {
        return this.nomTitular;
    }

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }

    public String getAppTitular() {
        return this.appTitular;
    }

    public void setAppTitular(String appTitular) {
        this.appTitular = appTitular;
    }

    public String getApmTitular() {
        return this.apmTitular;
    }

    public void setApmTitular(String apmTitular) {
        this.apmTitular = apmTitular;
    }

    public String getNumCuenta() {
        return this.numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public tipoCuenta getCuenta() {
        return this.cuenta;
    }

    public void setCuenta(tipoCuenta cuenta) {
        this.cuenta = cuenta;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void imprimeCuenta() {
        System.out.println(nomTitular);
        System.out.println(appTitular);
        System.out.println(apmTitular);
        System.out.println(numCuenta);
        System.out.println(cuenta);
        System.out.println(saldo);
    }

    private boolean validaMultiplo(int valor) {
        if (valor % 100 == 0) {
            return true;
        } else {
            System.out.println("retirar.Error: Solos multiplos de 100");
            return false;
        }
    }

    private boolean validaSaldoSuficiente(int valor) {
        if (valor > saldo) {
            System.out.println("retirar.Error: Saldo insuficiente");
            return false;
        } else {
            return true;
        }
    }

    public void retirar(int valor) {
        if (validaMultiplo(valor) && validaSaldoSuficiente(valor)) {
            saldo -= valor;
            System.out.println("retirar.Exito: " + valor);
        }
    }

    public void depositar(int valor) {
        if (validaMultiplo(valor)) {
            saldo += valor;
            System.out.println("depositar.Exito: " + valor);
        }
    }

    public boolean compararMayorSaldo(CuentaBancaria cuenta) {
        if (saldo > cuenta.saldo) {
            return true;
        } else {
            return false;
        }
    }

    public void transferencia(CuentaBancaria cuenta, int valor) {
        if (validaMultiplo(valor) && validaSaldoSuficiente(valor)) {
            saldo -= valor;
            cuenta.saldo += valor;
            System.out.println("Transferencia exitosa");
        }
    }
}