package com.rk.rt;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {

    JLabel X;
    Timer Y;

    public FormUtama() {
        super("Teks Berjalan");
        Inisialisasi_Komponen();
        AktifkanTeksBerjalan();
    }

    public void Inisialisasi_Komponen() {
        X = new JLabel("Ini adalah sebuah teks yang diperintahkan untuk berjalan");
        getContentPane().add(X, BorderLayout.CENTER);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void AktifkanTeksBerjalan() {
        Y = new Timer(100, new PenerimaAksi(X));
        X.addMouseListener(new AdapterMouseTeksBerjalan(Y));
        Y.start();
    }

}
