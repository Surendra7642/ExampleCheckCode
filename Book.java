class Author
{
	String authorName;
	int age;
	String place;
	Author(String authorName,int age,String place)
	{
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}
}
class Book 
{
	String name;
	int price;
	Author author;
	Book(String name,int price,Author author)
	{
		this.name = name;
		this.price = price;
		this.author = author;
	}
	void bookDetails(){
		System.out.println("Book Name :"+this.name);
		System.out.println("Book price : "+ this.price);
	}
	void authorDetails(){
		System.out.println("Auther Name :"+this.author.authorName);
		System.out.println("Auther Age :"+ this.author.age);
		System.out.println("Auther place :"+ this.author.place);
	}


	public static void main(String[] args) 
	{
		Author author = new Author("surya",25,"India");
		Book obj = new Book("java",500,author);
		obj.bookDetails();
		obj.authorDetails();
	}
}
