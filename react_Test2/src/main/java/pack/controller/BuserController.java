package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pack.model.Buser;
import pack.model.BuserDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BuserController {
    @Autowired
    private BuserDao buserDao;

    @GetMapping("/buser")
    public Map<String, List<Buser>>listAll(){
        Map<String, List<Buser>> map = new HashMap<>();
        List<Buser> list = buserDao.list();
        map.put("items", list);
        return map;
    }
//    public List<Buser>listAll(){
//        return buserDao.list();
//    }

}
