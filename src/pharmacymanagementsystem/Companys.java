/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacymanagementsystem;

/**
 *
 * @author Saoudi Massinissa
 */
public class Companys extends javax.swing.JFrame {

    /**
     * Creates new form Agents
     */
    public Companys() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        Logo_label = new javax.swing.JLabel();
        Header_label = new javax.swing.JLabel();
        Insertion_panel = new javax.swing.JPanel();
        name_label = new javax.swing.JLabel();
        phone_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        med_qte = new javax.swing.JLabel();
        add_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        companyID_field = new javax.swing.JTextField();
        address_field = new javax.swing.JTextField();
        med_QTE_field = new javax.swing.JTextField();
        phone_field = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        company_id_field = new javax.swing.JLabel();
        date_debut_label = new javax.swing.JLabel();
        date_debut_field = new com.toedter.calendar.JDateChooser();
        Affich_table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MedManager");
        setBackground(new java.awt.Color(51, 153, 0));
        setMinimumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 500));

        Container.setBackground(new java.awt.Color(51, 153, 0));
        Container.setForeground(new java.awt.Color(255, 255, 255));
        Container.setName("Container"); // NOI18N

        Logo_label.setBackground(new java.awt.Color(255, 255, 255));
        Logo_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacymanagementsystem/2.png"))); // NOI18N

        Header_label.setBackground(new java.awt.Color(255, 255, 255));
        Header_label.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Header_label.setForeground(new java.awt.Color(255, 255, 255));
        Header_label.setText("Medicines Companies Management");

        Insertion_panel.setBackground(new java.awt.Color(255, 255, 255));

        name_label.setBackground(new java.awt.Color(255, 255, 255));
        name_label.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        name_label.setForeground(new java.awt.Color(51, 153, 0));
        name_label.setText("Name");

        phone_label.setBackground(new java.awt.Color(255, 255, 255));
        phone_label.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        phone_label.setForeground(new java.awt.Color(51, 153, 0));
        phone_label.setText("Phone");

        address_label.setBackground(new java.awt.Color(255, 255, 255));
        address_label.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        address_label.setForeground(new java.awt.Color(51, 153, 0));
        address_label.setText("Address");

        med_qte.setBackground(new java.awt.Color(255, 255, 255));
        med_qte.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        med_qte.setForeground(new java.awt.Color(51, 153, 0));
        med_qte.setText("Medicines Quantity");

        add_btn.setBackground(new java.awt.Color(51, 153, 0));
        add_btn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("Add");

        clear_btn.setBackground(new java.awt.Color(51, 153, 0));
        clear_btn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        clear_btn.setText("Clear");

        update_btn.setBackground(new java.awt.Color(51, 153, 0));
        update_btn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        update_btn.setForeground(new java.awt.Color(255, 255, 255));
        update_btn.setText("Update");

        delete_btn.setBackground(new java.awt.Color(51, 153, 0));
        delete_btn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delete");

        companyID_field.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        address_field.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        med_QTE_field.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        phone_field.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        name.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        company_id_field.setBackground(new java.awt.Color(255, 255, 255));
        company_id_field.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        company_id_field.setForeground(new java.awt.Color(51, 153, 0));
        company_id_field.setText("CompanyID");

        date_debut_label.setBackground(new java.awt.Color(255, 255, 255));
        date_debut_label.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        date_debut_label.setForeground(new java.awt.Color(51, 153, 0));
        date_debut_label.setText("Date Debute");

        javax.swing.GroupLayout Insertion_panelLayout = new javax.swing.GroupLayout(Insertion_panel);
        Insertion_panel.setLayout(Insertion_panelLayout);
        Insertion_panelLayout.setHorizontalGroup(
            Insertion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Insertion_panelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(Insertion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Insertion_panelLayout.createSequentialGroup()
                        .addGroup(Insertion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Insertion_panelLayout.createSequentialGroup()
                                .addComponent(company_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(companyID_field, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Insertion_panelLayout.createSequentialGroup()
                                .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Insertion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phone_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_debut_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Insertion_panelLayout.createSequentialGroup()
                        .addComponent(add_btn)
                        .addGap(89, 89, 89)
                        .addComponent(clear_btn)
                        .addGap(101, 101, 101)
                        .addComponent(update_btn)
                        .addGap(110, 110, 110)
                        .addComponent(delete_btn))
                    .addGroup(Insertion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(phone_field, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Insertion_panelLayout.createSequentialGroup()
                            .addComponent(address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(med_qte, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(med_QTE_field, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(date_debut_field, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        Insertion_panelLayout.setVerticalGroup(
            Insertion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Insertion_panelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(Insertion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone_label)
                    .addComponent(companyID_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(company_id_field))
                .addGap(30, 30, 30)
                .addGroup(Insertion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Insertion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name_label)
                        .addComponent(date_debut_label))
                    .addComponent(date_debut_field, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(Insertion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(med_QTE_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(med_qte)
                    .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address_label))
                .addGap(18, 18, 18)
                .addGroup(Insertion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn)
                    .addComponent(update_btn)
                    .addComponent(clear_btn)
                    .addComponent(delete_btn))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Affich_table.setBackground(java.awt.Color.lightGray);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
             
            },
            new String [] {
                "CompanyID", "Name", "Med Quantity", "Address", "Phone", "DateDebute"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout Affich_tableLayout = new javax.swing.GroupLayout(Affich_table);
        Affich_table.setLayout(Affich_tableLayout);
        Affich_tableLayout.setHorizontalGroup(
            Affich_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Affich_tableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        Affich_tableLayout.setVerticalGroup(
            Affich_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Affich_tableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Insertion_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Affich_table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(Header_label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Header_label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(Insertion_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Affich_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Companys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Companys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Companys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Companys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Companys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Affich_table;
    private javax.swing.JPanel Container;
    private javax.swing.JLabel Header_label;
    private javax.swing.JPanel Insertion_panel;
    private javax.swing.JLabel Logo_label;
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField address_field;
    private javax.swing.JLabel address_label;
    private javax.swing.JButton clear_btn;
    private javax.swing.JTextField companyID_field;
    private javax.swing.JLabel company_id_field;
    private com.toedter.calendar.JDateChooser date_debut_field;
    private javax.swing.JLabel date_debut_label;
    private javax.swing.JButton delete_btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField med_QTE_field;
    private javax.swing.JLabel med_qte;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField phone_field;
    private javax.swing.JLabel phone_label;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
