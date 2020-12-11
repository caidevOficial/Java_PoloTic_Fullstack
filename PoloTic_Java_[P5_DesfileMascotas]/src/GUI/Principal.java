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

/**
 *
 * @author FacuFalcone - CaidevOficial
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_Participantes = new javax.swing.JPanel();
        btn_Participante = new javax.swing.JButton();
        jPanel_Mascota = new javax.swing.JPanel();
        btn_Mascota = new javax.swing.JButton();
        jPanel_Salir = new javax.swing.JPanel();
        btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project 5");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Desfile de Mascotas 2020");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
        );

        jPanel_Participantes.setBackground(new java.awt.Color(51, 51, 51));

        btn_Participante.setBackground(new java.awt.Color(75, 75, 75));
        btn_Participante.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btn_Participante.setForeground(new java.awt.Color(51, 255, 51));
        btn_Participante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/images/mascota_64.png"))); // NOI18N
        btn_Participante.setText("Inscribir Participante");
        btn_Participante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ParticipanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ParticipantesLayout = new javax.swing.GroupLayout(jPanel_Participantes);
        jPanel_Participantes.setLayout(jPanel_ParticipantesLayout);
        jPanel_ParticipantesLayout.setHorizontalGroup(
            jPanel_ParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ParticipantesLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(btn_Participante)
                .addGap(21, 21, 21))
        );
        jPanel_ParticipantesLayout.setVerticalGroup(
            jPanel_ParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ParticipantesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_Participante)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel_Mascota.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_Mascota.setForeground(new java.awt.Color(51, 51, 51));

        btn_Mascota.setBackground(new java.awt.Color(75, 75, 75));
        btn_Mascota.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btn_Mascota.setForeground(new java.awt.Color(0, 255, 0));
        btn_Mascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/images/mascota-amigable_64.png"))); // NOI18N
        btn_Mascota.setText("Inscribir Mascota");
        btn_Mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MascotaLayout = new javax.swing.GroupLayout(jPanel_Mascota);
        jPanel_Mascota.setLayout(jPanel_MascotaLayout);
        jPanel_MascotaLayout.setHorizontalGroup(
            jPanel_MascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MascotaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_Mascota)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel_MascotaLayout.setVerticalGroup(
            jPanel_MascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MascotaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_Mascota)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Salir.setBackground(new java.awt.Color(51, 51, 51));

        btn_Salir.setBackground(new java.awt.Color(75, 75, 75));
        btn_Salir.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(51, 255, 51));
        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/images/apagar_64.png"))); // NOI18N
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_SalirLayout = new javax.swing.GroupLayout(jPanel_Salir);
        jPanel_Salir.setLayout(jPanel_SalirLayout);
        jPanel_SalirLayout.setHorizontalGroup(
            jPanel_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SalirLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btn_Salir)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel_SalirLayout.setVerticalGroup(
            jPanel_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SalirLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_Salir)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel_Participantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jPanel_Mascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_Participantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Mascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel_Salir.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ParticipanteActionPerformed
        InscripCompetitor partic = new InscripCompetitor();
        partic.setVisible(true);
        partic.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_ParticipanteActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_MascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MascotaActionPerformed
        registerPet thisNewPet = new registerPet();
        thisNewPet.setVisible(true);
        thisNewPet.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_MascotaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Mascota;
    private javax.swing.JButton btn_Participante;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Mascota;
    private javax.swing.JPanel jPanel_Participantes;
    private javax.swing.JPanel jPanel_Salir;
    // End of variables declaration//GEN-END:variables
}
