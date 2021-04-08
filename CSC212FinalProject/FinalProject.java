
import java.io.*;
import java.util.*;
public class FinalProject {
	static Scanner fin = null;
	static Scanner in = new Scanner(System.in);
	public static void main (String [] args){
		List <cereal> L = new ArrayList<>();
		HashMap <String,cereal> H = new HashMap <String,cereal>();
		call(L,H);
		//MAKE IT POSSIBLE TO COMPARE CEREALS
		char cont = 'y';
		do {
			System.out.println("Pick one: " + "\n1.Print all cereals in alphabetical order" + "\n2.Search for a cereal's data" + "\n3.Search cereals based on nutritional contents" + 
					"\n4.Sort cereals based on different categories" + "\n5.Find different categorical ratios for each cereal" + "\n6.Compare two cereals"+ "\n7.Find maximums and minimums");
			int op = in.nextInt();
			switch (op) {
			case 1://Print all cereals in alphabetical order
				cerealList(L);
				break;
			case 2://Search for a cereal's data
				searchCereal(H);
				break;
			case 3://Search cereals based on nutritional contents
				findCereal(L);
				break;
			case 4://Sort cereals based on different categories
				sort(L);
				break;
			case 5://Find different categorical ratios for each cereal
				ratio(L);
				break;
			case 6://Compare 2 cereals
				compare(H);
				break;
			case 7: //Max and min
				maxmin(L);
			default: System.out.println("Goodbye");	
			}//switch
		System.out.println("\nDo you want to continue with the main menu? y/n");
		cont = in.next().charAt(0);		
		}//do
		while (cont == 'y' || cont == 'Y');
		System.out.println("Goodbye");	
	}//main
	
	static void cerealList(List <cereal> L) {//prints all cereals in alphabetical order
		Collections.sort(L,cereal.namec);
		System.out.println("Cereals sorted by name:");
		for (int i = 0; i < L.size(); i++) {
			System.out.println(L.get(i).getname());
		}//for
	}//cereal list
	
	static void call(List <cereal> L, HashMap <String,cereal> H) {//Adds all cereals from list to hashmap
		try  {
			fin = new Scanner(new File("cereal.csv")); //finds 
			}//try
		catch (FileNotFoundException ex) { 
			System.out.print("cereal.csv not found"); 
			System.exit(1); 
		}//catch
		while (fin.hasNext()){ //check if end of file
			String s = fin.nextLine();
			String [] list = s.split(",");
			String n = list[0];
			String m = list[1];
			String t = list[2];
			int cal = Integer.parseInt(list[3]);
			int pro = Integer.parseInt(list[4]);
			int fat = Integer.parseInt(list[5]);
			int sod = Integer.parseInt(list[6]);
			float fib = Float.parseFloat(list[7]);
			float carb = Float.parseFloat(list[8]);
			int sug = Integer.parseInt(list[9]);
			int pot = Integer.parseInt(list[10]);
			int vit = Integer.parseInt(list[11]);
			int sh = Integer.parseInt(list[12]);
			float w = Float.parseFloat(list[13]);
			float cup = Float.parseFloat(list[14]);
			double r = Double.parseDouble(list[15]);	
			cereal x = new cereal(n,m,t,cal,pro,fat,sod,fib,
					carb,sug,pot,vit,sh,w,cup,r);
			L.add(x);
			H.put(n.toLowerCase(), x);
					
		}//while
	}//call
	
	static void searchCereal(HashMap <String,cereal> H) {
		System.out.println("Enter a cereal and press enter twice to find all available information about it");
		in.nextLine();
		String s = in.nextLine();
		in.nextLine();
		
		while (H.get(s.toLowerCase()) == null) {
			System.out.println("You did not enter a valid cereal, enter again");
			s = in.nextLine().toLowerCase();
		}//if
		
		System.out.println("Name: "+ H.get(s).getname());
		System.out.println("Manufacturer: " + H.get(s).getmanu() + "\nTemperature: " + H.get(s).gettemp() + "\nCalories: " + H.get(s).getcalories() +
			"\nProtein: " + H.get(s).getprotein() + "\nFat: " + H.get(s).getfat() + "\nSodium: " + H.get(s).getsodium() + "\nFiber: " + H.get(s).getfiber() + 
			"\nCarbohydrates: " + H.get(s).getcarbs() + "\nSugar: " + H.get(s).getsugar() + "\nPotassium: " + H.get(s).getpotas() + "\nVitamins: " + H.get(s).getvitamins() +
			"\nDisplay shelf: " + H.get(s).getshelf() + "\nWeight: " + H.get(s).getweight() + "\nCups: " + H.get(s).getcups() + "\nRating: " + H.get(s).getrating());
	}//searchcereal
	
	static void compare(HashMap <String,cereal> H) {
		System.out.println("Enter the two cereals you want to compare");
		in.nextLine();
		String c1 = in.nextLine().toLowerCase();
		String c2 = in.nextLine().toLowerCase();
		in.nextLine();
		
		while (H.get(c1)== null || H.get(c2)== null){
			System.out.println("Re-enter two cereals you want to compare");
			c1 = in.nextLine().toLowerCase();
			c2 = in.nextLine().toLowerCase();
		}
		
		char cont = 'y';
		do {
			System.out.println("\nPick something to compare: " + "\n1.Manufacturer" + "\n2.Temperature" + "\n3.Calories" + 
					"\n4.Protein" + "\n5.Fat" + "\n6.Sodium" + "\n7.Fiber" + "\n8.Carbohydrates" + "\n9.Sugar" + "\n10.Potassium" +
					"\n11.Vitamins" + "\n12.Shelf" + "\n13.Weight" + "\n14.Cups" +"\n15.Rating");
			int op = in.nextInt();
			switch (op) {
			case 1://Manufacturer
				System.out.println("Manufacturer");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getmanu());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getmanu());
				break;
			case 2: //Temp
				System.out.println("Temperature (Hot/Cold)");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).gettemp());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).gettemp());
				break;
			case 3: //Calories
				System.out.println("Calories");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getcalories());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getcalories());
				break;	
			case 4: //Protein
				System.out.println("Protein (g)");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getprotein());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getprotein());
				break;	
			case 5://Fat
				System.out.println("Fat (g)");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getfat());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getfat());
				break;	
			case 6: //Sodium
				System.out.println("Sodium (mg)");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getsodium());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getsodium());
				break;	
			case 7: //Fiber
				System.out.println("Fiber (g)");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getfiber());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getfiber());
				break;	
			case 8://Carbs
				System.out.println("Carbohydrates (g)");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getcarbs());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getcarbs());
				break;
			case 9: //Sugar
				System.out.println("Sugar (g)");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getsugar());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getsugar());
				break;
			case 10: //Potassium
				System.out.println("Potassium (mg)");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getpotas());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getpotas());
				break;
			case 11: //Vitamins
				System.out.println("Vitamins (% of daily recommended)");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getvitamins());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getvitamins());
				break;
			case 12: //Shelf
				System.out.println("Shelf");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getshelf());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getshelf());
				break;
			case 13: //Weight
				System.out.println("Weight (oz)");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getweight());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getweight());
				break;
			case 14: //Cups
				System.out.println("Cups");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getcups());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getcups());
				break;
			case 15: //Rating
				System.out.println("Rating");
				System.out.println(H.get(c1).getname() + ": " + H.get(c1).getrating());
				System.out.println(H.get(c2).getname() + ": " + H.get(c2).getrating());
				break;
			default: System.out.println("You did not choose a valid option");;	
			}//switch
		System.out.println("\nDo you want to compare more variables? y/n");
		cont = in.next().charAt(0);		
		}//do
		while (cont == 'y' || cont == 'Y');		
	}//compare

	static void ratio(List <cereal> L) {//outputs ratios of different categories
		char cont = 'y';
		do {
			System.out.println("\nPick a proportion: " + "\n1.Proportion of Sugar to Protein" + "\n2.Proportion of Carbs to Protein" + "\n3.Proportion of Cargohydrates, protein and Fat to serving weight" + 
					"\n4.Proportion of sugar to rating");
			int op = in.nextInt();
			switch (op) {
			case 1://Sugar/protein
				System.out.println("Ratio of sugar to protein for each cereal:");
				for (int i = 0; i < L.size(); i++) {
					int sp = L.get(i).getsugar()/L.get(i).getprotein();
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getsugar() + "/" +L.get(i).getprotein() + " = "  + sp);
				}
				break;
			case 2://Carbs/protein
				System.out.println("Ratio of carbohydrates to protein for each cereal:");
				for (int i = 0; i < L.size(); i++) {
					float cp = L.get(i).getcarbs()/L.get(i).getprotein();
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getcarbs() + "/" +L.get(i).getprotein() + " = " + cp);
				}
				break;
			case 3://percent of serving that is carbs, protein and fat
				System.out.println("Proportion of serving that is carbs, protein and fat for each cereal:");
				for (int i = 0; i < L.size(); i++) {
					float grams = L.get(i).getweight()*(float)28.35;//converting ounces to grams/serving
					float carbs = L.get(i).getcarbs()/grams;//proportion of carbs/serving
					float protein = L.get(i).getprotein()/grams;//proportion of protein/serving
					float fat = L.get(i).getfat()/grams;//proportion of fat/serving
					System.out.println(L.get(i).getname() +  ": " + carbs + "\t" + protein + "\t" + fat);
				}
				break;
			case 4://sugar/rating
				System.out.println("Proportion of sugar to rating for each cereal:");
				for (int i = 0; i < L.size(); i++) {
					double sr = L.get(i).getsugar()/L.get(i).getrating();
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getsugar() + "/" +L.get(i).getrating() + " = " + sr);
				}
				break;
			default: System.out.println("You did not choose a valid option");
			}//switch
		System.out.println("\nDo you want to search more another ratio? y/n");
		cont = in.next().charAt(0);		
		}//do
		while (cont == 'y' || cont == 'Y');
	}//ratio
	
	static void sort(List <cereal> L) {//allows user to sort cereals by any variables
		List <cereal> A1 = new ArrayList <cereal> (L);
		char cont = 'y';
		do {
			System.out.println("\nPick something to sort by: " + "\n1.Manufacturer" + "\n2.Temperature" + "\n3.Calories" + 
					"\n4.Protein" + "\n5.Fat" + "\n6.Sodium" + "\n7.Fiber" + "\n8.Carbohydrates" + "\n9.Sugar" + "\n10.Potassium" +
					"\n11.Vitamins" + "\n12.Shelf" + "\n13.Weight" + "\n14.Cups" +"\n15.Rating");
			int op = in.nextInt();
			switch (op) {
			case 1://Manufacturer
				Collections.sort(L,cereal.manuc);
				System.out.println("Cereals sorted by manufacturer:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getmanu());
				}
				break;
			case 2: //Temp
				Collections.sort(L,cereal.tempc);
				System.out.println("Cereals sorted by temperature:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).gettemp());
				}
				break;
			case 3: //Calories
				Collections.sort(L,cereal.calc);
				System.out.println("Cereals sorted by calories:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getcalories());
				}
				break;	
			case 4: //Protein
				Collections.sort(L,cereal.proc);
				System.out.println("Cereals sorted by protein:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getprotein());
				}
				break;	
			case 5://Fat
				Collections.sort(L,cereal.fatc);
				System.out.println("Cereals sorted by fat:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getfat());
				}
				break;	
			case 6: //Sodium
				Collections.sort(L,cereal.sodc);
				System.out.println("Cereals sorted by sodium:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getsodium());
				}
				break;	
			case 7: //Fiber
				Collections.sort(L,cereal.fibc);
				System.out.println("Cereals sorted by fiber:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getfiber());
				}
				break;	
			case 8://Carbs
				Collections.sort(L,cereal.carbc);
				System.out.println("Cereals sorted by carbohydrates:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getcarbs());
				}
				break;
			case 9: //SUgar
				Collections.sort(L,cereal.sugc);
				System.out.println("Cereals sorted by sugar:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getsugar());
				}
				break;
			case 10: //Potassium
				Collections.sort(L,cereal.potc);
				System.out.println("Cereals sorted by potassium:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getpotas());
				}
				break;
			case 11: //Vitamins
				Collections.sort(L,cereal.vitc);
				System.out.println("Cereals sorted by % Vitamins recommended by FDA:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getvitamins());
				}
				break;
			case 12: //Shelf
				Collections.sort(L,cereal.shelfc);
				System.out.println("Cereals sorted by shelf:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getshelf());
				}
				break;
			case 13: //Weight
				Collections.sort(L,cereal.weightc);
				System.out.println("Cereals sorted by weight:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getweight());
				}
				break;
			case 14: //Cups
				Collections.sort(L,cereal.cupc);
				System.out.println("Cereals sorted by cups:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getcups());
				}
				break;
			case 15: //Rating
				Collections.sort(L,cereal.ratc);
				System.out.println("Cereals sorted by rating:");
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getrating());
				}
				break;
			default: System.out.println("You did not choose a valid option");	
			}//switch
		System.out.println("\nDo you want to sort by another category? y/n");
		cont = in.next().charAt(0);		
		}//do
		while (cont == 'y' || cont == 'Y');
	}//sort
	
	static void findCereal(List <cereal> L) {//allows user to find a cereal with nutritional data they want
		char cont = 'y';
		do {
			System.out.println("\nPick something to search for: " + "\n1.Manufacturer" + "\n2.Temperature" + "\n3.Calories" + 
					"\n4.Protein" + "\n5.Fat" + "\n6.Sodium" + "\n7.Fiber" + "\n8.Carbohydrates" + "\n9.Sugar" + "\n10.Potassium" +
					"\n11.Vitamins" + "\n12.Shelf" + "\n13.Weight" + "\n14.Cups" +"\n15.Rating");
			int op = in.nextInt();
			switch (op) {
			case 1:
				System.out.println("Enter manufacurer (A,G,K,N,P,Q,R)");
				String M = in.next();
				Collections.sort(L,cereal.manuc);
				System.out.println("The following cereals are manufactured by " + M );
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getmanu().equals(M))
					System.out.println(L.get(i).getname());
				}//for
				break;
			case 2: 
				System.out.println("Enter Temperature value (H or C)");
				String T = in.next().toUpperCase();
				Collections.sort(L,cereal.tempc);
				System.out.println("The following cereals are " + T );
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).gettemp().equals(T))
					System.out.println(L.get(i).getname());
				}//for
				break;
			case 3: 
				System.out.println("Calories range from 50-100");
				System.out.println("Enter minimum calorie value");
				int minc = in.nextInt();
				System.out.println("Enter maximum calorie value");
				int maxc = in.nextInt();
				Collections.sort(L,cereal.calc);
				System.out.println("The following cereals have a calorie range between " + minc + " and " + maxc);
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getcalories() >= minc && L.get(i).getcalories() <= maxc)
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getcalories());
				}//for
				break;
			case 4: 
				System.out.println("Protein ranges from 1-6 g");
				System.out.println("Enter minimum protein value");
				int minp = in.nextInt();
				System.out.println("Enter maximum protein value");
				int maxp = in.nextInt();
				Collections.sort(L,cereal.proc);
				System.out.println("The following cereals have a protein range between " + minp + " and " + maxp);
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getprotein() >= minp && L.get(i).getprotein() <= maxp)
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getprotein());
				}//for
				break;
			case 5: 
				System.out.println("Fat ranges from 0-5 g");
				System.out.println("Enter minimum fat value");
				int minf = in.nextInt();
				System.out.println("Enter maximum fat value");
				int maxf = in.nextInt();
				Collections.sort(L,cereal.fatc);
				System.out.println("The following cereals have a fat range between " + minf + " and " + maxf);
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getfat() >= minf && L.get(i).getfat() <= maxf)
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getfat());
				}//for
				break;
			case 6: 
				System.out.println("Sodium ranges from 0-320 mg");
				System.out.println("Enter minimum sodium value");
				int mins = in.nextInt();
				System.out.println("Enter maximum sodium value");
				int maxs = in.nextInt();
				Collections.sort(L,cereal.sodc);
				System.out.println("The following cereals have a sodium range between " + mins + " and " + maxs);
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getsodium() >= mins && L.get(i).getsodium() <= maxs)
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getsodium());
				}//for
				break;
			case 7: 
				System.out.println("Fiber ranges from 0-14 g");
				System.out.println("Enter minimum fiber value");
				float minfib = in.nextFloat();
				System.out.println("Enter maximum fiber value");
				float maxfib = in.nextFloat();
				Collections.sort(L,cereal.fibc);
				System.out.println("The following cereals have a fiber range between " + minfib + " and " + maxfib);
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getfiber() >= minfib && L.get(i).getfiber() <= maxfib)
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getfiber());
				}//for
				break;
			case 8: 
				System.out.println("Carbohydrates range from -1-23 g");
				System.out.println("Enter minimum carbohydrate value");
				float mincarb = in.nextFloat();
				System.out.println("Enter maximum carbohydrate value");
				float maxcarb = in.nextFloat();
				Collections.sort(L,cereal.carbc);
				System.out.println("The following cereals have a carbohydrate range between " + mincarb + " and " + maxcarb);
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getcarbs() >= mincarb && L.get(i).getcarbs() <= maxcarb)
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getcarbs());
				}//for
				break;
			case 9: 
				System.out.println("Sugar ranges from -1-15 g");
				System.out.println("Enter minimum sugar value");
				int minsug = in.nextInt();
				System.out.println("Enter maximum sugar value");
				int maxsug = in.nextInt();
				Collections.sort(L,cereal.sugc);
				System.out.println("The following cereals have a sugar range between " + minsug + " and " + maxsug);
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getsugar() >= minsug && L.get(i).getsugar() <= maxsug)
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getsugar());
				}//for
				break;
			case 10: 
				System.out.println("Protein ranges from -1-330 mg");
				System.out.println("Enter minimum potassium value");
				int minpot = in.nextInt();
				System.out.println("Enter maximum potassium value");
				int maxpot = in.nextInt();
				Collections.sort(L,cereal.potc);
				System.out.println("The following cereals have a potassium range between " + minpot + " and " + maxpot);
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getpotas() >= minpot && L.get(i).getpotas() <= maxpot)
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getpotas());
				}//for
				break;
			case 11: 
				System.out.println("Enter vitamin percentage (0,25 or 100)");
				int vit = in.nextInt();
				Collections.sort(L,cereal.namec);
				System.out.println("The following cereals have a vitamin percentage of " + vit);
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getvitamins() == vit)
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getvitamins());
				}//for
				break;
			case 12: 
				System.out.println("Enter shelf (1,2, or 3)");
				int s = in.nextInt();
				Collections.sort(L,cereal.namec);
				System.out.println("The following cereals are located on shelf " + s);
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getshelf() == s)
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getshelf());
				}//for
				break;
			case 13: 
				System.out.println("Weight ranges from .5-1.5 oz");
				System.out.println("Enter minimum weight value");
				float minw = in.nextInt();
				System.out.println("Enter maximum weight value");
				float maxw = in.nextInt();
				Collections.sort(L,cereal.weightc);
				System.out.println("The following cereals have a weight range between " + minw + " and " + maxw);
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getweight() >= minw && L.get(i).getweight() <= maxw)
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getweight());
				}//for
				break;
			case 14: 
				System.out.println("Cups ranges from .25-1.5 cups");
				System.out.println("Enter minimum cup value");
				float mincup = in.nextInt();
				System.out.println("Enter maximum cup value");
				float maxcup = in.nextInt();
				Collections.sort(L,cereal.cupc);
				System.out.println("The following cereals have a serving size (cups) between " + mincup + " and " + maxcup);
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getweight() >= mincup && L.get(i).getweight() <= maxcup)
					System.out.println(L.get(i).getname() +  ": " + L.get(i).getweight());
				}//for
				break;
			case 15: 
				System.out.println("Ratings range from 0-100");
				System.out.println("Enter minimum rating value");
				float minr = in.nextInt();
				System.out.println("Enter maximum rating value");
				float maxr = in.nextInt();
				Collections.sort(L,cereal.ratc);
				System.out.println("The following cereals have rating between " + minr + " and " + maxr);
				for(int i = 0; i < L.size(); i++) {
					if(L.get(i).getrating() >= minr && L.get(i).getrating() <= maxr)
					System.out.println(L.get(i).getname() + ": " + L.get(i).getrating());
				}//for
				break;	
			default: System.out.println("You did not choose a valid option");	
			}//switch
		System.out.println("\nDo you want to search for another cetegory? y/n");
		cont = in.next().charAt(0);		
		}//do
		while (cont == 'y' || cont == 'Y');
	}//find
	
	static void maxmin(List <cereal> L) {
		char cont = 'y';
		do {
			System.out.println("\nPick something to search for: " + "\n1.Calories" + "\n2.Protein" + "\n3.Fat" + 
					"\n4.Sodium" + "\n5.Fiber" + "\n6.Carbohydrates" + "\n7.Sugar" + "\n8.Potassium" + "\n9.Weight" + 
					"\n10.Cups" +"\n11.Rating");
			int op = in.nextInt();
			switch (op) {
			case 1://calories
				Collections.sort(L,cereal.calc);
				int mincal = L.get(0).getcalories();
				int maxcal = L.get(L.size()-1).getcalories();
				System.out.println("Minimum calories: " + mincal);
				System.out.println("Cereals with the minumum number of calories:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getcalories() == mincal){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				System.out.println();
				System.out.println("Maximum calories: " + maxcal);
				System.out.println("Cereals with the maximum number of calories:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getcalories() == maxcal){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				break;
			case 2://protein
				Collections.sort(L,cereal.proc);
				int minpro = L.get(0).getprotein();
				int maxpro = L.get(L.size()-1).getprotein();
				System.out.println("Minimum protein: " + minpro);
				System.out.println("Cereals with the minumum grams of protein:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getprotein() == minpro){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				System.out.println();
				System.out.println("Maximum protein: " + maxpro);
				System.out.println("Cereals with the maximum grams of protein:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getprotein() == maxpro){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				break;
			case 3://fat
				Collections.sort(L,cereal.fatc);
				int minfat = L.get(0).getfat();
				int maxfat = L.get(L.size()-1).getfat();
				System.out.println("Minimum fat: " + minfat);
				System.out.println("Cereals with the minumum grams of fat:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getfat() == minfat){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				System.out.println();
				System.out.println("Maximum fat: " + maxfat);
				System.out.println("Cereals with the maximum grams of fat:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getfat() == maxfat){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				break;
			case 4://sodium
				Collections.sort(L,cereal.sodc);
				int minsod = L.get(0).getsodium();
				int maxsod = L.get(L.size()-1).getsodium();
				System.out.println("Minimum sodium: " + minsod);
				System.out.println("Cereals with the minumum milligrams of sodium:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getsodium() == minsod){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				System.out.println();
				System.out.println("Maximum sodium: " + maxsod);
				System.out.println("Cereals with the maximum milligrams of sodium:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getsodium() == maxsod){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				break;
			case 5://fiber
				Collections.sort(L,cereal.fibc);
				float minfib = L.get(0).getfiber();
				float maxfib = L.get(L.size()-1).getfiber();
				System.out.println("Minimum fiber: " + minfib);
				System.out.println("Cereals with the minumum grams of fiber:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getfiber() == minfib){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				System.out.println();
				System.out.println("Maximum fiber: " + maxfib);
				System.out.println("Cereals with the maximum grams of fiber:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getfiber() == maxfib){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				break;
			case 6://carbohydrates
				Collections.sort(L,cereal.carbc);
				float mincar = L.get(0).getcarbs();
				float maxcar = L.get(L.size()-1).getcarbs();
				System.out.println("Minimum carbohydrates: " + mincar);
				System.out.println("Cereals with the minumum grams of carbohydrates:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getcarbs() == mincar){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				System.out.println();
				System.out.println("Maximum carbohydrates: " + maxcar);
				System.out.println("Cereals with the maximum grams of carbohydrates:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getcarbs() == maxcar){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				break;
			case 7://sugar
				Collections.sort(L,cereal.sugc);
				int minsug = L.get(0).getsugar();
				int maxsug = L.get(L.size()-1).getsugar();
				System.out.println("Minimum sugar: " + minsug);
				System.out.println("Cereals with the minumum grams of sugar:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getsugar() == minsug){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				System.out.println();
				System.out.println("Maximum sugar: " + maxsug);
				System.out.println("Cereals with the maximum grams of sugar:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getsugar() == maxsug){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				break;
			case 8://potassium
				Collections.sort(L,cereal.potc);
				int minpot = L.get(0).getpotas();
				int maxpot = L.get(L.size()-1).getsodium();
				System.out.println("Minimum potassium: " + minpot);
				System.out.println("Cereals with the minumum milligrams of potassium:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getpotas() == minpot){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				System.out.println();
				System.out.println("Maximum potassium: " + maxpot);
				System.out.println("Cereals with the maximum milligrams of potassium:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getpotas() == maxpot){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				break;
			case 9://weight
				Collections.sort(L,cereal.weightc);
				float minw = L.get(0).getweight();
				float maxw = L.get(L.size()-1).getweight();
				System.out.println("Minimum weight: " + minw);
				System.out.println("Cereals with the minumum weight:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getweight() == minw){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				System.out.println();
				System.out.println("Maximum weight: " + maxw);
				System.out.println("Cereals with the maximum weight:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getweight() == maxw){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				break;
			case 10://cups
				Collections.sort(L,cereal.cupc);
				float mincup = L.get(0).getcups();
				float maxcup = L.get(L.size()-1).getcups();
				System.out.println("Minimum cups: " + mincup);
				System.out.println("Cereals with the minumum number of cups:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getcups() == mincup){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				System.out.println();
				System.out.println("Maximum cups: " + maxcup);
				System.out.println("Cereals with the maximum number of cups:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getcups() == maxcup){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				break;
			case 11://rating
				Collections.sort(L,cereal.ratc);
				double minr = L.get(0).getrating();
				double maxr = L.get(L.size()-1).getrating();
				System.out.println("Minimum rating: " + minr);
				System.out.println("Cereals with the minumum rating:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getrating() == minr){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				System.out.println();
				System.out.println("Maximum rating: " + maxr);
				System.out.println("Cereals with the maximum rating:");
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).getrating() == maxr){
						System.out.println(L.get(i).getname());
					}//if
				}//for
				break;
			default: System.out.println("You did not choose a valid option");	
			}//switch
		System.out.println("\nDo you want to find more max and mins? y/n");
		cont = in.next().charAt(0);		
		}//do
		while (cont == 'y' || cont == 'Y');	
	}//maxmin
	
}//class main

	










