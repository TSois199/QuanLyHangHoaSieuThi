/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUILD;

import static BUILD.Data.importFileText;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) throws IOException {
        	String path = "E:\\CN_JAVA\\DoAn_DUONG\\apriori_test.txt";
		String charset = "UNICODE";
		String delemited = "\t";
		double support = 0.5;
		Map<String, Itemset> map = Data.importSQLServer( support);
                //Map<String, Itemset> map = importFileText(path,charset,delemited,support);
		System.out.println("TID: " + "\t" + "Itemset: ");
		for (Map.Entry<String, Itemset> mapEntry : map.entrySet()) {
			System.out.println(mapEntry.getKey() + "\t" + mapEntry.getValue().printDataSet());
		}
                Apiriori apri= new Apiriori(map, 2);
                Set<Itemset> setCi=apri.getCadidates();
//                System.out.println("item \tsupport");
//                for(Itemset it : setCi)
//                {
//                    System.out.println(it);
//                }
              // apri.printSetItem1(apri.getCandidates(setCi,2));
              apri.apriori_gen();
                
    }
    
}
