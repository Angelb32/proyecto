package servlet;

import DAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Modelo.usuario;

public class Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String option = request.getParameter("option") != null ? String.valueOf(request.getParameter("option")) : "";
	String email = request.getParameter("email") != null ? String.valueOf(request.getParameter("email")) : "";
	String contrasena = request.getParameter("contrasena") != null ? String.valueOf(request.getParameter("contrasena")) : "";
        String Nombre = request.getParameter("Nombre") != null ? String.valueOf(request.getParameter("Nombre")) : "";
        String Paterno = request.getParameter("Paterno") != null ? String.valueOf(request.getParameter("Paterno")) : "";
        String Materno = request.getParameter("Materno") != null ? String.valueOf(request.getParameter("Materno")) : "";       
        String fecha_nacimiento = request.getParameter("fecha_nacimiento") != null ? String.valueOf(request.getParameter("fecha_nacimiento")) : "";
        String Direccion = request.getParameter("Direccion") != null ? String.valueOf(request.getParameter("Direccion")) : "";     
        String telefono = request.getParameter("telefono") != null ? String.valueOf(request.getParameter("telefono")) : ""; 
        String Repetir = request.getParameter("Repetir") != null ? String.valueOf(request.getParameter("Repetir")) : "";       

        System.out.println("email "+email);
        System.out.println("contraseña "+contrasena);
        System.out.println("Nombre: "+Nombre);
        System.out.println("telefono: "+telefono);
        
        // Crear un objeto Usuario con los valores recibidos
        usuario usuario = new usuario();
        HttpSession session = request.getSession(true);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        //verifica que usuario exista y sea administrador
        if(option.equals("iniciar")){//entra login
            usuario = (usuario) usuarioDAO.iniciarSesion(email,contrasena);
            System.out.println("usuario "+usuario.getApellidoMaterno());
            if(usuario != null){
                response.sendRedirect("/angelbc/index.html");
            }
        }
        else{           
         System.out.println("En servlet option: " +option);
       try {
            // Crear un objeto Usuario con los valores recibidos
            if(option.equals("registrar")){
                usuario.setNombreUsuario(Nombre);
                usuario.setApellidoPaterno(Paterno);
                usuario.setApellidoMaterno(Materno);
                usuario.setEmail(email);
                usuario.setContrasena(contrasena);
                usuario.setFecha_nacimiento(fecha_nacimiento);
                usuario.setTelefono(telefono);
                usuario.setDireccion(Direccion);
            }
            
            switch (option){
                case "registrar" :
                    usuario = (usuario) usuarioDAO.insertarUsuario(usuario);
                    request.getSession().setAttribute("usuario", usuario);
                    System.out.println("usuario nombre: "+usuario.getNombreUsuario());
                    System.out.println("usuario id: "+usuario.getUsuarioId());
                    break;
             /*   case "" : 

                    usuario = (Usuario) usuarioDAO.actualizarUsuario(usuario);
                    System.out.println("usuario update: "+usuario.getNombre());
                    break;
                case "" : 
                    usuario = (Usuario) usuarioDAO.insertarUsuario(usuario);
                    request.getSession().setAttribute("usuario", usuario);
                    jsp = "menu.jsp";
                    break;
                case "" : 
                    List<HashMap<String, String>> listaUsuarios = usuarioDAO.listarUsuarios();
                    // Guardar la lista en la sesión
                    request.getSession().setAttribute("listaUsuarios", listaUsuarios);
                    jsp = "menu.jsp";
                    
                    break;    
                case "" :
                    int rutElim = request.getParameter("rutElim") != null ? Integer.parseInt(request.getParameter("rutElim")) : 0; 
                    String msg = usuarioDAO.eliminarUsuario(rutElim);
                    request.getSession().setAttribute("mensaje", msg);
                    jsp = "menu.jsp";*/
                default:
            }          
       // session.setAttribute("usuario", usuario); //envio por sesion el objeto usuario
        response.sendRedirect("/angelbc/iniciar.jsp");
        } 
        catch(Exception ex){ // Manejo de la excepción
            System.out.println("Ocurrió una excepción: " + ex.getMessage());
        }
        } 
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}