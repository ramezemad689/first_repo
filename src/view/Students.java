/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import logicservices.studentservice;
import model.Student;
public class Students extends javax.swing.JFrame {
   studentservice serve = new studentservice();  
    
    public Students() {
        initComponents();
        loadStudents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        b1 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        b2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "GPA", "Departement"
            }
        ));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 0, 957, 342));

        b1.setText("search");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 80, 30));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 270, 30));

        b2.setText("Delete");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        DefaultTableModel model =
        (DefaultTableModel) Table1.getModel();
        
        int id = Integer.parseInt(model.getValueAt(Table1.getSelectedRow(), 0).toString());
        String name= (model.getValueAt(Table1.getSelectedRow(), 1)).toString();
        int age = Integer.parseInt(model.getValueAt(Table1.getSelectedRow(), 2).toString());
        double gpa = Double.parseDouble(model.getValueAt(Table1.getSelectedRow(), 3).toString());
        int d = Integer.parseInt(model.getValueAt(Table1.getSelectedRow(), 4).toString());
        
         Register r=new Register(id, name, age, gpa, d);

        
        
        if (Table1.getSelectedRow()==-1){
       JOptionPane.showMessageDialog(this,"select student first");
        }   
        else{
        
        r.setVisible(true);
        
        }
    }//GEN-LAST:event_Table1MouseClicked

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked

try{
  
DefaultTableModel model =
        (DefaultTableModel) Table1.getModel();
Student s =new Student();
Student result = serve.searchById(t1.getText());

if (result != null) {
    model.setRowCount(0); // امسح بس لما تلاقي نتيجة
    
    model.addRow(new Object[]{
        result.getId(),
        result.getName(),
        result.getAge(),
        result.getGpa(),
        result.getDept()
    });
} else {
    JOptionPane.showMessageDialog(this, "Student not found");
}
}catch(NumberFormatException n){JOptionPane.showMessageDialog(this, "enter id to search for");}


    }//GEN-LAST:event_b1MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
try{
DefaultTableModel model= (DefaultTableModel) Table1.getModel();    

Student s=new Student(Integer.parseInt(t1.getText()));


if(t1.getText()==null){
JOptionPane.showMessageDialog(this,"select a student first");
}
else{
serve.delete(s);

}

loadStudents();
 
}
catch(Exception e){System.out.println(e);}

    }//GEN-LAST:event_b2MouseClicked

   private void loadStudents() 
   { ///////// انا موقف الدالة في instructor
   
 try{ 
DefaultTableModel model =
        (DefaultTableModel) Table1.getModel();
    
     model.setRowCount(0);
     List<Student> students = serve.load();

     
        for(Student s : students){
            System.out.println(s.getid());

            model.addRow(new Object[]{
                s.getid(),
                s.getname(),
                s.getAge(),
                s.getgpa(),
                s.getdept()
            });
        
    
        }
 }catch(Exception e){System.out.println(e);}
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
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Table1;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
