package abstractClassActivity;

public class AnotherClass {
	 public static void main(String []args) {
	        String title = "Your Issues by Rajat Sharma";
	        Book newNovel = new MyBook();
	        newNovel.setTitle(title);
	        System.out.println("The title is: " + newNovel.getTitle());
}
}