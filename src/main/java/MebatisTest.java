import com.gupaoedu.mebatis.*;

public class MebatisTest {
    public static void main(String[] args) {
        GpSqlSession gpSqlSession = new GpSqlSession(new GpConfigruation(),new GpExecutor());
        BlogMapper mapper = gpSqlSession.getMapper(BlogMapper.class);
        mapper.selectBlogById(1);
    }
}
