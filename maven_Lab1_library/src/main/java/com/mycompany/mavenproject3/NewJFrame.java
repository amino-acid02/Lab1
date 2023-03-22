package com.mycompany.mavenproject3;

import AllFictionBooks.DirectorFiction;
import AllFictionBooks.*;
import AllTextBooks.*;
import PeopleCreation.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class NewJFrame extends javax.swing.JFrame {

    //create lists of people, fabric and director
    ArrayList<People> allStudents = new ArrayList();
    ArrayList<People> allProfessors = new ArrayList();
    RealPeopleFactory factPeople = new RealPeopleFactory();
    DirectorFiction dir = new DirectorFiction();
   
    
    
    public NewJFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTree1ComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Введите количество преподавателей");

        jLabel2.setText("Введите количество студентов");

        jButton1.setText("сгенерировать людей и создать дерево");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Выйти");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addComponent(jButton1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTree1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTree1ComponentAdded

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    

     
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    boolean done = true;
    while(done)
    {
    try
    {    
        //take numbers of people
        int number_students = Integer.parseInt(jTextField1.getText());
        int number_proffs = Integer.parseInt(jTextField2.getText());
        
        if(number_students < 0 || number_proffs < 0)
        {
            JOptionPane.showMessageDialog(null,"Введите положительное число!","Ок",JOptionPane.INFORMATION_MESSAGE);
            break;
        }
        
        //create people, and they take books
        for(int i = 0; i<number_students; i++)
        {
            
            Student one_student = this.factPeople.createStudent();
            Random rand = new Random();
            int number_books = rand.nextInt(8) + 3;
            for(int k=0; k<number_books; k++)
            {
                int t = rand.nextInt(4);
                switch(t)
                {
                    case 0:
                    {
                        one_student.takeEngFiction();
                        break;
                    }
                    case 1:
                    {
                        one_student.takeRusFiction();
                        break;
                    }
                    case 2:
                    {
                        one_student.takeEngTextBook();
                        break;
                    }
                    case 3:
                    {
                        one_student.takeRusTextBook();
                        break;
                    }
                }
               
            }
            this.allStudents.add(one_student);
        }
        for(int i = 0; i<number_proffs; i++)
        {
            Professor one_professor = factPeople.createProfessor();
            Random rand = new Random();
            int number_books = rand.nextInt(8) + 3;
            for(int k=0; k<number_books; k++)
            {
                int t = rand.nextInt(4);
                switch(t)
                {
                    case 0:
                    {
                        one_professor.takeEngFiction();
                        break;
                    }
                    case 1:
                    {
                        one_professor.takeRusFiction();
                        break;
                    }
                    case 2:
                    {
                        one_professor.takeEngTextBook();
                        break;
                    }
                    case 3:
                    {
                        one_professor.takeRusTextBook();
                        break;
                    }
                }               
            }
            this.allProfessors.add(one_professor);
        }
        LoadInfo();
        done = false;
    }
    catch(NumberFormatException e)
    {
        JOptionPane.showMessageDialog(null,"Введите число!","Ок",JOptionPane.INFORMATION_MESSAGE);
        break;
    }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    //method of loading tree
    public void LoadInfo()
    {  
    DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
    DefaultMutableTreeNode people = new DefaultMutableTreeNode("Пользователи");
    DefaultMutableTreeNode proffPeople = new DefaultMutableTreeNode("Преподаватели");
    DefaultMutableTreeNode studPeople = new DefaultMutableTreeNode("Студенты");
    
    //load names of students   
    for(int i = 0; i < allStudents.size(); i++)
    {
        // get students and add his name to node
        People localStudent = allStudents.get(i);
        String totalName = localStudent.getName() + ' ' + localStudent.getSurName();
        DefaultMutableTreeNode localStudentNode = new DefaultMutableTreeNode(totalName);
        studPeople.add(localStudentNode );
        ArrayList<Books> localBooks = localStudent.GetBooks();
    
        // load books of exactly that students
        for (int j = 0; j < localBooks.size(); j++)
        {
        Books localBook = localBooks.get(j);
        String localBookTotalName = "";
        if(localBook instanceof RussianTextbook)
        {
            localBookTotalName = localBook.getType() + " по предмету " + localBook.getName();
        }
        if(localBook instanceof EnglishTextbook)
        {
            localBookTotalName = localBook.getName() + ", автор " + localBook.getAuthor() + ", университет " + localBook.getUniversity();
        }
        if(localBook instanceof AllFictionBooks)
        {
            localBookTotalName = localBook.getName() + ", автор " + localBook.getAuthor();
        }
        DefaultMutableTreeNode localBookNode = new DefaultMutableTreeNode(localBookTotalName);
        localStudentNode.add(localBookNode);
        }
    }
    
    // load names of  proffessor
    for(int i = 0; i < allProfessors.size(); i++)
    {
        // get proffessor and add his name to node
        People localProf = allProfessors.get(i);
        String totalName = localProf.getName() + ' ' + localProf.getSurName() + ' ' + localProf.getMiddleName();
        DefaultMutableTreeNode localProfNode = new DefaultMutableTreeNode(totalName);
        proffPeople.add(localProfNode );
        ArrayList<Books> localBooks = localProf.GetBooks();

        // load books of exact that proffessor
        for (int j = 0; j < localBooks.size(); j++)
        {
        Books localBook = localBooks.get(j);
        String localBookTotalName = "";
        if(localBook instanceof RussianTextbook)
        {
            localBookTotalName = localBook.getType() + " по предмету " + localBook.getName();
        }
        if(localBook instanceof EnglishTextbook)
        {
            localBookTotalName = localBook.getName() + ", автор " + localBook.getAuthor();
        }
        if(localBook instanceof AllFictionBooks)
        {
            localBookTotalName = localBook.getName() + ", автор " + localBook.getAuthor();
        }
        DefaultMutableTreeNode localBookNode = new DefaultMutableTreeNode(localBookTotalName);
        localProfNode.add(localBookNode);
        }
    }
    
    people.add(proffPeople);
    people.add(studPeople);
    
    model.setRoot(people);
    jTree1.setModel(model);
    
    allStudents.clear();
    allProfessors.clear();
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables














}
