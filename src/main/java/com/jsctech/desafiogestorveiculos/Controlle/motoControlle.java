package com.jsctech.desafiogestorveiculos.Controlle;

import com.jsctech.desafiogestorveiculos.Entity.Moto;
import com.jsctech.desafiogestorveiculos.Service.MotoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping
@AllArgsConstructor
public class motoControlle {

    private MotoService motoService;

    @GetMapping("/{id}")
    public ResponseEntity<Moto> buscarMotoId( @RequestParam Long id) {

        return motoService.buscarMotoId(id);

    }
@GetMapping
    public List<Moto> buscarTodasMotos() {
        return motoService.buscarTodasMotos();


    }
@PostMapping
    public ResponseEntity<Moto> CadastraMoto(@RequestBody Moto moto) {
        return motoService.CadastraMoto(moto);

    }
@PutMapping("/{id}")
    public ResponseEntity<Moto> AtualizaMotos(@RequestParam Moto moto) {
        return motoService.AtualizaMotos(moto);

    }
@DeleteMapping("/{id}")
    public ResponseEntity<String> RemoverMoto(@RequestParam Long id) {
        return motoService.RemoveMoto(id);

    }
}
