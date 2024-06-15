
package modelo.IPC;

import java.util.ArrayList;
import java.util.List; 
import modelo.chat.Usuario;

public class UsuarioIPC {
    private List<Usuario> usuarios;

    public UsuarioIPC() {
        usuarios = new ArrayList<>();
    }
    
    public int buscar(String usuario){
        int n=-1;
        for(int i=0; i<usuarios.size(); i++){
            if(usuarios.get(i).getUsuario().equals(usuario)){
                n=i;
                break;
            }
        }
        return n;
    }
    
    public boolean insertar(Usuario usuario){
        if(buscar(usuario.getUsuario())==-1){
            usuarios.add(usuario);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean modificar(Usuario usuario){
        if(buscar(usuario.getUsuario())!=-1){
            Usuario usuarioaux=obtener(usuario.getUsuario());
            usuarioaux.setContraseña(usuario.getContraseña());
            usuarioaux.setApellido(usuario.getApellido());
            usuarioaux.setNombre(usuario.getNombre());
            usuarioaux.setEdad(usuario.getEdad());
            usuarioaux.setGenero(usuario.getGenero());
            usuarioaux.setTelefono(usuario.getTelefono());
                 
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eliminar(String usuario){
        if(buscar(usuario)!=-1){
            usuarios.remove(buscar(usuario));
            return true;
        }else{
            return false;
        }
    }
    
    public Usuario obtener(String usuario){
        if(buscar(usuario)!=-1){
            return usuarios.get(buscar(usuario));
        }else{
            return null;
        }
    }
    
}
