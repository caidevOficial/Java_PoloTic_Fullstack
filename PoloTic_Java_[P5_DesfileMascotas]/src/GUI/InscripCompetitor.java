/*
* Copyright (C) 2020 FacuFalcone - CaidevOficial
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package GUI;

import java.util.Iterator;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import logic.LogicController;
import logic.classes.Competitor;
import persistence.Competitor.CompetitorJpaController;

/**
 *
 * @author FacuFalcone - CaidevOficial
 */
public class InscripCompetitor extends javax.swing.JFrame {

    LogicController LC = new LogicController();
    registerPet RP = new registerPet();
    /**
     * Creates new form InscripParticipant
     */
    public InscripCompetitor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Data = new javax.swing.JPanel();
        jPanel_InscripParticipante = new javax.swing.JPanel();
        jButton_registrationDone = new javax.swing.JButton();
        jPanel_Salir = new javax.swing.JPanel();
        jButton_logOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_city = new javax.swing.JTextField();
        jTextField_name = new javax.swing.JTextField();
        jTextField_age = new javax.swing.JTextField();
        jTextField_surname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Data.setBackground(new java.awt.Color(51, 51, 51));

        jPanel_InscripParticipante.setBackground(new java.awt.Color(51, 51, 51));

        jButton_registrationDone.setBackground(new java.awt.Color(75, 75, 75));
        jButton_registrationDone.setForeground(new java.awt.Color(51, 255, 51));
        jButton_registrationDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/images/persona_mascota.png"))); // NOI18N
        jButton_registrationDone.setText("Registration Done");
        jButton_registrationDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrationDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_InscripParticipanteLayout = new javax.swing.GroupLayout(jPanel_InscripParticipante);
        jPanel_InscripParticipante.setLayout(jPanel_InscripParticipanteLayout);
        jPanel_InscripParticipanteLayout.setHorizontalGroup(
            jPanel_InscripParticipanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_InscripParticipanteLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jButton_registrationDone)
                .addContainerGap())
        );
        jPanel_InscripParticipanteLayout.setVerticalGroup(
            jPanel_InscripParticipanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_InscripParticipanteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton_registrationDone, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel_Salir.setBackground(new java.awt.Color(51, 51, 51));

        jButton_logOut.setBackground(new java.awt.Color(75, 75, 75));
        jButton_logOut.setForeground(new java.awt.Color(51, 255, 51));
        jButton_logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/images/apagar.png"))); // NOI18N
        jButton_logOut.setText("Log Out");
        jButton_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_SalirLayout = new javax.swing.GroupLayout(jPanel_Salir);
        jPanel_Salir.setLayout(jPanel_SalirLayout);
        jPanel_SalirLayout.setHorizontalGroup(
            jPanel_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SalirLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton_logOut)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel_SalirLayout.setVerticalGroup(
            jPanel_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SalirLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("City:");

        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("Name: ");

        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setText("Surname:");

        jLabel4.setForeground(new java.awt.Color(51, 255, 51));
        jLabel4.setText("Age: ");

        jTextField_age.setActionCommand("");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 51));
        jLabel5.setText("Participant Registration");

        javax.swing.GroupLayout jPanel_DataLayout = new javax.swing.GroupLayout(jPanel_Data);
        jPanel_Data.setLayout(jPanel_DataLayout);
        jPanel_DataLayout.setHorizontalGroup(
            jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DataLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_DataLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_city, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_age, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_DataLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_InscripParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_DataLayout.setVerticalGroup(
            jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_InscripParticipante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void ErrorMessage(String tituloPane, String errorMsg) {
        //===================================================================
        JOptionPane alerta = new JOptionPane(errorMsg);
        alerta.setMessageType(JOptionPane.ERROR_MESSAGE);
        //por defecto tiene un solo boton y toma el idioma del sistema.
        JDialog dialogo = alerta.createDialog(tituloPane);
        dialogo.setVisible(true);
        dialogo.setAlwaysOnTop(true);
        //===================================================================
    }
    
    public static void SuccessMessage(String tituloPane, String successMsg) {
        // ===================================================================
        JOptionPane alerta = new JOptionPane(successMsg);
        alerta.setMessageType(JOptionPane.CLOSED_OPTION);
        // por defecto tiene un solo boton y toma el idioma del sistema.
        JDialog dialogo = alerta.createDialog(tituloPane);
        dialogo.setVisible(true);
        dialogo.setAlwaysOnTop(true);
        // ===================================================================
    }
    
    private void jButton_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logOutActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton_logOutActionPerformed

    // Make Registration
    private void jButton_registrationDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrationDoneActionPerformed
        Competitor parti = new Competitor();
        
        if(jTextField_age.getText().equals("") ||
            jTextField_city.getText().equals("") ||
            jTextField_name.getText().equals("") ||
            jTextField_surname.getText().equals("")){
            ErrorMessage("Campo Vacio", "Error, Hay al menos un campo vacio!");
        }else{
            parti.setName(jTextField_name.getText());
            parti.setSurname(jTextField_surname.getText());
            parti.setCity(jTextField_city.getText());
            parti.setAge(Integer.parseInt(jTextField_age.getText()));
            
            if(!LC.createCompetitor(parti)){
                ErrorMessage("Error LC", "Error, Fallo createCompetitor de Controladora Logica!");
            } else {
                SuccessMessage("Adicion Exitosa!", "Participante agregado con exito!");
                //Iterator<Competitor> combo = LC.showCompetitors().iterator();
                //TODO arreglar el combo box
                //RP.JCom removeAllItems();
                //while (combo.hasNext()) {
                    //RP.jC.addItem(combo.next());
                //}
            }
        }
    }//GEN-LAST:event_jButton_registrationDoneActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_logOut;
    private javax.swing.JButton jButton_registrationDone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel_Data;
    private javax.swing.JPanel jPanel_InscripParticipante;
    private javax.swing.JPanel jPanel_Salir;
    private javax.swing.JTextField jTextField_age;
    private javax.swing.JTextField jTextField_city;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_surname;
    // End of variables declaration//GEN-END:variables
}
