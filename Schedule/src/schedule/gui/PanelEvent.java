package schedule.gui;

import javax.swing.JOptionPane;
import schedule.io.ScheduleIO;
import schedule.utils.FrequencyEnum;
import schedule.utils.ScheduleUtils;
import schedule.vo.Event;

/**
 *
 * @author mateus
 */
public class PanelEvent extends javax.swing.JPanel {

    /**
     * Creates new form PanelEvent
     */
    EventsList eventsList = new EventsList();
    public PanelEvent(EventsList eventsList) {
        initComponents();
        this.eventsList = eventsList;
    }
    
    private void callSaveEvent(){
        ScheduleIO io = new ScheduleIO();
        Event event = new Event();
        
        Object[] newLine = new Object[5];
        
        event.setEventDate(ScheduleUtils.getDateFromString(
                this.tfDtEvent.getText()));
        event.setEventDesc(this.tfEventDesc.getText());
        event.setAlarm(this.ckbAlarm.isSelected() ? 1 : 0);
        event.setSendEmail(this.tfEmailEvent.getText());
        
        newLine[0] = this.tfDtEvent.getText();
        newLine[1] = this.tfEventDesc.getText();
        newLine[3] = this.tfEmailEvent.getText();
        newLine[4] = this.ckbAlarm.isSelected();
        
        if(this.rdbOneTime.isSelected()){
            event.setFrequency(FrequencyEnum.UNIQUE);
            newLine[2] = FrequencyEnum.UNIQUE;
        }else if (this.rdbMonthly.isSelected()) {
            event.setFrequency(FrequencyEnum.MONTHLY);
        }else{
            event.setFrequency(FrequencyEnum.WEEKLY);
        }
        
        try{
            io.saveEvent(event);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"ERRO",
                    ex.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        eventsList.addNewRow(newLine);
        Erase();
    }
    
    private void Erase(){
        this.ckbAlarm.setSelected(false);
        this.rdbOneTime.setSelected(true);
        this.rdbOneTime.setSelected(false);
        this.tfDtEvent.setText("");
        this.tfEmailEvent.setText("");
        this.tfEventDesc.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        standard = new javax.swing.ButtonGroup();
        lblNewLabel = new javax.swing.JLabel();
        tfEventDesc = new javax.swing.JTextField();
        lblDtEvent = new javax.swing.JLabel();
        lblEmailEvent = new javax.swing.JLabel();
        tfDtEvent = new javax.swing.JTextField();
        tfEmailEvent = new javax.swing.JTextField();
        lblEventFrequency = new javax.swing.JLabel();
        rdbOneTime = new javax.swing.JRadioButton();
        rdbWeekly = new javax.swing.JRadioButton();
        rdbMonthly = new javax.swing.JRadioButton();
        ckbAlarm = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        btnErase = new javax.swing.JButton();

        setToolTipText("");

        lblNewLabel.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 18)); // NOI18N
        lblNewLabel.setText("EVENT DESCRIPTION");

        tfEventDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEventDescActionPerformed(evt);
            }
        });

        lblDtEvent.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblDtEvent.setText("DATE");

        lblEmailEvent.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblEmailEvent.setText("E-MAIL");

        tfDtEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tfEmailEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailEventActionPerformed(evt);
            }
        });

        lblEventFrequency.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblEventFrequency.setText("FREQUENCY");

        standard.add(rdbOneTime);
        rdbOneTime.setText("One time");
        rdbOneTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOneTimeActionPerformed(evt);
            }
        });

        standard.add(rdbWeekly);
        rdbWeekly.setText("Weekly");
        rdbWeekly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbWeeklyActionPerformed(evt);
            }
        });

        standard.add(rdbMonthly);
        rdbMonthly.setText("Monthly");

        ckbAlarm.setText("Alarm");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnErase.setText("Erase");
        btnErase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEraseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfEventDesc)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDtEvent)
                                    .addComponent(lblEmailEvent))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDtEvent)
                                    .addComponent(tfEmailEvent))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbAlarm))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEventFrequency)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbOneTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbWeekly))
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rdbMonthly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnErase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEventDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDtEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfDtEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ckbAlarm)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmailEvent)
                    .addComponent(tfEmailEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEventFrequency)
                    .addComponent(rdbOneTime)
                    .addComponent(rdbWeekly)
                    .addComponent(rdbMonthly))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnErase))
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfEventDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEventDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEventDescActionPerformed

    private void tfEmailEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailEventActionPerformed

    private void rdbOneTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOneTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbOneTimeActionPerformed

    private void rdbWeeklyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbWeeklyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbWeeklyActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        this.callSaveEvent();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraseActionPerformed
        // TODO add your handling code here:
        this.Erase();
    }//GEN-LAST:event_btnEraseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnErase;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox ckbAlarm;
    private javax.swing.JLabel lblDtEvent;
    private javax.swing.JLabel lblEmailEvent;
    private javax.swing.JLabel lblEventFrequency;
    private javax.swing.JLabel lblNewLabel;
    private javax.swing.JRadioButton rdbMonthly;
    private javax.swing.JRadioButton rdbOneTime;
    private javax.swing.JRadioButton rdbWeekly;
    private javax.swing.ButtonGroup standard;
    private javax.swing.JTextField tfDtEvent;
    private javax.swing.JTextField tfEmailEvent;
    private javax.swing.JTextField tfEventDesc;
    // End of variables declaration//GEN-END:variables
}