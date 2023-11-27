/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica7;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class UIComputadora extends Canvas {

    private BufferedImage image;
    static private Computadora compu;
    public UIComputadora(Computadora compu) {
        this.compu=compu;
        try {
            // Cargar la imagen desde el archivo PNG
            image = ImageIO.read(new File("C:\\Users\\trejo\\OneDrive\\Documentos\\NetBeansProjects\\practica7\\src\\main\\java\\com\\mycompany\\practica7\\148305253-pc-o-computadora-de-escritorio-concepto-de-vector-icono-mínimo-o-signo-en-estilo-de-contorno.jpg"));

            // Verificar si la imagen se cargó correctamente
            if (image == null) {
                System.out.println("Error: No se pudo cargar la imagen.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        

        // Agregar un escuchador de eventos de ratón
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Acción a realizar al hacer clic en la imagen
                if(e.getX()>10 && e.getX()<(100+10) && e.getY()>10 && e.getY()<(100+10))System.out.println(compu.toString());
                
            }
        });
    }

    
  
    public void paint(Graphics g) {
        // Dibujar la imagen en el objeto Canvas
        if (image != null) {
            g.drawImage(image, 10, 10, 100, 100, this);
        }
    }

    public static void main(JFrame frame) {
        UIComputadora canvas = new UIComputadora(compu);
        
        frame.setSize(300, 300);
        frame.add(canvas);
        frame.setVisible(true);

        // Cerrar la aplicación al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public String toString() {
        return "UIComputadora{" + "compu=" + compu + '}'+ super.toString();
    }
    
}