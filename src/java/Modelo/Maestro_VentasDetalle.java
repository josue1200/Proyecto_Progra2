/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Rivera
 */
public class Maestro_VentasDetalle {
    private int id,id_venta,id_producto,cantidad;
    private double precio_unitario;
    private Conexion Con;
    public Maestro_VentasDetalle(int id, int id_venta, int id_producto, int cantidad, double precio_unitario) {
        this.id = id;
        this.id_venta = id_venta;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }

    public Maestro_VentasDetalle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }
     public DefaultTableModel TablaDeVentasDetalle(){
        DefaultTableModel tbldetalle=new DefaultTableModel();
        try {
            Con=new Conexion();
            Con.abrir_conexion();
            String query="select mvd.idVentaDetalle as id,v.idventas,v.nofactura,v.serie,v.fechafactura,c.idclientes,c.Nombres,"
                    + "e.idempleados,e.nombres,v.fechaingreso,p.idProductos,p.Productos,mvd.cantidad,mvd.precio_unitario from ventadetalle as mvd inner join ventas as v inner join productos as p inner join clientes as c inner join empleados as e on mvd.idventa=v.idventas and v.idcliente=c.idclientes and v.idempleado=e.idempleados and mvd.idproductos=p.idProductos;";
            ResultSet consulta=Con.conexionbd.createStatement().executeQuery(query);
        String Header[]={"id","id_venta","no_factura","serie","fechafactura","id_clientes","Nombre cliente","id_empleado",
                "Nombre empleado","fecha de ingreso","id_producto","Producto","cantidad","precio unitario"};
            tbldetalle.setColumnIdentifiers(Header);
            String data[]=new String[14];
            while (consulta.next()) {
                data[0] = consulta.getString("id");
                data[1] = consulta.getString("idventas");
                data[2] = consulta.getString("nofactura");
                data[3] = consulta.getString("serie");
                data[4] = consulta.getString("fechafactura");
                data[5] = consulta.getString("idclientes");
                data[6] = consulta.getString("Nombres");
                data[7] = consulta.getString("idempleados");
                data[8] = consulta.getString("e.nombres");
                data[9] = consulta.getString("fechaingreso");
                data[10] = consulta.getString("idProductos");
                data[11] = consulta.getString("Productos");
                data[12] = consulta.getString("cantidad");
                data[13] = consulta.getString("precio_unitario");
               tbldetalle.addRow(data);
            }
            Con.cerrar_conexion();
        } catch (SQLException e) {
            System.out.println("Error >:V "+e.getMessage());
        }
        return tbldetalle;
    }
     
      public int AgregarVentaDetalle(){
        int resultado=0;
        try {
      
            Con=new Conexion();
            PreparedStatement parameter;
            String query="insert into ventadetalle (idventa,idproductos,cantidad,precio_unitario)values(?,?,?,?);";
            Con.abrir_conexion();
            parameter=Con.conexionbd.prepareStatement(query);
            parameter.setInt(1,this.getId_venta());
            parameter.setInt(2,this.getId_producto());
            parameter.setInt(3,this.getCantidad());
            parameter.setDouble(4,this.getPrecio_unitario());
           
            resultado=parameter.executeUpdate();
            Con.cerrar_conexion();
        } catch (SQLException e) {
            System.out.println("Error Prro >:V"+e.getMessage());
        }
        return resultado;
    }
     public int ModificarVentaDetalle(){
        int resultado=0;
        try {
            Con=new Conexion();
            PreparedStatement parameter;
            String query="update ventadetalle set idventa=?,idproductos=?,cantidad=?,precio_unitario=? where idVentaDetalle=?;";
            Con.abrir_conexion();
            parameter=Con.conexionbd.prepareStatement(query);
           parameter.setInt(1,this.getId_venta());
            parameter.setInt(2,this.getId_producto());
            parameter.setInt(3,this.getCantidad());
            parameter.setDouble(4,this.getPrecio_unitario());
            parameter.setInt(5,this.getId());
            resultado=parameter.executeUpdate();
            Con.cerrar_conexion();
        } catch (SQLException e) {
            System.out.println("Error Prro >:V"+e.getMessage());
        }
        return resultado;
    }
          public int EliminaVentasDetalle(){
        int resultado=0;
        try {
            Con=new Conexion();
            PreparedStatement parameter;
            String query="delete from ventadetalle where idVentaDetalle=?;";
            Con.abrir_conexion();
            parameter=Con.conexionbd.prepareStatement(query);
            parameter.setInt(1,this.getId());
            resultado=parameter.executeUpdate();
            Con.cerrar_conexion();
        } catch (SQLException e) {
            System.out.println("Error Prro >:V"+e.getMessage());
        }
        return resultado;
    }
          
             public int NuevasExistencias(){
          
          int e=0;
     
        try {
            Con=new Conexion();
       
            String query="update productos set existencias=?-? where idProductos=?;";
            Con.abrir_conexion();
           PreparedStatement parameter;
        Ventas ex=new Ventas();
        
            Con.abrir_conexion();
            parameter=Con.conexionbd.prepareStatement(query);
            parameter.setInt(1,ex.Existencias(getId_producto()));
            parameter.setInt(2,getCantidad());
            parameter.setInt(3,getId_producto());
            e=parameter.executeUpdate();
                   
                    
            Con.cerrar_conexion();
            return e;
        } catch (SQLException ex) {
            System.out.println("Error"+ex.getMessage());
              return e;
        }
             }
             
              
          public int CantidadAnterior(int idvd){
          
          int e=0;
     
        try {
            Con=new Conexion();
       
            String query="select cantidad from ventadetalle where idVentaDetalle="+idvd+";";
            Con.abrir_conexion();
           
            
           
             ResultSet consulta=Con.conexionbd.createStatement().executeQuery(query);
             while (consulta.next()) {
                e=consulta.getInt("cantidad");
               
                }
                   
                    
            Con.cerrar_conexion();
            return e;
        } catch (SQLException ex) {
            System.out.println("Error"+ex.getMessage());
              return e;
        }
 }
}
