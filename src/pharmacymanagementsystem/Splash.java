/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacymanagementsystem;
import javax.swing.Timer;
import java.time.Clock;
import java.time.Instant;
import java.util.Date;
import java.util.TimerTask;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Saoudi Massinissa
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form MAinFrame
     */
    public Splash() {
        initComponents();
        Display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        X_label = new javax.swing.JLabel();
        middle_container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clock_field = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        companies_management = new javax.swing.JLabel();
        agents_management = new javax.swing.JLabel();
        med_management = new javax.swing.JLabel();
        function_management = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setBackground(new java.awt.Color(51, 153, 0));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacymanagementsystem/2.png"))); // NOI18N

        X_label.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        X_label.setForeground(new java.awt.Color(255, 255, 255));
        X_label.setText("X");
        X_label.setToolTipText("X");

        middle_container.setBackground(new java.awt.Color(255, 255, 255));
        middle_container.setForeground(new java.awt.Color(0, 153, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("HORIZON PHARMACY MANAGEMENT");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        clock_field.setBackground(new java.awt.Color(0, 153, 0));
        clock_field.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        clock_field.setForeground(new java.awt.Color(255, 255, 255));
        clock_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clock_field.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                clock_fieldMouseMoved(evt);
            }
        });
        clock_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clock_fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout middle_containerLayout = new javax.swing.GroupLayout(middle_container);
        middle_container.setLayout(middle_containerLayout);
        middle_containerLayout.setHorizontalGroup(
            middle_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middle_containerLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(clock_field, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, middle_containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        middle_containerLayout.setVerticalGroup(
            middle_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middle_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(clock_field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        companies_management.setBackground(new java.awt.Color(255, 255, 255));
        companies_management.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        companies_management.setForeground(new java.awt.Color(67, 204, 50));
        companies_management.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companies_management.setText("Comp Management");
        companies_management.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                companies_managementMouseClicked(evt);
            }
        });

        agents_management.setBackground(new java.awt.Color(255, 255, 255));
        agents_management.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        agents_management.setForeground(new java.awt.Color(67, 204, 50));
        agents_management.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agents_management.setText("Agents Management");
        agents_management.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agents_managementMouseClicked(evt);
            }
        });

        med_management.setBackground(new java.awt.Color(255, 255, 255));
        med_management.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        med_management.setForeground(new java.awt.Color(67, 204, 50));
        med_management.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        med_management.setText("Med Management");
        med_management.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                med_managementMouseClicked(evt);
            }
        });

        function_management.setBackground(new java.awt.Color(255, 255, 255));
        function_management.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        function_management.setForeground(new java.awt.Color(67, 204, 50));
        function_management.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        function_management.setText("Function Management");
        function_management.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                function_managementMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(companies_management, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agents_management, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(function_management, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(med_management, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(agents_management, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(companies_management, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(function_management, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(med_management, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(219, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(X_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addComponent(middle_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(X_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(middle_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(containerLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containerLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(logo))))
                .addGap(12, 12, 12)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clock_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clock_fieldActionPerformed

    }//GEN-LAST:event_clock_fieldActionPerformed

    private void clock_fieldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clock_fieldMouseMoved
        
    }//GEN-LAST:event_clock_fieldMouseMoved

    private void med_managementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_med_managementMouseClicked
        new MedecineManagement().setVisible(true);
    }//GEN-LAST:event_med_managementMouseClicked

    private void companies_managementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companies_managementMouseClicked
        new Companys().setVisible(true);
    }//GEN-LAST:event_companies_managementMouseClicked

    private void agents_managementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agents_managementMouseClicked
       new Agents().setVisible(true);
    }//GEN-LAST:event_agents_managementMouseClicked

    private void function_managementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_function_managementMouseClicked
        new Functions().setVisible(true);
    }//GEN-LAST:event_function_managementMouseClicked

    /**
     * @param args the command line arguments
     */
 Timer Display(){
    int delay =100;
Timer timer = new Timer(delay, new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
				String formattedDateTime = now.format(formatter);
				clock_field.setText(formattedDateTime);
			}
		});

		timer.start();
                return timer;
    }
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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel X_label;
    private javax.swing.JLabel agents_management;
    private javax.swing.JTextField clock_field;
    private javax.swing.JLabel companies_management;
    private javax.swing.JPanel container;
    private javax.swing.JLabel function_management;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel med_management;
    private javax.swing.JPanel middle_container;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
