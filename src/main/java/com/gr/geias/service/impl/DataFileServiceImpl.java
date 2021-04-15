package com.gr.geias.service.impl;

import com.gr.geias.entity.DataFile;
import com.gr.geias.service.IDataFileService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName : DataFileServiceImpl
 * @Description : 导入excel文件
 * @Author : douyonghou
 * @Date: 2021-04-10 23:16
 */
@Service
public class DataFileServiceImpl implements IDataFileService {

    @Autowired
    private com.gr.geias.mapper.DataFileMapper dataFileMapper;

    @Autowired
    private com.gr.geias.mapper.AreaMapper areaMapper;


    @Transactional(readOnly = false,rollbackFor = Exception.class)
    @Override
    public boolean batchImport(String fileName, MultipartFile file) throws Exception {

        boolean notNull = false;
        List<DataFile> dataFileList = new ArrayList<DataFile>();
        if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
            throw new Exception("上传文件格式不正确");
        }
        boolean isExcel2003 = true;
        if (fileName.matches("^.+\\.(?i)(xlsx)$")) {
            isExcel2003 = false;
        }
        InputStream is = file.getInputStream();
        Workbook wb = null;
        if (isExcel2003) {
            wb = new HSSFWorkbook(is);
        } else {
            wb = new XSSFWorkbook(is);
        }
        Sheet sheet = wb.getSheetAt(0);
        if(sheet!=null){
            notNull = true;
        }
        DataFile dataFile;
        for (int r = 1; r <= sheet.getLastRowNum(); r++) {
            Row row = sheet.getRow(r);
            if (row == null){
                continue;
            }

            dataFile = new DataFile();

            // 主键
            row.getCell(0).setCellType(Cell.CELL_TYPE_NUMERIC);
            int id = (int)row.getCell(0).getNumericCellValue();
            System.out.println(id);


            // 学号（）
            row.getCell(1).setCellType(Cell.CELL_TYPE_NUMERIC);
            int uid = (int)row.getCell(1).getNumericCellValue();
            System.out.println(uid);


            // 姓名
            String name = row.getCell(2).getStringCellValue();
            System.out.println(name);


            // 性别
            String sex = row.getCell(3).getStringCellValue();
            int gender = sex.equals("男") ? 1 : 0 ;
            System.out.println(gender);


            //学院id：（）
            String college_id = row.getCell(4).getStringCellValue();
            System.out.println(college_id);


            //专业：（）
            String specialty_id = row.getCell(5).getStringCellValue();
            System.out.println(specialty_id);


            //班级：（）
            String class_id = row.getCell(6).getStringCellValue();
            System.out.println(class_id);


            //地区：（）
            String area_id = row.getCell(7).getStringCellValue();
            System.out.println(area_id);


            //就业属性：
            String unit = row.getCell(8).getStringCellValue();
            System.out.println(unit);
            int unit_id = 0;
            switch (unit){
                case "国企" : unit_id = 1;
                case "私企" : unit_id = 2;
                case "公务员" : unit_id = 3;
                case "事业单位" : unit_id = 4;

            }


            //就业途径：（）
            String employment_way = row.getCell(9).getStringCellValue();
            System.out.println(employment_way);
            int employment_way_id = 0;
            switch (employment_way){
                case "学校双选会" : employment_way_id = 1;
                case "互联网招聘平台" : employment_way_id = 2;
                case "个人寻找" : employment_way_id = 3;
                case "朋友推荐" : employment_way_id = 4;
            }

            //工资：（）
            String salary = row.getCell(10).getStringCellValue();
            System.out.println(salary);


            dataFile.setInformation_id(id);
            dataFile.setStudent_num(uid);

            dataFile.setName(name);
            dataFile.setGender(gender);

            int collId = dataFileMapper.collegDataFile(college_id).get(0);
            dataFile.setCollege_id(collId); //-----------
            System.out.println(collId);

            int speId = dataFileMapper.specialaltyDataFile(specialty_id, collId).get(0);
            dataFile.setSpecialty_id(speId); // --------------
            System.out.println(speId);

            int classId = dataFileMapper.classDataFile(class_id, speId).get(0);
            dataFile.setClass_id(classId); // -----------
            System.out.println(classId);

            int areaId = areaMapper.getAreaId(area_id).get(0);
            dataFile.setArea_id(areaId); // -----------
            System.out.println(areaId);


            dataFile.setUnit_id(unit_id);
            dataFile.setEmployment_way_id(employment_way_id);
            dataFile.setSalary(salary);

            dataFile.setCreate_time("2021-04-30");
            dataFile.setMsg("des");
            System.out.println("----------------------");


//            //时间：（）
//            String create_time = row.getCell(11).getStringCellValue();
//            System.out.println(create_time);
////            dataFile.setCreate_time(create_time);
//
//            //信息：（）
//            String msg = row.getCell(12).getStringCellValue();
//            System.out.println(msg);









//            dataFile.setDes(des);

            dataFileList.add(dataFile);
        }
        for (DataFile dataFileResord : dataFileList) {
            String name = dataFileResord.getName();
            dataFileMapper.addDataFile(dataFileResord);
            System.out.println(" 插入 "+dataFileResord);
        }
        return notNull;
    }
}
