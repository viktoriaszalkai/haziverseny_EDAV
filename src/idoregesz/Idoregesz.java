
package idoregesz;

import javax.swing.ImageIcon;


public class Idoregesz extends javax.swing.JFrame {
    Integer eletero=5;
    Integer szamlaloKastely=0;
    Integer szamlaloKamra=0;
    String felszereles="";
    String leiras01= "Egy óriási mezőn vagy. Nyugat felé egy hatalmas épület körvonalai tűnnek fel.";
    String leiras02= "Napfényes mezőn állsz. Nyugatra egy hatalmas kastélyt, délre egy kutat látsz.";
    String leiras03= "Napfényes mezőn állsz, egy kút előtt. Itt van: pénz. Nyugatra egy hatalmas kastélyt látsz.";
    String leiras04= "Rendben, a pénzt elraktad.";
    String leiras05= "A várudvaron állsz. Nyugatra nyitott kamrát, északra zárt ajtót látsz. "
            + "Egy széles lépcső vezet fel a vártemplomhoz.";
    String leiras06= "A templom előtt egy kéregető szerzetes mosolyog rád. Nyugatra nyitott kamrát, északra zárt ajtót látsz.";
    String leiras07= "A szerzetes megköszöni, és kinyújtja feléd a kezét, a tenyerén egy kulcsot tart.";
    String leiras08= "Rendben, a kulcsot elraktad.";
    String leiras09= "A kamrában vagy. Egyik oldalon hatalmas asztal áll mindenféle ételekkel, "
            + "a másik oldalon egy nagy tűzhely, szintén ételekkel. Délre egy faajtót látsz.";
    String leiras10= "Egy faajtó előtt állsz, zárva van, a kulcslyukon nem lehet belátni.";
    String leiras11= "Az ajtó könnyedén nyílik, egy kis ládikát pont fel tudsz kapni, amikor visszakerülsz a jelenbe!";
    String leiras12= "Újra életerősnek érzed magad!";
    String leiras13= "Egy masszív, zárt ajtó előtt állsz.";
    String leiras14= "Ezt az ajtót nem nyitja a kulcsod!";
    
    
    ImageIcon kezdes = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\01_kezdes.png");
    ImageIcon kastely = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\Var.png");
    ImageIcon kamra = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\Kamra.png");
    ImageIcon ajto1 = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\09_kamra.png");
    ImageIcon ajto2 = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\14_ajto.png");
    ImageIcon szerzetes = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\06_szerzetes2.jpg");
    ImageIcon kut = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\03_kut2.png");
    public Idoregesz() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHatterSzin = new javax.swing.JPanel();
        pnlHatter = new javax.swing.JPanel();
        lblKep = new javax.swing.JLabel();
        lblEro = new javax.swing.JLabel();
        lblEroMennyiseg = new javax.swing.JLabel();
        lblIranytu = new javax.swing.JLabel();
        lblFelszereles = new javax.swing.JLabel();
        lblFelszerelesNev = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaSzoveg = new javax.swing.JTextArea();
        txtfInput = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(774, 493));
        setMinimumSize(new java.awt.Dimension(774, 493));
        setResizable(false);

        pnlHatterSzin.setBackground(new java.awt.Color(204, 204, 255));
        pnlHatterSzin.setMaximumSize(new java.awt.Dimension(774, 493));
        pnlHatterSzin.setMinimumSize(new java.awt.Dimension(774, 493));

        pnlHatter.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/01_kezdes.png"))); // NOI18N
        lblKep.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblEro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEro.setText("Erő:");

        lblEroMennyiseg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEroMennyiseg.setText("5");

        lblIranytu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/Képernyőkép 2023-12-13 131939.png"))); // NOI18N
        lblIranytu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblFelszereles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblFelszerelesNev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFelszerelesNev.setText("Felszerelés:");

        javax.swing.GroupLayout pnlHatterLayout = new javax.swing.GroupLayout(pnlHatter);
        pnlHatter.setLayout(pnlHatterLayout);
        pnlHatterLayout.setHorizontalGroup(
            pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHatterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEro)
                .addGap(18, 18, 18)
                .addComponent(lblEroMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblKep)
                .addGap(18, 18, 18)
                .addGroup(pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblIranytu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFelszereles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblFelszerelesNev))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHatterLayout.setVerticalGroup(
            pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHatterLayout.createSequentialGroup()
                .addGroup(pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHatterLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblIranytu))
                    .addGroup(pnlHatterLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEro)
                            .addComponent(lblEroMennyiseg))))
                .addGap(18, 18, 18)
                .addComponent(lblFelszerelesNev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFelszereles, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlHatterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblKep)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txtaSzoveg.setEditable(false);
        txtaSzoveg.setColumns(20);
        txtaSzoveg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtaSzoveg.setRows(5);
        txtaSzoveg.setText("Egy óriási mezőn vagy. Nyugat felé egy hatalmas épület körvonalai tűnnek fel.\n");
        txtaSzoveg.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(txtaSzoveg);

        txtfInput.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtfInput.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnEnter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHatterSzinLayout = new javax.swing.GroupLayout(pnlHatterSzin);
        pnlHatterSzin.setLayout(pnlHatterSzinLayout);
        pnlHatterSzinLayout.setHorizontalGroup(
            pnlHatterSzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHatterSzinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHatterSzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHatter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHatterSzinLayout.createSequentialGroup()
                        .addComponent(txtfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnter)
                        .addGap(49, 49, 49)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHatterSzinLayout.setVerticalGroup(
            pnlHatterSzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHatterSzinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHatter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHatterSzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnter))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHatterSzin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHatterSzin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
    
    txtaSzoveg.setText(leiras01);
    lblKep.setIcon(kezdes);
    String inputSzoveg=txtfInput.getText();
    String szoveg=txtaSzoveg.getText();
        //System.out.print(inputSzoveg);
        //2
        if ("megy kastély".equals(inputSzoveg)&&(szamlaloKastely==0)) {
            txtaSzoveg.setText(leiras02);
            szamlaloKastely+=1;
            txtfInput.setText("");
            lblKep.setIcon(kastely);
        //3
        }else if("megy kút".equals(inputSzoveg)){
            txtaSzoveg.setText(leiras03);
            txtfInput.setText("");
            lblKep.setIcon(kut);
        }else if("felvesz pénz".equals(inputSzoveg)){
            txtaSzoveg.setText(leiras04);
            lblFelszereles.setText(felszereles+="pénz ");
            txtfInput.setText("");
            lblKep.setIcon(kastely);
            eletero-=1;
            lblEroMennyiseg.setText(""+eletero);
        }else if("megy kastély".equals(inputSzoveg)&&(szamlaloKastely==1)){
            txtaSzoveg.setText(leiras05);
            txtfInput.setText("");
            szamlaloKastely+=1;
            lblKep.setIcon(kastely);
            eletero-=1;
            lblEroMennyiseg.setText(""+eletero);
        }else if("megy vártemplom".equals(inputSzoveg)){
            txtaSzoveg.setText(leiras06);
            txtfInput.setText("");
            lblKep.setIcon(szerzetes);
            eletero-=1;
            lblEroMennyiseg.setText(""+eletero);
        }else if("megy kamra".equals(inputSzoveg)){
            txtaSzoveg.setText(leiras09);
            txtfInput.setText("");
            lblKep.setIcon(kamra);
            szamlaloKamra+=1;
            eletero=10;
            lblEroMennyiseg.setText(""+eletero);
        }else if("megy ajtó".equals(inputSzoveg)){
            txtaSzoveg.setText(leiras14);
            txtfInput.setText("");
            lblKep.setIcon(ajto1);
            eletero-=1;
            lblEroMennyiseg.setText(""+eletero);
        }else if("használ pénz".equals(inputSzoveg)){
            txtaSzoveg.setText(leiras07);
            felszereles="kulcs";
            txtfInput.setText("");
            lblKep.setIcon(ajto1);
            eletero-=1;
            lblEroMennyiseg.setText(""+eletero);
        }else if("felvesz kulcs".equals(inputSzoveg)){
            txtaSzoveg.setText(leiras08);
            felszereles="kulcs";
            lblFelszereles.setText(felszereles);
            txtfInput.setText("");
            lblKep.setIcon(ajto1);
            eletero-=1;
            lblEroMennyiseg.setText(""+eletero);            
        }
    }//GEN-LAST:event_btnEnterActionPerformed

   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Idoregesz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Idoregesz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Idoregesz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Idoregesz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Idoregesz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEro;
    private javax.swing.JLabel lblEroMennyiseg;
    private javax.swing.JLabel lblFelszereles;
    private javax.swing.JLabel lblFelszerelesNev;
    private javax.swing.JLabel lblIranytu;
    private javax.swing.JLabel lblKep;
    private javax.swing.JPanel pnlHatter;
    private javax.swing.JPanel pnlHatterSzin;
    private javax.swing.JTextArea txtaSzoveg;
    private javax.swing.JTextField txtfInput;
    // End of variables declaration//GEN-END:variables
}
