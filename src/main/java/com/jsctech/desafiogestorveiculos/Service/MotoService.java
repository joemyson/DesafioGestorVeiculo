package com.jsctech.desafiogestorveiculos.Service;


import com.jsctech.desafiogestorveiculos.Entity.Moto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MotoService {

    public static Map<Long, Moto> listaMotos = new HashMap<>();

    public ResponseEntity<Moto> buscarMotoId(Long id) {
        Moto moto = listaMotos.get(id);
        if (moto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(moto);
    }

    public List<Moto> buscarTodasMotos() {

        return new ArrayList<>(listaMotos.values());
    }

 public ResponseEntity<Moto> CadastraMoto(Moto moto) {
        Moto motoEncontrado = listaMotos.get(moto.getId());
        if (motoEncontrado == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(motoEncontrado);
    }

    public ResponseEntity<Moto> AtualizaMotos(Moto moto) {
     Moto motoEncontrado = listaMotos.get(moto.getId());
        if (motoEncontrado == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        listaMotos.put(moto.getId(), moto);
        return ResponseEntity.status(HttpStatus.OK).body(motoEncontrado);
    }

   public ResponseEntity<String> RemoveMoto(Long id) {
       Moto motoEncontrado = listaMotos.get(id);
        if (motoEncontrado == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        listaMotos.remove(id);
        return ResponseEntity.status(HttpStatus.OK).body("moto removido com sucesso");
    }

}
