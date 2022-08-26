package com.algaworks.brewer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.algaworks.brewer.service.CadastroCervejaService;
import com.algaworks.brewer.service.CadastroEstiloService;

@Configuration
@ComponentScan(basePackageClasses = CadastroCervejaService.class)
@ComponentScan(basePackageClasses = CadastroEstiloService.class)
public class ServiceConfig {

}
