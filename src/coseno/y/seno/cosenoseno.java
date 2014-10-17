package coseno.y.seno;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class cosenoseno {
    
    public cosenoseno (){
   }
     public void setcoseno(){
        String n1="";
        double a=0,cos=0;
        n1=JOptionPane.showInputDialog("por favor ingrese el numero que desea conocer el coseno");
        a=Double.parseDouble(n1);
        cos=Math.cos(a);
        JOptionPane.showMessageDialog(null, "el coseno de "+a+" es "+cos);
        
    }
    
     public void setseno(){
        String n1="";
        double a=0,sen=0;
        n1=JOptionPane.showInputDialog("por favor ingrese el numero que desea conocer el seno");
        a=Double.parseDouble(n1);
        sen=Math.sin(a);
        JOptionPane.showMessageDialog(null, "el seno de "+a+" es "+sen);
        
    }
  }