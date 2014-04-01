//Données Brutes Netbeans

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gdr.qubazts;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author GDR
 */
class FQDGraph extends JFrame
{
    private JPanel pnl;
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    boolean dp = false;
    
    public FQDGraph()
    {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Graph Debug 1");
        this.setVisible(false);
        
        pnl = new JPanel(new BorderLayout());
        setContentPane(pnl);
        setSize(400, 250);

        MainFrame main = new MainFrame();
        
        dataset.addValue(main.nb3, "Nb3", "Nb3"); //d3
        dataset.addValue(main.nb4, "Nb4", "Nb4");
        dataset.addValue(main.getNb(5), "Nb5", "Nb5");
        dataset.addValue(main.getNb(6), "Nb6", "Nb6"); //d3
        dataset.addValue(main.getNb(7), "Nb7", "Nb7");
        dataset.addValue(main.getNb(8), "Nb8", "Nb8");
        dataset.addValue(main.getNb(9), "Nb9", "Nb9"); 
        dataset.addValue(main.getNb(10), "Nb10", "Nb10");
        dataset.addValue(main.getNb(11), "Nb11", "Nb11");
        dataset.addValue(main.getNb(12), "Nb12", "Nb12"); 
        dataset.addValue(main.getNb(13), "Nb13", "Nb13");
        dataset.addValue(main.getNb(14), "Nb14", "Nb14");
        dataset.addValue(main.getNb(15), "Nb15", "Nb15"); 
        dataset.addValue(main.getNb(16), "Nb16", "Nb16");
        dataset.addValue(main.getNb(17), "Nb17", "Nb17");
        dataset.addValue(main.getNb(18), "Nb18", "Nb18");
 
        JFreeChart barChart = ChartFactory.createBarChart("Données des totaux", "",
        "Nombre de succès", dataset, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel cPanel = new ChartPanel(barChart);
        pnl.add(cPanel);
    }

    void render(boolean b) 
    {
        if (b == true)
        {
            this.setVisible(true);
        }
        else
        {
            this.setVisible(false);
        }
    }
    
    public void deleteData()
    {
        dataset.clear();
    }
    
    public void addArg(int a, String b, String c)
    {
        dataset.addValue(a, b, c);
    }
    
    public void tryDisplay()
    {
        if (dp == false)
        {
            JOptionPane displayn = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Aucun graphique à charger", "QuB Baz - Erreur", JOptionPane.ERROR_MESSAGE);
            this.render(true);
        }
        else
        {
            this.render(true);
        }
    }
}
