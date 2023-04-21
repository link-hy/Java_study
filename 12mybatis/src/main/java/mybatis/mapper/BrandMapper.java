package mybatis.mapper;
import mybatis.pojp.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    List<Brand> selectAll();
    Brand selectById(int id);

    //多参数的接口
/*    List<Brand> selectByCondition(
            @Param("status")  int status,
            @Param("companyName") String companyName,
            @Param("brandName") String brandName);*/

//    List<Brand> selectByCondition(Brand brand);

    List<Brand> selectByCondition(Map map);

    /**
     * 单条件动态查询
     * @param brand
     * @return
     */
    List<Brand> selectByConditionSingle(Brand brand);

    /**
     * 添加
     */
    void add(Brand brand);

    /**
     * 修改
     */
    int update(Brand brand);

    /**
     * 根据id删除
     */
    void deleteById(int id);

    /**
     * 批量删除
     */
    void deleteByIds(int[] ids);
}
