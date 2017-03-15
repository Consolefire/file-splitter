package net.sf.tools.gsplit.ui.core;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import net.sf.tools.gsplit.SplitterConstants;
import net.sf.tools.gsplit.SplitterContext;
import net.sf.tools.gsplit.WorkerTaskConstants;
import net.sf.tools.gsplit.core.FlatFileSplitter;
import net.sf.tools.gsplit.core.TextFileSplitter;
import net.sf.tools.gsplit.util.FileBrowserUtil;
import net.sf.tools.gsplit.util.StringUtil;
import org.apache.log4j.Logger;

/**
 *
 * @author Sabuj Das | sabuj.das@gmail.com
 */
public class TextSplitPanel extends javax.swing.JPanel implements PropertyChangeListener {

    private static Logger logger = Logger.getLogger(FlatSplitPanel.class);
    private static SplitterContext context = SplitterContext.getContext();
    private TextFileSplitter textFileSplitter;
    private FlatFileSplitter flatFileSplitter;

    /**
     * Creates new form TextSplitPanel
     */
    public TextSplitPanel() {
        initComponents();
        splitterProgressBar.setVisible(false);
        splitterStopButton.setVisible(false);
        splitterStartButton.setEnabled(false);
        splitterSourceTextField.getDocument().addDocumentListener(new DocumentListener() {
            public void removeUpdate(DocumentEvent e) {
                updateSplitterStartButton();
            }

            public void insertUpdate(DocumentEvent e) {
                updateSplitterStartButton();
            }

            public void changedUpdate(DocumentEvent e) {
                updateSplitterStartButton();
            }
        });
        splitterTargetTextField.getDocument().addDocumentListener(new DocumentListener() {
            public void removeUpdate(DocumentEvent e) {
                updateSplitterStartButton();
            }

            public void insertUpdate(DocumentEvent e) {
                updateSplitterStartButton();
            }

            public void changedUpdate(DocumentEvent e) {
                updateSplitterStartButton();
            }
        });
    }

    private void updateSplitterStartButton() {
        if (StringUtil.hasValidContent(splitterSourceTextField.getText())
                && StringUtil.hasValidContent(splitterTargetTextField.getText())) {
            splitterStartButton.setEnabled(true);
        } else {
            splitterStartButton.setEnabled(false);
        }
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

        splitByButtonGroup = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        splitterPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        splitterSourceTextField = new javax.swing.JTextField();
        browseSplitterSourceButton = new javax.swing.JButton();
        fileSizeLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        splitterTargetTextField = new javax.swing.JTextField();
        browseSplitterTargetButton = new javax.swing.JButton();
        splitterProgressBar = new javax.swing.JProgressBar();
        splitterStopButton = new javax.swing.JButton();
        splitterStartButton = new javax.swing.JButton();
        sizeOrPartLabel = new javax.swing.JLabel();
        splitterLineSizeTextField = new javax.swing.JTextField();
        byteComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        sizeRadioButton = new javax.swing.JRadioButton();
        linesRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        FormListener formListener = new FormListener();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 35));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel3.setPreferredSize(new java.awt.Dimension(454, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/text-file.png"))); // NOI18N
        jLabel1.setText("Text File Splitter");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-split.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.PAGE_START);

        splitterPanel.setMinimumSize(new java.awt.Dimension(384, 137));
        splitterPanel.setLayout(new java.awt.GridBagLayout());

        jLabel4.setText("Source File");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(splitterSourceTextField, gridBagConstraints);

        browseSplitterSourceButton.setText("Browse");
        browseSplitterSourceButton.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(browseSplitterSourceButton, gridBagConstraints);

        fileSizeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fileSizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(fileSizeLabel, gridBagConstraints);

        jLabel5.setText("Target Folder");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(splitterTargetTextField, gridBagConstraints);

        browseSplitterTargetButton.setText("Browse");
        browseSplitterTargetButton.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(browseSplitterTargetButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(splitterProgressBar, gridBagConstraints);

        splitterStopButton.setText("Stop");
        splitterStopButton.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(splitterStopButton, gridBagConstraints);

        splitterStartButton.setText("Start");
        splitterStartButton.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(splitterStartButton, gridBagConstraints);

        sizeOrPartLabel.setText("Maximum Part Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(sizeOrPartLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(splitterLineSizeTextField, gridBagConstraints);

        byteComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BYTE", "KB", "MB", "GB" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(byteComboBox, gridBagConstraints);

        jLabel3.setText("Split By");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(jLabel3, gridBagConstraints);

        splitByButtonGroup.add(sizeRadioButton);
        sizeRadioButton.setSelected(true);
        sizeRadioButton.setText("Size");
        sizeRadioButton.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(sizeRadioButton, gridBagConstraints);

        splitByButtonGroup.add(linesRadioButton);
        linesRadioButton.setText("No of Lines");
        linesRadioButton.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(linesRadioButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        splitterPanel.add(jLabel6, gridBagConstraints);

        add(splitterPanel, java.awt.BorderLayout.CENTER);
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == browseSplitterSourceButton) {
                TextSplitPanel.this.browseSplitterSourceButtonActionPerformed(evt);
            }
            else if (evt.getSource() == browseSplitterTargetButton) {
                TextSplitPanel.this.browseSplitterTargetButtonActionPerformed(evt);
            }
            else if (evt.getSource() == splitterStopButton) {
                TextSplitPanel.this.splitterStopButtonActionPerformed(evt);
            }
            else if (evt.getSource() == splitterStartButton) {
                TextSplitPanel.this.splitterStartButtonActionPerformed(evt);
            }
            else if (evt.getSource() == sizeRadioButton) {
                TextSplitPanel.this.sizeRadioButtonActionPerformed(evt);
            }
            else if (evt.getSource() == linesRadioButton) {
                TextSplitPanel.this.linesRadioButtonActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void browseSplitterSourceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseSplitterSourceButtonActionPerformed
        File file = FileBrowserUtil.openSingleFile(this, null, false,
                context.getAppSettings().getLastAccessedPathName());
        if (null != file) {
            splitterSourceTextField.setText(file.getAbsolutePath());
            long size = file.length();
            if (size < SplitterConstants.KB) {
                fileSizeLabel.setText("Size: " + file.length() + SplitterConstants.BYTE_TEXT);
            } else if (size >= SplitterConstants.KB && size < SplitterConstants.MB) {
                fileSizeLabel.setText("Size: " + file.length() / SplitterConstants.KB + SplitterConstants.KB_TEXT);
            } else if (size >= SplitterConstants.MB && size < SplitterConstants.GB) {
                fileSizeLabel.setText("Size: " + file.length() / SplitterConstants.MB + SplitterConstants.MB_TEXT);
            } else if (size >= SplitterConstants.GB) {
                fileSizeLabel.setText("Size: " + file.length() / SplitterConstants.GB + SplitterConstants.GB_TEXT);
            }
            context.getAppSettings().setLastAccessedPathName(file.getAbsolutePath());
        }
    }//GEN-LAST:event_browseSplitterSourceButtonActionPerformed

    private void browseSplitterTargetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseSplitterTargetButtonActionPerformed
        File dir = FileBrowserUtil.openSingleFile(this, null, true,
                context.getAppSettings().getLastAccessedPathName());
        if (null != dir) {
            splitterTargetTextField.setText(dir.getAbsolutePath());
            context.getAppSettings().setLastAccessedPathName(dir.getAbsolutePath());
        }
    }//GEN-LAST:event_browseSplitterTargetButtonActionPerformed

    private void splitterStopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splitterStopButtonActionPerformed
        if(null != flatFileSplitter){
        	flatFileSplitter.cancel(true);
        }
        if(null != textFileSplitter){
        	textFileSplitter.cancel(true);
        }
    }//GEN-LAST:event_splitterStopButtonActionPerformed

    private void splitterStartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splitterStartButtonActionPerformed
        if (sizeRadioButton.isSelected()) {
            splitBySize();
        } else {
            splitByLines();
        }
    }//GEN-LAST:event_splitterStartButtonActionPerformed

    private void sizeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeRadioButtonActionPerformed
        if (sizeRadioButton.isSelected()) {
            sizeOrPartLabel.setText("Maximum Part Size");
            byteComboBox.setVisible(true);
        }
    }//GEN-LAST:event_sizeRadioButtonActionPerformed

    private void linesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linesRadioButtonActionPerformed
        if (linesRadioButton.isSelected()) {
            sizeOrPartLabel.setText("Maximum No. of Lines");
            byteComboBox.setVisible(false);
        }
    }//GEN-LAST:event_linesRadioButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseSplitterSourceButton;
    private javax.swing.JButton browseSplitterTargetButton;
    private javax.swing.JComboBox byteComboBox;
    private javax.swing.JLabel fileSizeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton linesRadioButton;
    private javax.swing.JLabel sizeOrPartLabel;
    private javax.swing.JRadioButton sizeRadioButton;
    private javax.swing.ButtonGroup splitByButtonGroup;
    private javax.swing.JTextField splitterLineSizeTextField;
    private javax.swing.JPanel splitterPanel;
    private javax.swing.JProgressBar splitterProgressBar;
    private javax.swing.JTextField splitterSourceTextField;
    private javax.swing.JButton splitterStartButton;
    private javax.swing.JButton splitterStopButton;
    private javax.swing.JTextField splitterTargetTextField;
    // End of variables declaration//GEN-END:variables

    private void splitBySize() {
        synchronized (this) {
            flatFileSplitter = new FlatFileSplitter(splitterSourceTextField.getText(),
                    splitterTargetTextField.getText());
            flatFileSplitter.addPropertyChangeListener(this);
            long blockSize = 0;
            int maxPartCount = 0;
            try {
                flatFileSplitter.setSplitByPartCount(false);
                int multiplier = 1;
                String mul = byteComboBox.getSelectedItem().toString();
                if (SplitterConstants.KB_TEXT.equals(mul)) {
                    multiplier = SplitterConstants.KB;
                } else if (SplitterConstants.MB_TEXT.equals(mul)) {
                    multiplier = SplitterConstants.MB;
                } else if (SplitterConstants.GB_TEXT.equals(mul)) {
                    multiplier = SplitterConstants.GB;
                }
                blockSize = Integer.parseInt(splitterLineSizeTextField.getText()) * multiplier;


            } catch (Exception ex) {
                ex.printStackTrace();
                logger.error(ex);
            }
            if (!flatFileSplitter.isSplitByPartCount() && blockSize <= 0) {
                JOptionPane.showMessageDialog(this, "Block size is incorrect.");
                return;
            }
            
            flatFileSplitter.setByteCount(blockSize);
            flatFileSplitter.setMaximumPartCount(maxPartCount);
            flatFileSplitter.execute();
        }
    }

    private void splitByLines() {
        synchronized (this) {
            textFileSplitter = new TextFileSplitter(splitterSourceTextField.getText(),
                    splitterTargetTextField.getText());
            textFileSplitter.addPropertyChangeListener(this);
            
            int maxLineCount = 0;
            try {            
                maxLineCount = Integer.parseInt(splitterLineSizeTextField.getText());
            } catch (Exception ex) {
                ex.printStackTrace();
                logger.error(ex);
            }
            if (maxLineCount <= 0) {
                JOptionPane.showMessageDialog(this, "Max Line count is incorrect.");
                return;
            }
            textFileSplitter.setMaximumLineCount(maxLineCount);
            textFileSplitter.execute();
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String propertyName = evt.getPropertyName();
        if (evt.getSource().equals(flatFileSplitter)) {
            if (WorkerTaskConstants.TASK_STATUS_DONE.equals(propertyName)) {
                Object newValue = evt.getNewValue();
                JOptionPane.showMessageDialog(this,
                        String.format("Completed in [ %10.2f ] seconds.",
                        ((Long) newValue) / 1000.0));
                splitterStartButton.setEnabled(true);
                splitterStopButton.setVisible(false);
                splitterProgressBar.setVisible(false);
                splitterSourceTextField.setEditable(true);
                splitterTargetTextField.setEditable(true);
                browseSplitterSourceButton.setEnabled(true);
                browseSplitterTargetButton.setEnabled(true);
            }
            if (WorkerTaskConstants.TASK_STATUS_ABORT.equals(propertyName)) {
                Object newValue = evt.getNewValue();
                JOptionPane.showMessageDialog(this, "Split aborted by user");
                splitterStartButton.setEnabled(true);
                splitterStopButton.setVisible(false);
                splitterProgressBar.setVisible(false);
                splitterSourceTextField.setEditable(true);
                splitterTargetTextField.setEditable(true);
                browseSplitterSourceButton.setEnabled(true);
                browseSplitterTargetButton.setEnabled(true);
            }
            if (WorkerTaskConstants.PROPERTY_PROGRESS.equals(propertyName)) {
                String type = evt.getNewValue().toString();
                Object newProgress = evt.getNewValue();
                if (null != newProgress && newProgress instanceof Integer) {
                    splitterProgressBar.setValue((Integer) newProgress);
                    splitterProgressBar.updateUI();
                } else if (WorkerTaskConstants.TASK_STATUS_START.equals(newProgress)) {
                    splitterStartButton.setEnabled(false);
                    splitterStopButton.setVisible(true);
                    splitterProgressBar.setVisible(true);
                    splitterSourceTextField.setEditable(false);
                    splitterTargetTextField.setEditable(false);
                    browseSplitterSourceButton.setEnabled(false);
                    browseSplitterTargetButton.setEnabled(false);
                }
            }

            if (WorkerTaskConstants.TASK_STATUS_FAILED.equals(propertyName)) {
                Object newValue = evt.getNewValue();
                JOptionPane.showMessageDialog(this, "Split failed for : " + newValue);
                splitterStartButton.setEnabled(true);
                splitterStopButton.setVisible(false);
                splitterProgressBar.setVisible(false);
                splitterSourceTextField.setEditable(true);
                splitterTargetTextField.setEditable(true);
                browseSplitterSourceButton.setEnabled(true);
                browseSplitterTargetButton.setEnabled(true);
            }
        }

        if (evt.getSource().equals(textFileSplitter)) {
            if (WorkerTaskConstants.TASK_STATUS_DONE.equals(propertyName)) {
                Object newValue = evt.getNewValue();
                JOptionPane.showMessageDialog(this,
                        String.format("Completed in [ %10.2f ] seconds.",
                        ((Long) newValue) / 1000.0));
                splitterStartButton.setEnabled(true);
                splitterStopButton.setVisible(false);
                splitterProgressBar.setVisible(false);
                splitterProgressBar.setIndeterminate(false);
                splitterSourceTextField.setEditable(true);
                splitterTargetTextField.setEditable(true);
                browseSplitterSourceButton.setEnabled(true);
                browseSplitterTargetButton.setEnabled(true);
            }
            if (WorkerTaskConstants.TASK_STATUS_ABORT.equals(propertyName)) {
                Object newValue = evt.getNewValue();
                JOptionPane.showMessageDialog(this, "Split aborted by user");
                splitterStartButton.setEnabled(true);
                splitterStopButton.setVisible(false);
                splitterProgressBar.setVisible(false);
                splitterProgressBar.setIndeterminate(false);
                splitterSourceTextField.setEditable(true);
                splitterTargetTextField.setEditable(true);
                browseSplitterSourceButton.setEnabled(true);
                browseSplitterTargetButton.setEnabled(true);
            }
            if (WorkerTaskConstants.PROPERTY_PROGRESS.equals(propertyName)) {
                String type = evt.getNewValue().toString();
                Object newProgress = evt.getNewValue();
                if (null != newProgress && newProgress instanceof Integer) {
                    splitterProgressBar.setIndeterminate(true);
                    splitterProgressBar.updateUI();
                } else if (WorkerTaskConstants.TASK_STATUS_START.equals(newProgress)) {
                    splitterStartButton.setEnabled(false);
                    splitterStopButton.setVisible(true);
                    splitterProgressBar.setVisible(true);
                    splitterProgressBar.setIndeterminate(true);
                    splitterSourceTextField.setEditable(false);
                    splitterTargetTextField.setEditable(false);
                    browseSplitterSourceButton.setEnabled(false);
                    browseSplitterTargetButton.setEnabled(false);
                }
            }

            if (WorkerTaskConstants.TASK_STATUS_FAILED.equals(propertyName)) {
                Object newValue = evt.getNewValue();
                JOptionPane.showMessageDialog(this, "Split failed for : " + newValue);
                splitterStartButton.setEnabled(true);
                splitterStopButton.setVisible(false);
                splitterProgressBar.setVisible(false);
                splitterProgressBar.setIndeterminate(false);
                splitterSourceTextField.setEditable(true);
                splitterTargetTextField.setEditable(true);
                browseSplitterSourceButton.setEnabled(true);
                browseSplitterTargetButton.setEnabled(true);
            }
        }
    }
}
