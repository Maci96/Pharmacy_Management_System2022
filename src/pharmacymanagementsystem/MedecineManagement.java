/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacymanagementsystem;

/**
 * @author Saoudi Massinissa
 */
public class MedecineManagement extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CompaniesComboBox;
    private javax.swing.JLabel Company_label;
    private com.toedter.calendar.JDateChooser ExpDateField;
    private javax.swing.JLabel ExpDate_label;
    private javax.swing.JPanel Gen_conatiner;
    private javax.swing.JLabel Header;
    private javax.swing.JTextField Price_Filed;
    private javax.swing.JButton add_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JPanel conatiner;
    private javax.swing.JButton delete_btn;
    private com.toedter.calendar.JDateChooser fabDateField;
    private javax.swing.JLabel fabDate_label;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logo_label;
    private javax.swing.JTextField medID_field;
    private javax.swing.JTextField medName_Field;
    private javax.swing.JLabel medName_label;
    private javax.swing.JLabel med_id_label;
    private javax.swing.JLabel price_label;
    private javax.swing.JTextField qte_field;
    private javax.swing.JLabel qte_label;
    private javax.swing.JScrollPane table;
    private javax.swing.JButton update_btn;
    /**
     * Creates new form MedecineManagement
     */
    public MedecineManagement() {
        initComponents();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MedecineManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedecineManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedecineManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedecineManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedecineManagement().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gen_conatiner = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        logo_label = new javax.swing.JLabel();
        conatiner = new javax.swing.JPanel();
        med_id_label = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();
        medName_label = new javax.swing.JLabel();
        ExpDate_label = new javax.swing.JLabel();
        Company_label = new javax.swing.JLabel();
        fabDate_label = new javax.swing.JLabel();
        medID_field = new javax.swing.JTextField();
        medName_Field = new javax.swing.JTextField();
        Price_Filed = new javax.swing.JTextField();
        fabDateField = new com.toedter.calendar.JDateChooser();
        ExpDateField = new com.toedter.calendar.JDateChooser();
        CompaniesComboBox = new javax.swing.JComboBox<>();
        add_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        table = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        qte_field = new javax.swing.JTextField();
        qte_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 204, 0));

        Gen_conatiner.setBackground(new java.awt.Color(102, 204, 0));

        Header.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Header.setForeground(new java.awt.Color(255, 255, 255));
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Medicine Management");

        logo_label.setBackground(new java.awt.Color(0, 153, 0));
        logo_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacymanagementsystem/2.png"))); // NOI18N

        med_id_label.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        med_id_label.setForeground(new java.awt.Color(0, 153, 0));
        med_id_label.setText("MedID");

        price_label.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        price_label.setForeground(new java.awt.Color(0, 153, 0));
        price_label.setText("Price");

        medName_label.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        medName_label.setForeground(new java.awt.Color(0, 153, 0));
        medName_label.setText("MedName");

        ExpDate_label.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ExpDate_label.setForeground(new java.awt.Color(0, 153, 0));
        ExpDate_label.setText("ExpDate");

        Company_label.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Company_label.setForeground(new java.awt.Color(0, 153, 0));
        Company_label.setText("Company");

        fabDate_label.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        fabDate_label.setForeground(new java.awt.Color(0, 153, 0));
        fabDate_label.setText("FabDate");

        medID_field.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        medName_Field.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        Price_Filed.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        CompaniesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        add_btn.setBackground(new java.awt.Color(51, 153, 0));
        add_btn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("Add");

        delete_btn.setBackground(new java.awt.Color(51, 153, 0));
        delete_btn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delete");

        clear_btn.setBackground(new java.awt.Color(51, 153, 0));
        clear_btn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        clear_btn.setText("Clear");

        update_btn.setBackground(new java.awt.Color(51, 153, 0));
        update_btn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        update_btn.setForeground(new java.awt.Color(255, 255, 255));
        update_btn.setText("Update");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(218, 212, 212));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "MedID", "Name", "Comapany", "Price", "FabDate", "ExpDate"
                }
        ));
        table.setViewportView(jTable1);

        qte_field.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        qte_label.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        qte_label.setForeground(new java.awt.Color(0, 153, 0));
        qte_label.setText("Quantity");

        javax.swing.GroupLayout conatinerLayout = new javax.swing.GroupLayout(conatiner);
        conatiner.setLayout(conatinerLayout);
        conatinerLayout.setHorizontalGroup(
                conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(conatinerLayout.createSequentialGroup()
                                .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(conatinerLayout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addComponent(add_btn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(clear_btn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(update_btn)
                                                .addGap(37, 37, 37))
                                        .addGroup(conatinerLayout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(conatinerLayout.createSequentialGroup()
                                                                .addComponent(qte_label, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(46, 46, 46)
                                                                .addComponent(qte_field, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(conatinerLayout.createSequentialGroup()
                                                                .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(price_label, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(medName_label, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(med_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(46, 46, 46)
                                                                .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(medID_field, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(medName_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Price_Filed, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(34, 34, 34)
                                                .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ExpDate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(fabDate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Company_label, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(conatinerLayout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(delete_btn))
                                        .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(CompaniesComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fabDateField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ExpDateField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(conatinerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        conatinerLayout.setVerticalGroup(
                conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(conatinerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(medID_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(med_id_label)
                                                .addComponent(fabDate_label))
                                        .addComponent(fabDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(conatinerLayout.createSequentialGroup()
                                                .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(medName_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(medName_label)
                                                                .addComponent(ExpDate_label)))
                                                .addGap(18, 18, 18)
                                                .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Price_Filed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(price_label)
                                                        .addComponent(Company_label)))
                                        .addGroup(conatinerLayout.createSequentialGroup()
                                                .addComponent(ExpDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17)
                                                .addComponent(CompaniesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15)
                                .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(qte_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(qte_label))
                                .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(conatinerLayout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(conatinerLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(add_btn)
                                                        .addComponent(update_btn)
                                                        .addComponent(clear_btn)
                                                        .addComponent(delete_btn))))
                                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Gen_conatinerLayout = new javax.swing.GroupLayout(Gen_conatiner);
        Gen_conatiner.setLayout(Gen_conatinerLayout);
        Gen_conatinerLayout.setHorizontalGroup(
                Gen_conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Gen_conatinerLayout.createSequentialGroup()
                                .addComponent(logo_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(conatiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Gen_conatinerLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(313, 313, 313))
        );
        Gen_conatinerLayout.setVerticalGroup(
                Gen_conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Gen_conatinerLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Header)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Gen_conatinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(conatiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(180, 180, 180))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Gen_conatiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Gen_conatiner, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // End of variables declaration//GEN-END:variables
}
