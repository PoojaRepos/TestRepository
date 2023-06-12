package program;
import java.io.File;

/*
 * Write code for getting count of files from folders; few are .xls and .txt (Based on extension print the count. 
for example: .xlsx = n, .txt = n)
 * 
 */     
public class FileCount {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\DELL\\Desktop\\New folder (2)"; // Replace with the actual directory path

        
        int xlsCount = 0;
        int txtCount = 0;

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    if (fileName.endsWith(".xlsx")) {
                        xlsCount++;
                       // System.out.println("filename are " + fileName);
                    } else if (fileName.endsWith(".docx")) {
                        txtCount++;
                    }
                }
            }
        }

        System.out.println(".xlsx count: " + xlsCount);
        System.out.println(".docx count: " + txtCount);
    }
}
