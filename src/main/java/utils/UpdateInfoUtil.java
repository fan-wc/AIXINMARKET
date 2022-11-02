package utils;

import dao.InfoDao;
import entity.AixinStudent;
import entity.InfoStudent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UpdateInfoUtil {

    @Autowired
    InfoDao infoDao;

    public void InsertInfo(List<InfoStudent> list){
        for(InfoStudent info : list){
            infoDao.insertInfo(info);
        }
    }
    public void InsertAiXin(List<InfoStudent> list){
        Integer riYong = 0;
        Integer fuZhuang = 0;
        for(InfoStudent info : list){
            Integer info_studentId = infoDao.getInfoStudentId(info);
            switch (info.getDepartmentId()){
                case 1:
                    riYong=11;
                    fuZhuang=11;
                    break;
                case 2:
                    riYong=11;
                    fuZhuang=11;
                    break;
                case 3:
                    riYong=11;
                    fuZhuang=11;
                    break;
                case 4:
                    riYong=11;
                    fuZhuang=11;
                    break;
                case 5:
                    riYong=11;
                    fuZhuang=11;
                    break;
            }
            AixinStudent aixinStudent = new AixinStudent(info_studentId,info_studentId.toString(),riYong.toString(),fuZhuang.toString());
            infoDao.insertAiXin(aixinStudent);
        }
    }
    public void updateRiYong(List<InfoStudent> list) {
        for (InfoStudent info : list){

        }
    }
    public void updateFuZhuang(List<InfoStudent> list) {
        for (InfoStudent info : list){

        }
    }
}
