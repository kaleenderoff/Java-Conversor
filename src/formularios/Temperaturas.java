package formularios;

public class Temperaturas extends javax.swing.JInternalFrame {

    private final String temp;

    public Temperaturas(String temp) {
        initComponents();
        this.temp = temp;
        this.setTitle("Temperaturas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultado2 = new javax.swing.JTextField();
        temperatura = new javax.swing.JTextField();
        labelResultado2 = new javax.swing.JLabel();
        convertir = new javax.swing.JButton();
        labelTemperatura = new javax.swing.JLabel();
        resultado1 = new javax.swing.JTextField();
        labelResultado1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setMaximumSize(new java.awt.Dimension(472, 242));
        setMinimumSize(new java.awt.Dimension(472, 242));
        setPreferredSize(new java.awt.Dimension(472, 242));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultado2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(resultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 200, 30));

        temperatura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 200, 30));

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

        labelTemperatura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTemperatura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 30));

        resultado1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(resultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 200, 30));

        labelResultado1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelResultado1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        // Grados a Fahrenheit --> (°C × 9/5) + 32 = °F
        // Grados a Kelvin --> °C + 273.15 = °K

        // Fahrenheit a Kelvin --> (°F − 32) × 5/9 + 273.15 = °K
        // Fahrenheit a Grados --> (°F − 32) × 5/9 = °C
        
        // Kelvin a Grados --> °K − 273.15 = °C
        // Kelvin a Fahrenheit --> (°K − 273.15) × 9/5 + 32 = °F
        
        if (Menu.caracterNoValido(this.temperatura.getText())) {
            this.labelResultado1.setText("");
            this.labelResultado2.setText("");
            this.resultado1.setText("");
            this.resultado2.setText("");
            Menu.mensajeError();
        } else {
            double fahrenheit_a_grados = (Double.parseDouble(this.temperatura.getText()) - 32) * 5 / 9;
            double kelvin_a_grados = Double.parseDouble(this.temperatura.getText()) - 273.15;

            switch (this.temp) {
                case "Grados":
                    this.labelTemperatura.setText("Grados:");
                    this.labelResultado1.setText("Fahrenheit:");
                    this.labelResultado2.setText("Kelvin:");
                    this.resultado1.setText(String.format("%.2f", (Double.parseDouble(this.temperatura.getText()) * 9 / 5) + 32));
                    this.resultado2.setText(String.format("%.2f", Double.parseDouble(this.temperatura.getText()) + 273.15));
                    break;
                case "Fahrenheit":
                    this.labelTemperatura.setText("Fahrenheit:");
                    this.labelResultado1.setText("Kelvin:");
                    this.labelResultado2.setText("Grados:");
                    this.resultado1.setText(String.format("%.2f", fahrenheit_a_grados + 273.15));
                    this.resultado2.setText(String.format("%.2f", fahrenheit_a_grados));
                    break;
                default:
                    this.labelTemperatura.setText("Kelvin:");
                    this.labelResultado1.setText("Grados:");
                    this.labelResultado2.setText("Fahrenheit:");
                    this.resultado1.setText(String.format("%.2f", kelvin_a_grados));
                    this.resultado2.setText(String.format("%.2f", (kelvin_a_grados * 9 / 5) + 32));
                    break;
            }
            Menu.exit();
        }
    }//GEN-LAST:event_convertirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertir;
    private javax.swing.JLabel labelResultado1;
    private javax.swing.JLabel labelResultado2;
    private javax.swing.JLabel labelTemperatura;
    private javax.swing.JTextField resultado1;
    private javax.swing.JTextField resultado2;
    private javax.swing.JTextField temperatura;
    // End of variables declaration//GEN-END:variables
}
