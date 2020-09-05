package br.com.bandtec.projetoindividual;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sessoes")
public class BilheteriaController {

 //   private List<Sessao> sessao = new ArrayList<>();
    private List<Filme> listaFilme = new ArrayList<>();
    private List<Teatro> listaTeatro = new ArrayList<>();

//    @PostMapping("/teste")
//    public ResponseEntity addTeste (@RequestBody Sessao s) {
//        sessao.add(s);
//        return ResponseEntity.status(201).build();
//    }


    //metodos filme
    @PostMapping("/filme")
    public ResponseEntity addFilme (@RequestBody Filme f) {
        listaFilme.add(f);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/filme")
    public List<Filme> getListaFilme() {return listaFilme;}

    @DeleteMapping("/filme/{id}")
    public void excluirFilme(@PathVariable int id) {
        listaFilme.remove(id-1);
    }

    //metodos teatro
    @PostMapping("/teatro")
    public ResponseEntity addTeatro (@RequestBody Teatro t) {
        listaTeatro.add(t);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/teatro")
    public List<Teatro> getListaTeatro() {return listaTeatro;}

    @DeleteMapping("/teatro/{id}")
    public void excluirTeatro(@PathVariable int id) {
        listaTeatro.remove(id-1);
    }

}
