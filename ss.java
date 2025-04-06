import java.awt.Desktop;
import java.io.*;
import java.net.*;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class ss {

    public static void main(String[] args) {
        try {
            // URL of the webpage you want to copy
            String urlString = "https://ums.lpu.in/lpuums";
            URL url = new URL(urlString);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            StringBuilder pageContent = new StringBuilder();
            
            // Reading the HTML content of the webpage
            while ((inputLine = in.readLine()) != null) {
                pageContent.append(inputLine).append("\n");
            }
            in.close();

            // Create a new Word document
            XWPFDocument document = new XWPFDocument();
            XWPFParagraph paragraph = document.createParagraph();
            XWPFRun run = paragraph.createRun();
            
            // Add the webpage content to the Word document
            run.setText(pageContent.toString());

            // Save the document to the Desktop
            String desktopPath = System.getProperty("user.home") + "/Desktop/WebpageContent.docx";
            FileOutputStream out = new FileOutputStream(desktopPath);
            document.write(out);
            out.close();
            
            System.out.println("Webpage content saved to: " + desktopPath);

            // Optionally open the webpage in the browser
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                URI uri = new URI(urlString);
                desktop.browse(uri);
            }

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
