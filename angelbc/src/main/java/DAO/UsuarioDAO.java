package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import conexion.conexion;
import Modelo.usuario;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UsuarioDAO {
    
    
public usuario iniciarSesion(String email, String contrasena){
       
        usuario usuario = null;
        
        String query = "SELECT usuario_id, nombre_usuario, fecha_creacion, email, contrasena, cliente_id, apellido_paterno, apellido_materno FROM usuario WHERE email = ? AND contrasena = ?";
        
        System.out.println("iniciarSesion query: "+query);

        try {
            conexion db = new conexion();
            Connection con = db.conexion();
            try {
                PreparedStatement sent = con.prepareStatement(query);
                sent.setString(1, email);
                sent.setString(2,contrasena);
                ResultSet rs = sent.executeQuery();

            if (rs.next()) {
                usuario = new usuario();
                usuario.setApellidoMaterno(rs.getString("apellido_materno"));
                usuario.setApellidoPaterno(rs.getString("apellido_paterno"));
                usuario.setClienteId(rs.getInt("cliente_id"));
                usuario.setContrasena(rs.getString("contrasena"));
                usuario.setEmail(rs.getString("email"));
                usuario.setFechaCreacion(rs.getDate("fecha_creacion"));
                usuario.setNombreUsuario(rs.getString("nombre_usuario"));
                usuario.setUsuarioId(rs.getInt("usuario_id"));
            }
            
            } catch (Exception ex) {
                System.out.println("error" + ex.getMessage());
            }
            con.close();

        } catch (Exception ex) {
            System.out.println("error" + ex.getMessage());
        }
        return usuario;
    }
      
    
public usuario datosUsuario(int usuario_id){
       
        usuario usuario = null;
        
        String query = "SELECT usuario_id, nombre_usuario, fecha_creacion, email, contrasena, cliente_id, apellido_paterno, apellido_materno FROM usuario WHERE usuario_id = ? ";
        
        System.out.println("iniciarSesion query: "+query);

        try {
            conexion db = new conexion();
            Connection con = db.conexion();
            try {
                PreparedStatement sent = con.prepareStatement(query);
                sent.setInt(1, usuario_id);
                ResultSet rs = sent.executeQuery();

            if (rs.next()) {
                usuario = new usuario();
                usuario.setApellidoMaterno(rs.getString("apellido_materno"));
                usuario.setApellidoPaterno(rs.getString("apellido_paterno"));
                usuario.setClienteId(rs.getInt("cliente_id"));
                usuario.setContrasena(rs.getString("contrasena"));
                usuario.setEmail(rs.getString("email"));
                usuario.setFechaCreacion(rs.getDate("fecha_creacion"));
                usuario.setNombreUsuario(rs.getString("nombre_usuario"));
                usuario.setUsuarioId(rs.getInt("usuario_id"));
            }
            
            } catch (Exception ex) {
                System.out.println("error" + ex.getMessage());
            }
            con.close();

        } catch (Exception ex) {
            System.out.println("error" + ex.getMessage());
        }
        return usuario;
    }

   
public usuario insertarUsuario(usuario usuario) {
    
    usuario nuevoUsuario = null;

    String query = "INSERT INTO usuario (nombre,apellido_paterno,apellido_materno,fecha_nacimiento,direccion,telefono,correo,contrasena,fecha_creacion) "
                 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    System.out.println("insertarUsuario query: "+query);
    
    try {
        conexion db = new conexion();
        Connection con = db.conexion();

        try {
            PreparedStatement sent = con.prepareStatement(query);
            sent.setString(1, usuario.getNombreUsuario());
            sent.setString(2, usuario.getApellidoPaterno());
            sent.setString(3, usuario.getApellidoMaterno());
            sent.setString(4, usuario.getFecha_nacimiento());
            sent.setString(5, usuario.getDireccion());
            sent.setString(6, usuario.getTelefono());
            sent.setString(7, usuario.getEmail());
            sent.setString(8, usuario.getContrasena());
            
            LocalDateTime fechaCreacion = LocalDateTime.now();
                sent.setString(9, fechaCreacion.toString());

            // Verificar si se insertó al menos una fila
            if (filasInsertadas > 0) {
                nuevoUsuario = (usuario) datosUsuario(usuario.getUsuarioId()); // La inserción fue exitosa voy a buscar datos para mostrar
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        con.close();
    } catch (Exception ex) {
        System.out.println("Error: " + ex.getMessage());
    }

    return nuevoUsuario; // se envia el objeto usuario con los datos registrados
}


}