public class elMelquiadesGeneratol {


	public static void main (String[] args){

	//make three sets of words to chose from. add your own!
	String[] wordListOne = {"MAMI", "BEBE", "PRINCESS", "MAMI"}; //* mami dos veces por que en el regeton se repite mucho mami*/
	String[] wordListTwo = {"YO QUIERO", "YO PUEDO", "YO VENGO A", "VOY A"};
	String[] wordListThree = {"ENCENDELTE","AMALTE","LIGAL","JUGAL"};
	String[] wordListFour = {"SUAVE","LENTO","RAPIDO","FUELTE"};
	String[] wordListFive = {"HASTA QUE SALGA EL SOL","TODA LA NOCHE","HASTA EL AMANECER","TODO EL DIA"};
        String[] wordListSix = {"SIN ANESTECIA", "SIN COMPROMISO", "FEIS TO FEIS", "SIN MIEDO"};
	
	//random array
        String[][] ray = {wordListOne, wordListTwo, wordListThree, wordListFour, wordListFive, wordListSix};

	//find out how many words are in each list
        int ceroLength = ray.length;
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;
	int fourLength = wordListFour.length;
	int fiveLength = wordListFive.length;
	int sixLength = wordListSix.length;
	//generate three random numbers
	int rand0 = (int)(Math.random() * ceroLength);
	int rand1 = (int)(Math.random() * oneLength);
	int rand2 = (int)(Math.random() * twoLength);
	int rand3 = (int)(Math.random() * threeLength);
	int rand4 = (int)(Math.random() * fourLength);
	int rand5 = (int)(Math.random() * fiveLength);
	int rand6 = (int)(Math.random() * sixLength);
	//now build a phrase
	String phrase = wordListOne[rand1] + " " +wordListTwo[rand2]+" "+wordListThree[rand3]+" "+wordListFour[rand4]+" "+wordListFive[rand5]+" "+wordListSix[rand6];
	//print out phrase selecting random phrase of one array.
	System.out.println("Estrofa Generada: " + phrase);
        System.out.println("Estribillo Generado: " +" "+ wordListFive[rand5]+" "+ wordListFour[rand4]+" "+ wordListFour[rand4]+" "+ wordListFour[rand4]+" "+ wordListFour[rand4]+" "+ wordListFour[rand4]);
	//print out phrase selecting random array of six arrays.
	System.out.println("Estrofa Totalmente Aleatoria Generada: " + ray[rand0][rand1] + " ♪ ♫ ♩ ♬ " + ray[rand6][rand5] + " ♪ ♫ ♩ ♬ " + ray[rand4][rand6] + " ♪ ♫ ♩ ♬ " + ray[rand3][rand4] + " ♪ ♫ ♩ ♬ " + ray[rand5][rand6] + " ♪ ♫ ♩ ♬ " + ray[rand2][rand1] + " ♪ ♫ ♩ ♬ ");
	System.out.println("Thanks for use elMelquiadesGeneratol...");

 



		
}

}
 
