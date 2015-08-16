/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author T-107
 */

@Configuration
public class ConfiguracionBasica {
    
    @Bean
    
    Leer servicioLeer(){
       LeerTarjeta leer=new LeerTarjeta();
       return leer;
    }
    
}
