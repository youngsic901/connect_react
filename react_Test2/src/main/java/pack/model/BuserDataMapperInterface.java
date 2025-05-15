package pack.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BuserDataMapperInterface {
    @Select("SELECT busernum, busername, busertel, COUNT(busernum) AS jikwon FROM buser JOIN jikwon ON buserno=busernum GROUP BY busernum")
    List<Buser> selectAll();
}
