package ua.edu.ucu.apps.documents;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class SmartDocument implements Document {
    public String parse(String filePath) {
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("/home/oleh/edu/OOP/Lab10");
        tesseract.setLanguage("eng");
        try {
            return tesseract.doOCR(new File(filePath));
        } catch (TesseractException e) {
            e.printStackTrace();
            return "";
        }
    }
}