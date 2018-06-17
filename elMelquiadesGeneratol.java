public class elMelquiadesGeneratol {


	public static void main (String[] args){

	//make three sets of words to chose from. add your own!
	String[] wordListOne = {"MAMI", "BEBE", "PRINCESS", "MAMI"}; //* mami dos veces por que en el regeton se repite mucho mami*/
	String[] wordListTwo = {"YO QUIERO", "YO PUEDO", "YO VENGO A", "VOY A"};
	String[] wordListThree = {"ENCENDELTE","AMALTE","LIGAL","JUGAL"};
	String[] wordListFour = {"SUAVE","LENTO","RAPIDO","FUELTE"};
	String[] wordListFive = {"HASTA QUE SALGA EL SOL","TODA LA NOCHE","HASTA EL AMANECEL","TODO EL DIA"};
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

//now build a Introduction.
	String introduccion = wordListOne[rand1] +"\n"+wordListTwo[rand2]+" " 
	+wordListThree[rand3]+" "+wordListFour[rand4]+"\n" 
	+wordListFive[rand5]+"\n"+wordListSix[rand6];
	//print out phrase selecting random phrase of one array.
	System.out.println("     I \n" +introduccion+"\n");


//now build the tema_estrofa.
	String tema_estrofa = wordListOne[rand1]+"... "+wordListFour[rand4]+"\n" 
	+wordListSix[rand6]+"\n"+wordListFive[rand5]; 
	//print out phrase selecting random phrase of one array. 
	System.out.println("     II \n" + tema_estrofa+"\n");


//now build a interludio.
         String interludio = wordListTwo[rand2]+" " 
         +wordListThree[rand3]+"\n"+wordListFive[rand5]+"\n"
         +wordListThree[rand3]+" "+wordListFour[rand4] ;
        //print out phrase selecting random phrase of one array.
        System.out.println("     III \n" + interludio+"\n");

 //now build a estribillo.
         String estribillo = wordListFour[rand4]+" " 
        +wordListSix[rand6]+"\n"+wordListFour[rand4]+" "+wordListFive[rand5]+"\n"+wordListSix[rand6]+" " 
        +wordListOne[rand1]; 
        //print out phrase selecting random phrase of one array. 
        System.out.println("      IV \n" + estribillo+"\n");


 //now build a coda.
         String coda = wordListTwo[rand2]+" " 
         +wordListThree[rand3]+"\n"+wordListFour[rand4]+" " 
         +wordListFive[rand5]+"\n"+wordListOne[rand1]+" " 
         +wordListFour[rand4]+"\n"+wordListFive[rand5]+"\n"+wordListSix[rand6];
         
        //print out phrase selecting random phrase of one array.
        System.out.println("      V \n" + coda+"\n");


	System.out.println("Thanks for use elMelquiadesGeneratol...");

}

}
 
