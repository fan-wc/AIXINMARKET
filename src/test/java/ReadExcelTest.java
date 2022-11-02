import entity.InfoStudent;
import utils.ReadExcelUtils;

import java.util.List;

public class ReadExcelTest {
    public static void main(String[] args) throws Exception {
        String filePath = "C:\\文件\\AIXIN\\list.xls";
        ReadExcelUtils readExcelUtils = new ReadExcelUtils();
        List<InfoStudent> infoStudentList = readExcelUtils.readExcel(filePath);
        for(InfoStudent info : infoStudentList){
            System.out.println(info.getName());
        }
    }
}