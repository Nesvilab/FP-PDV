package GUI.Export;

import GUI.GUIMainClass;
import com.compomics.util.enumeration.ImageType;
import com.compomics.util.gui.renderers.AlignedListCellRenderer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.WindowEvent;
import java.io.File;

/**
 * Export batch pic dialog
 * Created by Ken on 8/8/2017.
 */
public class ExportBatchDialog extends JDialog {
    private JLabel pathJLabel;
    private JTextField pathJText;
    private JButton exportJButton;
    private JComboBox typeJComboBox;
    private JTextField picHeightJText;
    private JTextField picWidthJText;
    private JComboBox unitJCombox;

    /**
     * Picture type
     */
    private String[] picType = new String[]{"PNG", "TIFF", "PDF", "SVG"};
    /**
     * Selection size
     */
    private Integer selectionSize;
    /**
     * Last selected folder
     */
    private String lastFolder;
    /**
     * Output folder path
     */
    private String outputFolder;
    /**
     * Parent class
     */
    private GUIMainClass guiMainClass;

    /**
     * Constructor
     * @param guiMainClass Parent class
     * @param selectionSize All selections
     */
    public ExportBatchDialog(GUIMainClass guiMainClass, Integer selectionSize){
        super(guiMainClass, true);

        this.guiMainClass = guiMainClass;
        this.selectionSize = selectionSize;

        setUpGui();

        setLocationRelativeTo(guiMainClass);

        setVisible(true);
    }

    /**
     * Set up the GUI
     */
    private void setUpGui() {
        initComponents();
        validateInput();

        picHeightJText.setText(String.valueOf(500));
        picWidthJText.setText(String.valueOf(900));

        typeJComboBox.setEnabled(true);
        typeJComboBox.setRenderer(new AlignedListCellRenderer(0));
        pathJText.setText("No Selection");
    }

    /**
     * Init all GUI components
     */
    private void initComponents(){
        JPanel mainJPanel = new JPanel();
        JPanel detailJPanel = new JPanel();
        JButton pathBrowseJButton = new JButton();
        JLabel typeJLabel = new JLabel();
        JLabel inforJLabel = new JLabel();
        JLabel picHeightJLabel = new JLabel("Height");
        JLabel picWidthJlabel = new JLabel("Width");
        JLabel blankJLabel = new JLabel(" ");
        exportJButton = new JButton();
        typeJComboBox = new JComboBox();
        pathJLabel = new JLabel();
        pathJText = new JTextField();
        picHeightJText = new JTextField();
        picWidthJText = new JTextField();
        unitJCombox = new JComboBox();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PDV - Export");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        setResizable(false);

        mainJPanel.setBackground(Color.white);

        TitledBorder titledBorder = BorderFactory.createTitledBorder("Path & Type" + " \t ");
        titledBorder.setTitleFont(new Font("Console", Font.PLAIN, 12));
        detailJPanel.setBorder(titledBorder);

        detailJPanel.setOpaque(false);
        detailJPanel.setBackground(Color.white);

        pathJLabel.setText("Output Path");
        pathJLabel.setFont(new Font("Console", Font.PLAIN, 12));
        pathJLabel.setBackground(new Color(255, 0, 0));

        pathJText.setHorizontalAlignment(SwingConstants.CENTER);
        pathJText.setEditable(false);

        pathBrowseJButton.setIcon(new ImageIcon(getClass().getResource("/icons/open.png")));
        pathBrowseJButton.setBorder(null);
        pathBrowseJButton.setBorderPainted(false);
        pathBrowseJButton.setContentAreaFilled(false);
        pathBrowseJButton.addActionListener(this::pathBrowseJButtonActionPerformed);

        typeJLabel.setText("Type");
        typeJLabel.setFont(new Font("Console", Font.PLAIN, 12));

        typeJComboBox.setModel(new DefaultComboBoxModel(this.picType));
        typeJComboBox.addItemListener(this::typeJComboBoxdMouseClicked);

        inforJLabel.setText("There are "+selectionSize +" spectral you selected to export");
        inforJLabel.setFont(new Font("Arial", Font.ITALIC,12));

        picHeightJText.setHorizontalAlignment(SwingConstants.CENTER);
        picWidthJText.setHorizontalAlignment(SwingConstants.CENTER);

        exportJButton.setText("Export");
        exportJButton.setFont(new Font("Lucida", Font.BOLD, 13));
        exportJButton.setBackground(Color.GREEN);
        exportJButton.setOpaque(false);
        exportJButton.setEnabled(false);
        exportJButton.addActionListener(this::exportJButtonActionPerformed);

        picHeightJLabel.setFont(new Font("Console", Font.PLAIN, 12));
        picWidthJlabel.setFont(new Font("Console", Font.PLAIN, 12));

        unitJCombox.setModel(new DefaultComboBoxModel(new String[]{"px", "mm", "cm", "in"}));

        GroupLayout detailJPanelLayout = new GroupLayout(detailJPanel);
        detailJPanel.setLayout(detailJPanelLayout);;

        detailJPanelLayout.setHorizontalGroup(
                detailJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(detailJPanelLayout.createSequentialGroup()
                                .addGroup(detailJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(pathJLabel, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                        .addComponent(typeJLabel, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                        .addComponent(blankJLabel, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                .addGroup(detailJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(detailJPanelLayout.createSequentialGroup()
                                                .addComponent(pathJText, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pathBrowseJButton))
                                        .addComponent(typeJComboBox, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addGroup(detailJPanelLayout.createSequentialGroup()
                                                .addComponent(picHeightJLabel, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                .addComponent(picHeightJText, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                                .addGap(10,40,80)
                                                .addComponent(picWidthJlabel, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(picWidthJText, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(unitJCombox, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))))
        );

        detailJPanelLayout.setVerticalGroup(
                detailJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(detailJPanelLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addGroup(detailJPanelLayout.createSequentialGroup()
                                        .addComponent(pathJLabel, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(typeJLabel, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(blankJLabel, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                        )
                        .addGroup(detailJPanelLayout.createSequentialGroup()
                                .addGroup(detailJPanelLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(pathJText)
                                        .addComponent(pathBrowseJButton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typeJComboBox)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(detailJPanelLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(picHeightJLabel)
                                        .addComponent(picHeightJText)
                                        .addComponent(picWidthJlabel)
                                        .addComponent(picWidthJText)
                                        .addComponent(unitJCombox)))
        );

        GroupLayout mainJPanelLayout = new GroupLayout(mainJPanel);
        mainJPanel.setLayout(mainJPanelLayout);

        mainJPanelLayout.setHorizontalGroup(
                mainJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(detailJPanel)
                        .addGroup(mainJPanelLayout.createSequentialGroup()
                                .addGap(20)
                                .addComponent(inforJLabel, GroupLayout.DEFAULT_SIZE, 260, 400)
                                .addComponent(exportJButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(10))

        );

        mainJPanelLayout.setVerticalGroup(
                mainJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainJPanelLayout.createSequentialGroup()
                                .addComponent(detailJPanel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainJPanelLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(inforJLabel)
                                        .addComponent(exportJButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(mainJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(mainJPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    /**
     * Validates input information and enable start button
     */
    private void validateInput() {
        boolean allValid = true;

        if(outputFolder!=null){
            pathJLabel.setForeground(Color.BLACK);
            pathJLabel.setToolTipText(null);
        }else {
            pathJLabel.setForeground(Color.RED);
            pathJLabel.setToolTipText("Please select output directory");
            pathJText.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            allValid = false;
        }
        exportJButton.setEnabled(allValid);
    }

    /**
     * Closes the dialog
     * @param evt window event
     */
    private void formWindowClosing(WindowEvent evt) {
        this.dispose();
    }

    /**
     * Select output path
     * @param evt mouse click event
     */
    private void pathBrowseJButtonActionPerformed(ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser(lastFolder);
        fileChooser.setDialogTitle("Select Output Directory");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showDialog(this, "Ok");

        if (returnValue == JFileChooser.APPROVE_OPTION) {

            File selectedFile = fileChooser.getSelectedFile();

            outputFolder = selectedFile.getAbsolutePath();

            if (!selectedFile.exists()){ // Avoid bug in Mac
                outputFolder = outputFolder.substring(0, outputFolder.lastIndexOf("/"));
                if (!new File(outputFolder).exists()){
                    JOptionPane.showMessageDialog(null, "Please check your output path.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    pathJText.setText(outputFolder + " selected");
                }
            } else {
                pathJText.setText(outputFolder + " selected");
            }

            validateInput();
        }
    }

    /**
     * Update unit according to the pic type
     * @param evt Mouse click event
     */
    private void typeJComboBoxdMouseClicked(ItemEvent evt){
        int selectIndex = typeJComboBox.getSelectedIndex();

        if(selectIndex == 2 || selectIndex == 3){
            unitJCombox.setModel(new DefaultComboBoxModel(new String[]{"mm", "cm", "in"}));
        } else {
            unitJCombox.setModel(new DefaultComboBoxModel(new String[]{"px", "mm", "cm", "in"}));
        }
    }

    /**
     * Export selected spectrum
     * @param evt mouse click event
     */
    private void exportJButtonActionPerformed(ActionEvent evt) {

        ImageType finalImageType = null;
        Integer picHeight = 460;
        Integer picWidth = 800;

        Integer selectIndex = typeJComboBox.getSelectedIndex();

        switch (selectIndex){
            case 0:
                finalImageType = ImageType.PNG;
                break;
            case 1:
                finalImageType = ImageType.TIFF;
                break;
            case 2:
                finalImageType = ImageType.PDF;
                break;
            case 3:
                finalImageType = ImageType.SVG;
                break;
        }

        if(picHeightJText.getText() != null && !picHeightJText.getText().equals("")){
            picHeight = Integer.valueOf(picHeightJText.getText());
        }
        if(picWidthJText.getText() != null && !picWidthJText.getText().equals("")){
            picWidth = Integer.valueOf(picWidthJText.getText());
        }

        if (guiMainClass != null){
            guiMainClass.exportSelectedSpectra(finalImageType, outputFolder, picHeight, picWidth, String.valueOf(unitJCombox.getSelectedItem()));
        }
    }
}
