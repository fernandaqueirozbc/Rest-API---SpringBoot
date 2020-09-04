package br.com.bandtec.projetoindividual;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sessoes")
public class BilheteriaController {

    private List<Filme> listaFilme = new ArrayList<>();
    private List<Teatro> listaTeatro = new ArrayList<>();

    //metodos filme
    @PostMapping("/filme")
    public void addFilme (@RequestBody Filme f) {listaFilme.add(f);}

    @GetMapping("/filme")
    public List<Filme> getListaFilme() {return listaFilme;}

    @DeleteMapping("/filme/{id}")
    public void excluirFilme(@PathVariable int id) {
        listaFilme.remove(id-1);
    }

    //metodos teatro
    @PostMapping("/teatro")
    public void addTeatro (@RequestBody Teatro t) {listaTeatro.add(t);}

    @GetMapping("/teatro")
    public List<Teatro> getListaTeatro() {return listaTeatro;}

    @DeleteMapping("/teatro/{id}")
    public void excluirTeatro(@PathVariable int id) {
        listaTeatro.remove(id-1);
    }

}