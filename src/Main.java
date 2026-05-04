// calcular resistencias con menu


import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args){
        JFrame ventana = new JFrame("resistencias");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500,500);
        ventana.setLayout(new FlowLayout());
        // vaina para las opciones
        String opciones[] = {"negro","cafe","rojo","naranja","verde","amarillo","azul","violeta","gris","blanco"};
        String rango[] = {"dorado", "plateado", "cafe" , "rojo"};
        //labels
        Panel panel = new Panel();
        JLabel resistencia = new JLabel("<html><div style='width:200px; height:50px;'>resistencia: </div></html>");
        JLabel titulo_1 = new JLabel("<html><div style = 'width:300px; text-align:center'>hola</div></html>");
        JLabel titulo_2 = new JLabel("<html><p syle = 'width:300px'>hola, aqui se podra calcular el valor de una resistencia dada</p></html>");
        JLabel imagen_r = new JLabel("<html><img src='https://angelmicelti.github.io/4ESO/EAN/resistencia_electrica_1.png'></html>");
        JComboBox <String> caja_1 = new JComboBox<>(opciones);
        JComboBox <String> caja_2 = new JComboBox<>(opciones);
        JComboBox <String> caja_3 = new JComboBox<>(opciones);
        JComboBox <String> caja_4 = new JComboBox<>(rango);
        JButton boton1 = new JButton("<html><div style='text-align:center ;width:200px;height:10px'>calcular</div></html>");

        // calcular la resistencia

        boton1.addActionListener(e -> {
            String tole = "";
            int r = 0;
            int banda_1 = caja_1.getSelectedIndex();
            int banda_2 = caja_2.getSelectedIndex();
            int banda_3 = caja_3.getSelectedIndex();
            int banda_4 = caja_4.getSelectedIndex();
            r = banda_1;
            banda_3++;
            r = r * 10 + banda_2;
            for (int i=1;i<banda_3;i++) {
                r = r * 10;
            }
            switch (banda_4) {
                case 0:
                    tole = "+- 5%";
                    break;
                case 1:
                    tole = "+- 10%";
                    break;
                case 2:
                    tole = "+- 1%";
                    break;
                case 3:
                    tole = "+- 2%";
                    break;
            }
            resistencia.setText("<html><div style='width:200px; height:50px;'>resistencia:  " +  String.valueOf(r)  + " tolerancia: " + tole + "</div></html>");
        });



        //añadirir

        ventana.add(titulo_1);
        ventana.add(titulo_2);
        ventana.add(imagen_r);

        panel.add(caja_1);
        panel.add(caja_2);
        panel.add(caja_3);
        panel.add(caja_4);
        ventana.add(panel);
        ventana.add(boton1);
        ventana.add(resistencia);
        ventana.setVisible(true);
    }
}
