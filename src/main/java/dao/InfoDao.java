package dao;

import entity.AixinStudent;
import entity.InfoStudent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InfoDao {
    Integer getSpecialId(String specialName);
    Integer getDepartmentId(String departmentName);
    Integer getCampus(String departmentName);
    Integer getImburseType(String imburseTypeName);

    AixinStudent getRiYongAndFuZhuang(InfoStudent infoStudent);

    public Integer getInfoStudentId(InfoStudent infoStudent);

    public void insertInfo(InfoStudent infoStudent);
    public void insertAiXin(AixinStudent aixinStudent);

    public void updateAiXinRiYong(AixinStudent aixinStudent);
    public void updateAiXinFuZhuang(AixinStudent aixinStudent);
}
