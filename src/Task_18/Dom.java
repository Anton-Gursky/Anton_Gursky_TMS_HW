package Task_18;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Dom {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\anton\\IdeaProjects\\Anton_Gursky_TMS_HW\\src\\Task_18\\resultFile.txt";

        try{
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("FileForParsing.xml");

            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            Node root = document.getDocumentElement();
            System.out.println("Информация об авторе:");

            NodeList sonnet = root.getChildNodes();

            for (int i = 0; i < sonnet.getLength(); i++) {
                Node author = sonnet.item(i);

                if (author.getNodeType() != Node.TEXT_NODE){
                    NodeList authorsInfo = author.getChildNodes();

                    for (int j = 0; j < authorsInfo.getLength(); j++) {
                        Node authorsPieceOfInfo = authorsInfo.item(j);

                        if (authorsPieceOfInfo.getNodeType() != Node.TEXT_NODE){
                            //System.out.println(authorsPieceOfInfo.getNodeName() + ":" + authorsPieceOfInfo.getChildNodes().item(0).getTextContent());
                            System.out.println(authorsPieceOfInfo.getChildNodes().item(0).getTextContent());
                            writeDocument(document);
                            bufferedWriter.append(authorsPieceOfInfo.getChildNodes().item(0).getTextContent() + "\n");
                        }
                    }
                }
            }
            bufferedWriter.close();
        }
        catch (ParserConfigurationException | SAXException | IOException e){
            e.printStackTrace(System.out);
        }
    }

    private static void writeDocument(Document document) throws TransformerFactoryConfigurationError {
        try{
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(document);
            FileOutputStream fos = new FileOutputStream("result.xml");
            StreamResult result = new StreamResult(fos);
            tr.transform(source, result);
        }
        catch (TransformerException | IOException e){
            e.printStackTrace(System.out);
        }
    }
}