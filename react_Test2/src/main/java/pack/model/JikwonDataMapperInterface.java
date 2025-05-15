package pack.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface JikwonDataMapperInterface {
    @Select("SELECT jikwonno, jikwonname, busername, jikwonjik, COUNT(gogekdamsano) AS gogeksu\n" +
            "        FROM jikwon\n" +
            "        JOIN buser ON buserno=busernum\n" +
            "        LEFT JOIN gogek ON jikwonno=gogekdamsano\n" +
            "        WHERE busername=#{buserName}\n" +
            "        GROUP BY jikwonno\n" +
            "        ORDER BY jikwonno;")
    List<Jikwon> selectByBuserName(String buserName);
}
