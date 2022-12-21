package formularios;

import java.awt.Toolkit;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import java.util.Timer;

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
        this.setTitle("CONVERSOR");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static boolean caracterNoValido(String cadena) {
        boolean error = false;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            int valorASCII = (int) caracter;
            if (valorASCII < 46 || valorASCII > 57 || valorASCII == 47) {
                error = true;
            }
        }
        return error;
    }

    
    public static void exit() {
        Timer timer = new Timer();
        TimerTask timertask = new TimerTask() {
            @Override
            public void run() {
                String[] buttons = {"NO", "SI"};
                int selection = JOptionPane.showOptionDialog(null, "¿Desea continuar con el programa?", "EXIT", 0, JOptionPane.WARNING_MESSAGE, null, buttons, "SI");
                if (selection == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else if (selection == JOptionPane.NO_OPTION) {
                    System.out.println("Canceled exit...");

                }
            }
        };
        timer.schedule(timertask, 3000);
    }
    
    public static void mensajeError() {
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Se ha detectado un caracter no válido.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        monedaLocal = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        divisa = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        grados = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        radianes = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        tempGrados = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        tempFahrenheit = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        tempKelvin = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        JMenu = new javax.swing.JMenu();
        milimetro = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        centimetro = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        metro = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        kilometro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktop.setBackground(new java.awt.Color(0, 0, 0));
        desktop.setMaximumSize(new java.awt.Dimension(488, 365));
        desktop.setMinimumSize(new java.awt.Dimension(488, 365));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(230, 235, 240));

        jMenu1.setText("Menu");

        jMenu2.setText("Conversor de Monedas");

        monedaLocal.setText("Moneda local --> Divisa");
        monedaLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedaLocalActionPerformed(evt);
            }
        });
        jMenu2.add(monedaLocal);
        jMenu2.add(jSeparator3);

        divisa.setText("Divisa --> Moneda local");
        divisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaActionPerformed(evt);
            }
        });
        jMenu2.add(divisa);

        jMenu1.add(jMenu2);
        jMenu1.add(jSeparator1);

        jMenu3.setText("Conversor de Grados/Radianes");

        grados.setText("Grados --> Radianes");
        grados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradosActionPerformed(evt);
            }
        });
        jMenu3.add(grados);
        jMenu3.add(jSeparator4);

        radianes.setText("Radianes --> Grados");
        radianes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radianesActionPerformed(evt);
            }
        });
        jMenu3.add(radianes);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator2);

        jMenu4.setText("Conversor de Temperaturas");

        tempGrados.setText("Grados --> Fahrenheit, Kelvin");
        tempGrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempGradosActionPerformed(evt);
            }
        });
        jMenu4.add(tempGrados);
        jMenu4.add(jSeparator5);

        tempFahrenheit.setText("Fahrenheit --> Kelvin, Grados");
        tempFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempFahrenheitActionPerformed(evt);
            }
        });
        jMenu4.add(tempFahrenheit);
        jMenu4.add(jSeparator6);

        tempKelvin.setText("Kelvin --> Grados, Fahrenheit");
        tempKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempKelvinActionPerformed(evt);
            }
        });
        jMenu4.add(tempKelvin);

        jMenu1.add(jMenu4);
        jMenu1.add(jSeparator7);

        JMenu.setText("Conversor de Medidas");

        milimetro.setText("mm --> cm, m, km");
        milimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milimetroActionPerformed(evt);
            }
        });
        JMenu.add(milimetro);
        JMenu.add(jSeparator8);

        centimetro.setText("cm --> mm, m, km");
        centimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centimetroActionPerformed(evt);
            }
        });
        JMenu.add(centimetro);
        JMenu.add(jSeparator9);

        metro.setText("m --> mm, cm, km");
        metro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metroActionPerformed(evt);
            }
        });
        JMenu.add(metro);
        JMenu.add(jSeparator10);

        kilometro.setText("km --> mm, cm, m");
        kilometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilometroActionPerformed(evt);
            }
        });
        JMenu.add(kilometro);

        jMenu1.add(JMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void divisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisaActionPerformed
        Divisa divisa = new Divisa();
        this.desktop.add(divisa);
        divisa.setVisible(true);
    }//GEN-LAST:event_divisaActionPerformed

    private void monedaLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedaLocalActionPerformed
        MonedaLocal monedalocal = new MonedaLocal();
        this.desktop.add(monedalocal);
        monedalocal.setVisible(true);
    }//GEN-LAST:event_monedaLocalActionPerformed

    private void gradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradosActionPerformed
        Grados grados = new Grados();
        this.desktop.add(grados);
        grados.setVisible(true);
    }//GEN-LAST:event_gradosActionPerformed

    private void radianesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radianesActionPerformed
        Radianes radi = new Radianes();
        this.desktop.add(radi);
        radi.setVisible(true);
    }//GEN-LAST:event_radianesActionPerformed

    private void tempGradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempGradosActionPerformed
        Temperaturas temp = new Temperaturas("Grados");
        this.desktop.add(temp);
        temp.setVisible(true);
    }//GEN-LAST:event_tempGradosActionPerformed

    private void tempFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempFahrenheitActionPerformed
        Temperaturas temp = new Temperaturas("Fahrenheit");
        this.desktop.add(temp);
        temp.setVisible(true);
    }//GEN-LAST:event_tempFahrenheitActionPerformed

    private void tempKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempKelvinActionPerformed
        Temperaturas temp = new Temperaturas("Kelvin");
        this.desktop.add(temp);
        temp.setVisible(true);
    }//GEN-LAST:event_tempKelvinActionPerformed

    private void milimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milimetroActionPerformed
        Medidas medidas = new Medidas("Milimetros");
        this.desktop.add(medidas);
        medidas.setVisible(true);
    }//GEN-LAST:event_milimetroActionPerformed

    private void centimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centimetroActionPerformed
        Medidas medidas = new Medidas("Centimetros");
        this.desktop.add(medidas);
        medidas.setVisible(true);
    }//GEN-LAST:event_centimetroActionPerformed

    private void metroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metroActionPerformed
        Medidas medidas = new Medidas("Metros");
        this.desktop.add(medidas);
        medidas.setVisible(true);
    }//GEN-LAST:event_metroActionPerformed

    private void kilometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilometroActionPerformed
        Medidas medidas = new Medidas("");
        this.desktop.add(medidas);
        medidas.setVisible(true);
    }//GEN-LAST:event_kilometroActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenu;
    private javax.swing.JMenuItem centimetro;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem divisa;
    private javax.swing.JMenuItem grados;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem kilometro;
    private javax.swing.JMenuItem metro;
    private javax.swing.JMenuItem milimetro;
    private javax.swing.JMenuItem monedaLocal;
    private javax.swing.JMenuItem radianes;
    private javax.swing.JMenuItem tempFahrenheit;
    private javax.swing.JMenuItem tempGrados;
    private javax.swing.JMenuItem tempKelvin;
    // End of variables declaration//GEN-END:variables
}
