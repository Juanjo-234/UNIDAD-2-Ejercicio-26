//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
ImpresoraLaser laser = new ImpresoraLaser("HP LaserJet Pro", "1200x1200 dpi", 40);
ImpresoraTinta tinta = new ImpresoraTinta(15, 90, "4800x1200 dpi", "Epson EcoTank");


    laser.imprimirDocumento("Reporte_Financiero_2026.pdf");
    System.out.println("===============================================");
    tinta.imprimirDocumento("Foto_Vacaciones.jpg");
}
