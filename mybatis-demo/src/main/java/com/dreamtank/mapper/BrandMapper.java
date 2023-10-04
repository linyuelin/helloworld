package com.dreamtank.mapper;

import com.dreamtank.pojo.Brand;
import com.dreamtank.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {


      List<Brand> selectAll();

      Brand selectByIdBrand(int id);

      //1.別々にパラメーターを渡す
//      List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

//     2. オブジェクトで渡す
//      List<Brand> selectByCondition(Brand brand);

//       3.マップで渡す

      List<Brand> selectByCondition(Map map);

      List<Brand> selectByConditionSingle(Map map);

      void addOrder(Brand brand);

      int  update(Brand brand);

      void deleteByIdAfter(int id);

      void deleteByIds(@Param("ids") int[] ids);



}
