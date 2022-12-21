package formularios;

public class Grados extends javax.swing.JInternalFrame {

    public Grados() {
        initComponents();
        this.setTitle("Grados --> Radianes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultado = new javax.swing.JTextField();
        grados = new javax.swing.JTextField();
        labelRadianes = new javax.swing.JLabel();
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

        grados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(grados, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 200, 30));

        labelRadianes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRadianes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelRadianes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 30));

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
        jLabel3.setText("Grados:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        if (Menu.caracterNoValido(this.grados.getText())) {
            this.labelRadianes.setText("");
            this.resultado.setText("");
            Menu.mensajeError();
        } else {
            double g = Double.parseDouble(this.grados.getText());
            this.resultado.setText("" + String.valueOf(Math.PI * g / 180));
            this.labelRadianes.setText("Radianes:");
            Menu.exit();
        }
    }//GEN-LAST:event_convertirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertir;
    private javax.swing.JTextField grados;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelRadianes;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
