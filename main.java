
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER90
 */
public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Kalkulator menghitung = new Kalkulator();
            menghitung.setVisible(true);
        });
    }
}
