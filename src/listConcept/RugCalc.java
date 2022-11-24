package listConcept; 
import java.io.BufferedReader;
import java.math.*;

public class RugCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculation cal = new Calculation();
		cal.speechLanguageTherapy();
	}

}

class Calculation{
	int slp, ot, pt;
	//BufferedReader br = new BufferedReader();
	
	public void speechLanguageTherapy(){
		int  sIm = 112,sCm = 155, sGm = 142;
		float totalSlp, slpProportion, adjustedSlp;
		totalSlp = sIm+(sCm/2)+(sGm/4);
		System.out.println("total SLP minutes = "+totalSlp);
		slpProportion = (sGm/4)/totalSlp;
		System.out.println("group proportion (after group allocation) = "+slpProportion);
		if(slpProportion<0.25){
			adjustedSlp = ((sIm+(sGm/2))*4)/4;
			slp = (int) adjustedSlp;
			System.out.println("speech Language Therapy Minutes = "+slp);
		}
		else{
			slp = (int) totalSlp;
			System.out.println("speech Language Therapy Minutes = "+slp);
		}
	}
}
