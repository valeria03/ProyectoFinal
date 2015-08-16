/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author T-107
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration 
@ComponentScan
public class Aplicacion {
    
    public static void main(String[] args)throws Exception{
        
        SpringApplication.run(Aplicacion.class, args);
        
        System.out.println("Un mensaje desde spring boot");
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ConfiguracionBasica.class);
        
        Leer servicioLeer= ctx.getBean(Leer.class);
        System.out.println(servicioLeer.Leer());
        
        //LeerArchivo objeto=new LeerArchivo();
        //System.out.println(objeto.leer());
        
    }
    
}
