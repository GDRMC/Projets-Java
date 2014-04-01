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
class FQTGraph extends JFrame
{
    private JPanel pnl;
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    boolean dp = false;
    
    public FQTGraph()
    {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Graph Debug 2");
        this.setVisible(false);
        
        pnl = new JPanel(new BorderLayout());
        setContentPane(pnl);
        setSize(400, 250);
 
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(120000.0, "Produit 1", "2000");
        dataset.addValue(550000.0, "Produit 1", "2001");
        dataset.addValue(180000.0, "Produit 1", "2002");
        dataset.addValue(270000.0, "Produit 2", "2000");
        dataset.addValue(600000.0, "Produit 2", "2001");
        dataset.addValue(230000.0, "Produit 2", "2002");
        dataset.addValue(90000.0, "Produit 3", "2000");
        dataset.addValue(450000.0, "Produit 3", "2001");
        dataset.addValue(170000.0, "Produit 3", "2002");
 
        JFreeChart barChart = ChartFactory.createBarChart("Nombre", "",
        "Fréquence", dataset, PlotOrientation.VERTICAL, true, true, false);
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
