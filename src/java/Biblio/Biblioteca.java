/* ---------------------------- CONTROLADOR ---------------------------- */
package Biblio;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "Biblioteca", urlPatterns = {"/Biblioteca"})
public class Biblioteca extends HttpServlet {
    
    ModeloL narn = new ModeloL ("Las crónicas de Narnia","Rayo","16-11-1956","C. S. Lewis","Fantasía",0);
    ModeloL ladr = new ModeloL ("La ladrona de libros","Picador","03-06-2005","Markus Zusak","Novela",0);
    ModeloL princ = new ModeloL ("El Principito","Edito","07-05-1987","Peter Hernández","Infantil",0);
    int cntn=0, cntp=0,cntl=0;


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
                
        try {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"CSS/style.css\"/>");
            out.println("<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@9\"></script>");
            out.println("<title>Acervo Biblioteca</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div id='acervmain'>");
            out.println("<div id='titulo'>");
            out.println("<h1 style='color:white'>Mi Biblioteca - Acervo </h1>");
            out.println("</div>");
            out.println("<div id='libros'>");
                out.println("<div id='lib1' class='libros' onClick='libNarnia()'>");
                out.println("</div>");
                out.println("<div id='lib2' class='libros' onClick='libPrincipito()'>");
                out.println("</div>");
                out.println("<div id='lib3' class='libros' onClick='libLadrona()'>");
                out.println("</div>");
            out.println("</div>");
            out.println("<div style='height: 70px;'></div>");
            out.println("<div id='btnencript'>");
            out.println("<input type='text' class='text_pro'>");
            out.println("<button type='button' class='boton_pro'>Encriptar</button>");
            out.println("</div>");
            out.println("<div style='height: 70px;'></div>");
            
            
            
            
            out.println("</div>");
            out.println("</body>");
            
            out.println("<script>const Toast = Swal.mixin({\n" +
                                    "  toast: true,\n" +
                                    "  position: 'top-end',\n" +
                                    "  showConfirmButton: false,\n" +
                                    "  timer: 2500,\n" +
                                    "  onOpen: (toast) => {\n" +
                                    "  }\n" +
                                    "})\n" +
                                    "\n" +
                                    "Toast.fire({\n" +
                                    "  icon: 'success',\n" +
                                    "  title: 'Hola de nuevo, bienvenido!'\n" +
                                    "});</script>");
             out.println("<script>var cntn = 0;\n"
                     +"var cntp = 0;\n"
                     +"var cntl = 0;\n"
                     + "function libNarnia() {\n" +
                    "  cntn++;\n"+narn.setCons(cntn++)
                     + " Swal.fire({"
                        + "icon: 'success',"
                        + "title: 'No Consultas: "+(narn.setCons(narn.getCons()))+"',"
                        + "text: 'Libro: "+narn.getNombre()+" || Autor: "+narn.getAutor()+" ||  Editorial: "+narn.getEditorial()+" || Fecha Publicación: "+narn.getFecha_P()+" || Género: "+narn.getCategoria()+"'"
                        + "});\n" +
                    "}"
                     + "function libPrincipito() {\n" +
                    "  cntp++;\n"
                     + " Swal.fire({"
                        + "icon: 'success',"
                        + "title: 'No Consultas: '+ cntp,"
                        + "text: 'Libro: "+princ.getNombre()+" || Autor: "+princ.getAutor()+" ||  Editorial: "+princ.getEditorial()+" || Fecha Publicación: "+princ.getFecha_P()+" || Género: "+princ.getCategoria()+"'"
                        + "});\n" +
                    "}"
                     + "function libLadrona() {\n" +
                    "  cntl++;\n"
                     + " Swal.fire({"
                        + "icon: 'success',"
                        + "title: 'No Consultas: '+ cntl,"
                        + "text: 'Libro: "+ladr.getNombre()+" || Autor: "+ladr.getAutor()+" ||  Editorial: "+ladr.getEditorial()+" || Fecha Publicación: "+ladr.getFecha_P()+" || Género: "+ladr.getCategoria()+"'"
                        + "});\n" +
                    "}</script>");
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
