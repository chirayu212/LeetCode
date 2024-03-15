package general;	
	import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class RandomTextGeneration {

	    public static void main(String[] args) {
	        try {
	            // Generate random text
	            String randomText = generateRandomText(10240); // 10 KB

	            // Create Excel workbook and sheet
	            Workbook workbook = new XSSFWorkbook();
	            Sheet sheet = workbook.createSheet("RandomText");

	            // Write random text to Excel sheet
	            Row row = sheet.createRow(0);
	            Cell cell = row.createCell(0);
	            cell.setCellValue(randomText);

	            // Save workbook to file
	            try (FileOutputStream fileOut = new FileOutputStream("random_text.xlsx")) {
	                workbook.write(fileOut);
	            }

	            // Close workbook
	            workbook.close();

	            System.out.println("Random text successfully generated and saved to Excel file.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static String generateRandomText(int sizeInBytes) {
	        StringBuilder randomText = new StringBuilder(sizeInBytes);
	        Random random = new Random();

	        // ASCII printable characters range from 32 to 126
	        int minAscii = 32;
	        int maxAscii = 126;

	        for (int i = 0; i < sizeInBytes; i++) {
	            int randomAscii = random.nextInt(maxAscii - minAscii + 1) + minAscii;
	            randomText.append((char) randomAscii);
	        }

	        return randomText.toString();
	    }
	}


}
