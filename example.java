import javax.swing.*;
/* 
import der javax swing library 
Aufruf Klasse newWindow
*/
class newWindow{

/*
main Methode 
*/
    public static void main(String args[]){

    //public String displayVorname = public String vorname;
       JFrame frame = new JFrame("Einfach Java mit Swing");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       //JButton button = new JButton("Press");
     //  frame.getContentPane().add(button); 
/*
Einfaches Label auf Window. Kann auch genutzt werden, um Klasse Kunde auszugeben
*/
    JLabel vornameLabel = new JLabel("Position eines einfachen Labels, kann auch Variablen ausgeben.");
     frame.getContentPane().add(vornameLabel);
       frame.setVisible(true);
       System.out.print(vornameLabel.getText());
       
    }
}
/*
Klasse Kunde wie in Kapitel 4/4
*/
class Kunde {   
    public String name;
    public String vorname;
    public String geschlecht;
    public String geburtsdatum;     
        public String getName() {
            name= "Skywalker";
            return name;
        }
        public String getVorname() {
            vorname = "Luke";
            return vorname;
        }
        public String getGeschlecht() {
            geschlecht = "w";
            return geschlecht;
        }
        public String getGeburtsdatum() {
            geburtsdatum = "01.01.2001";
            return geburtsdatum;
        }
      /* 
Mit public void setName kann der oben zugewisene name neu deklariert werden

       public void setName(String name) {
            this.name = name;
        }
        */
        }  

   

