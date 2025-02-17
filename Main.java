import javax.swing.SwingUtilities;
import src.ui.TelaPrincipal;

public class Main {
   public static void main(String[] var0) {
      SwingUtilities.invokeLater(() -> {
        (new TelaPrincipal()).mostrarTela();
      });
   }
}
