package pack.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BuserDao {
    @Autowired
    private BuserDataMapperInterface buserdataMapper;

    public List<Buser> list() {
        List<Buser> list = null;

        try {
            list = buserdataMapper.selectAll();
        } catch (Exception e) {
            System.out.println("list err : " + e);
        }

        return list;
    }
}
