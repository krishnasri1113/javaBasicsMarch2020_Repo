package Overridding;

 class music {
 public void classicalmusic() {
	 System.out.println("this is classical");
 }
}
 class classical extends music{
	 public void classicalmusic() {
		 System.out.println("classical songs are good to hear");
	 }
 }
 class musicoverride
 {
	 public static void main(String[] args) {
		music m=new classical();
		m.classicalmusic();
	}
 }
