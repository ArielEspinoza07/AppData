/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdata;

import appentities.Persona;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/**
 *
 * @author marisol molina rosal
 */
public class PersonaDAO {
    private static Persistencia pr = new Persistencia();
    
    public static LinkedList getALL() throws SQLException{
        
        String Sql = "Select * from persona";
        LinkedList lista = pr.SelectAll(Sql);
        
        return lista;
    }
    
    public static boolean Insert(Persona p){
         String sql="insert into persona (Cedula,Nombre,Apellidos,Telefono,Email) values ('"+p.getCedula()+"','"+p.getNombre()+"','"+p.getApellidos()+
            "','"+p.getTelefono()+"','"+p.getEmail()+"')";
         
         JOptionPane.showMessageDialog(null, p.toString());
         
         int est = pr.Insert(sql);
         
         boolean ins;
         
         if(est==1){
             ins = true;
         }else{
             ins = false;
         }
         
         
         return ins;
    }
    
    public static boolean Exist(Persona p){
        String Sql = "select * from persona where cedula = "+p.getCedula();
        
        Persona P=null;
        
        boolean exist = false;
        
        try {
            P = (Persona)pr.Select(Sql);
            if(P != null){
                exist = true;
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return exist;
    }
    
    public static void Guardar(Persona P){
        if(PersonaDAO.Exist(P)){
            
        }else{
            if(PersonaDAO.Insert(P)){
                JOptionPane.showMessageDialog(null, "Registro guardado");
            }else{
                JOptionPane.showMessageDialog(null, "No se a podido guardar el registro");
            }
        }
    }
    
    public static Persona getPersona(Persona P) throws SQLException{
        String sql = "select * from persona where Cedula='"+P.getCedula()+"'";
        return pr.Select(sql);
    }
}
