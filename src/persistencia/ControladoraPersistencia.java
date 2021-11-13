package persistencia;

import java.util.List;
import logica.Mascota;


public class ControladoraPersistencia {
    
    MascotaJpaController mascotaJPA = new MascotaJpaController();
    
    
    public void crearMascota(Mascota mascota){
        try {
            mascotaJPA.create(mascota);
        } catch (Exception e) {
            System.out.println("No se pudo crear mascota.");
        }
    }
    
    public void eliminarMascota(Mascota mascota){
        int idMascota = mascota.getId();
        try {
            mascotaJPA.destroy(idMascota);
        } catch (Exception e) {
            System.out.println("No se pudo eliminar mascota.");
        }
    }
    
    public void eliminarMascota(int idMascota){
        try {
            mascotaJPA.destroy(idMascota);
        } catch (Exception e) {
            System.out.println("No se pudo eliminar mascota.");
        }
    }
    
    public void modificarMascota(Mascota mascota){
        try {
            mascotaJPA.edit(mascota);
        } catch (Exception e) {
            System.out.println("No se pudo modificar mascota.");
        }
    }
    
    public List<Mascota> getMascotas(){
        return mascotaJPA.findMascotaEntities();
    } 
    
    public Mascota buscarMascota(Mascota mascota){
        int idMascota = mascota.getId();
        return mascotaJPA.findMascota(idMascota);
    }
    
    public Mascota buscarMascota(int idMascota){
        return mascotaJPA.findMascota(idMascota);
    }
    
}
