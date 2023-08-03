
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhruvshah619
 */
public class AddingBranchesAndTeachers_UI extends javax.swing.JFrame {
    /**
     * Creates new form AddingBranchesAndTeachers_UI
     */
    /*
        *This form would just be used to display the list of teachers and branches of the college!
    */
    List<Subject[][]> listOfTT=new ArrayList<>();
    Institute institute;
    public AddingBranchesAndTeachers_UI(Institute institute) {
        this.institute=institute;
        dm1=new DefaultListModel<>();
        dm2=new DefaultListModel<>();
        initComponents();
        aui=this;
        lblInstituteName.setHorizontalAlignment(SwingConstants.CENTER);
        lblInstituteName.setText(institute.getInstituteName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddBranch = new javax.swing.JButton();
        btnAddTeacher = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listOfBranches = new javax.swing.JList<>(dm1);
        jScrollPane4 = new javax.swing.JScrollPane();
        listOfTeachers = new javax.swing.JList<>(dm2);
        btnRemoveBranch = new javax.swing.JButton();
        btnUpdateBranch = new javax.swing.JButton();
        btnRemoveTeacher = new javax.swing.JButton();
        btnUpdateTeacher = new javax.swing.JButton();
        lblInstituteName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddBranch.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnAddBranch.setText("Add Branch");
        btnAddBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBranchActionPerformed(evt);
            }
        });

        btnAddTeacher.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnAddTeacher.setText("Add Teacher");
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
            }
        });

        btnDone.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        btnDone.setText("DONE");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        listOfBranches.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listOfBranches.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        listOfBranches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listOfBranchesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listOfBranches);

        listOfTeachers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listOfTeachers.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(listOfTeachers);

        btnRemoveBranch.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnRemoveBranch.setText("Remove Branch");
        btnRemoveBranch.setEnabled(false);
        btnRemoveBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveBranchActionPerformed(evt);
            }
        });

        btnUpdateBranch.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnUpdateBranch.setText("Update Branch");
        btnUpdateBranch.setEnabled(false);
        btnUpdateBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateBranchActionPerformed(evt);
            }
        });

        btnRemoveTeacher.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnRemoveTeacher.setText("Remove Teacher");
        btnRemoveTeacher.setEnabled(false);
        btnRemoveTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveTeacherActionPerformed(evt);
            }
        });

        btnUpdateTeacher.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnUpdateTeacher.setText("Update Teacher");
        btnUpdateTeacher.setEnabled(false);
        btnUpdateTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTeacherActionPerformed(evt);
            }
        });

        lblInstituteName.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        lblInstituteName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblInstituteName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnRemoveBranch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddBranch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdateBranch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRemoveTeacher, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdateTeacher, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstituteName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddBranch)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveBranch)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateBranch))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddTeacher)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveTeacher)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateTeacher))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnDone)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBranchActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddingBranch(institute,dm1,aui).setVisible(true);
            }
        }); 
        this.dispose();
    }//GEN-LAST:event_btnAddBranchActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddingTeacher(institute,dm2,aui).setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_btnAddTeacherActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        //all the important code goes in here!
        List<Thread> threads=new ArrayList<>();
        Set<Branch> setOfBranches=new HashSet<>(Institute.getHashSetOfBranches());
        for(Branch branch:setOfBranches){
            //create that many number of threads and pass the branch name as its parameter
            //that thread would consist of the dd array which would indeed generate TT
            //
            Set<Subject> setOfSubjects=branch.getSetOfSubjects();
            int totalNoOfLecsRequired=0;
            for(Subject subject:setOfSubjects){
                totalNoOfLecsRequired+=subject.getLecturesPerWeek();
            }
            int maxLecsPerWeek=6 * Institute.getNumberOfWorkingDays();
            if(totalNoOfLecsRequired<=maxLecsPerWeek){   
                //executing perfectly!!
                Thread thread=new Thread(new TimeTableGeneratingThread(branch.getBranchName()));
                thread.start();
                threads.add(thread);
            }else{
                System.out.println("Total no of Lectures more than limit!");
            }
        }
        for(Thread thread:threads){
            try{
                thread.join();
            }catch(InterruptedException e){}
        }
        for(Branch branch:setOfBranches){
//            branch.printTimeTable();//printed all of them successfully!
            Map<String,Subject> mapOfTT=branch.getTimeTable();
            Subject[][] arrOfSubjects=new Subject[6][Institute.getNumberOfWorkingDays()];
            for(Map.Entry<String,Subject> entry:mapOfTT.entrySet()){
                String key=entry.getKey();
                String arr[]=key.split(" - ");
                String day=arr[0];
                int row=Integer.parseInt(arr[1])-1;
                int column= getRow(day);
                arrOfSubjects[row][column]=entry.getValue();
            }
            //CHANGES FROM HERE=-======================================================================
//            for(int i=0;i<5;i++){
//                for(int j=0;j<Institute.getNumberOfWorkingDays();j++){
//                    if(null==arrOfSubjects[i][j]){
//                        System.out.println("empty at :"+i+" "+j);
//                        //now what youn do is that you push the lectures up and see if the slot is full if it isnt then you push
//                        //it to another day!
//                    //got the indexes
//                    }
//                }
//            }
            //
            //here now call the reshape thread!
            displayTTInFormat(arrOfSubjects);
            listOfTT.add(arrOfSubjects);
        }
        
    }//GEN-LAST:event_btnDoneActionPerformed
    private void displayTTInFormat(Subject[][] arrOfSubjects){
        for(int i=0;i<6;i++){
            for(int j=0;j<Institute.getNumberOfWorkingDays();j++){
                if(arrOfSubjects[i][j]!=null)
                    System.out.print(arrOfSubjects[i][j].getSubjectName()+" ");
                else
                    System.out.print("-- ");
            }
            System.out.println("");
        }
    }
    private int getRow(String day){
        if("MONDAY".equals(day)){
            return 0; 
        }else if("TUESDAY".equals(day)){
            return 1;
        }else if("WEDNESDAY".equals(day)){
            return 2;
        }else if("THURSDAY".equals(day)){
            return 3;
        }else if("FRIDAY".equals(day)){
            return 4;
        }else if("SATURDAY".equals(day)){
            return 5;
        }
        return -1;
    }
    private void btnRemoveBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveBranchActionPerformed

    private void btnUpdateBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateBranchActionPerformed

    private void btnRemoveTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveTeacherActionPerformed

    private void btnUpdateTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateTeacherActionPerformed

    private void listOfBranchesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listOfBranchesMouseClicked
        // TODO add your handling code here:
        Branch selectedBranch=institute.getBranchByName(listOfBranches.getSelectedValue());
        //here changes would be made like..only in case of adding the sujects to the branch selected
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddingInfoToBranches(selectedBranch,aui).setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_listOfBranchesMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddingBranchesAndTeachers_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddingBranchesAndTeachers_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddingBranchesAndTeachers_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddingBranchesAndTeachers_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }
    AddingBranchesAndTeachers_UI aui;
    DefaultListModel<String> dm1,dm2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBranch;
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnRemoveBranch;
    private javax.swing.JButton btnRemoveTeacher;
    private javax.swing.JButton btnUpdateBranch;
    private javax.swing.JButton btnUpdateTeacher;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblInstituteName;
    private javax.swing.JList<String> listOfBranches;
    private javax.swing.JList<String> listOfTeachers;
    // End of variables declaration//GEN-END:variables
}
