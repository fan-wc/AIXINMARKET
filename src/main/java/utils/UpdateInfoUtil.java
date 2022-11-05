package utils;

import dao.InfoDao;
import entity.AixinStudent;
import entity.InfoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring/application.xml");
        infoDao = context.getBean("infoDao", InfoDao.class);
        Integer riYong = 0;
        Integer fuZhuang = 0;
        for(InfoStudent info : list){
            if(infoDao.getInfoStudentId(info) == null){
                if (info.getImburseType() == null){
                    info.setImburseType(0);
                }
                infoDao.insertInfo(info);
                Integer info_studentId = infoDao.getInfoStudentId(info);

                switch (info.getImburseType()){
                    case 1:
                        riYong=20;
                        fuZhuang=150;
                        break;
                    case 5:
                        riYong=20;
                        fuZhuang=110;
                        break;
                    case 2:
                        riYong=20;
                        fuZhuang=130;
                        break;
                    case 3:
                        riYong=20;
                        fuZhuang=100;
                        break;
                    default:
                        riYong=0;
                        fuZhuang=0;
                        break;
                }
                AixinStudent aixinStudent = new AixinStudent(info_studentId,info_studentId.toString(),riYong.toString(), fuZhuang.toString());
                infoDao.insertAiXin(aixinStudent);
            }

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
