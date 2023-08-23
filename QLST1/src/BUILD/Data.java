package BUILD;

import dao.GioHangDao;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pojo.GioHang;


public class Data {
	public static Map<String, Itemset> importFileText(String fileName, String charset, String delemited, double support)
			throws IOException, FileNotFoundException {
		Map<String, Itemset> dataSet = new HashMap<>();
		File f = new File(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), charset));
		String line = br.readLine();
		while ((line = br.readLine()) != null) {
			String arrObj[] = line.split(delemited);
			Itemset itemSet = new Itemset();
			itemSet.support = support;
			if (arrObj.length == 2) {
				String[] items = arrObj[1].split(",");
				for (String s : items) {
					itemSet.itemset.add(Integer.parseInt(s));
				}
			}
			dataSet.put(arrObj[0], itemSet);
		}

		br.close();
		return dataSet;
	}
         public static Map<String,Itemset>importSQLServer(double support)
        {
            ArrayList<GioHang> dsGH= GioHangDao.LayDanhSachGioHang();
            Map<String, Itemset> dataSet = new HashMap<>();
            
              Itemset itemSet = new Itemset();
            for(GioHang gh:dsGH)
            {
              
                int giaTri = Integer.parseInt(gh.getLoaiSP().trim().substring(1));
                String arrObj[]={gh.getLoaiSP(),gh.getLoaiSP()};
                itemSet.support=support;
                itemSet.itemset.add(giaTri);
                dataSet.put(arrObj[0], itemSet);
            }
           
            return dataSet;
        }

	public static void main(String[] args) throws  IOException {
		String path = "E:\\CN_JAVA\\DoAn_DUONG\\apriori_test.txt";
		String charset = "UNICODE";
		String delemited = "\t";
		double support = 0.5;
		Map<String, Itemset> map = importFileText(path,charset,delemited,support);
		System.out.println("TID: " + "\t" + "Itemset: ");
		for (Map.Entry<String, Itemset> mapEntry : map.entrySet()) {
			System.out.println(mapEntry.getKey() + "\t" + mapEntry.getValue().printDataSet());
		}
	}
}
