package pack.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pack.dto.MemDto;

import java.util.List;

@Repository
public class MemDao {
    @Autowired
    SqlSession session;

    // 전체 자료 읽기
    public List<MemDto> getList() {
        return session.selectList("member.getList");
    }

    // 부분 자료 읽기
    public MemDto getData(int num) {
        return session.selectOne("member.getData", num);
    }

    public void insert(MemDto dto) {
        session.insert("member.insert", dto);
    }

    public void update(MemDto dto) {
        session.update("member.update", dto);
    }

    public void delete(int num) {
        session.delete("member.delete", num);
    }
}
