/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;


import config.connectDB;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import panel.login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author vienz
 */
public class Employeereport extends javax.swing.JFrame {
    
    

    /**
     * Creates new form adminreport
     */
    public Employeereport() {
        initComponents();
        displayData();
    }
    
    public void displayData() {
    try {
        connectDB dbc = new connectDB();
        
        // Only select rows where r_status is 'approve'
        String query = "SELECT r_id, r_customername, r_package, r_servicestartdate, r_cost, r_status " +
                       "FROM tbl_reservation WHERE r_status = 'approve'";
        ResultSet rs = dbc.getData(query);
        
        // Set result set to table model
        overview.setModel(DbUtils.resultSetToTableModel(rs));

        // Set custom column headers
        overview.getColumnModel().getColumn(0).setHeaderValue("Reservation ID");
        overview.getColumnModel().getColumn(1).setHeaderValue("Customer Name");
        overview.getColumnModel().getColumn(2).setHeaderValue("Service Type");
        overview.getColumnModel().getColumn(3).setHeaderValue("Service Start");
        overview.getColumnModel().getColumn(4).setHeaderValue("Cost");
        overview.getColumnModel().getColumn(5).setHeaderValue("Status");
        
        // Refresh table headers
        overview.getTableHeader().repaint();
        
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * red by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        overview = new javax.swing.JTable();
        refresh = new javax.swing.JButton();
        status = new javax.swing.JButton();
        reservation = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mbg.setBackground(new java.awt.Color(255, 204, 204));
        mbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        overview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "Contact Number", "Role", "Status"
            }
        ));
        jScrollPane1.setViewportView(overview);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 730, 220));

        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel5.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        status.setText("OVERALL REPORT");
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel5.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        reservation.setText("GET REPORT");
        reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationActionPerformed(evt);
            }
        });
        jPanel5.add(reservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel5.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 490));

        mbg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 850, 510));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel4.setText("PureClean");
        mbg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backlogin1.png"))); // NOI18N
        jLabel8.setText("Logout");
        jLabel8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel8FocusLost(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        mbg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setText("RESERVATION");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        mbg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 30));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel15.setText("REPORTS");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        mbg.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setText("PROFILE");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        mbg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        displayData();
    }//GEN-LAST:event_refreshActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void jLabel8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel8FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8FocusLost

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        login log = new login();

        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void reservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationActionPerformed
        
     int selectedRow = overview.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Please select a reservation from the table first.");
        return;
    }

    // Extract values from the 6 visible columns
    String customer = overview.getValueAt(selectedRow, 1).toString(); // r_customername
    String type = overview.getValueAt(selectedRow, 2).toString();     // r_type
    String startDate = overview.getValueAt(selectedRow, 3).toString(); // r_servicestartdate
    String cost = overview.getValueAt(selectedRow, 4).toString();     // r_cost
    String status = overview.getValueAt(selectedRow, 5).toString();   // r_status
    String id = overview.getValueAt(selectedRow, 0).toString();       // r_id (if needed)

    // Fetch the additional 2 columns (r_creationdate, r_cnumber, r_location) from the database
    try {
        connectDB dbc = new connectDB();
        String query = "SELECT r_creationdate, r_cnumber, r_location FROM tbl_reservation WHERE r_id = ?";
        PreparedStatement pst = dbc.getConnection().prepareStatement(query);
        pst.setString(1, id); // Use the r_id to fetch the additional columns
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            String creationDate = rs.getString("r_creationdate");
            String contactNumber = rs.getString("r_cnumber");
            String location = rs.getString("r_location");

            // Format and show details in a dialog
            StringBuilder details = new StringBuilder();
            details.append("Customer: ").append(customer).append("\n");
            details.append("Type: ").append(type).append("\n");
            details.append("Start Date: ").append(startDate).append("\n");
            details.append("Cost: ").append(cost).append("\n");
            details.append("Status: ").append(status).append("\n");
            details.append("Creation Date: ").append(creationDate).append("\n");
            details.append("Contact: ").append(contactNumber).append("\n");
            details.append("Location: ").append(location).append("\n");

            // Show the details in a JOptionPane dialog
            JOptionPane.showMessageDialog(null, details.toString(), "Reservation Details", JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error loading additional data: " + e.getMessage());
    }




    }//GEN-LAST:event_reservationActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        ereservation reservation = new ereservation();  // Create a new instance of reservation panel
        reservation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        Employeereport arp = new Employeereport();
        arp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        account acc = new account();
        acc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
 
    int selectedRow = overview.getSelectedRow();

    // If no row is selected, show a message and exit
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a reservation to print.");
        return;
    }

    // Assuming the reservationId is in the first column (index 0)
    int reservationId = Integer.parseInt(overview.getValueAt(selectedRow, 0).toString());

    // Call the print receipt method and pass the reservationId
    printReceipt(reservationId);
    }//GEN-LAST:event_printActionPerformed

    private void printReceipt(int reservationId) {
    // Create a PrinterJob instance
    PrinterJob printerJob = PrinterJob.getPrinterJob();

    // Set the Printable interface that defines how to print
    printerJob.setPrintable((Graphics g, PageFormat pf, int pageIndex) -> {
        if (pageIndex > 0) {
            return Printable.NO_SUCH_PAGE;
        }

        // Set the margins and font size for better print layout
        g.setFont(new Font("Arial", Font.BOLD, 18));  // Title font
        g.setColor(Color.BLACK);

        // Print system title at the top
        g.drawString("PureClean - Home Cleaning Service", 100, 80);
        
        // Add a line to separate the header from the content
        g.drawLine(100, 90, 500, 90);

        // Set font for the rest of the details
        g.setFont(new Font("Arial", Font.PLAIN, 12));

        // Retrieve reservation details from the database
        try (Connection conn = connectDB.getConnection()) {
            String sql = "SELECT * FROM tbl_reservation WHERE r_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, reservationId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String customerName = rs.getString("r_customername");
                String reservationDate = rs.getString("r_servicestartdate");
                String packageType = rs.getString("r_package");
                String location = rs.getString("r_location");
                String contactNumber = rs.getString("r_cnumber");
                String creationDate = rs.getString("r_creationdate");
                double totalCost = rs.getDouble("r_cost");

                // Set color for the content
                g.setColor(Color.BLACK);

                // Print the receipt details with better spacing
                g.drawString("Reservation ID: " + reservationId, 100, 120);
                g.drawString("Customer: " + customerName, 100, 140);
                g.drawString("Reservation Date: " + reservationDate, 100, 160);
                g.drawString("Package: " + packageType, 100, 180);
                g.drawString("Location: " + location, 100, 200);
                g.drawString("Contact Number: " + contactNumber, 100, 220);
                g.drawString("Creation Date: " + creationDate, 100, 240);
                g.drawString("Total Cost: $" + totalCost, 100, 260);

                // Add a footer message
                g.setFont(new Font("Arial", Font.ITALIC, 10));  // Footer font
                g.drawString("Thank you for choosing PureClean!", 100, 280);

                // Add a line at the bottom
                g.drawLine(100, 290, 500, 290);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Printable.PAGE_EXISTS;
    });

    // Display the print dialog to allow user to choose a printer
    if (printerJob.printDialog()) {
        try {
            printerJob.print();  // Print the document
        } catch (PrinterException e) {
            e.printStackTrace();
        }
    }
}
    
    
    
    
    public void generateReport() {
    try {
        connectDB dbc = new connectDB();
        
        // Query to get 8 columns
        String query = "SELECT r_customername, r_type, r_creationdate, r_servicestartdate, r_status, r_cost, r_cnumber, r_location FROM tbl_reservation";
        ResultSet rs = dbc.getData(query);
        
        // Display in the JTable named 'overview'
        overview.setModel(DbUtils.resultSetToTableModel(rs));

        // Set headers for the 8 columns
        overview.getColumnModel().getColumn(0).setHeaderValue("Customer Name");
        overview.getColumnModel().getColumn(1).setHeaderValue("Service Type");
        overview.getColumnModel().getColumn(2).setHeaderValue("Creation Date");
        overview.getColumnModel().getColumn(3).setHeaderValue("Service Start Date");
        overview.getColumnModel().getColumn(4).setHeaderValue("Status");
        overview.getColumnModel().getColumn(5).setHeaderValue("Cost");
        overview.getColumnModel().getColumn(6).setHeaderValue("Contact Number");
        overview.getColumnModel().getColumn(7).setHeaderValue("Location");
        
        overview.getTableHeader().repaint();
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error loading data: " + ex.getMessage());
    }
}





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
            java.util.logging.Logger.getLogger(Employeereport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employeereport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employeereport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employeereport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employeereport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mbg;
    private javax.swing.JTable overview;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JButton reservation;
    private javax.swing.JButton status;
    // End of variables declaration//GEN-END:variables
}
