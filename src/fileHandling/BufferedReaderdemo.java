package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;


public class BufferedReaderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadDataCSV rdCSV = new ReadDataCSV();
		try {
			String str = rdCSV.GetValuefromParamList("CreateTaskWithNewCustomer", "Customer");
			System.out.println(">> "+str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class ReadDataCSV{
	public static HashMap<String, String> hashampcsv = new HashMap<String, String>();
	public String tagvalue = null;
	public String csvtag = null;
	public static String TESTDATA_FILE = "D:\\Test Projects\\ActiTime\\src\\TestData\\TaskTestData.csv";
	
	public String getTestData(String tag) {
		tagvalue="";
		Set<String> keySet = hashampcsv.keySet();
		for (Object key : keySet) {
			System.out.println("-- "+key);
			if (key.equals(tag)) {
				String temp = hashampcsv.get(key).toString();
				System.out.println("-- "+temp);
				if (temp.contains("~")){
					tagvalue = temp.replace("~",",");
				}
				else{
					tagvalue = temp;
				}
			}
		}

		return tagvalue;

	}
	
	public String GetValuefromParamList(String ParamStringReference, String FldName) throws Exception {
		String csvvalue = "",LHS,tempy = "",extn = null;
		System.out.println("File Name = "+TESTDATA_FILE);//+ParamStringReference);
		String stringmethod = getTestData(ParamStringReference);
		String[] Params = stringmethod.split(";");
		for (int i = 0; i < Params.length; i++) {
			if (Params[i].contains("=")) {
				String[] LHSRHS = Params[i].split("=");
				LHS = LHSRHS[0];
				if (LHS.equalsIgnoreCase(FldName)) {
					tempy = LHSRHS[1];

					if (tempy.contains("\"")) {
						tempy = tempy.replace("\"","");
						csvvalue = tempy;
					} else

						csvvalue = getTestData(FldName);

				}
			}

			else if (Params[i].contains("->")) {
				String[] LHSRHS = Params[i].split("->");
				LHS = LHSRHS[0];
				if (LHS.equalsIgnoreCase(FldName)) {
					csvtag = LHSRHS[1];
					csvvalue = getTestData(csvtag);

				}
			}

		}
		return csvvalue;
	}
	
	public static HashMap<String,String> setTestDataCSV() throws IOException {
		String[] values = null;
		BufferedReader br = new BufferedReader(new FileReader(TESTDATA_FILE.concat("TaskTestData.csv")));
		String strLine = "";
		while ((strLine = br.readLine()) != null) {
			values = strLine.split(",");
			if (values.length>1) {
				hashampcsv.put(values[0], values[1]);
			}
			
		}
		br.close();
		return hashampcsv;
		
	}

}
