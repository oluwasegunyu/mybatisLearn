package yxy.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import yxy.pojo.User;
import yxy.utils.MybatisUtils;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
