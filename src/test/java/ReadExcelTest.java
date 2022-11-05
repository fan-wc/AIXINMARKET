import entity.InfoStudent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import utils.ReadExcelUtils;
import utils.UpdateInfoUtil;

import java.util.List;

public class ReadExcelTest {
    @Test
    public void main() throws Exception {
        String filePath = "C:\\文件\\AIXIN\\list.xls";
        ReadExcelUtils readExcelUtils = new ReadExcelUtils();
        List<InfoStudent> infoStudentList = readExcelUtils.readExcel(filePath);
        UpdateInfoUtil updateInfoUtil = new UpdateInfoUtil();
        for (InfoStudent infoStudent : infoStudentList){
            System.out.println(infoStudent.toString());
        }
        updateInfoUtil.insertAiXin(infoStudentList);
    }
}