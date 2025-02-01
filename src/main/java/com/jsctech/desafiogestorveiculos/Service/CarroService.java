package com.jsctech.desafiogestorveiculos.Service;

import com.jsctech.desafiogestorveiculos.Entity.Carro;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CarroService {

 public static Map<Long, Carro> listaCarros = new HashMap<>();

   public ResponseEntity<Carro> buscarCarroId(Long id) {
        Carro carro = listaCarros.get(id);
        if (carro == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(carro);
    }

    public List<Carro> buscarTodosCarros() {

        return new ArrayList<>(listaCarros.values());
    }

  public ResponseEntity<Carro> CadastraCarro(Carro carro) {
        Carro carroEncontrado = listaCarros.get(carro.getId());
        if (carroEncontrado == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(carroEncontrado);
    }

public ResponseEntity<Carro> AtualizaCarro(Carro carro) {
        Carro carroEncontrado = listaCarros.get(carro.getId());
        if (carroEncontrado == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        listaCarros.put(carro.getId(), carro);
        return ResponseEntity.status(HttpStatus.OK).body(carroEncontrado);
    }

   public ResponseEntity<String> removeCarro(Long id) {
        Carro carroEncontrado = listaCarros.get(id);
        if (carroEncontrado == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        listaCarros.remove(id);
        return ResponseEntity.status(HttpStatus.OK).body("carro removido com sucesso");
    }

}
