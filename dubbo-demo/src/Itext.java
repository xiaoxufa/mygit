///**
// * @Author 肖绪发 <xiaoxufa@lianhyd.com>
// * @Date 2020-03-11 13:34
// * @version 1.0
// * @update
// */
//
//import com.itextpdf.text.Document;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfReader;
//import com.itextpdf.text.pdf.PdfStamper;
//import com.itextpdf.text.pdf.PdfWriter;
//
//
//import java.io.FileOutputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Itext {
//
//    public static void  main(String[] args)throws Exception{
//        String FILE_DIR="E://jacob-1.19//";
//
//        FileOutputStream out = new FileOutputStream(FILE_DIR + "deletePage.pdf");
//
//        Document document = new Document();
//
//        PdfWriter writer = PdfWriter.getInstance(document, out);
//
//        document.open();
//        document.add(new Paragraph("First page"));
////        document.add(new Paragraph(Document.getVersion()));
//
//        document.newPage();
//        writer.setPageEmpty(false);
//
//        document.newPage();
//        document.add(new Paragraph("New page"));
//
//        document.close();
//
//        //操作PDF文件
//        PdfReader reader = new PdfReader(FILE_DIR + "张三1.pdf");
//        //获取PDF总页数
//        int pages=reader.getNumberOfPages();
//
//        //要选取的PDF页号集合
//        List<Integer> pagesToKeep=new ArrayList<>();
//        for (int i = 2; i <=pages ; i++) {
//            pagesToKeep.add(i);
//        }
//        //reader.selectPages("2,3,4,5,6,18");
//        reader.selectPages(pagesToKeep);
//        //输出PDF文件
//        PdfStamper stamp = new PdfStamper(reader, new FileOutputStream(FILE_DIR
//                + "deletePage5.pdf"));
//        stamp.close();
//        reader.close();
//    }
//}
