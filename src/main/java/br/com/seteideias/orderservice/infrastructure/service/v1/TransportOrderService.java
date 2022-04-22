package br.com.seteideias.orderservice.infrastructure.service.v1;

import br.com.seteideias.orderservice.configuration.GlobalProjectConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TransportOrderService {

    @Autowired
    private GlobalProjectConfiguration globalProjectConfiguration;

    @Autowired
    private RestTemplate restTemplate;

    public void createOrUpdateTransportOrder(){

    }

}
