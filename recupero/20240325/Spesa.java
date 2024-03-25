import Java.io.*
	
	public class Spesa () {
		public static void main (String args[]) {
			
			float caffe;
			float cornetto;
			float sigarette;
			float trasporto;
			float acqua;
			float totale;
			
			String articoloCaffe = "caffe";
			float prezzoCaffe = 1.00f;
			
			String articoloCornetto = "Cornetto";
			float prezzoCornetto = 1.20f;
			
			String articoloSigarette = "Sigarette";
			float prezzoSigarette = 5.20f;
			
			String articoloTrasporto = "Trasporto";
			float prezzoTrasporto = 1.50f;
			
			String articoloAcqua = "Acqua";
			float prezzoAcqua = 0.50f;
			
			totale = articoloCaffe + articoloCornetto + articoloSigarette + articoloTrasporto + articoloAcqua;
			System.out.println ("Il totale e' : " + totale);
			
		}
	}