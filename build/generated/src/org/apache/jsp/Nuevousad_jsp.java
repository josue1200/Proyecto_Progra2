package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.usuario;
import java.util.List;
import Modelo.Empleado;
import java.util.HashMap;
import Modelo.Puesto;
import javax.swing.table.DefaultTableModel;

public final class Nuevousad_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");

      HttpSession actual =request.getSession(true);
      String usuario = (String) actual.getAttribute("Dentro");
      String jerarquia = (String) actual.getAttribute("j");
             List<List<String>>meniu=(List<List<String>>) actual.getAttribute("menu");
      if((actual.getAttribute("Dentro")!=null)&&(jerarquia.equals("administrador"))){
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <form action=\"sr_inicio\" method=\"post\">\n");
      out.write("            <h6 class=\"text-muted\"><input type=\"submit\" value=\"Cerrar Sesion\" class=\"btn btn-dark\" id=\"cerrarsesion\" name=\"cerrarsesion\"/></h6>\n");
      out.write("        </form>\n");
      out.write("                 ");

  for( int i=0;i<meniu.get(0).size();i++){
      out.println("<a href='"+meniu.get(0).get(i)+"' class='btn btn-info'>"+ meniu.get(1).get(i)+"</a>");
  }
 
      out.write("\n");
      out.write("        <h1 style=\"text-align: center;\">CRUD De Empleados</h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <form action=\"sr_nuevo\" method=\"POST\" class=\"form-group\">\n");
      out.write("   \n");
      out.write("      <button name=\"boton_agregar\" id=\"boton_agregar\" value=\"agregar\" class=\"btn btn-success\">Agregar</button>\n");
      out.write("  <button name=\"boton_Modificar\" id=\"boton_Modificar\" value=\"modificar\" class=\"btn btn-primary\">Modificar</button>\n");
      out.write("  <button name=\"boton_Eliminar\" id=\"boton_Eliminar\" value=\"eliminar\" class=\"btn btn-danger\" onclick=\"javascript:if(!confirm('¿Desea Eliminar?'))return false\">Eliminar</button>\n");
      out.write("  <br>\n");
      out.write("  <label for=\"text\">ID</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" placeholder=\"ID\" id=\"txt_ID\" name=\"txt_ID\" value=\"0\" readonly>\n");
      out.write("  \n");
      out.write("    <label for=\"text\">Usuario</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" placeholder=\"user\" id=\"txt_usuario\" name=\"txt_usuario\"  required>\n");
      out.write("\n");
      out.write("    <label for=\"text\">Nombres:</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" placeholder=\"Escriba los nombres\" id=\"txt_nombres\" name=\"txt_nombres\" required>\n");
      out.write("\n");
      out.write("    <label for=\"text\">Apellidos:</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" placeholder=\"Escriba los apellidos\" id=\"txt_apellidos\" name=\"txt_apellidos\" required>\n");
      out.write("    \n");
      out.write(" \n");
      out.write("    <label for=\"text\">Correo</label>\n");
      out.write("    <input type=\"email\" class=\"form-control\" placeholder=\"Escriba el Correo\" id=\"txt_correo\" name=\"txt_correo\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"text\">Contraseña</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" placeholder=\"Escriba la contraseña\" id=\"txt_contra\" name=\"txt_contra\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"text\">Tipo</label>\n");
      out.write("    <select name=\"Listatipe\" id=\"Listatipe\">\n");
      out.write("        <option value=\"0\">Elija</option>\n");
      out.write("        <option value=\"administrador\">Admin</option>\n");
      out.write("        <option value=\"usuario\">User</option>\n");
      out.write("    </select>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write(" <table class=\"table table-hover\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("          <th>Usuario</th>\n");
      out.write("        <th>Nombre</th>\n");
      out.write("        <th>Apellidos</th>\n");
      out.write("        <th>Correo</th>\n");
      out.write("        \n");
      out.write("        <th>Contraseña</th>\n");
      out.write("        <th>Tipo</th>\n");
      out.write("        \n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody id=\"tbl_usuarios\">\n");
      out.write("        ");

            usuario use=new usuario();
            DefaultTableModel tablausers=new DefaultTableModel();
            tablausers=use.TablaDeusers();
            for (int i = 0; i < tablausers.getRowCount(); i++) {
                         out.println("<tr data-ide="+tablausers.getValueAt(i, 0)+">"); 
                         out.println("<td>"+tablausers.getValueAt(i,1)+"</td>");
                         out.println("<td>"+tablausers.getValueAt(i,2)+"</td>");
                         out.println("<td>"+tablausers.getValueAt(i,3)+"</td>");
                         out.println("<td>"+tablausers.getValueAt(i,4)+"</td>");
                         out.println("<td>"+tablausers.getValueAt(i,5)+"</td>");
                         out.println("<td>"+tablausers.getValueAt(i,6)+"</td>");
                        
                      out.println("</tr>");
                }

        

              
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("        </div>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $('#tbl_usuarios').on('click','tr td',function(e){\n");
      out.write("            var target,ide,nombres,Apellidos,tipo,correo,user,contra;\n");
      out.write("            target=$(event.target);\n");
      out.write("            ide=target.parent().data('ide');\n");
      out.write("           \n");
      out.write("            user=target.parent(\"tr\").find(\"td\").eq(0).html();\n");
      out.write("            nombres=target.parent(\"tr\").find(\"td\").eq(1).html();\n");
      out.write("            Apellidos=target.parent(\"tr\").find(\"td\").eq(2).html();\n");
      out.write("            correo=target.parent(\"tr\").find(\"td\").eq(3).html();\n");
      out.write("            contra=target.parent(\"tr\").find(\"td\").eq(4).html();\n");
      out.write("            tipo=target.parent(\"tr\").find(\"td\").eq(5).html();\n");
      out.write("            \n");
      out.write("            $(\"#txt_ID\").val(ide);\n");
      out.write("            $(\"#txt_usuario\").val(user);\n");
      out.write("            $(\"#txt_nombres\").val(nombres);\n");
      out.write("            $(\"#txt_apellidos\").val(Apellidos);\n");
      out.write("            $(\"#txt_correo\").val(correo);\n");
      out.write("            $(\"#txt_contra\").val(contra);\n");
      out.write("            $(\"#Listatipe\").val(tipo);\n");
      out.write(" \n");
      out.write("        });\n");
      out.write("        </script>\n");
      out.write("  \n");
      out.write("    </body>\n");
      out.write("</html>\n");

   }
else{

response.sendRedirect("index.jsp");

}

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
