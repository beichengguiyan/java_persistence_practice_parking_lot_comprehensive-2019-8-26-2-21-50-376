package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.Parkinglot;

@Mapper
public interface ParkinglotMapper {
    List<Parkinglot> selectAll();
   void insert(@Param("parkinglot") Parkinglot parkinglot);
   List<Parkinglot> selectById(@Param("id") int id);
}
