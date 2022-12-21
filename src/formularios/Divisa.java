package formularios;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Divisa extends javax.swing.JInternalFrame {

    public Divisa() {
        initComponents();
        this.setTitle("Divisas --> COP");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesos = new javax.swing.JTextField();
        divisa = new javax.swing.JTextField();
        labelPesos = new javax.swing.JLabel();
        convertir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        opcion = new javax.swing.JComboBox<>();
        labelDivisa = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setMaximumSize(new java.awt.Dimension(472, 242));
        setMinimumSize(new java.awt.Dimension(472, 242));
        setPreferredSize(new java.awt.Dimension(472, 242));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pesos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(pesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 200, 30));

        divisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(divisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 200, 30));

        labelPesos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPesos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelPesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 30));

        convertir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        convertir.setText("Convertir");
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });
        getContentPane().add(convertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Opciones:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 30));

        opcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Dólar a Peso colombiano", "Euros a Peso colombiano", "Libras Esterlinas a Peso colombiano", "Yen Japonés a Peso colombiano", "Won sur-coreano a Peso colombiano" }));
        opcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionActionPerformed(evt);
            }
        });
        getContentPane().add(opcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 350, 30));

        labelDivisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDivisa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelDivisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        //1 USD = 4,802.48 COP.
        //1 EUR = 5,066.00 COP.
        //1 GBP = 5,787.50 COP.
        //1 JPY = 36.465 COP.
        //1 KRW = 3,725 COP.

        if (Menu.caracterNoValido(this.divisa.getText())) {
            this.pesos.setText("");
            this.labelPesos.setText("");
            this.labelDivisa.setText("");
            Menu.mensajeError();            
        } else {
            this.labelPesos.setText("Pesos:");
            switch (opcion.getSelectedIndex()) {
                case 0:
                    this.divisa.setText("");
                    this.labelPesos.setText("");
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Por favor elige alguna divisa.");
                    break;
                case 1:
                    this.pesos.setText(String.format("%.2f", Double.parseDouble(this.divisa.getText()) * 4802.48));
                    break;
                case 2:
                    this.pesos.setText(String.format("%.2f", Double.parseDouble(this.divisa.getText()) * 5066.00));
                    break;
                case 3:
                    this.pesos.setText(String.format("%.2f", Double.parseDouble(this.divisa.getText()) * 5787.50));
                    break;
                case 4:
                    this.pesos.setText(String.format("%.2f", Double.parseDouble(this.divisa.getText()) * 36.465));
                    break;
                case 5:
                    this.pesos.setText(String.format("%.2f", Double.parseDouble(this.divisa.getText()) * 3725.00));
                    break;
                default:
                    throw new AssertionError();
            }
        }
        Menu.exit();
    }//GEN-LAST:event_convertirActionPerformed

    private void opcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionActionPerformed
        this.divisa.setText("");
        this.pesos.setText("");
        this.labelPesos.setText("");

        switch (opcion.getSelectedIndex()) {
            case 1:
                this.labelDivisa.setText("Dolares:");
                break;
            case 2:
                this.labelDivisa.setText("Euros:");
                break;
            case 3:
                this.labelDivisa.setText("Libras:");
                break;
            case 4:
                this.labelDivisa.setText("Yen:");
                break;
            case 5:
                this.labelDivisa.setText("Won:");
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_opcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertir;
    private javax.swing.JTextField divisa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelDivisa;
    private javax.swing.JLabel labelPesos;
    private javax.swing.JComboBox<String> opcion;
    private javax.swing.JTextField pesos;
    // End of variables declaration//GEN-END:variables
}
