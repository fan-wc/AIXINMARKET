package dao;

import entity.AixinStudent;
import entity.InfoStudent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InfoDao {
    public Integer getSpecialId(String specialName);
    public Integer getDepartmentId(String departmentName);
    public Integer getCampus(String departmentName);
    public Integer getImburseType(String imburseTypeName);
    public AixinStudent getRiYongAndFuZhuang(InfoStudent infoStudent);

    public Integer getInfoStudentId(InfoStudent infoStudent);

    public void insertInfo(InfoStudent infoStudent);
    public void insertAiXin(AixinStudent aixinStudent);

    public void updateAiXinRiYong(AixinStudent aixinStudent);
    public void updateAiXinFuZhuang(AixinStudent aixinStudent);
}
