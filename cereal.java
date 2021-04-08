import java.util.Comparator;

public class cereal {
	public String name, manufacture,temp;
	public int calories, protein, fat, sodium;
	public float fiber,carbs;
	public int sugar, potassium, vitamins, shelf;
	public float weight, cups;
	public double rating;

	public cereal() {}//empty constructor
	
	cereal(String n, String m, String t,int cal,int pro,int fat,
			int sod,float fib,float carb,int sug,int pot,int vit,
			int sh,float w,float cup,double r){
		this.name = n;
		this.manufacture = m;
		this.temp = t;
		this.calories = cal;
		this.protein = pro;	
		this.fat = fat;
		this.sodium = sod;
		this.fiber = fib;
		this.carbs = carb;
		this.sugar = sug;
		this.potassium = pot;
		this.vitamins = vit;
		this.shelf = sh;
		this.weight = w;
		this.cups = cup;
		this.rating = r;
		}//cereal
	public String toString() {
		return name + "  "  + manufacture + "  " + temp +  "  "  + calories + 
				 "  "  + protein +  "  "  + fat +  "  "  + sodium +  "  "  + fiber + 
				 "  "  + carbs +  "  "  + sugar +  "  "  + potassium +  "  "  + vitamins + 
				 "  "  + shelf +  "  "  + weight +  "  "  + cups +  "  "  + rating;
	}//to string
	public String getname() {return name;}
	public String getmanu() {return manufacture;}
	public String gettemp() {return temp;}
	public int getcalories() {return calories;}
	public int getprotein() {return protein;}
	public int getfat() {return fat;}
	public int getsodium() {return sodium;}
	public float getfiber() {return fiber;}
	public float getcarbs() {return carbs;}
	public int getsugar() {return sugar;}
	public int getpotas() {return potassium;}
	public int getvitamins() {return vitamins;}
	public int getshelf() {return shelf;}
	public float getweight() {return weight;}
	public float getcups() {return cups;}
	public double getrating() {return rating;}
	
	public static Comparator <cereal> namec = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			return c1.getname().compareTo(c2.getname()); 
	}};
	public static Comparator <cereal> manuc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			return c1.getmanu().compareTo(c2.getmanu()); 
	}};
	public static Comparator <cereal> tempc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			return c1.gettemp().compareTo(c2.gettemp()); 
	}};
	public static Comparator <cereal> calc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			if (c1.getcalories() > c2.getcalories()) return 1;
			if (c1.getcalories() < c2.getcalories()) return -1;
			return 0;
	}};
	public static Comparator <cereal> proc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			if (c1.getprotein() > c2.getprotein()) return 1;
			if (c1.getprotein() < c2.getprotein()) return -1;
			return 0;
	}};
	public static Comparator <cereal> fatc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			if (c1.getfat() > c2.getfat()) return 1;
			if (c1.getfat() < c2.getfat()) return -1;
			return 0;
	}};
	public static Comparator <cereal> sodc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			if (c1.getsodium() > c2.getsodium()) return 1;
			if (c1.getsodium() < c2.getsodium()) return -1;
			return 0;
	}};
	public static Comparator <cereal> fibc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			if (c1.getfiber() > c2.getfiber()) return 1;
			if (c1.getfiber() < c2.getfiber()) return -1;
			return 0;
	}};
	public static Comparator <cereal> carbc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			if (c1.getcarbs() > c2.getcarbs()) return 1;
			if (c1.getcarbs() < c2.getcarbs()) return -1;
			return 0;
	}};
	public static Comparator <cereal> sugc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			if (c1.getsugar() > c2.getsugar()) return 1;
			if (c1.getsugar() < c2.getsugar()) return -1;
			return 0;
	}};
	public static Comparator <cereal> potc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			if (c1.getsugar() > c2.getsugar()) return 1;
			if (c1.getsugar() < c2.getsugar()) return -1;
			return 0;
	}};
	public static Comparator <cereal> vitc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			if (c1.getvitamins() > c2.getvitamins()) return 1;
			if (c1.getvitamins() < c2.getvitamins()) return -1;
			return 0;
	}};
	public static Comparator <cereal> shelfc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			if (c1.getshelf() > c2.getshelf()) return 1;
			if (c1.getshelf() < c2.getshelf()) return -1;
			return 0;
	}};
	public static Comparator <cereal> weightc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			if (c1.getweight() > c2.getweight()) return 1;
			if (c1.getweight() < c2.getweight()) return -1;
			return 0;
	}};
	public static Comparator <cereal> cupc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			if (c1.getcups() > c2.getcups()) return 1;
			if (c1.getcups() < c2.getcups()) return -1;
			return 0;
	}};
	public static Comparator <cereal> ratc = new Comparator <cereal>(){
		public int compare (cereal c1,cereal c2) {
			if (c1.getrating() > c2.getrating()) return 1;
			if (c1.getrating() < c2.getrating()) return -1;
			return 0;
	}};
}//class cereal

