package formularios;

public class Medidas extends javax.swing.JInternalFrame {

    private final String med;

    public Medidas(String med) {
        initComponents();
        this.med = med; 
        this.setTitle("Medidas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultado2 = new javax.swing.JTextField();
        medida = new javax.swing.JTextField();
        labelResultado2 = new javax.swing.JLabel();
        convertir = new javax.swing.JButton();
        labelMedida = new javax.swing.JLabel();
        resultado1 = new javax.swing.JTextField();
        labelResultado1 = new javax.swing.JLabel();
        labelResultado3 = new javax.swing.JLabel();
        resultado3 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setMaximumSize(new java.awt.Dimension(472, 270));
        setMinimumSize(new java.awt.Dimension(472, 270));
        setPreferredSize(new java.awt.Dimension(472, 270));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultado2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(resultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 200, 30));

        medida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(medida, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 200, 30));

        labelResultado2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelResultado2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelResultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 30));

        convertir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        convertir.setText("Convertir");
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });
        getContentPane().add(convertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 30));

        labelMedida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelMedida.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 30));

        resultado1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(resultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 200, 30));

        labelResultado1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelResultado1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 30));

        labelResultado3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelResultado3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelResultado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, 30));

        resultado3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(resultado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 200, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
            if (Menu.caracterNoValido(this.medida.getText())) {
            this.labelResultado1.setText("");
            this.labelResultado2.setText("");
            this.labelResultado3.setText("");
            this.resultado1.setText("");
            this.resultado2.setText("");
            this.resultado3.setText("");
            Menu.mensajeError();
        } else {
            switch (this.med) {
                case "Milimetros":
                    this.labelMedida.setText("Milimetros:");
                    this.labelResultado1.setText("Centimetros:");
                    this.labelResultado2.setText("Metros:");
                    this.labelResultado3.setText("Kilometros:");
                    this.resultado1.setText(String.format("%.1f", Double.parseDouble(this.medida.getText()) / 10));
                    this.resultado2.setText(String.format("%.3f", Double.parseDouble(this.medida.getText()) / 1000));
                    this.resultado3.setText(String.format("%.6f", Double.parseDouble(this.medida.getText()) / 1000000));
                    break;
                case "Centimetros":
                    this.labelMedida.setText("Centimetros:");
                    this.labelResultado1.setText("Milimetros:");
                    this.labelResultado2.setText("Metros:");
                    this.labelResultado3.setText("Kilometros:");
                    this.resultado1.setText(String.format("%.2f", Double.parseDouble(this.medida.getText()) * 10));
                    this.resultado2.setText(String.format("%.2f", Double.parseDouble(this.medida.getText()) / 100));
                    this.resultado3.setText(String.format("%.5f", Double.parseDouble(this.medida.getText()) / 100000));
                    break;
                case "Metros":
                    this.labelMedida.setText("Metros:");
                    this.labelResultado1.setText("Milimetros:");
                    this.labelResultado2.setText("Centimetros:");
                    this.labelResultado3.setText("Kilometros:");
                    this.resultado1.setText(String.format("%.2f", Double.parseDouble(this.medida.getText()) * 1000));
                    this.resultado2.setText(String.format("%.2f", Double.parseDouble(this.medida.getText()) * 100));
                    this.resultado3.setText(String.format("%.3f", Double.parseDouble(this.medida.getText()) / 1000));
                    break;
                default:
                    this.labelMedida.setText("Kilometro:");
                    this.labelResultado1.setText("Milimetros:");
                    this.labelResultado2.setText("Centimetros:");
                    this.labelResultado3.setText("Metros:");
                    this.resultado1.setText(String.format("%.2f", Double.parseDouble(this.medida.getText()) * 1000000));
                    this.resultado2.setText(String.format("%.2f", Double.parseDouble(this.medida.getText()) * 100000));
                    this.resultado3.setText(String.format("%.2f", Double.parseDouble(this.medida.getText()) * 1000));
                    break;
            }
            Menu.exit();
        }
    }//GEN-LAST:event_convertirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertir;
    private javax.swing.JLabel labelMedida;
    private javax.swing.JLabel labelResultado1;
    private javax.swing.JLabel labelResultado2;
    private javax.swing.JLabel labelResultado3;
    private javax.swing.JTextField medida;
    private javax.swing.JTextField resultado1;
    private javax.swing.JTextField resultado2;
    private javax.swing.JTextField resultado3;
    // End of variables declaration//GEN-END:variables
}
