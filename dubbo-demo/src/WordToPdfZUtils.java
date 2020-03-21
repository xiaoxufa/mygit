//
//import com.jacob.activeX.ActiveXComponent;
//import com.jacob.com.Dispatch;
//
//import com.spire.doc.Document;
//import com.spire.doc.FileFormat;
//import com.spire.pdf.PdfDocument;
//
//import java.io.File;
//
//
//public class WordToPdfZUtils {
//
//    public static void wToPdfChange(String wordFile,String pdfFile){
//
//        ActiveXComponent app = null;
//        System.out.println("开始转换...");
//        // 开始时间
//        // long start = System.currentTimeMillis();
//        try {
//            // 打开word
//            app = new ActiveXComponent("Word.Application");
//            // 获得word中所有打开的文档
//            Dispatch documents = app.getProperty("Documents").toDispatch();
//            System.out.println("打开文件: " + wordFile);
//            // 打开文档
//            Dispatch document = Dispatch.call(documents, "Open", wordFile, false, true).toDispatch();
//            // 如果文件存在的话，不会覆盖，会直接报错，所以我们需要判断文件是否存在
//            File target = new File(pdfFile);
//            if (target.exists()) {
//                target.delete();
//            }
//            System.out.println("另存为: " + pdfFile);
//            Dispatch.call(document, "SaveAs", pdfFile, 17);
//            // 关闭文档
//            Dispatch.call(document, "Close", false);
//        }catch(Exception e) {
//            System.out.println("转换失败"+e.getMessage());
//        }finally {
//            // 关闭office
//            app.invoke("Quit", 0);
//        }
//    }
//
//    public static void main(String[] args) {
//
////        document.loadFromFile("E://jacob-1.19//建委联合执法网格化平台需求单LHYDSQ2020031001.doc");
//        //加载word示例文档
//        com.spire.doc.Document document = new Document();
//        document.loadFromFile("E://jacob-1.19//张三_发展党员纪实材料.docx");
//        //保存结果文件
//        document.saveToFile("E://jacob-1.19//张三.pdf", FileFormat.PDF);
//
////        //创建PdfDocument对象并加载示例文档
////        PdfDocument pdf = new PdfDocument();
////        pdf.loadFromFile("E://jacob-1.19//toPDF1.pdf");
////
////        //删除第二页
////        pdf.getPages().removeAt(0);
////        pdf.saveToFile("E://jacob-1.19//添加删除页面.pdf");
////        //保存结果文件
////        document.saveToFile("out/toPDF.pdf", FileFormat.PDF);
////        String word = "E://jacob-1.19//建委联合执法网格化平台需求单LHYDSQ2020031001.doc";//你的word 文件的位置
////        String name = "建委联合执法".concat(".pdf");//你的转换后的文档的名称
////        String pdf = "E://jacob-1.19//"+name;//转换后的文档位置 路径
////        wToPdfChange(word, pdf);
//    }
//    private void deletePDF(){
//
//    }
//}
