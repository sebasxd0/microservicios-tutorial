package authservice.usuarioservice.feignClients;

import authservice.usuarioservice.modelos.Carro;
import authservice.usuarioservice.modelos.Moto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "carro-service")
public interface CarroFeignClient {
    @PostMapping("/carro")
    public Carro save(@RequestBody Carro carro);

    @GetMapping("/carro/usuario/{usuarioId}")
    public List<Carro> getCarros(@PathVariable("usuarioId") int usuarioId);
}
