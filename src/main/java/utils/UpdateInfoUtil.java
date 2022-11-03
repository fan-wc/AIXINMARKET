package utils;

import dao.InfoDao;
import entity.AixinStudent;
import entity.InfoStudent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UpdateInfoUtil {

    @Autowired
    InfoDao infoDao;

    public void insertInfo(List<InfoStudent> list){
        for(InfoStudent info : list){
            infoDao.insertInfo(info);
        }
    }
    public void insertAiXin(List<InfoStudent> list){
        int riYong = 0;
        int fuZhuang = 0;
        for(InfoStudent info : list){
            Integer info_studentId = infoDao.getInfoStudentId(info);
            /*
             * 涉及数额的不确定
             * Info.xml 里也有-没用批量插入
             */
            switch (info.getDepartmentId()){
                case 1:
                case 5:
                case 2:
                case 3:
                case 4:
                    riYong=11;
                    fuZhuang=11;
                    break;
                default:
                    break;
            }
            AixinStudent aixinStudent = new AixinStudent(info_studentId,info_studentId.toString(), Integer.toString(riYong), Integer.toString(fuZhuang));
            infoDao.insertAiXin(aixinStudent);
        }
    }


    //TODO
//    public void updateRiYong(List<InfoStudent> list) {
//        for (InfoStudent info : list){
//
//        }
//    }

    //TODO
//    public void updateFuZhuang(List<InfoStudent> list) {
//        for (InfoStudent info : list){
//
//        }
//    }
}
