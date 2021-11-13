package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
        
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearMascota(String numCliente,String nombre,String raza,
            String color,boolean alergico,boolean atencionEspecial,String nombreDuenio,
            String celularDuenio,String observaciones){
        
        Mascota mascota = new Mascota();
        
        mascota.setNombre_perro(nombre);
        mascota.setNum_cliente(numCliente);
        mascota.setNombre_duenio(nombreDuenio);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencionEspecial);
        mascota.setCelular_duenio(celularDuenio);
        mascota.setObservaciones(observaciones);
        
        controlPersis.crearMascota(mascota);
        
    }
    
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
