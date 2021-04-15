package com.gr.geias.mapper;

import com.gr.geias.entity.Area;
import com.gr.geias.entity.DataFile;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DataFileMapper {
//    @Insert("insert into tb_employment_information(information_id, student_num, name, gender, college_id, specialty_id, class_id, area_id, unit_id, employment_way_id\", salary, create_time, msg)values(#{dataFile.information_id}, #{dataFile.student_num}, #{dataFile.name}, #{dataFile.gender}, #{dataFile.college_id}, #{dataFile.specialty_id}, #{dataFile.class_id}, #{dataFile.area_id}, #{dataFile.unit_id}, #{dataFile.employment_way_id\"}, #{dataFile.salary}, #{dataFile.create_time}, #{dataFile.msg}")
    void addDataFile(@Param("sysDataFile")DataFile sysDataFile);

    List<Integer> collegDataFile(@Param("college_id")String college_id);
    List<Integer> specialaltyDataFile(@Param("specialty_id")String specialty_id, @Param("college_id") int college_id);
    List<Integer> classDataFile(@Param("class_id")String class_id, @Param("specialty_id")int specialty_id);





}
