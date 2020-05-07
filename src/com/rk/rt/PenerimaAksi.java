package com.rk.rt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PenerimaAksi implements ActionListener {

    JLabel Label_Var;

    public PenerimaAksi(JLabel Label_Param) {
        this.Label_Var = Label_Param;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String TeksLama, TeksBaru;

        TeksLama = Label_Var.getText();
        TeksBaru = TeksLama.substring(1) + TeksLama.substring(0, 1);
        Label_Var.setText(TeksBaru);
    }
}
