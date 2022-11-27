package Ejercicio_ultima_entrega;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.*;

public class Interfaz extends javax.swing.JFrame {
    
    Conexion con1 = new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    
    public Interfaz() {
        initComponents();
        this.setTitle("Registro de usuarios");
        setLocationRelativeTo(null);
        buscar();
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        nombres = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        texto_cedula = new javax.swing.JTextField();
        texto_apellidos = new javax.swing.JTextField();
        texto_nombres = new javax.swing.JTextField();
        texto_telefono = new javax.swing.JTextField();
        texto_edad = new javax.swing.JTextField();
        boton_guardar = new javax.swing.JButton();
        boton_limpiar = new javax.swing.JButton();
        boton_buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        Fondo.setBackground(new java.awt.Color(204, 153, 255));
        Fondo.setForeground(new java.awt.Color(0, 0, 0));

        titulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Base de datos de usuarios");

        cedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cedula.setForeground(new java.awt.Color(0, 0, 0));
        cedula.setText("Cédula :");

        nombres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombres.setForeground(new java.awt.Color(0, 0, 0));
        nombres.setText("Nombres : ");

        apellidos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        apellidos.setForeground(new java.awt.Color(0, 0, 0));
        apellidos.setText("Apellidos : ");

        telefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        telefono.setForeground(new java.awt.Color(0, 0, 0));
        telefono.setText("Número de contacto :");

        edad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edad.setForeground(new java.awt.Color(0, 0, 0));
        edad.setText("Edad : ");

        texto_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_cedulaActionPerformed(evt);
            }
        });
        texto_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                texto_cedulaKeyTyped(evt);
            }
        });

        texto_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_apellidosActionPerformed(evt);
            }
        });
        texto_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                texto_apellidosKeyTyped(evt);
            }
        });

        texto_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_nombresActionPerformed(evt);
            }
        });
        texto_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                texto_nombresKeyTyped(evt);
            }
        });

        texto_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                texto_telefonoKeyTyped(evt);
            }
        });

        texto_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                texto_edadKeyTyped(evt);
            }
        });

        boton_guardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        boton_guardar.setText("Guardar");
        boton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_guardarActionPerformed(evt);
            }
        });

        boton_limpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        boton_limpiar.setText("Limpiar");
        boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarActionPerformed(evt);
            }
        });

        boton_buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        boton_buscar.setText("Buscar");
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Edad", "Teléfono"
            }
        ));
        jScrollPane2.setViewportView(Tabla);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(boton_guardar)
                .addGap(18, 18, 18)
                .addComponent(boton_limpiar)
                .addGap(18, 18, 18)
                .addComponent(boton_buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombres))
                .addGap(11, 11, 11)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_guardar)
                    .addComponent(boton_limpiar)
                    .addComponent(boton_buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(Fondo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void texto_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_apellidosActionPerformed

    private void texto_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_cedulaActionPerformed

    private void texto_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_nombresActionPerformed

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
        
        texto_nombres.setText("");
        texto_apellidos.setText("");
        texto_cedula.setText("");
        texto_edad.setText("");
        texto_telefono.setText("");        
    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void boton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_guardarActionPerformed
        String name, lastname,id, phone, age;
        
        name = texto_nombres.getText();
        lastname = texto_apellidos.getText();
        id = texto_cedula.getText();
        phone = texto_telefono.getText();
        age = texto_edad.getText();
        
        if (name.equals("") || lastname.equals("") || id.equals("") || phone.equals("") || age.equals("")){
        javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.","Error", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }    
    }//GEN-LAST:event_boton_guardarActionPerformed

    private void texto_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_cedulaKeyTyped
        char ced = evt.getKeyChar();
        if (ced < '0' || ced > '9'){
            evt.consume();        
        } 
    }//GEN-LAST:event_texto_cedulaKeyTyped

    private void texto_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_nombresKeyTyped
        char nombre = evt.getKeyChar();
        if ((nombre < 'a' || nombre > 'z') && (nombre < 'A' || nombre > 'Z') && (nombre < ' ' || nombre > ' ')){
            evt.consume();        
        } 
    }//GEN-LAST:event_texto_nombresKeyTyped

    private void texto_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_apellidosKeyTyped
        char apellido = evt.getKeyChar();
        if ((apellido < 'a' || apellido > 'z') && (apellido < 'A' || apellido > 'Z') && (apellido < ' ' || apellido > ' ')){
            evt.consume();        
        } 
    }//GEN-LAST:event_texto_apellidosKeyTyped

    private void texto_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_edadKeyTyped
        char edad = evt.getKeyChar();
        if (edad < '0' || edad > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_texto_edadKeyTyped

    private void texto_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_telefonoKeyTyped
        char tel = evt.getKeyChar();
        if (tel < '0' || tel > '9'){
            evt.consume();}
    }//GEN-LAST:event_texto_telefonoKeyTyped

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed
        
    }//GEN-LAST:event_boton_buscarActionPerformed

    public static void main(String args[]) {
              
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });           
    }
    
    void buscar(){
        String sql = "select * from usuarios";
        try {
            conet = con1.getConnection();
            st = (Statement) conet.createStatement();
            Object[] cliente =  new Object[5];
            modelo = (DefaultTableModel) Tabla.getModel();
            
            while(rs.next()){
                cliente[0] = rs.getString("Cédula");
                cliente[1] = rs.getString("Nombre");
                cliente[2] = rs.getString("Apellido");
                cliente[3] = rs.getString("Edad");
                cliente[4] = rs.getString("Teléfono");
                
                modelo.addRow(cliente);
            }
            Tabla.setModel(modelo);
            
            
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel apellidos;
    private javax.swing.JButton boton_buscar;
    private javax.swing.JButton boton_guardar;
    private javax.swing.JButton boton_limpiar;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel edad;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombres;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField texto_apellidos;
    private javax.swing.JTextField texto_cedula;
    private javax.swing.JTextField texto_edad;
    private javax.swing.JTextField texto_nombres;
    private javax.swing.JTextField texto_telefono;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
