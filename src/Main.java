import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();
        int opcion;

        do {
            System.out.println("\n=== SISTEMA BANCARIO ===");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Mostrar cuentas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese número de cuenta: ");
                    String num = sc.next();
                    System.out.print("Ingrese nombre del titular: ");
                    String tit = sc.next();
                    System.out.print("Ingrese saldo inicial: ");
                    double saldo = sc.nextDouble();
                    banco.agregarCuenta(new CuentaBancaria(num, tit, saldo));
                    System.out.println(" Cuenta creada correctamente.");
                }
                case 2 -> {
                    System.out.print("Número de cuenta: ");
                    String numDep = sc.next();
                    CuentaBancaria cDep = banco.buscarCuenta(numDep);
                    if (cDep != null) {
                        System.out.print("Monto a depositar: ");
                        double montoDep = sc.nextDouble();
                        cDep.depositar(montoDep);
                    } else {
                        System.out.println(" Cuenta no encontrada.");
                    }
                }
                case 3 -> {
                    System.out.print("Número de cuenta: ");
                    String numRet = sc.next();
                    CuentaBancaria cRet = banco.buscarCuenta(numRet);
                    if (cRet != null) {
                        System.out.print("Monto a retirar: ");
                        double montoRet = sc.nextDouble();
                        cRet.retirar(montoRet);
                    } else {
                        System.out.println(" Cuenta no encontrada.");
                    }
                }
                case 4 -> banco.mostrarCuentas();
                case 0 -> System.out.println(" Saliendo del sistema...");
                default -> System.out.println(" Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
