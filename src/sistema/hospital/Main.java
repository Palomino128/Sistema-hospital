
package sistema.hospital;

import sistema.hospital.interfaces.*;
import sistema.hospital.servicios.ServicioColas;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ServicioColas servicio = new ServicioColas();
        
        if (args.length > 0 && args[0].equalsIgnoreCase("doctor")) {
            new DoctorCLI(servicio).iniciar();
        } else {
            SwingUtilities.invokeLater(() -> {
                new RecepcionGUI(servicio).setVisible(true);
            });
        }
    }
}