package amazon.Forms;

import amazon.ListProduct;
import amazon.Product;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author andre
 */
public class LoadFile extends JFrame implements ActionListener {

    public ListProduct Lp = new ListProduct();
    private JTextField txt;
    private JButton btn;

    public LoadFile() {
        super("Load File Amazon.txt");
        setLayout(new FlowLayout());

        txt = new JTextField(30);
        add(txt);

        btn = new JButton("Select File...");
        btn.addActionListener(this);
        add(btn);
    }

    public static void main(String[] args) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("TXT Files", "txt", "csv");
        fileChooser.setFileFilter(imgFilter);

        int result = fileChooser.showOpenDialog(this);

        if (result != JFileChooser.CANCEL_OPTION) {

            File fileName = fileChooser.getSelectedFile();

            if ((fileName == null) || (!"AMAZON.TXT".equals(fileName.getName().toUpperCase())) || (fileName.getName().equals(""))) {
                JOptionPane.showMessageDialog(null, "El Nombre del archivo debe ser Amazon.txt y NO: " + fileName.getName().toUpperCase());
                txt.setText("Seleccione un archivo con el nombre Amazon.txt");
            } else {
                txt.setText(fileName.getAbsolutePath());
                JOptionPane.showMessageDialog(null, "Cargar datos en las Listas Creadas" + fileName.getName());
                String SEPARATOR = ",";
                String cadena;
                BufferedReader br = null;
                try {
                    JOptionPane.showMessageDialog(null, "Ingrese Clave:" + fileName.getAbsolutePath());
                    br = new BufferedReader(new FileReader(fileName.getAbsolutePath()));
                    Product p = new Product();
                    String line = br.readLine();

                    while (null != line) {
                        String[] fields = line.split(SEPARATOR);
                        cadena = fields[0];

                        p.setName(line);
                        JOptionPane.showMessageDialog(null, "Mostrar: " + p.getName());
                        line = br.readLine();

                        Lp.insertEnd(p);
                    }
                    br.close();
                    //Main Main = new Main();
                    //Main.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    //Main.setSize(500, 110);
                    //Main.setVisible(true);

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LoadFile.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(LoadFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
