public class App {
    public static void main(String[] args) throws Exception {
        CuentaBancaria cuentaBancaria = new CuentaBancaria("Jesus", "Diaz", "Lara", "1314",
                CuentaBancaria.tipoCuenta.AHORROS);
        System.out.println(cuentaBancaria.getSaldo());
        cuentaBancaria.depositar(1000);
        cuentaBancaria.retirar(300);
        System.out.println(cuentaBancaria.getSaldo());
        cuentaBancaria.retirar(66);
        cuentaBancaria.retirar(1000);
        cuentaBancaria.imprimeCuenta();
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

    public void retirar(int valor) {
        if (valor % 100 != 0) {
            System.out.println("retirar.Error: Solos multiplos de 100");
        } else if (valor > saldo) {
            System.out.println("retirar.Error: Saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("retirar.Exito: " + valor);
        }
    }

    public void depositar(int valor) {
        if (valor % 100 != 0) {
            System.out.println("depositar.Error: Solos multiplos de 100");
        } else {
            saldo += valor;
            System.out.println("depositar.Exito: " + valor);
        }
    }
}