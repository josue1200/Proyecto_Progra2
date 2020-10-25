/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Maestro_VentasDetalle;
import Modelo.Ventas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Miguel Rivera
 */
public class sr_Maesto_VentasDetalle extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet sr_Maesto_VentasDetalle</title>");            
            out.println("</head>");
            out.println("<body>");
             Maestro_VentasDetalle maestro1;
            Ventas venta=new Ventas(Integer.parseInt(request.getParameter("txt_id_ventas")),Integer.parseInt(request.getParameter("txt_numfac")),Integer.parseInt(request.getParameter("Listaclientes")),Integer.parseInt(request.getParameter("Listaempleados")),request.getParameter("txt_serie"),request.getParameter("txt_fechafactura"),request.getParameter("txt_fi"));
            Maestro_VentasDetalle maestroanterior=new Maestro_VentasDetalle();
            
            int antes=maestroanterior.CantidadAnterior(Integer.parseInt(request.getParameter("txt_id_mvd")));
            
            if("agregar".equals(request.getParameter("boton_agregar"))){
                if(venta.AgregarVenta()>0){
                    Ventas venta2=new Ventas();
           
            int idVenta=venta2.IDVENTA(Integer.parseInt(request.getParameter("txt_numfac")));
             maestro1=new Maestro_VentasDetalle(Integer.parseInt(request.getParameter("txt_id_mvd")),idVenta,Integer.parseInt(request.getParameter("ListaProducto")),Integer.parseInt(request.getParameter("txt_cantidad")),Double.parseDouble(request.getParameter("txt_pu")));             
              if(maestro1.AgregarVentaDetalle()>0){
                 if(maestro1.NuevasExistencias()>0){
              response.sendRedirect("Maestro_VentasDetalle.jsp");
                 }
              }
                }else{
                    out.println("<h1>PTM Error</h1>");
                }
            }
             
            if("modificar".equals(request.getParameter("boton_Modificar"))){
                if(venta.ModificarVenta()>0){
                   maestro1=new Maestro_VentasDetalle(Integer.parseInt(request.getParameter("txt_id_mvd")),Integer.parseInt(request.getParameter("txt_id_ventas")),Integer.parseInt(request.getParameter("ListaProducto")),Integer.parseInt(request.getParameter("txt_cantidad")),Double.parseDouble(request.getParameter("txt_pu")));
                    if(maestro1.ModificarVentaDetalle()>0){
                        if(Integer.parseInt(request.getParameter("txt_cantidad"))>antes){
                            
                             maestro1=new Maestro_VentasDetalle(Integer.parseInt(request.getParameter("txt_id_mvd")),Integer.parseInt(request.getParameter("txt_id_ventas")),Integer.parseInt(request.getParameter("ListaProducto")),(Integer.parseInt(request.getParameter("txt_cantidad"))-antes),Double.parseDouble(request.getParameter("txt_pu")));
                        }else if(antes>Integer.parseInt(request.getParameter("txt_cantidad"))){
                           
                           maestro1=new Maestro_VentasDetalle(Integer.parseInt(request.getParameter("txt_id_mvd")),Integer.parseInt(request.getParameter("txt_id_ventas")),Integer.parseInt(request.getParameter("ListaProducto")),(Integer.parseInt(request.getParameter("txt_cantidad"))-antes),Double.parseDouble(request.getParameter("txt_pu")));
                        }else{
                            if(Integer.parseInt(request.getParameter("txt_cantidad"))==antes){
                              
                            maestro1=new Maestro_VentasDetalle(Integer.parseInt(request.getParameter("txt_id_mvd")),Integer.parseInt(request.getParameter("txt_id_ventas")),Integer.parseInt(request.getParameter("ListaProducto")),(Integer.parseInt(request.getParameter("txt_cantidad"))-antes),Double.parseDouble(request.getParameter("txt_pu")));
                        }
                        }
                        if(maestro1.NuevasExistencias()>0){
                        response.sendRedirect("Maestro_VentasDetalle.jsp");
                        }
                    }
            
                
              
                 
              
                }else{
                    out.println("<h1>PTM Error</h1>");
                }
            }
            
            if("eliminar".equals(request.getParameter("boton_Eliminar"))){
                maestro1=new Maestro_VentasDetalle(Integer.parseInt(request.getParameter("txt_id_mvd")),Integer.parseInt(request.getParameter("txt_id_ventas")),Integer.parseInt(request.getParameter("ListaProducto")),Integer.parseInt(request.getParameter("txt_cantidad")),Double.parseDouble(request.getParameter("txt_pu")));
                if(maestro1.EliminaVentasDetalle()>0){
                    maestro1=new Maestro_VentasDetalle(Integer.parseInt(request.getParameter("txt_id_mvd")),Integer.parseInt(request.getParameter("txt_id_ventas")),Integer.parseInt(request.getParameter("ListaProducto")),(0-Integer.parseInt(request.getParameter("txt_cantidad"))),Double.parseDouble(request.getParameter("txt_pu")));
                    if(maestro1.NuevasExistencias()>0)
                    {
                         if(venta.EliminaVentas()>0){
                       
                    response.sendRedirect("Maestro_VentasDetalle.jsp");
                        
                }
                    }
                     
                
                   
                }
                else{
                    out.println("<h1>elim Error</h1>");
                }
            }
           
            out.println("</body>");
            out.println("</html>");
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
