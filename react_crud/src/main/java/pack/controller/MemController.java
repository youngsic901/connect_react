package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pack.dto.MemDto;
import pack.repository.MemDao;

import java.util.List;

@Controller
public class MemController {
    @Autowired
    private MemDao memDao;

    @GetMapping("/members")
    public String list(Model model) {
        List<MemDto> list = memDao.getList();
        model.addAttribute("list", list);
        return "list";
    }
}
