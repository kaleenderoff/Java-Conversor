package formularios;

public class Radianes extends javax.swing.JInternalFrame {

    public Radianes() {
        initComponents();
        this.setTitle("Radianes --> Grados");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultado = new javax.swing.JTextField();
        radianes = new javax.swing.JTextField();
        labelGrados = new javax.swing.JLabel();
        convertir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setMaximumSize(new java.awt.Dimension(472, 242));
        setMinimumSize(new java.awt.Dimension(472, 242));
        setPreferredSize(new java.awt.Dimension(472, 242));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 200, 30));

        radianes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(radianes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 200, 30));

        labelGrados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelGrados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelGrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 30));

        convertir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        convertir.setText("Convertir");
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });
        getContentPane().add(convertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Radianes:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        if (Menu.caracterNoValido(this.radianes.getText())) {
            this.labelGrados.setText("");
            this.resultado.setText("");
            Menu.mensajeError();
        } else {
            double r = Double.parseDouble(this.radianes.getText());
            this.resultado.setText("" + String.format("%.1f°", r * (180 / Math.PI)));
            this.labelGrados.setText("Grados:");
            Menu.exit();
        }
    }//GEN-LAST:event_convertirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelGrados;
    private javax.swing.JTextField radianes;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
