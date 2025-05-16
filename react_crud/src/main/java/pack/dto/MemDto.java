package pack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@Alias("memDto")
public class MemDto {
    private int num;
    private String name;
    private String addr;
}
