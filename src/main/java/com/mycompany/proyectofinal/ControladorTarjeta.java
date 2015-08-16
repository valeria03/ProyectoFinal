/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinal;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */
@RestController
@RequestMapping("/")
public class ControladorTarjeta {
    //////////////////////////
    @RequestMapping(value="/tarjeta/{nombre}/{fechaCorte}",
        method = RequestMethod.POST,headers={"Accept=text/html"})
    @ResponseBody String guardar(@PathVariable String nombre,
        @PathVariable Integer diaCorte)throws Exception{
        Tarjeta p =new Tarjeta();
        p.setDiaCorte(diaCorte);
        p.setNombre(nombre);
        DAOTarjeta dao=new DAOTarjeta();
        dao.guardar(p);
        return "Tu tarjeta se guardo con exito";
        
    }
 ///////////////////////////////////////////////  
    @RequestMapping(value="/tarjeta/{id_tarjeta}/{nombre]/{costo}/{unidades}",
                    method = RequestMethod.PUT,headers={"Accept=text/html"})
    @ResponseBody String actualizar
    (@PathVariable Integer id_tarjeta,@PathVariable String nombre,@PathVariable Float costo,@PathVariable Integer unidades )
    throws Exception{
        
        DAOTarjeta dao=new DAOTarjeta();
   
        Tarjeta p=new Tarjeta();
        p.setIdTarjeta(id_tarjeta);
//        p.setCosto(costo);
        p.setNombre(nombre);
//        p.setUnidades(unidades);
          dao.actualizar(p);
           return "Tu tarjeta se actualizo";
        
      }
    
    
    
    @RequestMapping(value="/tarjeta", method =RequestMethod.GET, headers={"Accept=application/json"})
    @ResponseBody ArrayList<Tarjeta> obtenerTodos() throws Exception{
    DAOTarjeta dao = new DAOTarjeta();
    ArrayList<Tarjeta> tarjetas = dao.buscarTodos();
    return tarjetas;
    }
}
