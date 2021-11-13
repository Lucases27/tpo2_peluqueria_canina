package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
        
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void altaMascota(Mascota mascota){
        controlPersis.crearMascota(mascota);
    }
    
    public void bajaMascota(Mascota mascota){
        controlPersis.eliminarMascota(mascota);
    }
    
    public void bajaMascota(int idMascota){
        controlPersis.eliminarMascota(idMascota);
    }
    
    public List<Mascota> traerMascotas(){
        return controlPersis.getMascotas();
    }
    
    public void modificarMascota(Mascota mascota){
        controlPersis.modificarMascota(mascota);
    }
    
    public void buscarMascota(Mascota mascota){
        controlPersis.buscarMascota(mascota);
    }
    
    public void buscarMascota(int idMascota){
        controlPersis.buscarMascota(idMascota);
    }
}
