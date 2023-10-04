package com.dreamtank;

import com.dreamtank.mapper.BrandMapper;
import com.dreamtank.mapper.UserMapper;
import com.dreamtank.pojo.Brand;
import com.dreamtank.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

    @Test
    public void testSelectAll() throws IOException {

        String resource = "mybatis-config.xml";

        // 2. 使用 MyBatis 提供的 Resources 类加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 3. 使用 SqlSessionFactoryBuilder 创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();
        System.out.println(brands);


    }

    @Test
    public void testSelectOne() throws IOException {

        int id = 2;

        String resource = "mybatis-config.xml";

        // 2. 使用 MyBatis 提供的 Resources 类加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 3. 使用 SqlSessionFactoryBuilder 创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = mapper.selectByIdBrand(id);
        System.out.println(brand);


    }

    @Test
    public void testSelectByCondition() throws IOException {

        int status = 1;
        String companyName = "华为";
        String brandName = "华为";

        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

//        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);

        Map map = new HashMap<String, Brand>();
//        map.put("companyName",companyName);
//        map.put("brandName",brandName);
        map.put("status", status);

        String resource = "mybatis-config.xml";

        // 2. 使用 MyBatis 提供的 Resources 类加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 3. 使用 SqlSessionFactoryBuilder 创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectByCondition(map);
        System.out.println(brands);


    }


    @Test
    public void testSelectByConditionSingle() throws IOException {

        int status = 1;
        String companyName = "华为";
        String brandName = "华为";

        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

//        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);

        Map map = new HashMap<String, Brand>();
//        map.put("companyName",companyName);
//        map.put("brandName",brandName);
//        map.put("status",status);

        String resource = "mybatis-config.xml";

        // 2. 使用 MyBatis 提供的 Resources 类加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 3. 使用 SqlSessionFactoryBuilder 创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectByConditionSingle(map);
        System.out.println(brands);


    }


    @Test
    public void testAddOrder() throws IOException {
        int status = 1;
        String companyName = "パナソニック";
        String brandName = "パナソニック電子レンジ";
        String description = "半端なくない";
        int ordered = 10000;



        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setOrdered(ordered);
        brand.setDescription(description);

        String resource = "mybatis-config.xml";

        // 2. 使用 MyBatis 提供的 Resources 类加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 3. 使用 SqlSessionFactoryBuilder 创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.addOrder(brand);


    }
    @Test
    public void testAddOrder2() throws IOException {
        int status = 1;
        String companyName = "パナソニック";
        String brandName = "パナソニック電子レンジ";
        String description = "半端なくない";
        int ordered = 10000;



        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setOrdered(ordered);
        brand.setDescription(description);

        String resource = "mybatis-config.xml";

        // 2. 使用 MyBatis 提供的 Resources 类加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 3. 使用 SqlSessionFactoryBuilder 创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.addOrder(brand);
        Integer id = brand.getId();
        System.out.println(id);


    }

    @Test
    public void testUpdate() throws IOException {
        int status =1;
        String companyName = "小樽ビール";
        String brandName = "Sapporo";
        String description = "解消のために";
        int ordered = 800;
        int id =6;



        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setOrdered(ordered);
        brand.setDescription(description);
        brand.setId(id);

        String resource = "mybatis-config.xml";

        // 2. 使用 MyBatis 提供的 Resources 类加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 3. 使用 SqlSessionFactoryBuilder 创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        int update = mapper.update(brand);
        sqlSession.commit();
        System.out.println(update);



    }


    @Test
    public void testDelete() throws IOException {
        int id = 2;

        String resource = "mybatis-config.xml";

        // 2. 使用 MyBatis 提供的 Resources 类加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 3. 使用 SqlSessionFactoryBuilder 创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.deleteByIdAfter(id);
        sqlSession.commit();
        sqlSession.close();



    }

    @Test
    public void testDeleteByIds() throws IOException {
         int [] its = {5,6};

        String resource = "mybatis-config.xml";

        // 2. 使用 MyBatis 提供的 Resources 类加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 3. 使用 SqlSessionFactoryBuilder 创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.deleteByIds(its);
        sqlSession.commit();
        sqlSession.close();



    }


    @Test
    public void testSelectById() throws IOException {

        int id = 1     ;

        String resource = "mybatis-config.xml";

        // 2. 使用 MyBatis 提供的 Resources 类加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 3. 使用 SqlSessionFactoryBuilder 创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectById(id);
        System.out.println(user);
        sqlSession.close();


    }
}
