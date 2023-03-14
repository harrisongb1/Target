package Sistemas;

public class Distribuidora2 {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        
        double total = sp + rj + mg + es + outros;
        
        double percSP = (sp / total) * 100;
        double percRJ = (rj / total) * 100;
        double percMG = (mg / total) * 100;
        double percES = (es / total) * 100;
        double percOutros = (outros / total) * 100;
        
        System.out.println("Percentual de representação por estado:");
        System.out.println("SP: " + percSP + "%");
        System.out.println("RJ: " + percRJ + "%");
        System.out.println("MG: " + percMG + "%");
        System.out.println("ES: " + percES + "%");
        System.out.println("Outros: " + percOutros + "%");
    }
}