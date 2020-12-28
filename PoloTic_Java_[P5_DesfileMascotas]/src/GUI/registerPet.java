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

import static GUI.InscripCompetitor.ErrorMessage;
import static GUI.InscripCompetitor.SuccessMessage;
import logic.LogicController;
import logic.classes.Pet;

/**
 *
 * @author FacuFalcone - CaidevOficial
 */
public class registerPet extends javax.swing.JFrame {

    LogicController LC = new LogicController();
    /**
     * Creates new form registerPet
     */
    public registerPet() {
        initComponents();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Data = new javax.swing.JPanel();
        jPanel_Salir = new javax.swing.JPanel();
        jButton_logOut = new javax.swing.JButton();
        jPanel_InscripParticipante = new javax.swing.JPanel();
        jButton_registrationDone = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Pet_race = new javax.swing.JTextField();
        jTextField_Pet_name = new javax.swing.JTextField();
        jTextField_Pet_age = new javax.swing.JTextField();
        jTextField_Pet_kind = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_owners = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project 5");

        jPanel_Data.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_Data.setForeground(new java.awt.Color(51, 51, 51));

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

        jPanel_InscripParticipante.setBackground(new java.awt.Color(51, 51, 51));

        jButton_registrationDone.setBackground(new java.awt.Color(75, 75, 75));
        jButton_registrationDone.setForeground(new java.awt.Color(51, 255, 51));
        jButton_registrationDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/images/mascota-amigable.png"))); // NOI18N
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
                .addComponent(jButton_registrationDone, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_SalirLayout = new javax.swing.GroupLayout(jPanel_Salir);
        jPanel_Salir.setLayout(jPanel_SalirLayout);
        jPanel_SalirLayout.setHorizontalGroup(
            jPanel_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SalirLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton_logOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jPanel_InscripParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_SalirLayout.setVerticalGroup(
            jPanel_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SalirLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_SalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel_InscripParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Race:");

        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Name: ");

        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Kind:");

        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("Age: ");

        jTextField_Pet_age.setActionCommand("");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("Pet Registration");

        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("Owner:");

        javax.swing.GroupLayout jPanel_DataLayout = new javax.swing.GroupLayout(jPanel_Data);
        jPanel_Data.setLayout(jPanel_DataLayout);
        jPanel_DataLayout.setHorizontalGroup(
            jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(90, 90, 90))
            .addGroup(jPanel_DataLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_DataLayout.createSequentialGroup()
                        .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Pet_name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Pet_kind, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_DataLayout.createSequentialGroup()
                        .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_Pet_race, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextField_Pet_age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jComboBox_owners, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_DataLayout.setVerticalGroup(
            jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Pet_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Pet_kind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Pet_race, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Pet_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox_owners, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButton_registrationDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrationDoneActionPerformed
        Pet thisPet = new Pet();

        if(jTextField_Pet_age.getText().equals("") ||
            jTextField_Pet_race.getText().equals("") ||
            jTextField_Pet_name.getText().equals("") ||
            jTextField_Pet_kind.getText().equals("") /*||
            jComboBox_owners.getSelectedIndex()!=-1*/){
            ErrorMessage("Campo Vacio", "Error, Hay al menos un campo vacio!");
        }else{
            thisPet.setName(jTextField_Pet_name.getText());
            thisPet.setKind(jTextField_Pet_kind.getText());
            thisPet.setRace(jTextField_Pet_race.getText());
            thisPet.setAge(Integer.parseInt(jTextField_Pet_age.getText()));
            //thisPet.setOwner(jComboBox_owners.getSelectedItem());

            if(!LC.createPet(thisPet)){
                ErrorMessage("Error LC", "Error, Fallo createPet de Controladora Logica!");
            } else {
                SuccessMessage("Adicion Exitosa!", "Mascota agregada con exito!");
            }
        }
    }//GEN-LAST:event_jButton_registrationDoneActionPerformed

    private void jButton_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logOutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_logOutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_logOut;
    private javax.swing.JButton jButton_registrationDone;
    private javax.swing.JComboBox<String> jComboBox_owners;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel_Data;
    private javax.swing.JPanel jPanel_InscripParticipante;
    private javax.swing.JPanel jPanel_Salir;
    private javax.swing.JTextField jTextField_Pet_age;
    private javax.swing.JTextField jTextField_Pet_kind;
    private javax.swing.JTextField jTextField_Pet_name;
    private javax.swing.JTextField jTextField_Pet_race;
    // End of variables declaration//GEN-END:variables
}
