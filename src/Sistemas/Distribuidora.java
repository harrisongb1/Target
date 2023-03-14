package Sistemas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Distribuidora {

    public static void main(String[] args) {
        
        // Carrega o arquivo XML de dados
        File file = new File("dados.xml");
        List<Double> faturamentoDiario = new ArrayList<Double>();
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("faturamento");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    double faturamento = Double.parseDouble(element.getTextContent());
                    faturamentoDiario.add(faturamento);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo XML: " + e.getMessage());
            return;
        }

        // Calcula o menor valor de faturamento diário do mês
        double menorFaturamento = faturamentoDiario.get(0);
        for (int i = 1; i < faturamentoDiario.size(); i++) {
            if (faturamentoDiario.get(i) < menorFaturamento) {
                menorFaturamento = faturamentoDiario.get(i);
            }
        }
        System.out.println("O menor valor de faturamento diário do mês foi: " + menorFaturamento);

        // Calcula o maior valor de faturamento diário do mês
        double maiorFaturamento = faturamentoDiario.get(0);
        for (int i = 1; i < faturamentoDiario.size(); i++) {
            if (faturamentoDiario.get(i) > maiorFaturamento) {
                maiorFaturamento = faturamentoDiario.get(i);
            }
        }
        System.out.println("O maior valor de faturamento diário do mês foi: " + maiorFaturamento);

        // Calcula a média mensal de faturamento diário
        double somaFaturamento = 0;
        for (int i = 0; i < faturamentoDiario.size(); i++) {
            somaFaturamento += faturamentoDiario.get(i);
        }
        double mediaFaturamento = somaFaturamento / faturamentoDiario.size();

        // Calcula o número de dias em que o faturamento diário foi superior à média mensal
        int diasAcimaMedia = 0;
        for (int i = 0; i < faturamentoDiario.size(); i++) {
            if (faturamentoDiario.get(i) > mediaFaturamento) {
                diasAcimaMedia++;
            }
        }
        System.out.println("O número de dias em que o faturamento diário foi superior à média mensal foi: " + diasAcimaMedia);
    }
}