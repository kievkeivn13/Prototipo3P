/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brayan Cifuentes
 */
public class Notas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Empleados
     */
    String BD = "jdbc:mysql://localhost/siu";
    String Usuario = "root";
    String Clave = "Cagada1234";

    public Notas() {
        initComponents();
        //cbx_carrera();
        //cbx_sede();
        //cbx_jornada();
        //consulta_cursos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_codigoalumno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nota = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl_estatus = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_notas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl_incremento = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        cbx_sede = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbx_carrera = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbx_jornada = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txt_codigomaestro = new javax.swing.JTextField();
        cbx_tiponota = new javax.swing.JComboBox<>();
        cbx_curso = new javax.swing.JComboBox<>();
        lbl_sede = new javax.swing.JLabel();
        lbl_carrera = new javax.swing.JLabel();
        lbl_jornada = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_curso = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblSolvencia = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoMDI.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Notas");
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Codigo Curso:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 279, -1, -1));

        txt_codigoalumno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_codigoalumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_codigoalumnoMouseClicked(evt);
            }
        });
        txt_codigoalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoalumnoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_codigoalumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 246, 113, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tipo Nota: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nota (pts) : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        txt_nota.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_notaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 111, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 20, 50, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ingrese el Carnet alumno: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txt_buscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 106, 31));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busquedap.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 50, 40));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardarp.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 20, 50, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 20, 50, 40));

        lbl_estatus.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jPanel1.add(lbl_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 138, 240, 29));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jButton5.setBackground(new java.awt.Color(141, 141, 208));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busquedap.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 322, 55, 40));

        Tbl_notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Nota", "Codigo Maestro", "Codigo Carrera", "Codigo Sede", "Codigo Jornada", "Carnet Alumno", "Codigo Curso", "Tipo Nota", "Nota"
            }
        ));
        Tbl_notas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_notasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_notas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 97, 805, 98));

        jLabel1.setText("Buscar Curso");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1215, 604, -1, -1));
        getContentPane().add(lbl_incremento, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 54, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Carnet Alumno:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 247, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("                        Para modificar:\n1. Debe buscar el carnet del alumno\n2. Luego seleccionar la fila de la tabla \n3. Modificar los campos necesarios\n4. Darle click al boton Modificar (Icono del \n    Lápiz).");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 294, 350, 130));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Codigo Carrera:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 137, -1, -1));

        cbx_sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_sedeActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_sede, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 171, 111, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Codigo Sede:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 177, -1, -1));

        cbx_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_carreraActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 133, 111, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Codigo Jornada:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 210, -1, -1));

        cbx_jornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_jornadaActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_jornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 208, 112, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Codigo Maestro:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 100, -1, -1));

        txt_codigomaestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_codigomaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigomaestroActionPerformed(evt);
            }
        });
        getContentPane().add(txt_codigomaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 99, 113, -1));

        cbx_tiponota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo Nota", "Primer Parcial", "Segundo Parcial", "Final", "Actividades", "Extraordinario", "Recuperacion" }));
        getContentPane().add(cbx_tiponota, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 113, -1));

        cbx_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_cursoActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 277, 113, -1));

        lbl_sede.setText("Codigo");
        getContentPane().add(lbl_sede, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 175, -1, -1));

        lbl_carrera.setText("Codigo");
        getContentPane().add(lbl_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 133, -1, -1));

        lbl_jornada.setText("Codigo");
        getContentPane().add(lbl_jornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 211, -1, -1));

        lbl_nombre.setText("Nombre");
        getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 246, 100, -1));

        lbl_curso.setText("Nombre");
        getContentPane().add(lbl_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Ingreso de Notas");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 30, -1, -1));

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 97, -1, -1));

        jButton7.setText("Verificar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jButton8.setText("Listar Datos");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 211, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Solvencia:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 100, -1));
        getContentPane().add(lblSolvencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 80, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void Tabla() {
        try {

       Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);

            PreparedStatement ps = cn.prepareStatement("select * from notas");
            PreparedStatement ps2 = cn.prepareStatement("select * from notas");
            //pstt4.setString(1, txt_buscar.getText().trim());

            ResultSet rs = ps.executeQuery();

            ResultSet rss = ps2.executeQuery();

            if (rs.next()) {

                DefaultTableModel modelo = new DefaultTableModel();

                modelo.addColumn("codigo_notas");
                modelo.addColumn("codigo_maestro");
                modelo.addColumn("codigo_carrera");
                modelo.addColumn("codigo_sede");
                modelo.addColumn("codigo_jornada");
                modelo.addColumn("carnet_alumno");
                modelo.addColumn("codigo_curso");
                modelo.addColumn("tipo_nota");
                modelo.addColumn("nota");

                Tbl_notas.setModel(modelo);
                String[] dato = new String[9];

                while (rss.next()) {
                    dato[0] = rss.getString(1);
                    dato[1] = rss.getString(2);
                    dato[2] = rss.getString(3);
                    dato[3] = rss.getString(4);
                    dato[4] = rss.getString(5);
                    dato[5] = rss.getString(6);
                    dato[6] = rss.getString(7);
                    dato[7] = rss.getString(8);
                    dato[8] = rss.getString(9);

                    modelo.addRow(dato);
                }
            }

        } catch (Exception e) {

        }
    }
    
    public void cbx_carrera() {
        //Codigo que permite consultar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_carrera from asignacioncursosmastros where codigo_maestro=?");
            pst.setString(1, txt_codigomaestro.getText().trim());

            ResultSet rs = pst.executeQuery();

            //llenar combobox para el comentaario
            cbx_carrera.addItem("Codigo carrera");

            while (rs.next()) {
                cbx_carrera.addItem(rs.getString("codigo_carrera"));
            }

            rs.close();

        } catch (Exception e) {

        }
    }
    public void cbx_sede() {
        //Codigo que permite consultar registros en la base de datos
        try {
           Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select nombre_sede from sedes");

            ResultSet rs = pst.executeQuery();

            //llenar combobox para el comentaario
            cbx_sede.addItem("Sede");

            while (rs.next()) {
                cbx_sede.addItem(rs.getString("nombre_sede"));
            }

            rs.close();

        } catch (Exception e) {

        }
    }
    public void cbx_jornada() {
        //Codigo que permite consultar registros en la base de datos
        try {
         Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select nombre_jornada from jornadas");

            ResultSet rs = pst.executeQuery();

            //llenar combobox para el comentaario
            cbx_jornada.addItem("Jornada");

            while (rs.next()) {
                cbx_jornada.addItem(rs.getString("nombre_jornada"));
            }

            rs.close();

        } catch (Exception e) {

        }
    }
    
     public void consulta_cursos() {
        //Codigo que permite consultar registros en la base de datos
        try {
          Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_curso from asignacioncursosmastros where codigo_maestro=?");
           
            pst.setString(1, txt_codigomaestro.getText().trim());

            ResultSet rs = pst.executeQuery();

            //llenar combobox para el comentaario
            cbx_curso.addItem("Codigo Curso");

            while (rs.next()) {
                cbx_curso.addItem(rs.getString("codigo_curso"));
            }

            rs.close();

        } catch (Exception e) {

        }
    }
    private void txt_codigoalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoalumnoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_codigoalumnoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {

            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);

            PreparedStatement pstt4 = cn.prepareStatement("select * from notas where carnet_alumno=?");
            pstt4.setString(1, txt_buscar.getText().trim());

            ResultSet rss4 = pstt4.executeQuery();

            // hacer la copia del query para que la tabla empiece desde 1
            PreparedStatement ps = cn.prepareStatement("select * from notas where carnet_alumno=?");
            ps.setString(1, txt_buscar.getText().trim());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                DefaultTableModel modelo = new DefaultTableModel();

                modelo.addColumn("codigo_notas");
                modelo.addColumn("carnet_alumno");
                modelo.addColumn("codigo_curso");
                modelo.addColumn("nombre_curso");
                modelo.addColumn("tipo_nota");
                modelo.addColumn("nota");

                Tbl_notas.setModel(modelo);

                String[] dato = new String[6];

                while (rss4.next()) {
                    dato[0] = rss4.getString(1);
                    dato[1] = rss4.getString(2);
                    dato[2] = rss4.getString(3);
                    dato[3] = rss4.getString(4);
                    dato[4] = rss4.getString(5);
                    dato[5] = rss4.getString(6);

                    modelo.addRow(dato);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no Registrado");
            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Codigo que permite insertar registros en al base de datos
       
      try {

            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("insert into notas values(?,?,?,?,?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txt_codigomaestro.getText().trim());
            pst.setString(3, lbl_carrera.getText().trim());
            pst.setString(4, lbl_sede.getText().trim());
            pst.setString(5, lbl_jornada.getText().trim());
            pst.setString(6, txt_codigoalumno.getText().trim());
            pst.setString(7, cbx_curso.getSelectedItem().toString());
            pst.setString(8, cbx_tiponota.getSelectedItem().toString());
            pst.setString(9, txt_nota.getText().trim());


            pst.executeUpdate();

            lbl_incremento.setText("");
            txt_codigomaestro.setText("");
            lbl_carrera.setText("Codigo");
            lbl_sede.setText("Codigo");
            lbl_jornada.setText("Codigo");
            txt_codigoalumno.setText("");
            cbx_carrera.setSelectedIndex(0);
            cbx_sede.setSelectedIndex(0);
            cbx_jornada.setSelectedIndex(0);
            cbx_curso.setSelectedIndex(0);
            cbx_tiponota.setSelectedIndex(0);
            txt_nota.setText("");
            

            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en registro", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//Codigo que permite modificar registros en la base de datos
        /*try {
            String ID = lbl_incremento.getText().trim();

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("update notas set codigo_notas=?, carnet_alumno= ?, codigo_curso=?, nombre_curso=?, tipo_nota=?, nota=? where codigo_notas = " + ID);

            pst.setString(1, lbl_incremento.getText().trim());
            pst.setString(2, txt_codigoalumno.getText().trim());
            pst.setString(3, txt_codigocurso.getText().trim());
            pst.setString(4, txt_nombrecurso.getText().trim());

            pst.setString(5, txt_tiponota.getText().trim());
            pst.setString(6, txt_nota.getText().trim());

            pst.executeUpdate();

            lbl_incremento.setText("");
            txt_codigoalumno.setText("");
            txt_codigocurso.setText("");
            txt_nombrecurso.setText("");
            txt_tiponota.setText("");
            txt_nota.setText("");
            txt_buscar.setText("");

            JOptionPane.showMessageDialog(this, "¡MODIFICACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            //Tabla();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Error en modificación", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }*/

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//Codigo que permite borrar registros en la base de datos
        /*try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("delete from notas where codigo_notas = ?");

            pst.setString(1, lbl_incremento.getText().trim());
            pst.executeUpdate();

            lbl_incremento.setText("");
            txt_codigoalumno.setText("");
            txt_codigocurso.setText("");
            txt_nombrecurso.setText("");
            txt_tiponota.setText("");
            txt_nota.setText("");
            txt_buscar.setText("");

            JOptionPane.showMessageDialog(this, "¡ELIMINACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en eliminación", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_notaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// buscar curso
/*
        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("select * from cursos where codigo_curso = ?");
            pst.setString(1, txt_codigocurso.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_nombrecurso.setText(rs.getString("nombre_curso"));

            } else {
                JOptionPane.showMessageDialog(null, "Curso no registrado.");
            }

        } catch (Exception e) {

        }*/
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Tbl_notasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_notasMouseClicked
        //para seleccionar el dato y mostrarlo en los txt
        /*int seleccionar = Tbl_notas.rowAtPoint(evt.getPoint());
        lbl_incremento.setText(String.valueOf(Tbl_notas.getValueAt(seleccionar, 0)));
        txt_codigoalumno.setText(String.valueOf(Tbl_notas.getValueAt(seleccionar, 1)));
        txt_codigocurso.setText(String.valueOf(Tbl_notas.getValueAt(seleccionar, 2)));
        txt_nombrecurso.setText(String.valueOf(Tbl_notas.getValueAt(seleccionar, 3)));
        txt_tiponota.setText(String.valueOf(Tbl_notas.getValueAt(seleccionar, 4)));
        txt_nota.setText(String.valueOf(Tbl_notas.getValueAt(seleccionar, 5)));*/

    }//GEN-LAST:event_Tbl_notasMouseClicked

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void txt_codigomaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigomaestroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigomaestroActionPerformed

    private void cbx_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_carreraActionPerformed
        // TODO add your handling code here:
        cbx_carrera.removeAllItems();
        cbx_carrera();
        
        
    }//GEN-LAST:event_cbx_carreraActionPerformed

    private void cbx_sedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_sedeActionPerformed
        // TODO add your handling code here:
         try {
          Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_sede from sedes where nombre_sede=?");
            pst.setString(1, cbx_sede.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            //llenar combobox para el comentaario
            //cbx_facultad.addItem("Facultad");
            if (rs.next()) {
                lbl_sede.setText(rs.getString("codigo_sede"));
            }

            //rs.close();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_cbx_sedeActionPerformed

    private void cbx_jornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_jornadaActionPerformed
        // TODO add your handling code here:
        try {
         Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_jornada from jornadas where nombre_jornada=?");
            pst.setString(1, cbx_jornada.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            //llenar combobox para el comentaario
            //cbx_facultad.addItem("Facultad");
            if (rs.next()) {
                lbl_jornada.setText(rs.getString("codigo_jornada"));
            }

            //rs.close();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_cbx_jornadaActionPerformed

    private void txt_codigoalumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_codigoalumnoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoalumnoMouseClicked

    private void cbx_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_cursoActionPerformed
        // TODO add your handling code here:
        try {
        Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select nombre_curso from cursos where codigo_curso=?");
            pst.setString(1, cbx_curso.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            //llenar combobox para el comentaario
            //cbx_facultad.addItem("Facultad");
            if (rs.next()) {
                lbl_curso.setText(rs.getString("nombre_curso"));
            }

            //rs.close();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_cbx_cursoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        cbx_curso.removeAllItems();
        consulta_cursos();
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {
Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from alumnos where carnet_alumno=?");
            pst.setString(1, txt_codigoalumno.getText().trim());

            ResultSet rs = pst.executeQuery();

            //llenar combobox para el comentaario
            //cbx_facultad.addItem("Facultad");
            if (rs.next()) {
                lblSolvencia.setText(rs.getString("solvencia"));
                JOptionPane.showMessageDialog(null, "Verificado con Exito");
            }else
            {
                JOptionPane.showMessageDialog(null, "Carnet Alumno no valido");
            }

            //rs.close();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Tabla();
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tbl_notas;
    private javax.swing.JComboBox<String> cbx_carrera;
    private javax.swing.JComboBox<String> cbx_curso;
    private javax.swing.JComboBox<String> cbx_jornada;
    private javax.swing.JComboBox<String> cbx_sede;
    private javax.swing.JComboBox<String> cbx_tiponota;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblSolvencia;
    private javax.swing.JLabel lbl_carrera;
    private javax.swing.JLabel lbl_curso;
    private javax.swing.JLabel lbl_estatus;
    private javax.swing.JLabel lbl_incremento;
    private javax.swing.JLabel lbl_jornada;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_sede;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigoalumno;
    private javax.swing.JTextField txt_codigomaestro;
    private javax.swing.JTextField txt_nota;
    // End of variables declaration//GEN-END:variables
}
