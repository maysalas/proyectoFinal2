
package Biblio;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "validacion", urlPatterns = {"/validacion"})
public class validacion extends HttpServlet {
    
    public ModeloU usu1 = new ModeloU ();
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        
        usu1.setUsu1("Rodrigo");
        usu1.setPass1("pass");
        usu1.setFecha_N1("03/08/2020");
        
        try {
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet validacion</title>"); 
            out.println("<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@9\"></script>");
            out.println("<link rel='stylesheet' href='CSS/style.css'/>");
            out.println("</head>");
            out.println("<body>");
            if(request.getParameter("user").equals(usu1.getUsu1()) && request.getParameter("pass").equals(usu1.getPass1())){
                response.sendRedirect("Biblioteca");
            } else{
                out.println("<script>Swal.fire({"
                        + "icon: 'error',"
                        + "title: 'Datos incorrectos',"
                        + "text: 'Intenta de nuevo'"
                        + "}).then(function(){"
                        + "location.href='index.jsp'});</script>");
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
