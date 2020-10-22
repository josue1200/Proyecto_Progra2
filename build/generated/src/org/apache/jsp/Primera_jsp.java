package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Modelo.usuario;

public final class Primera_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('+');
      out.write("\n");
      out.write("\n");
      out.write("\n");

      HttpSession actual =request.getSession(true);
      String usuario = (String) actual.getAttribute("Dentro");
      List<List<String>>meniu=(List<List<String>>) actual.getAttribute("menu");
      if(actual.getAttribute("Dentro")!=null){
        
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("     body{\n");
      out.write("       margin: 0;\n");
      out.write("       padding: 0;\n");
      out.write("       font-family: 'Roboto', sans-serif;\n");
      out.write("       background-color: #EEEEEE;\n");
      out.write("     }\n");
      out.write("     .navbar{\n");
      out.write("      margin-top: -40px;\n");
      out.write("      background-color: #fff;\n");
      out.write("      display:block;\n");
      out.write("      width: 100%;\n");
      out.write("      overflow: hidden;\n");
      out.write("      padding: 10px 10px;\n");
      out.write("      position: fixed;\n");
      out.write("      z-index: 2;\n");
      out.write("     }\n");
      out.write("     ul{\n");
      out.write("      list-style-type: none;\n");
      out.write("      margin: 0;\n");
      out.write("      padding: 0;\n");
      out.write("     }\n");
      out.write("     li{\n");
      out.write("      display: inline;\n");
      out.write("     }\n");
      out.write("     .titulo{\n");
      out.write("      color: #0057A0;\n");
      out.write("      font-family: Helvetica;\n");
      out.write("      display: inline;\n");
      out.write("      margin-left: 20px;\n");
      out.write("      position: fixed;\n");
      out.write("      margin-top: 15px;\n");
      out.write("\n");
      out.write("     }\n");
      out.write("     .logo{\n");
      out.write("      margin-left: 50px;\n");
      out.write("     }\n");
      out.write("\n");
      out.write("     .fondo{\n");
      out.write("       background: url(\"2.jpg\") no-repeat fixed center;\n");
      out.write("      -webkit-background-size: cover;\n");
      out.write("       -moz-background-size: cover;\n");
      out.write("       -o-background-size: cover;\n");
      out.write("       background-size: cover;\n");
      out.write("       height:600px;\n");
      out.write("       width: 100%;\n");
      out.write("       z-index: 1;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("    \n");
      out.write("       .card {\n");
      out.write("        background: #fff;\n");
      out.write("        border-radius: 2px;\n");
      out.write("        display: inline-block;\n");
      out.write("        margin: 1rem;\n");
      out.write("        position: relative;\n");
      out.write("        height: 300px;\n");
      out.write("        width: 110px;\n");
      out.write("        box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);\n");
      out.write("        padding: 40px;\n");
      out.write("        text-align: left;\n");
      out.write("        transition: .1s;  \n");
      out.write("      }\n");
      out.write("      .card1{\n");
      out.write("        margin-left: 40px;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      .card:hover{\n");
      out.write("        background-color: #ff7400;\n");
      out.write("        box-shadow: 0 0px 15px #ff7400;\n");
      out.write("        cursor: pointer;\n");
      out.write("        filter: invert(1);\n");
      out.write("\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      .separador{\n");
      out.write("        width: 100%;\n");
      out.write("        height: 100px;\n");
      out.write("        background-color: transparent;\n");
      out.write("        \n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .txt{\n");
      out.write("        padding: 15% 40%;\n");
      out.write("        color: white; \n");
      out.write("        font-size: 60px;\n");
      out.write("        text-shadow: 0 0 10px #000;\n");
      out.write("      }\n");
      out.write("      .ini{\n");
      out.write("        color: #0057A0;\n");
      out.write("        position: relative;\n");
      out.write("        float: right;\n");
      out.write("        margin-top: 20px;\n");
      out.write("        margin-right: 40px;\n");
      out.write("        font-size: 17px;\n");
      out.write("        text-decoration: none;\n");
      out.write("      }\n");
      out.write("      .cardimg{\n");
      out.write("        display: block;\n");
      out.write("        margin: auto;\n");
      out.write("        width: 140px;\n");
      out.write("        margin-bottom: 40px;\n");
      out.write("      }\n");
      out.write("      .parrafo{\n");
      out.write("        color: #000;\n");
      out.write("        opacity: .5;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      a{\n");
      out.write("        color: #000;\n");
      out.write("      }\n");
      out.write("      footer{\n");
      out.write("        background-color: #1e1e1e;\n");
      out.write("        padding: 10px 20px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      @media screen and (min-width: 1640px){\n");
      out.write("        .card{\n");
      out.write("          padding: 50px;\n");
      out.write("        }\n");
      out.write("        .card1 {\n");
      out.write("          margin-left: 120px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .txt{\n");
      out.write("          font-size: 70px;\n");
      out.write("          padding: 15% 43%;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("      @media screen and (max-width: 1350px){\n");
      out.write("        .card{\n");
      out.write("          margin: 5px;\n");
      out.write("        }\n");
      out.write("        .card1{\n");
      out.write("          margin-left: 25px;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("       @media screen and (max-width: 1250px){\n");
      out.write("        .card{\n");
      out.write("          margin: 5px;\n");
      out.write("          width: 140px;\n");
      out.write("        }\n");
      out.write("        .card1{\n");
      out.write("          margin-left: 20px;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("      @media screen and (max-width: 1180px){\n");
      out.write("        .card{\n");
      out.write("          margin: 5px;\n");
      out.write("          width: 140px;\n");
      out.write("        }\n");
      out.write("        .card1{\n");
      out.write("          margin-left: 100px;\n");
      out.write("        }\n");
      out.write("        .card3{\n");
      out.write("          margin-left: 100px;\n");
      out.write("        \n");
      out.write("        }\n");
      out.write("        .card4{\n");
      out.write("          margin-left: 100px;\n");
      out.write("        \n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("       @media screen and (max-width: 1080px){\n");
      out.write("     \n");
      out.write("        .card1{\n");
      out.write("          margin-left: 40px;\n");
      out.write("        }\n");
      out.write("        .card3{\n");
      out.write("          margin-left: 40px;\n");
      out.write("        }\n");
      out.write("        .card4{\n");
      out.write("          margin-left: 100px;\n");
      out.write("        \n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("      @media screen and (max-width: 1000px){\n");
      out.write("        .card1{\n");
      out.write("          margin-left: 100px;\n");
      out.write("        }\n");
      out.write("        .card2{\n");
      out.write("           margin-left: 100px;\n");
      out.write("        }\n");
      out.write("        .card3{\n");
      out.write("          margin-left: 0;\n");
      out.write("        }\n");
      out.write("        .card4{\n");
      out.write("          margin-left: 0;\n");
      out.write("        \n");
      out.write("        }\n");
      out.write("        .fondo{\n");
      out.write("          height:400px;\n");
      out.write("          width: 100%;  \n");
      out.write("        }\n");
      out.write("        .txt{\n");
      out.write("          font-size: 50px;\n");
      out.write("          padding: 13% 45%;\n");
      out.write("        }\n");
      out.write("        .titulo{\n");
      out.write("          font-size: 30px;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("   </style>\n");
      out.write("   <body>\n");
      out.write("       \n");
      out.write("       <div class=\"navbar\">\n");
      out.write("        <ul>\n");
      out.write("          <img class=\"logo\" src=\"1.png\" width=\"60\">\n");
      out.write("\n");
      out.write("          <li>\n");
      out.write("            <h1 class=\"titulo\">GRUPO #7 UMG</h1>\n");
      out.write("          </li>\n");
      out.write("                    <form action=\"sr_inicio\" method=\"post\">\n");
      out.write("                        <h6 class=\"text-muted\"><input type=\"submit\" value=\"Cerrar Sesion\" class=\"ini\" id=\"cerrarsesion\" name=\"cerrarsesion\"/></h6>\n");
      out.write("                    </form>\n");
      out.write("          <li><a href=\"#\" class=\"ini\">INICIO</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"fondo\">\n");
      out.write("        <h1 class=\"txt\">PROYECTO FINAL</h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"separador\"></div>\n");
      out.write("\n");
      out.write("      <a href=\"Clientes.jsp\">\n");
      out.write("        <div class=\"card card1\">\n");
      out.write("          <img src=\"clientes.png\" class=\"cardimg\">\n");
      out.write("          <h4>CLIENTES</h4>\n");
      out.write("          <p class=\"parrafo\">ver todos los clientes, eliminar o registrar</p>\n");
      out.write("        </div>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"Empleados.jsp\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img src=\"empleadosa.png\" class=\"cardimg\">\n");
      out.write("          <h4>EMPLEADOS</h4>\n");
      out.write("          <p class=\"parrafo\">ver todos los empleados, eliminar o registrar</p>\n");
      out.write("        </div>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"Marcas.jsp\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img src=\"marcas.png\" class=\"cardimg\">\n");
      out.write("          <h4>MARCAS</h4>\n");
      out.write("          <p class=\"parrafo\">ver todos las marcas, eliminar o registrar</p>\n");
      out.write("        </div>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"Proveedores.jsp\">\n");
      out.write("        <div class=\"card card2\">\n");
      out.write("          <img src=\"proveedores.png\" class=\"cardimg\">\n");
      out.write("          <h4>PROVEEDORES</h4>\n");
      out.write("          <p class=\"parrafo\">ver todos los proveedores, eliminar o registrar</p>\n");
      out.write("        </div>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"Puestos.jsp\">\n");
      out.write("        <div class=\"card card3\">\n");
      out.write("          <img src=\"puestos.png\" class=\"cardimg\">\n");
      out.write("          <h4>PUESTOS</h4>\n");
      out.write("          <p class=\"parrafo\">ver todos los puestos, eliminar o registrar</p>\n");
      out.write("        </div>\n");
      out.write("      </a>\n");
      out.write("      <a href=\"Productos.jsp\">\n");
      out.write("        <div class=\"card card3\">\n");
      out.write("          <img src=\"productos.png\" class=\"cardimg\">\n");
      out.write("          <h4>PRODUCTOS</h4>\n");
      out.write("          <p class=\"parrafo\">ver todos los produtos, eliminar o registrar</p>\n");
      out.write("        </div>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <div class=\"separador\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <footer>\n");
      out.write("        <img src=\"umg.png\" width=\"250\">\n");
      out.write("    </body>\n");
      out.write("   </body>\n");
      out.write("      \n");
      out.write("    \n");
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
