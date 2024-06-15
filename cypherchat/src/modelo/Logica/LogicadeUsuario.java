
package modelo.Logica;

import modelo.IPC.UsuarioIPC;
import modelo.chat.Usuario;

public class LogicadeUsuario {
    private static UsuarioIPC usuarioipc = new UsuarioIPC();
    
    public static boolean autentificar(String usuario, String contraseña){
        if(obtener(usuario)!=null){
            Usuario Usuarioconsulta=obtener(usuario);
            if (Usuarioconsulta.getUsuario().equals(usuario)&&Usuarioconsulta.getContraseña().equals(contraseña)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public static boolean insertar(Usuario usuario){
        return usuarioipc.insertar(usuario);
    }
    
    public static boolean modificar(Usuario usuario){
        return usuarioipc.modificar(usuario);
    }
    
    public static boolean eliminar(String usuario){
        return usuarioipc.eliminar(usuario);
    }
    
    public static Usuario obtener(String usuario){
        return usuarioipc.obtener(usuario);
    }
    
}
