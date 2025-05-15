package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pack.model.Jikwon;
import pack.model.JikwonDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class JikwonController {
    @Autowired
    JikwonDao jikwonDao;

    @GetMapping("/jikwon")
    public Map<String, List<Jikwon>>list(@RequestParam("busername")String busername) {
        System.out.println("jikwonName : " + busername);
        Map<String, List<Jikwon>> map = new HashMap<>();
        List<Jikwon> list = jikwonDao.list(busername);
//        System.out.println("list : " + list);
        map.put("items", list);

        return map;
    }
}
