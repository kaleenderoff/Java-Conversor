package formularios;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class MonedaLocal extends javax.swing.JInternalFrame {

    public MonedaLocal() {
        initComponents();
        this.setTitle("COP --> Divisas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultado = new javax.swing.JTextField();
        pesos = new javax.swing.JTextField();
        labelResultado = new javax.swing.JLabel();
        convertir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        opcion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setMaximumSize(new java.awt.Dimension(472, 242));
        setMinimumSize(new java.awt.Dimension(472, 242));
        setPreferredSize(new java.awt.Dimension(472, 242));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 200, 30));

        pesos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(pesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 200, 30));

        labelResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 30));

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
        opcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Peso colombiano a Dólar", "Peso colombiano a Euros", "Peso colombiano a Libras Esterlinas", "Peso colombiano a Yen Japonés", "Peso colombiano a Won sur-coreano" }));
        opcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionActionPerformed(evt);
            }
        });
        getContentPane().add(opcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 350, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Pesos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        // TRM 21 de diciembre de 2022

        //1 USD = 4,769.29 COP.
        //1 EUR = 5,039.50 COP.
        //1 GBP = 5,735.00 COP.
        //1 JPY = 35.92 COP.
        //1 KRW = 3.70 COP.

        if (Menu.caracterNoValido(this.pesos.getText())) {
            this.labelResultado.setText("");
            this.resultado.setText("");
            Menu.mensajeError();            
        } else {
            switch (opcion.getSelectedIndex()) {
                case 0:
                    this.pesos.setText("");
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Por favor elige alguna divisa.");
                    break;
                case 1:
                    this.labelResultado.setText("Dolares:");
                    this.resultado.setText(String.format("%.2f", Double.parseDouble(this.pesos.getText()) / 4769.29));
                    break;
                case 2:
                    this.labelResultado.setText("Euros:");
                    this.resultado.setText(String.format("%.2f", Double.parseDouble(this.pesos.getText()) / 5039.50));
                    break;
                case 3:
                    this.labelResultado.setText("Libras:");
                    this.resultado.setText(String.format("%.2f", Double.parseDouble(this.pesos.getText()) / 5735.00));
                    break;
                case 4:
                    this.labelResultado.setText("Yen:");
                    this.resultado.setText(String.format("%.2f", Double.parseDouble(this.pesos.getText()) / 35.92));
                    break;
                case 5:
                    this.labelResultado.setText("Won:");
                    this.resultado.setText(String.format("%.2f", Double.parseDouble(this.pesos.getText()) / 3.70));
                    break;
                default:
                    throw new AssertionError();
            }
            Menu.exit();
        }


    }//GEN-LAST:event_convertirActionPerformed

    private void opcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionActionPerformed
        this.labelResultado.setText("");
        this.pesos.setText("");
        this.resultado.setText("");
    }//GEN-LAST:event_opcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JComboBox<String> opcion;
    private javax.swing.JTextField pesos;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
