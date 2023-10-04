package com.poi.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

public class PoiService {

	
	public static void main(String[] args) throws IOException {
	}
	public static void getData(MultipartFile file) throws IOException {
		InputStream inputStream = file.getInputStream();
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheetAt(0);
		Header header = sheet.getHeader();
		System.out.println(header+"*********************");
	}
}