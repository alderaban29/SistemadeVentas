package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Usuario;

public class Ctrl_Usuario {
    
    
    /**
     * **************************************************
     * metodo para guardar un nuevo usuario
     * **************************************************
     */
    public boolean guardar(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_usuario values(?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getPassword());
            consulta.setString(6, objeto.getTelefono());
            consulta.setString(7, objeto.getRol());
            consulta.setInt(8, objeto.getEstado());
            consulta.setString(9, objeto.getPalabra_secreta());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar usuario: " + e);
        }
        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si el producto ya esta registrado en la BBDD
     * ********************************************************************
     */
    public boolean existeUsuario(String usuario) {
        boolean respuesta = false;
        String sql = "select usuario from tb_usuario where usuario = '" + usuario + "';";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar usuario: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para Iniciar Sesion
     * **************************************************
     */
    public String loginUser(String user, String password ) {
        //boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String rol= "";
        String sql = "select rol from tb_usuario where usuario = '" + user + "' and password = '" + password + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                rol = rs.getString(1);
                
                
                //respuesta = true;
                //System.out.println(rs.getObject(0));
            }
        } catch (SQLException e) {
            //System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");//frmmensajesistema
        }
        return rol;
    }
    
    public boolean verificarPalabraSecreta(String user, String palabra_secreta) {
        //boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String usuario = "";
        boolean consulta = false;///////////consultaaaaaaaaa
        String sql = "select usuario from tb_usuario where usuario = '" + user + "' and palabra_secreta = '" + palabra_secreta + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                usuario = rs.getString(1);
                //test(usuario);
                consulta = true;
                
                //System.out.println(rs.getObject(0));
            }
        } catch (SQLException e) {
            System.out.println("Verifica la palabra secreta");
            //JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");//frmmensajesistema
        }
        return consulta;
    }
    
    public String actualizarContraseña(String password, String usuario){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try {

            //PreparedStatement consulta = cn.prepareStatement("update tb_usuario where password='"+ password +"' ?");
            PreparedStatement consulta = cn.prepareStatement("update tb_usuario set password= ? where usuario ='" + usuario + "'");
            //consulta.setString(1, objeto.getNombre());;
            consulta.setString(1, password);
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
                JOptionPane.showMessageDialog(null, "Contraseña actualizada con exito");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar la contraseña: " + e);
        }
        return null;
    }
    
    /**
     * **************************************************
     * metodo para actualizar un usuario
     * **************************************************
     */
    public boolean actualizar(Usuario objeto, int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_usuario set nombre=?, apellido = ?, usuario = ?, password= ?, telefono = ?, estado = ? where idUsuario ='" + idUsuario + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getUsuario());
            consulta.setString(4, objeto.getPassword());
            consulta.setString(5, objeto.getTelefono());
            consulta.setInt(6, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar un usuario
     * **************************************************
     */
    public boolean eliminar(int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_usuario where idUsuario ='" + idUsuario + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: " + e);
        }
        return respuesta;
    }
    
    
}
