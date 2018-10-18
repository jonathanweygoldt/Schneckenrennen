import java.util.Random;
public class Rennschnecke {
	
	String name;
	String rasse;
	int vMax;
	int strecke;
	
	public Rennschnecke(String name, String rasse, int vMax){
		this.name=name;
		this.rasse=rasse;
		this.vMax=vMax;
		strecke = 0;
	}


		public void krieche(){
			
			Random ran = new Random();
			strecke = strecke+ran.nextInt(vMax - + 1);
		}

		public String toString(){
			return "Name: "+name
					+"\n Rasse: "+rasse+
					"\n Höchstgeschwindigkeit: "+vMax
					+"\n Geschleimte Strecke : "+strecke;
		}
		
	
		
		
}