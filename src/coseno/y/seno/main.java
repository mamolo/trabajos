package coseno.y.seno;
import javax.swing.JOptionPane;

public class main {
   
    public static void main(String[] args) {
     String n="";
     int n1=0;
     cosenoseno op=new cosenoseno();
     n=JOptionPane.showInputDialog("Menu"
                                    +"\n Por favor seleccione el programa que desea ejecutar"
                                    +"\n 1.Coseno"
                                    +"\n 2.Seno");
     
      n1=Integer.parseInt(n);
        switch (n1){
            case 1:
                op.setcoseno();
                break;
            case 2:
                op.setseno();
                break;
      }
     
    }
    
}
