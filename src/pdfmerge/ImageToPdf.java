package pdfmerge;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.File;
import java.io.IOException;

public class ImageToPdf {
    public static void main(String[] args) throws Exception{

        try (final PDDocument doc = new PDDocument()){

            PDPage page = new PDPage();
            doc.addPage(page);

            String image = "/Users/prategar/Downloads/dadpassport/Picture042.jpg";
            PDImageXObject pdImage = PDImageXObject.createFromFile(image, doc);

            PDPageContentStream contents = new PDPageContentStream(doc, page);
            PDRectangle mediaBox = page.getMediaBox();

            float startX = (mediaBox.getWidth() - pdImage.getWidth()) / 2;
            float startY = (mediaBox.getHeight() - pdImage.getHeight()) / 2;
            contents.drawImage(pdImage, startX, startY);

            contents.close();

            doc.save(new File("/Users/prategar/Downloads/dadpassport/image.pdf"));
        } catch (IOException e){
            System.err.println("Exception while trying to create pdf document - " + e);
        }
    }
}
