package utils;
import dao.InfoDao;
import entity.InfoStudent;
import jxl.Workbook; //java读取excel表使用的类
import jxl.Cell;  //java读取表格里的单元格的类
import jxl.Sheet; //java读取的工作铺的类
import jxl.read.biff.BiffException;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadExcelUtils {

    @Autowired
    InfoDao infoDao;

    public  List<InfoStudent> readExcel(String filePath) {
        List<InfoStudent> list = new ArrayList<>();

        try{
            Workbook workbook = null;
            File excelFile = new File(filePath);

            FileInputStream fileInputStream = new FileInputStream(excelFile);
            workbook = Workbook.getWorkbook(fileInputStream);

            Sheet readfirst = workbook.getSheet(0);
            int rows = readfirst.getRows();
            int clomns = readfirst.getColumns();
            System.out.println("row:" + rows);
            System.out.println("clomns:" + clomns);

            for (int i = 1; i < rows; i++) {
                Cell[] cells = readfirst.getRow(i); //循环得到每一行的单元格对象
                //根据每一个单元格对象的到里面的值
                String name = cells[1].getContents();
                String scho = cells[2].getContents();
                String special = cells[3].getContents();
                String grade = cells[4].getContents();
                String code = cells[5].getContents();
                String clas = cells[7].getContents();

                Integer specialId = infoDao.getSpecialId(special);
                Integer departId = infoDao.getDepartmentId(scho);
                Integer campus = infoDao.getCampus(scho);
                Integer imbursetype = infoDao.getImburseType(clas);

                InfoStudent infoStudent = new InfoStudent(code,code,name,departId,specialId,Integer.getInteger(grade),campus,imbursetype);

                list.add(infoStudent);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        return list;
    }
}