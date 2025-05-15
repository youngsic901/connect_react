package pack.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JikwonDao {
    @Autowired
    private JikwonDataMapperInterface jikwonDataMapper;

    public List<Jikwon> list(String buserName) {
        List<Jikwon> list = null;

        try {
            list = jikwonDataMapper.selectByBuserName(buserName);
        } catch (Exception e) {
            System.out.println("list err : " + e);
        }
        System.out.println("list : " + list);
        return list;
    }
}
