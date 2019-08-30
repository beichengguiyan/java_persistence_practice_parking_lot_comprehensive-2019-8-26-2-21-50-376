package tws.repository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import tws.entity.Parkinglot;

import javax.sql.DataSource;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@MybatisTest
public class ParkinglotMapperTest {

    @Autowired
    private ParkinglotMapper parkinglotMapper;

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @After
    public void tearDown() throws Exception {
        JdbcTestUtils.deleteFromTables(jdbcTemplate, "parkinglot");
    }

    @Test
    public void shouldFetchAllParkinglots() {
        // given
        jdbcTemplate.execute("INSERT INTO PARkINGLOT VALUES(1,20, 100,2);");
        // when
        List<Parkinglot> parkinglotList = parkinglotMapper.selectAll();
        // then
        assertEquals(1, parkinglotList.size());
    }  
}