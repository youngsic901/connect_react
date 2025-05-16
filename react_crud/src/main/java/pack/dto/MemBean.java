package pack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@Alias("memBean")
public class MemBean {
    private int num;
    private String name;
    private String addr;
}
