//Données Brutes Netbeans

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gdr.qubazts;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author GDR
 */
public class MainFrame extends javax.swing.JFrame {

    
        int n;
        //valeur dés
        byte d1;
        byte d2;
        byte d3;
        //total des 3 dés
        byte td = 0;
        //nombre de fois que le total est tombé
        int nb3;
        int nb4;
        int nb5;
        int nb6;
        int nb7;
        int nb8;
        int nb9;
        int nb10;
        int nb11;
        int nb12;
        int nb13;
        int nb14;
        int nb15;
        int nb16;
        int nb17;
        int nb18;
        float fq3;
        float fq4;
        float fq5;
        float fq6;
        float fq7;
        float fq8;
        float fq9;
        float fq10;
        float fq11;
        float fq12;
        float fq13;
        float fq14;
        float fq15;
        float fq16;
        float fq17;
        float fq18;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QubazTs - Build 16 - GDR");
        setBackground(new java.awt.Color(153, 180, 209));
        setResizable(false);

        jLabel1.setText("n=");

        jTextField1.setText("10000");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Lancer la simulation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(215, 228, 242));

        jLabel2.setText("Résultats:");

        jButton2.setText("Remettre à zéro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("QubazTs - Build 16 (vAlpha)");

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Rien à afficher");
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("Rien à afficher");
        jScrollPane4.setViewportView(jTextArea4);

        jLabel3.setText("Nb de totaux de dés:");

        jLabel4.setText("Fréquences observées:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)))
        );

        jLabel6.setText("SimpleFrq - Build 2 - GDR 2013");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextField1.setEditable(true);
        jTextArea3.setText("Rien à afficher");
        jTextArea4.setText("Rien à afficher");
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextField1.setEditable(false);
        int n = Integer.parseInt(jTextField1.getText());
        JOptionPane displayn = new JOptionPane();
        JOptionPane.showMessageDialog(null, "Démarrage de la simulation.\nParamètre(s):\n- n="+n, "Lancement du calcul...", JOptionPane.INFORMATION_MESSAGE);
        calc(n);
    }                                        

    public void calc(int xn)
    {
        int n = xn;
        //valeur dés
        byte d1;
        byte d2;
        byte d3;
        //total des 3 dés
        byte td;
        //System.out.println(d1+" "+d2+" "+d3);
        //nombre de fois que le total est tombé
        nb3 = 0;
        nb4 = 0;
        nb5 = 0;
        nb6 = 0;
        nb7 = 0;
        nb8 = 0;
        nb9 = 0;
        nb10 = 0;
        nb11 = 0;
        nb12 = 0;
        nb13 = 0;
        nb14 = 0;
        nb15 = 0;
        nb16 = 0;
        nb17 = 0;
        nb18 = 0;
        //compteur
        int inin = 0;
        while(inin != n)
        {
            Random r = new Random();
            d1 = (byte) (1 + r.nextInt(7 - 1));
            d2 = (byte) (1 + r.nextInt(7 - 1));
            d3 = (byte) (1 + r.nextInt(7 - 1));
            td = (byte) (d1+d2+d3);
            switch(td)
            {
                case 3:
                    nb3++;
                    break;
                case 4:
                    nb4++;
                    break;
                case 5:
                    nb5++;
                    break;
                case 6:
                    nb6++;
                    break;
                case 7:
                    nb7++;
                    break;
                case 8:
                    nb8++;
                    break;
                case 9:
                    nb9++;
                    break;
                case 10:
                    nb10++;
                    break;
                case 11:
                    nb11++;
                    break;
                case 12:
                    nb12++;
                    break;
                case 13:
                    nb13++;
                    break;
                case 14:
                    nb14++;
                    break;
                case 15:
                    nb15++;
                    break;
                case 16:
                    nb16++;
                    break;
                case 17:
                    nb17++;
                    break;
                case 18:
                    nb18++;
                    break;
            }
            //System.out.println(d1+";"+d2+";"+d3+";"+String.valueOf(td)+" "+inin);
            inin++;
        }
        fq3 =(float)nb3/n;
        fq4 =(float)nb4/n;
        fq5 =(float)nb5/n;
        fq6 =(float)nb6/n;
        fq7 =(float)nb7/n;
        fq8 =(float)nb8/n;
        fq9 =(float)nb9/n;
        fq10 =(float)nb10/n;
        fq11 =(float)nb11/n;
        fq12 =(float)nb12/n;
        fq13 =(float)nb13/n;
        fq14 =(float)nb14/n;
        fq15 =(float)nb15/n;
        fq16 =(float)nb16/n;
        fq17 =(float)nb17/n;
        fq18 =(float)nb18/n;
        long disptotal = nb3+nb4+nb5+nb6+nb7+nb8+nb9+nb10+nb11+nb12+nb13+nb14+nb15+nb16+nb17+nb18;
        JOptionPane.showMessageDialog(null, "Total:"+disptotal, "Debug - Fin de simulation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, 
                "nb3="+nb3+"  fq3="+fq3+
                "\nnb4="+nb4+"  fq4="+fq4+
                "\nnb5="+nb5+"  fq5="+fq5+
                "\nnb6="+nb6+"  fq6="+fq6+
                "\nnb7="+nb7+"  fq7="+fq7+
                "\nnb8="+nb8+"  fq8="+fq8+
                "\nnb9="+nb9+"  fq9="+fq9+
                "\nnb10="+nb10+"  fq10="+fq10+
                "\nnb11="+nb11+"  fq11="+fq11+
                "\nnb12="+nb12+"  fq12="+fq12+
                "\nnb13="+nb13+"  fq13="+fq13+
                "\nnb14="+nb14+"  fq14="+fq14+
                "\nnb15="+nb15+"  fq15="+fq15+
                "\nnb16="+nb16+"  fq16="+fq16+
                "\nnb17="+nb17+"  fq17="+fq17+
                "\nnb18="+nb18+"  fq18="+fq18   , "Debug - Fin de simulation", JOptionPane.INFORMATION_MESSAGE);
        jTextArea3.setText("");
        jTextArea3.append("nb3=   "+nb3);
        jTextArea3.append("\nnb4=   "+nb4);
        jTextArea3.append("\nnb5=   "+nb5);
        jTextArea3.append("\nnb6=   "+nb6);
        jTextArea3.append("\nnb7=   "+nb7);
        jTextArea3.append("\nnb8=   "+nb8);
        jTextArea3.append("\nnb9=   "+nb9);
        jTextArea3.append("\nnb10= "+nb10);
        jTextArea3.append("\nnb11= "+nb11);
        jTextArea3.append("\nnb12= "+nb12);
        jTextArea3.append("\nnb13= "+nb13);
        jTextArea3.append("\nnb14= "+nb14);
        jTextArea3.append("\nnb15= "+nb15);
        jTextArea3.append("\nnb16= "+nb16);
        jTextArea3.append("\nnb17= "+nb17);
        jTextArea3.append("\nnb18= "+nb18);
        jTextArea4.setText("");
        jTextArea4.append("fq3=   "+fq3);
        jTextArea4.append("\nfq4=   "+fq4);
        jTextArea4.append("\nfq5=   "+fq5);
        jTextArea4.append("\nfq6=   "+fq6);
        jTextArea4.append("\nfq7=   "+fq7);
        jTextArea4.append("\nfq8=   "+fq8);
        jTextArea4.append("\nfq9=   "+fq9);
        jTextArea4.append("\nfq10= "+fq10);
        jTextArea4.append("\nfq11= "+fq11);
        jTextArea4.append("\nfq12= "+fq12);
        jTextArea4.append("\nfq13= "+fq13);
        jTextArea4.append("\nfq14= "+fq14);
        jTextArea4.append("\nfq15= "+fq15);
        jTextArea4.append("\nfq16= "+fq16);
        jTextArea4.append("\nfq17= "+fq17);
        jTextArea4.append("\nfq18= "+fq18);
        
        FQDGraph gr1 = new FQDGraph();
        gr1.setVisible(true);
        
    }
    
    public int getNb(int a)
    {
        switch(a)
            {
                case 3:
                    return nb3;
                case 4:
                    return nb4;
                case 5:
                    return nb5;
                case 6:
                    return nb6;
                case 7:
                    return nb7;
                case 8:
                    return nb8;
                case 9:
                    return nb9;
                case 10:
                    return nb10;
                case 11:
                    return nb11;
                case 12:
                    return nb12;
                case 13:
                    return nb13;
                case 14:
                    return nb14;
                case 15:
                    return nb15;
                case 16:
                    return nb16;
                case 17:
                    return nb17;
                case 18:
                    return nb18;
                default: 
                    return 0;
                    
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   

}
