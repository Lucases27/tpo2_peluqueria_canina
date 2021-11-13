package logica;

import igu.Principal;

public class Main {
    
    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        Principal prin = new Principal(control);
        prin.setVisible(true);
        prin.setLocationRelativeTo(null);
    }
}
