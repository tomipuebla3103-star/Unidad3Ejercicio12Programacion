//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CajaFuerte caja = new CajaFuerte("1234");

    System.out.println("Primer intento:");
    caja.abrir("1111");

    System.out.println();

    System.out.println("Segundo intento:");
    caja.abrir("2222");

    System.out.println();

    System.out.println("Tercer intento:");
    caja.abrir("3333");

    System.out.println();

    System.out.println("Cuarto intento:");
    caja.abrir("1234");

    System.out.println();

    System.out.println("Estado de la caja: " + caja.estaBloqueada());

    caja.cambiarCombinacion("1234", "5678");
}
