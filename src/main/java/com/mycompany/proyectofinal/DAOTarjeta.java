/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinal;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T-107
 */
public class DAOTarjeta {
private SessionFactory fac;
      private Session ses;
      private Transaction tranza;
       //Esta clase hara todas las operaciones de sql para larelacion  de buscar....
    //Tendriamos que crear algo parecido a lo del parcial
    
  public  DAOTarjeta (){
        fac=  HibernateU.getSessionFactory();
         ses= fac.openSession();
        tranza= ses.beginTransaction();  
    }
    

  public void cerrarSesion(){
  tranza.commit();
  ses.close();
  }
    
     public  void guardar(Tarjeta p)throws Exception{
        
        ses.save(p);
        cerrarSesion();
    }
            
    
     public ArrayList<Tarjeta> buscarTodos() throws Exception {
     
     Criteria cri= ses.createCriteria(Tarjeta.class);
     ArrayList<Tarjeta> gastos=(ArrayList<Tarjeta>) cri.list();
     cerrarSesion();
     return gastos;
     }
     
     
     public void actualizar(Tarjeta p)throws Exception{
     ses.update(p);
     cerrarSesion();
     
     
     }
}




