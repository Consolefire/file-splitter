/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.tools.gsplit.ui.core;

import java.io.File;
import javax.swing.JInternalFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import net.sf.tools.gsplit.AppSettings;
import net.sf.tools.gsplit.LafEnum;
import net.sf.tools.gsplit.SplitterContext;
import net.sf.tools.gsplit.util.FileBrowserUtil;

/**
 *
 * @author SG1736
 */
public class SettingsPanel extends javax.swing.JPanel {

    private static final AppSettings appSettings = SplitterContext.getContext()
            .copyAppSettings();
    
    private JInternalFrame parentFrame;
    /**
     * Creates new form SettingsPanel
     */
    public SettingsPanel(JInternalFrame parent) {
        this.parentFrame = parent;
        initComponents();
        LafEnum lafEnum = LafEnum.getLafEnum(appSettings.getLafClassName());
        lafComboBox.setSelectedItem(lafEnum.getName());
        logFileNameTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                appSettings.setLogFileName(logFileNameTextField.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                appSettings.setLogFileName(logFileNameTextField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                appSettings.setLogFileName(logFileNameTextField.getText());
            }
        });
        maxLogFileCountTextField.getDocument().addDocumentListener(new DocumentListener() {
            private void setValue() {
                int val = appSettings.getMaxLogFileCount();
                try {
                    val = Integer.parseInt(maxLogFileCountTextField.getText());
                } catch (Exception ex) {
                    maxLogFileCountTextField.setText(""+val);
                }
                appSettings.setMaxLogFileCount(val);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                setValue();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setValue();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setValue();
            }
        });
        maxLogFileSizeTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                appSettings.setMaxLogFileSize(maxLogFileSizeTextField.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                appSettings.setMaxLogFileSize(maxLogFileSizeTextField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                appSettings.setMaxLogFileSize(maxLogFileSizeTextField.getText());
            }
        });
        loggerPatternTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                appSettings.setLoggerPattern(loggerPatternTextField.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                appSettings.setLoggerPattern(loggerPatternTextField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                appSettings.setLoggerPattern(loggerPatternTextField.getText());
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        settingsTabbedPane = new javax.swing.JTabbedPane();
        generalSettingsPanelPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lafComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        selectedLaFClassNameLabel = new javax.swing.JLabel();
        loggerSettingsPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        logFileNameTextField = new javax.swing.JTextField();
        browseLogFileButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        logLevelComboBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        maxLogFileSizeTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        maxLogFileCountTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        loggerPatternTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        FormListener formListener = new FormListener();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 35));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel3.setPreferredSize(new java.awt.Dimension(454, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Settings");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 33));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 33));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel4.add(cancelButton, gridBagConstraints);

        applyButton.setText("Apply");
        applyButton.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel4.add(applyButton, gridBagConstraints);

        add(jPanel4, java.awt.BorderLayout.PAGE_END);

        generalSettingsPanelPanel.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Look & Feel ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(1, 5, 1, 5);
        generalSettingsPanelPanel.add(jLabel3, gridBagConstraints);

        lafComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "System Default", "Metal", "Motif", "Nimbus", "Windows Classic", "Windows" }));
        lafComboBox.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        generalSettingsPanelPanel.add(lafComboBox, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        generalSettingsPanelPanel.add(jLabel4, gridBagConstraints);

        selectedLaFClassNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        generalSettingsPanelPanel.add(selectedLaFClassNameLabel, gridBagConstraints);

        settingsTabbedPane.addTab("General", generalSettingsPanelPanel);

        loggerSettingsPanel.setLayout(new java.awt.GridBagLayout());

        jLabel6.setText("Log File ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        loggerSettingsPanel.add(jLabel6, gridBagConstraints);

        logFileNameTextField.setText(appSettings.getLogFileName());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        loggerSettingsPanel.add(logFileNameTextField, gridBagConstraints);

        browseLogFileButton.setText("Browse");
        browseLogFileButton.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        loggerSettingsPanel.add(browseLogFileButton, gridBagConstraints);

        jLabel7.setText("Log Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        loggerSettingsPanel.add(jLabel7, gridBagConstraints);

        logLevelComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INFO", "WARN", "ERROR", "DEBUG" }));
        logLevelComboBox.setSelectedItem(appSettings.getLogLevel());
        logLevelComboBox.setMaximumSize(new java.awt.Dimension(120, 32767));
        logLevelComboBox.setMinimumSize(new java.awt.Dimension(120, 18));
        logLevelComboBox.setPreferredSize(new java.awt.Dimension(120, 20));
        logLevelComboBox.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        loggerSettingsPanel.add(logLevelComboBox, gridBagConstraints);

        jLabel8.setText("Maximum Log file size ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        loggerSettingsPanel.add(jLabel8, gridBagConstraints);

        maxLogFileSizeTextField.setText(appSettings.getMaxLogFileSize());
        maxLogFileSizeTextField.setMaximumSize(new java.awt.Dimension(120, 2147483647));
        maxLogFileSizeTextField.setMinimumSize(new java.awt.Dimension(120, 20));
        maxLogFileSizeTextField.setPreferredSize(new java.awt.Dimension(120, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        loggerSettingsPanel.add(maxLogFileSizeTextField, gridBagConstraints);

        jLabel9.setText("Maximum log file count");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        loggerSettingsPanel.add(jLabel9, gridBagConstraints);

        maxLogFileCountTextField.setText("" + appSettings.getMaxLogFileCount());
        maxLogFileCountTextField.setMinimumSize(new java.awt.Dimension(80, 20));
        maxLogFileCountTextField.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        loggerSettingsPanel.add(maxLogFileCountTextField, gridBagConstraints);

        jLabel5.setText("Conversion Pattern");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        loggerSettingsPanel.add(jLabel5, gridBagConstraints);

        loggerPatternTextField.setText(appSettings.getLoggerPattern());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 10);
        loggerSettingsPanel.add(loggerPatternTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        loggerSettingsPanel.add(jLabel10, gridBagConstraints);

        settingsTabbedPane.addTab("Logger", loggerSettingsPanel);

        add(settingsTabbedPane, java.awt.BorderLayout.CENTER);
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == cancelButton) {
                SettingsPanel.this.cancelButtonActionPerformed(evt);
            }
            else if (evt.getSource() == applyButton) {
                SettingsPanel.this.applyButtonActionPerformed(evt);
            }
            else if (evt.getSource() == lafComboBox) {
                SettingsPanel.this.lafComboBoxActionPerformed(evt);
            }
            else if (evt.getSource() == logLevelComboBox) {
                SettingsPanel.this.logLevelComboBoxActionPerformed(evt);
            }
            else if (evt.getSource() == browseLogFileButton) {
                SettingsPanel.this.browseLogFileButtonActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void logLevelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logLevelComboBoxActionPerformed
        String lvl = logLevelComboBox.getSelectedItem().toString();
        appSettings.setLogLevel(lvl);
    }//GEN-LAST:event_logLevelComboBoxActionPerformed

    private void lafComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lafComboBoxActionPerformed
        String laf = lafComboBox.getSelectedItem().toString();
        appSettings.setLafClassName(LafEnum.getLafEnum(laf).getClassName());
        selectedLaFClassNameLabel.setText(appSettings.getLafClassName());
    }//GEN-LAST:event_lafComboBoxActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        SplitterContext.getContext().updateSettings(appSettings);
        parentFrame.dispose();
    }//GEN-LAST:event_applyButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        parentFrame.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void browseLogFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseLogFileButtonActionPerformed
        File file = FileBrowserUtil.browseToSaveFile(this, 
                appSettings.getLastAccessedPathName(), null, false);
        if(null != file){
            logFileNameTextField.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_browseLogFileButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JButton browseLogFileButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel generalSettingsPanelPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox lafComboBox;
    private javax.swing.JTextField logFileNameTextField;
    private javax.swing.JComboBox logLevelComboBox;
    private javax.swing.JTextField loggerPatternTextField;
    private javax.swing.JPanel loggerSettingsPanel;
    private javax.swing.JTextField maxLogFileCountTextField;
    private javax.swing.JTextField maxLogFileSizeTextField;
    private javax.swing.JLabel selectedLaFClassNameLabel;
    private javax.swing.JTabbedPane settingsTabbedPane;
    // End of variables declaration//GEN-END:variables
}
