import entity.InfoStudent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import utils.ReadExcelUtils;

import java.util.List;

public class ReadExcelTest {
    @Test
    public void main() throws Exception {
        String filePath = "E:\\student.xls";
        ReadExcelUtils readExcelUtils = new ReadExcelUtils();
        List<InfoStudent> infoStudentList = readExcelUtils.readExcel(filePath);
        for(InfoStudent info : infoStudentList){
            System.out.println(info.getName());
        }
    }
}