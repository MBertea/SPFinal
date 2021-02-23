package ro.uvt;
import ro.uvt.models.*;
import ro.uvt.services.*;
import java.util.*;

import ro.uvt.models.Paragraf;
import ro.uvt.models.Section;
import ro.uvt.services.AlignLeft;
import ro.uvt.services.AlignRight;

public class Main {

    public static void main(String[] args) {
          Section section = new Section();
        List<Autor> autori = Arrays.asList(new Autor("First Author"));

        Carte c = new Carte((ArrayList<Autor>) autori, "Book");
        c.add(new Paragraf("aa"));
        Section s1 = new Section("bb");
        s1.add(new Imagine("cc"));
        c.add(s1);

        long startTime = System.currentTimeMillis();
        Element img1 = new ImageProxy ("First Image");
        Element img2 = new ImageProxy ("Second Image");
        Element img3 = new ImageProxy ("Third Image");

        Section section1 = new Section ("First Section");
        section1.add(img1);

        Section section2 = new Section ("Second");
        section2.add(img2);
        section2.add(img3);

        Carte book = new Carte ((ArrayList<Autor>) autori, "Book");
        book.add(section1);
        book.add(section2);

        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        //section1.render();
        endTime = System.currentTimeMillis();

        System.out.println("Printing of the section 1 took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        //section1.render();
        endTime = System.currentTimeMillis();

        System.out.println("Printing again the section 1 took " + (endTime - startTime) + " milliseconds");


        startTime = System.currentTimeMillis();
        //section2.render();
        endTime = System.currentTimeMillis();

        System.out.println("Printing of the section 2 took " + (endTime - startTime) + " milliseconds");
        Section cap1 = new Section("First Chapter");
        Paragraf p1 = new Paragraf("First Paragraph");
        cap1.add(p1);
        Paragraf p2 = new Paragraf("Second Paragraph");
        cap1.add(p2);
        Paragraf p3 = new Paragraf("ThirdParagraph");
        cap1.add(p3);
        Paragraf p4 = new Paragraf("Fourth Paragraph");
        cap1.add(p4);
        System.out.println("Printing without Alignment");
        System.out.println();
        //cap1.render();


        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());
        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
    }
}
