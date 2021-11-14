/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import com.toedter.calendar.demo.DateChooserPanel;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.xml.crypto.Data;

/**
 *
 * @author ashwi
 */
public class CommonFunctions
{
    static public void switchPanel(JLayeredPane layeredPane,JPanel pane)
    {
        layeredPane.removeAll();
        layeredPane.add(pane);
        layeredPane.repaint();
        layeredPane.revalidate();
    }
     static public void addimage(JLabel lblobj,String path)
    {
        BufferedImage imgBufferedImage=null;
        try
        {
            imgBufferedImage=ImageIO.read(new File(path));
            Image newimg=imgBufferedImage.getScaledInstance(lblobj.getWidth(),lblobj.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon=new ImageIcon(newimg);
            lblobj.setIcon(icon);
            
                    
        } 
        catch (Exception e)
        {
            System.out.println("caught");
        }
        
    }
    static  public void setDate(JLabel label)
    {
        Calendar cal=Calendar.getInstance();
        int day=cal.get(Calendar.DAY_OF_MONTH);
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        String dString=(day+"/"+month+"/"+year);
        label.setText(dString);
    }
    static public void setTime(JLabel label)
    {
        Calendar cldCalendar=Calendar.getInstance();
        Date d=cldCalendar.getTime();
        SimpleDateFormat sd =new SimpleDateFormat("dd-MM-yyyy_hh::mm::ss");
        String myDate=sd.format(d);
        label.setText(myDate);
        System.out.println(myDate);
    }
}
