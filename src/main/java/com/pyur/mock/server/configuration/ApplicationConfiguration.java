package com.pyur.mock.server.configuration;

import com.pyur.mock.server.service.SpriEndpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class ApplicationConfiguration {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint wholesaleEndpoint(SpriEndpoint spriEndpoint) {
        EndpointImpl endpoint = new EndpointImpl(bus, spriEndpoint);
        endpoint.publish("/wswbservice");
        return endpoint;
    }
}
