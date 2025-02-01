package com.jsctech.desafiogestorveiculos.Controlle;

import com.jsctech.desafiogestorveiculos.Entity.Carro;
import com.jsctech.desafiogestorveiculos.Service.CarroService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("Carro")
@AllArgsConstructor
public class CarroControlle {

    private CarroService carroService;

@GetMapping("/{id}")
    public ResponseEntity<Carro> buscarCarroId(@RequestParam Long id) {

   return carroService.buscarCarroId(id);

}
@GetMapping
    public List<Carro> buscarTodosCarros() {
    return  carroService.buscarTodosCarros();

}
@PostMapping
    public ResponseEntity<Carro> CadastraCarro(@RequestBody Carro carro) {
    return carroService.CadastraCarro(carro);

}
@PutMapping("/{id}")
    public ResponseEntity<Carro> AtualizaCarro(@RequestParam Carro carro) {
    return carroService.AtualizaCarro(carro);

}
@DeleteMapping("/{id}")
    public ResponseEntity<String> removeCarro( @RequestParam Long id) {
    return carroService.removeCarro(id);

}
}
