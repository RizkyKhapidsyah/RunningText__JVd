package com.rk.rt;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AdapterMouseTeksBerjalan extends MouseAdapter {
    Timer Kecepatan_Var;

    public AdapterMouseTeksBerjalan(Timer Kecepatan_Param) {
        Kecepatan_Var = Kecepatan_Param;
    }

    public void mouseDiEnter(MouseEvent E){
        Kecepatan_Var.stop();
    }

    public void mouseDiExited(MouseEvent E){
        Kecepatan_Var.start();
    }

}
