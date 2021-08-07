package restweb.springbootrestapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import restweb.springbootrestapi.model.ManUnitedPlayer;
import restweb.springbootrestapi.service.ManUnitedService;


import java.util.List;

@Controller
public class ManUtdController {

   private final ManUnitedService manUnitedService;

   @Autowired
    public ManUtdController(ManUnitedService manUnitedService) {
        this.manUnitedService = manUnitedService;
    }



    @GetMapping("manutd")
    public String manUtd(Model model) {
       List<ManUnitedPlayer> manUnitedPlayerList = manUnitedService.findAll();

        model.addAttribute("manutdplayer", manUnitedPlayerList);
        return "manutd";
    }

    @GetMapping("addManUtdPlayer")
    public String addManUtdPlayer(Model model){
       ManUnitedPlayer manUnitedPlayer = new ManUnitedPlayer();
       model.addAttribute("manutdplayer", manUnitedPlayer);
       return "addManUtdPlayer";
    }

    @PostMapping("addManUtdPlayer")
    public String savePlayer(@ModelAttribute("manutdplayer") ManUnitedPlayer manUnitedPlayer){

       manUnitedService.save(manUnitedPlayer);

       return "redirect:/manutd";

    }

    @GetMapping("updateManUtdPlayer")
    public String updateManUtdPlayer(@RequestParam("manUtdPlayerId") int id, Model model){
       ManUnitedPlayer manUnitedPlayer = manUnitedService.findById(id);

       model.addAttribute("manutdplayer", manUnitedPlayer);

       return "addManUtdPlayer";
    }

    @GetMapping("deleteManUtdPlayer")
    public String deleteManUtdPlayer(@RequestParam("manUtdPlayerId") int id){
        manUnitedService.deleteById(id);

        return "redirect:/manutd";
    }

}
