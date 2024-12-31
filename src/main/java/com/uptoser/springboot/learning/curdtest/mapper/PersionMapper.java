//package me.ibeyond.springboottest.test.mapper;
//
//import me.ibeyond.springboottest.test.model.Persion;
//import org.apache.ibatis.annotations.Delete;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Select;
//import org.apache.ibatis.annotations.Update;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface PersionMapper {
//
//    @Select("select * from persion where pid = #{pid}")
//    Persion getPersion(Integer pid);
//
//    @Insert("insert into persion values(#{pid},#{name},#{age})")
//    int addPersion(Persion persion);
//
//    @Delete("delete from persion where pid = #{pid}")
//    int deletePersion(Integer pid);
//
//    @Update("update persion set name = #{name} where pid = #{pid}")
//    int updatePersion();
//}
