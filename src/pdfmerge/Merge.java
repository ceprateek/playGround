package pdfmerge;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Merge {
    public static void main(String[] args) throws IOException {
        String folderLoc = "/Users/prategar/Downloads/w2-deepti/";
        File folder = new File(folderLoc);
        File[] files = folder.listFiles();
        Arrays.sort(files);
        PDDocument mergedDoc = new PDDocument();
        PDFMergerUtility pdfMerger = new PDFMergerUtility();
        for (File file : files)
        {
            System.out.println(file.getName());
            if (file.getName().endsWith(".pdf"))
                pdfMerger.addSource(file);
        }
        pdfMerger.setDestinationFileName(folderLoc + "merged.pdf");
        pdfMerger.mergeDocuments();

    }
}
