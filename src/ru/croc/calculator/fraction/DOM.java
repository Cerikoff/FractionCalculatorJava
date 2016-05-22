package ru.croc.calculator.fraction;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by Igor on 22.05.2016.
 */
public class DOM {
    private Document docOutput;

    DOM(){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            docOutput = factory.newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException e) {
            System.out.println("Error with DOM creation. Console input.");
        }
        Element root = docOutput.createElement("root");
        docOutput.appendChild(root);
    }

    public void newResultItem(String itemName, String res){
        Element item = docOutput.createElement(itemName);
        item.setAttribute("result", res);
        docOutput.getFirstChild().appendChild(item);
    }

    public void writeToFile(String fileName) throws TransformerException {
        File file = new File(fileName);
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(docOutput), new StreamResult(file));
    }
}
