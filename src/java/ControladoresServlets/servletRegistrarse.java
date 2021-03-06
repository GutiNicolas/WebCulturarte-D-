/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladoresServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import servicios.DtUsuarioWeb;
import servicios.Exception_Exception;
import servicios.ServicioContColabiracion;
import servicios.ServicioContPropuesta;
import servicios.ServicioContusuario;
import servicios.WebServiceContColaboracion;
import servicios.WebServiceContPropuesta;
import servicios.WebServiceContUsusario;

/**
 *
 * @author jp
 */
@WebServlet(name = "servletRegistrarse", urlPatterns = {"/servletRegistrarse"})
public class servletRegistrarse extends HttpServlet {

    private static Propiedades prop = Propiedades.getInstance();
    private String direccionWSU = prop.getWsU(), direccionWSP = prop.getWsP(), direccionWSC = prop.getWsC();
    WebServiceContUsusario WSCUPort;//"http://localhost:8580/ServicioU"
    WebServiceContPropuesta WSCPPort;//"http://localhost:8680/ServicioP"
    WebServiceContColaboracion WSCCPort;//"http://localhost:8780/ServicioC"

    /**
     * funcion inicial que se llama al crear el servlet
     *
     * @param conf
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig conf)
            throws ServletException {
        inicio();
        super.init(conf);
    }

    private void inicio() {

        try {
            ServicioContusuario WSCU = new ServicioContusuario(new URL(direccionWSU));
            WSCUPort = WSCU.getWebServiceContUsusarioPort();
            ServicioContPropuesta WSCP = new ServicioContPropuesta(new URL(direccionWSP));
            WSCPPort = WSCP.getWebServiceContPropuestaPort();
            ServicioContColabiracion WSCC = new ServicioContColabiracion(new URL(direccionWSC));
            WSCCPort = WSCC.getWebServiceContColaboracionPort();
        } catch (MalformedURLException ex) {
            System.err.println(ex.getMessage());
        }

    }

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
        //    response.setContentType("text/html;charset=UTF-8");
        String url = "/PRESENTACIONES/registrarse.jsp";
        ServletContext sr = getServletContext();
        RequestDispatcher rd = sr.getRequestDispatcher(url);
        rd.forward(request, response);
        // request.getRequestDispatcher(url).forward(request, response);  //    request.getRequestDispatcher("PRESENTACIONES/altapropuesta.jsp").forward(request, response);
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
        //processRequest(request, response);
        String url = "/PRESENTACIONES/registrarse.jsp";
        ServletContext sr = getServletContext();
        RequestDispatcher rd = sr.getRequestDispatcher(url);
        rd.forward(request, response);
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
        // processRequest(request, response);
        try {
            PrintWriter out = response.getWriter();
           
            altaUsuario(request, response);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    private void altaUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String nick = null, correo = null, pass1, pass2, nombre, apellido, direccion, web, biografia, fechaNac;

        try {
            nick = (String) request.getParameter("nickname");
            correo = (String) request.getParameter("correo");
            pass1 = (String) request.getParameter("password");
            pass2 = (String) request.getParameter("password2");
            nombre = (String) request.getParameter("nombre");
            apellido = (String) request.getParameter("apellido");
            direccion = (String) request.getParameter("direccion");
            web = (String) request.getParameter("pagWeb");
            biografia = (String) request.getParameter("bio");
            fechaNac = (String) request.getParameter("nacimiento");//yyyy-mm-dd
            System.out.println(nick);
            System.out.println(correo);
            System.out.println(pass1);
            System.out.println(pass2);
            System.out.println(nombre);
            System.out.println(apellido);
            System.out.println(direccion);
            System.out.println(web);
            System.out.println(biografia);
            System.out.println(fechaNac);
            HttpSession session = request.getSession();
            if (WSCUPort.verificaExistencia(nick, correo) == 0) {
                if (pass1.equals(pass2)) {
                    String tipo = (String) request.getParameter("tipo");

                    if (tipo.equals("Proponente")) {
                        DtUsuarioWeb nuevoProp = new DtUsuarioWeb();
                        nuevoProp.setNickname(nick);
                        nuevoProp.setNombre(nombre);
                        nuevoProp.setApellido(apellido);
                        nuevoProp.setEmail(correo);
                        nuevoProp.setFechaNac(fechaNac);
                        nuevoProp.setRol("Proponente");
                        nuevoProp.setBio(biografia);
                        nuevoProp.setDireccion(direccion);
                        nuevoProp.setPagWeb(web);
                        nuevoProp.setPass(pass1);

                        WSCUPort.agregarUsu(nuevoProp);
                        out.print("Usuario: " + nick + " agregado con Exito!!");
                        DtUsuarioWeb dtu = WSCUPort.usuarioLoginSN(nick);
                        session.setAttribute("nickusuario", dtu.getNickname());
                        session.setAttribute("rol", dtu.getRol());

                    }
                    if (tipo.equals("Colaborador")) {
                        DtUsuarioWeb nuevoColaborador = new DtUsuarioWeb();
                        nuevoColaborador.setNombre(nombre);
                        nuevoColaborador.setRol("Colaborador");
                        nuevoColaborador.setApellido(apellido);
                        nuevoColaborador.setNickname(nick);
                        nuevoColaborador.setEmail(correo);
                        nuevoColaborador.setFechaNac(fechaNac);
                        nuevoColaborador.setPass(pass1);
                        WSCUPort.agregarUsu(nuevoColaborador);
                        out.print("Usuario: " + nick + " agregado con Exito!!");
                        DtUsuarioWeb dtu = WSCUPort.usuarioLoginSN(nick);
                        session.setAttribute("nickusuario", dtu.getNickname());
                        session.setAttribute("rol", dtu.getRol());
                    }
                } else {
                    out.print("noOkPass");
                }

            } else {
                out.print(queExiste(nick, correo));
            }

        } catch (Exception_Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    /**
     * funcion que comprueba existencia de nickname u correo retorna 1 si existe
     * el nickname retorna -1 si existe el correo retorna 0 si no existe ninguno
     */
    /* private int verificaExistencia(String nick, String correo) {
        if (WSCPPort.existeUsuario(nick)) {
            return 1;
        }
        if (contU.existeMail(correo)) {
            return -1;
        }
        return 0;
    }*/
    private String queExiste(String nick, String correo) {
        String existe = null;
        if (WSCUPort.verificaExistencia(nick, correo) == 1) {
            existe = "usuarioE";//"Ya existe un usuario registrado con el mismo Nickname";
        }
        if (WSCUPort.verificaExistencia(nick, correo) == -1) {
            existe = "correoE";//"Ya existe un usuario registrado con el mismo correo";
        }
        return existe;
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
