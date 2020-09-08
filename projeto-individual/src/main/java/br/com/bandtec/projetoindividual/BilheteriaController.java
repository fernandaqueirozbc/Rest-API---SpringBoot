package br.com.bandtec.projetoindividual;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/sessoes")
public class BilheteriaController {

    private List<Sessao> listaSessao;

    public BilheteriaController() {
        this.listaSessao = new ArrayList<>();
    }

    //Adcionar um novo filme
    @PostMapping("/filme")
    public ResponseEntity adicionarFilme (@RequestBody Filme f) {
        listaSessao.add(f);
        return ResponseEntity.status(201).build();
    }

    //Adcionar teatro
    @PostMapping("/teatro")
    public ResponseEntity adicionarTeatro (@RequestBody Teatro t) {
        listaSessao.add(t);
        return ResponseEntity.status(201).build();
    }

    //Retorna toda lista
    @GetMapping
    public ResponseEntity exibirBilheteria() {
        if (listaSessao.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(listaSessao);
        }
    }

    //Retorna baseado no id
    @GetMapping("/{id}")
    public ResponseEntity codigoBilheteria(@PathVariable int id) {
        if (listaSessao.size() >= id) {
            return ResponseEntity.ok(listaSessao.get(id-1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //Deleta uma sessão
    @DeleteMapping("/{id}")
    public void excluirSessao(@PathVariable int id) {
        listaSessao.remove(id-1);
    }


//    @GetMapping("/economica")
//    public List<Sessao> sessaoEconomica() {
//        List<Sessao> sessaoEconomica = listaSessao.stream()
//                .filter(listaSessao -> listaSessao.calcValorIngresso() < 15)
//                .collect(Collectors.toList());
//        return sessaoEconomica;
//    }

}
