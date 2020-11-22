/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Telas;


import Controller.Aluno;
import Controller.Perfil;
import Controller.Produtos;
import Model.AlunoDAO;
import Model.PerfilDAO;
import Model.ProdutoDAO;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruan Fagundes
 */
public class Turma extends javax.swing.JFrame {

    /**
     * Creates new form Turma
     */
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Turma() {
        initComponents();
    }

    /*-------------------------------------------
     *              MEUS METODOS 
     *------------------------------------------*/
    
    //INICIANTE
    public void attTableI(){
        AlunoDAO aDAO = new AlunoDAO();
        PerfilDAO p = new PerfilDAO();
        try{
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            int quant = jTable1.getRowCount();            
            for (int i=0;i<quant;i++){
                dtm.removeRow(0);
            }
            if (aDAO.buscarAluno()!= null){
                for(Aluno lista : aDAO.buscarAluno()){ 
                    Perfil li = p.buscarPerfil(lista.getId());
                    if(li.getNivel().equals("Iniciante")){
                        dtm.addRow(new Object[]{li.getId(),lista.getAluno(),lista.getCpf(),lista.getTelefone(),lista.getDatanascimento(), lista.getEndereco(),lista.getEmail(),lista.getStatusMensalidade(),lista.getStatusMatricula(),lista.getStatusCompra()});
                    }
                }
            }              
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //BASICO
    public void attTableB(){
        AlunoDAO aDAO = new AlunoDAO();
        PerfilDAO p = new PerfilDAO();
        try{
            DefaultTableModel dtm = (DefaultTableModel) jTable8.getModel();
            int quant = jTable8.getRowCount();            
            for (int i=0;i<quant;i++){
                dtm.removeRow(0);
            }
            if (aDAO.buscarAluno()!= null){
                for(Aluno lista : aDAO.buscarAluno()){ 
                    Perfil li = p.buscarPerfil(lista.getId());
                    if(li.getNivel().equals("Basico")){
                        dtm.addRow(new Object[]{li.getId(),lista.getAluno(),lista.getCpf(),lista.getTelefone(),lista.getDatanascimento(), lista.getEndereco(),lista.getEmail(),lista.getStatusMensalidade(),lista.getStatusMatricula(),lista.getStatusCompra()});
                    }
                }
            }              
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //INTERMEDIARIO
    public void attTableIT(){
        AlunoDAO aDAO = new AlunoDAO();
        PerfilDAO p = new PerfilDAO();
        try{
            DefaultTableModel dtm = (DefaultTableModel) jTable9.getModel();
            int quant = jTable9.getRowCount();            
            for (int i=0;i<quant;i++){
                dtm.removeRow(0);
            }
            if (aDAO.buscarAluno()!= null){
                for(Aluno lista : aDAO.buscarAluno()){ 
                    Perfil li = p.buscarPerfil(lista.getId());
                    if(li.getNivel().equals("Intermediario")){
                        dtm.addRow(new Object[]{li.getId(),lista.getAluno(),lista.getCpf(),lista.getTelefone(),lista.getDatanascimento(), lista.getEndereco(),lista.getEmail(),lista.getStatusMensalidade(),lista.getStatusMatricula(),lista.getStatusCompra()});
                    }
                }
            }              
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //AVANÇADO
    public void attTableA(){
        AlunoDAO aDAO = new AlunoDAO();
        PerfilDAO p = new PerfilDAO();
        try{
            DefaultTableModel dtm = (DefaultTableModel) jTable10.getModel();
            int quant = jTable10.getRowCount();            
            for (int i=0;i<quant;i++){
                dtm.removeRow(0);
            }
            if (aDAO.buscarAluno()!= null){
                for(Aluno lista : aDAO.buscarAluno()){ 
                    Perfil li = p.buscarPerfil(lista.getId());
                    if(li.getNivel().equals("Avançado")){
                        dtm.addRow(new Object[]{li.getId(),lista.getAluno(),lista.getCpf(),lista.getTelefone(),lista.getDatanascimento(), lista.getEndereco(),lista.getEmail(),lista.getStatusMensalidade(),lista.getStatusMatricula(),lista.getStatusCompra()});
                    }
                }
            }              
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //EXPERIENTE
    public void attTableE(){
        AlunoDAO aDAO = new AlunoDAO();
        PerfilDAO p = new PerfilDAO();
        try{
            DefaultTableModel dtm = (DefaultTableModel) jTable11.getModel();
            int quant = jTable11.getRowCount();            
            for (int i=0;i<quant;i++){
                dtm.removeRow(0);
            }
            if (aDAO.buscarAluno()!= null){
                for(Aluno lista : aDAO.buscarAluno()){ 
                    Perfil li = p.buscarPerfil(lista.getId());
                    if(li.getNivel().equals("Experiente")){
                        dtm.addRow(new Object[]{li.getId(),lista.getAluno(),lista.getCpf(),lista.getTelefone(),lista.getDatanascimento(), lista.getEndereco(),lista.getEmail(),lista.getStatusMensalidade(),lista.getStatusMatricula(),lista.getStatusCompra()});
                    }
                }
            }              
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //FLUENTE
    public void attTableF(){
        AlunoDAO aDAO = new AlunoDAO();
        PerfilDAO p = new PerfilDAO();
        try{
            DefaultTableModel dtm = (DefaultTableModel) jTable12.getModel();
            int quant = jTable12.getRowCount();            
            for (int i=0;i<quant;i++){
                dtm.removeRow(0);
            }
            if (aDAO.buscarAluno()!= null){
                for(Aluno lista : aDAO.buscarAluno()){ 
                    Perfil li = p.buscarPerfil(lista.getId());
                    if(li.getNivel().equals("Fluente")){
                        dtm.addRow(new Object[]{li.getId(),lista.getAluno(),lista.getCpf(),lista.getTelefone(),lista.getDatanascimento(), lista.getEndereco(),lista.getEmail(),lista.getStatusMensalidade(),lista.getStatusMatricula(),lista.getStatusCompra()});
                    }
                }
            }              
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
     //BOLETIM
    public void attTableBoletim(){
        AlunoDAO aDAO = new AlunoDAO();
        PerfilDAO p = new PerfilDAO();
        try{
            DefaultTableModel dtm = (DefaultTableModel) jTable7.getModel();
            int quant = jTable7.getRowCount();            
            for (int i=0;i<quant;i++){
                dtm.removeRow(0);
            }
            if (aDAO.buscarAluno()!= null){
                for(Aluno lista : aDAO.buscarAluno()){ 
                    Perfil li = p.buscarPerfil(lista.getId());
                    dtm.addRow(new Object[]{li.getId(),lista.getAluno(),li.getNivel(),li.getNotaFinal(),li.difinirSituacao()});
                }
            }              
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
     /*-------------------------------------------
     *     FIM -- FIM DOS MEUS METODOS -- FIM
     *------------------------------------------*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField16 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(10, 10));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("© All rights reserved 2019");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Desevolvedores : Pedro Neto e Ruan Rita  ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(214, 217, 223));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(214, 217, 223));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jButton14.setBackground(new java.awt.Color(51, 51, 51));
        jButton14.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Home");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton14MouseExited(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);

        jButton15.setBackground(new java.awt.Color(51, 51, 51));
        jButton15.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Funcionário");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton15MouseExited(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);

        jButton16.setBackground(new java.awt.Color(51, 51, 51));
        jButton16.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Produto");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton16MouseExited(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);

        jButton17.setBackground(new java.awt.Color(51, 51, 51));
        jButton17.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Equipamento");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton17MouseExited(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17);

        jButton18.setBackground(new java.awt.Color(0, 153, 153));
        jButton18.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(51, 51, 51));
        jButton18.setText("TURMA");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton18MouseExited(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);

        jButton19.setBackground(new java.awt.Color(51, 51, 51));
        jButton19.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Venda");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton19MouseExited(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19);

        jButton20.setBackground(new java.awt.Color(51, 51, 51));
        jButton20.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Relatório");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton20MouseExited(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20);

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Desconectar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jTable1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RA", "Aluno", "CPF", "Telefone", "Data Nascimento", "Endereço", "Email", "Status Mensalidade", "Status Matricula", "Status Compra"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Iniciante", jPanel1);

        jTable8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RA", "Aluno", "CPF", "Telefone", "Data Nascimento", "Endereço", "Email", "Status Mensalidade", "Status Matricula", "Status Compra"
            }
        ));
        jTable8.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(jTable8);
        jTable8.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Basico", jPanel9);

        jTable9.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RA", "Aluno", "CPF", "Telefone", "Data Nascimento", "Endereço", "Email", "Status Mensalidade", "Status Matricula", "Status Compra"
            }
        ));
        jTable9.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(jTable9);
        jTable9.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Intermediario", jPanel10);

        jTable10.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RA", "Aluno", "CPF", "Telefone", "Data Nascimento", "Endereço", "Email", "Status Mensalidade", "Status Matricula", "Status Compra"
            }
        ));
        jTable10.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(jTable10);
        jTable10.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Avançado", jPanel11);

        jTable11.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RA", "Aluno", "CPF", "Telefone", "Data Nascimento", "Endereço", "Email", "Status Mensalidade", "Status Matricula", "Status Compra"
            }
        ));
        jTable11.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(jTable11);
        jTable11.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Experiente", jPanel12);

        jTable12.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RA", "Aluno", "CPF", "Telefone", "Data Nascimento", "Endereço", "Email", "Status Mensalidade", "Status Matricula", "Status Compra"
            }
        ));
        jTable12.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(jTable12);
        jTable12.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Fluente", jPanel13);

        jTabbedPane1.addTab("Turmas", jTabbedPane2);

        jTabbedPane3.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N

        jPanel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel14.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 400, 32));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Aluno :");
        jPanel14.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 400, 32));

        jTextField3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel14.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 400, 32));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Data de Nascimento :");
        jPanel14.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 400, 32));

        jTextField4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel14.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 400, 32));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("CPF :");
        jPanel14.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 400, 32));

        jTextField5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel14.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 400, 32));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("E-Mail :");
        jPanel14.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 400, 32));

        jTextField6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel14.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 400, 32));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Endereço :");
        jPanel14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 400, 32));

        jTextField7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel14.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 400, 32));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Telefone");
        jPanel14.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 400, 32));

        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Finalizar Matrícula");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 400, 40));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel14.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 440, 400));

        jRadioButton3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton3.setText("Não Realizou Pagamento");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel14.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 330, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton4.setText("Realizou Pagamento");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel14.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Nota Proeficiência");
        jPanel14.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 400, 32));

        jTextField8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel14.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 400, 32));

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel14.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 450, 400));

        jTabbedPane3.addTab("", jPanel14);

        jTabbedPane1.addTab("Matrícula", jTabbedPane3);

        jTabbedPane4.setFont(new java.awt.Font("Comic Sans MS", 0, 1)); // NOI18N

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel19.setText("Registro do Aluno (RA) :");
        jPanel15.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 300, 32));
        jPanel15.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 300, 32));

        jTextField12.setEditable(false);
        jTextField12.setForeground(new java.awt.Color(51, 51, 51));
        jPanel15.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 430, 32));

        jLabel16.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel16.setText("Situação :");
        jPanel15.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 430, 32));

        jTextField13.setEditable(false);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel15.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 430, 32));

        jLabel18.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel18.setText("Nível Atual :");
        jPanel15.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 430, 32));

        jButton2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 100, 32));

        jTextField14.setEditable(false);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel15.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 430, 32));

        jLabel20.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel20.setText("Próximo Nível  :");
        jPanel15.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 430, 32));

        jTextField15.setEditable(false);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel15.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 430, 32));

        jLabel21.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel21.setText("Data de Hoje (dd/MM/yyyy):");
        jPanel15.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 430, 32));

        jButton3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Confirmar");
        jPanel15.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 430, 40));

        jTextField16.setSelectionStart(1);
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel15.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 430, 32));

        jLabel22.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel22.setText("Valor do Nível :");
        jPanel15.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 430, 32));

        jLabel23.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel23.setText("Forma de Pagamento");
        jPanel15.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 430, 32));

        jTextField17.setEditable(false);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel15.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 430, 32));

        jLabel24.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 500, 90));

        jLabel25.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 500, 370));

        jLabel15.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 500, 370));

        jTabbedPane4.addTab("", jPanel15);

        jTabbedPane1.addTab("Re-Matrícula", jTabbedPane4);

        jTabbedPane5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N

        jPanel16.setLayout(new javax.swing.BoxLayout(jPanel16, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTable7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTable7.setForeground(new java.awt.Color(51, 51, 51));
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RA", "Alunos", "Nível", "Nota", "Conselho"
            }
        ));
        jTable7.setRowHeight(20);
        jScrollPane7.setViewportView(jTable7);

        jPanel16.add(jScrollPane7);

        jTabbedPane5.addTab("", jPanel16);

        jTabbedPane1.addTab("Boletim", jTabbedPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 658, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 659, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 348, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 348, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseEntered
        // TODO add your handling code here:
        jButton14.setForeground(new java.awt.Color(0, 205, 251));
        jButton14.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16));
    }//GEN-LAST:event_jButton14MouseEntered

    private void jButton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseExited
        // TODO add your handling code here:
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14));
    }//GEN-LAST:event_jButton14MouseExited

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuPrincipal MP = new MenuPrincipal();
        MP.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseEntered
        // TODO add your handling code here:
        jButton15.setForeground(new java.awt.Color(0, 205, 251));
        jButton15.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16));
    }//GEN-LAST:event_jButton15MouseEntered

    private void jButton15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseExited
        // TODO 2add your handling code here:
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14));
    }//GEN-LAST:event_jButton15MouseExited

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        this.setVisible(false);
        FuncionarioTela PE = new FuncionarioTela();
        PE.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseEntered
        // TODO add your handling code here:
        jButton16.setForeground(new java.awt.Color(0, 205, 251));
        jButton16.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16));
    }//GEN-LAST:event_jButton16MouseEntered

    private void jButton16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseExited
        // TODO add your handling code here:
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14));
    }//GEN-LAST:event_jButton16MouseExited

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        ProdutosTela PM = new ProdutosTela();
        PM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseEntered
        // TODO add your handling code here:
        jButton17.setForeground(new java.awt.Color(0, 205, 251));
        jButton17.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16));
    }//GEN-LAST:event_jButton17MouseEntered

    private void jButton17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseExited
        // TODO add your handling code here:
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14));
    }//GEN-LAST:event_jButton17MouseExited

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        EquipamentosTela EP = new EquipamentosTela();
        EP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseEntered
       
    }//GEN-LAST:event_jButton18MouseEntered

    private void jButton18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseExited
        
    }//GEN-LAST:event_jButton18MouseExited

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        Turma t = new Turma();
        this.setVisible(false);
        t.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseEntered
        // TODO add your handling code here:
        jButton19.setForeground(new java.awt.Color(0, 205, 251));
        jButton19.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16));
    }//GEN-LAST:event_jButton19MouseEntered

    private void jButton19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseExited
        // TODO add your handling code here:
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14));
    }//GEN-LAST:event_jButton19MouseExited

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:

        VendaTelas rv = new VendaTelas();
        rv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseEntered
        // TODO add your handling code here:
        jButton20.setForeground(new java.awt.Color(0, 205, 251));
        jButton20.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16));
    }//GEN-LAST:event_jButton20MouseEntered

    private void jButton20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseExited
        // TODO add your handling code here:
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14));
    }//GEN-LAST:event_jButton20MouseExited

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        RelatorioTelas R = new RelatorioTelas();
        R.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        attTableI();
        attTableB();
        attTableIT();
        attTableA();
        attTableE();
        attTableF();
        attTableBoletim();
        
       
        
    }//GEN-LAST:event_formWindowOpened

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /* STATUS DE MENSADLIDADE: INATIVO , OK , EM DÍVIDA
         * STATUS DE MATRICULA : INATIVO , ATIVO 
         * STATUS DE COMPRA: INATIVO, EM DÍVIDA , OK 333.333.333.01
         * Esses dados começa
         */
        String mensalidade = "";
        AlunoDAO alunodao = new AlunoDAO();
        if(jRadioButton4.getSelectedObjects()!=null){
            mensalidade = "OK";
        }else if(jRadioButton3.getSelectedObjects()!=null){
            mensalidade = "Em Dívida";
        }
        try{
            alunodao.CadastarAluno(new Aluno(0, jTextField1.getText(), jTextField4.getText(), jTextField7.getText(), new java.sql.Date(sdf.parse(jTextField3.getText()).getTime()), jTextField6.getText(), jTextField5.getText(), mensalidade, "Matriculado", "Inativo",Double.parseDouble(jTextField8.getText())));
        }catch(ParseException e){
            e.printStackTrace();
        }catch(Exception ee){
            ee.printStackTrace();
        }
        attTableI();
        attTableB();
        attTableIT();
        attTableA();
        attTableE();
        attTableF();

        
        
       
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        jRadioButton3.setSelected(false);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        jRadioButton4.setSelected(false);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PerfilDAO pdao = new PerfilDAO();     
        Date data = new java.util.Date();
        ProdutoDAO p = new ProdutoDAO();
        
        Perfil lista =  pdao.buscarPerfil(Integer.parseInt(jTextField11.getText()));
        jTextField13.setText(lista.getNivel());
        jTextField12.setText(lista.difinirSituacao());
        jTextField14.setText(lista.proximoNivel());
        jTextField17.setText("À Vista");
        jTextField15.setText(sdf.format(data));
        for(Produtos a : p.buscarProdutoPorNome(lista.proximoNivel())){
            jTextField16.setText("R$ "+String.format("%.2f",a.getPreco()));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
