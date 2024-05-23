package GUI.Tugas;

import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {

JMenuBar mb = new JMenuBar();
JMenu file = new JMenu("File");
JMenu edit = new JMenu("Edit");
JMenu help = new JMenu("Help");
JMenuItem open = new JMenuItem("Open");
JMenuItem close = new JMenuItem("Close");
JMenuItem quit = new JMenuItem("Quit");
JMenuItem about = new JMenuItem("About");
JMenuItem copy = new JMenuItem("Copy");
JMenuItem paste = new JMenuItem("Paste");

JMenuItem cut = new JMenuItem("Cut");
JLabel lblnama = new JLabel("Nama");
JTextField txnama = new JTextField(30);
JLabel lblTglLahir = new JLabel("Tanggal Lahir");
JTextField txTglLahir = new JTextField(30);
JLabel lblNomor = new JLabel("No.Pendaftaran");
JTextField txNomor = new JTextField(30);
JLabel lblAlamat = new JLabel("Alamat");
JTextField txAlamat = new JTextField(30);
JLabel lblEmail = new JLabel("E-mail");
JTextField txEmail = new JTextField(30);
JButton sumbit = new JButton("sumbit");
JTextArea hasil = new JTextArea();

Gui() {
    setTitle("DATA MAHASISWA");
    setLocation(300, 100);
    setSize(340, 290);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

void KomponenVisual() {
    setJMenuBar(mb);
    mb.add(file);
    mb.add(edit);
    mb.add(help);
    file.add(open);
    file.add(close);
    edit.add(copy);
    edit.add(paste);
    edit.add(cut);
    close.setEnabled(false);
    file.add(quit);
    help.add(about);
    setVisible(true);
    getContentPane().setLayout(null);
    getContentPane().add(lblnama);
    lblnama.setBounds(10, 10, 200, 20);

    
    getContentPane().add(txnama);
    txnama.setBounds(115, 10, 200, 20);

    getContentPane().add(lblTglLahir);
    lblTglLahir.setBounds(10, 33, 200, 20);

    getContentPane().add(txTglLahir);
    txTglLahir.setBounds(115, 33, 200, 20);

    getContentPane().add(lblNomor);
    lblNomor.setBounds(10, 56, 200, 20);
    
    getContentPane().add(txNomor);
    txNomor.setBounds(115, 56, 200, 20);

    getContentPane().add(lblAlamat);
    lblAlamat.setBounds(10, 80, 70, 20);

    getContentPane().add(txAlamat);
    txAlamat.setBounds(115, 80, 200, 40);

    getContentPane().add(lblEmail);
    lblEmail.setBounds(10, 126, 80, 20);

    getContentPane().add(txEmail);
    txEmail.setBounds(115, 126, 200, 20);

    getContentPane().add(sumbit);
    sumbit.setBounds(200, 170, 100, 20);
}

void AksiReaksi() {
    sumbit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            hasil.append(lblnama.getText() + "\t: " + txnama.getText() + "\n");
            hasil.append(lblTglLahir.getText() + "\t: " + txTglLahir.getText() + "\n");
            hasil.append(lblNomor.getText() + ": " + txNomor.getText() + "\n");
            hasil.append(lblAlamat.getText() + "\t: " + txAlamat.getText() + "\n");
            hasil.append(lblEmail.getText() + "\t: " + txEmail.getText() + "\n");
            
            JButton btn = (JButton) event.getSource();

            JFrame tab = new JFrame();
            if (btn == sumbit) {
                JOptionPane.showMessageDialog(tab, getContentPane().add(hasil), "Data Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    });
}
    public static void main(String args[]) {
        Gui tabel = new Gui();
        tabel.KomponenVisual();
        tabel.AksiReaksi();}
}