package Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class BookLib 
{ 
	@Id
	private int book_no;
	@Column
private String Book;
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.MERGE)
	@JoinColumn(name="lib_no")
	private Userdata userdata;
	
	public Userdata getUserdata() {
		return userdata;
	}
	public void setUserdata(Userdata userdata) {
		this.userdata = userdata;
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}

	public String getBook() {
		return Book;
	}
	public void setBook(String book) {
		Book = book;
	}
	
	
	public BookLib(int book_no, String book) {
		super();
		this.book_no = book_no;
		Book = book;
		this.userdata = userdata;
	}
	public BookLib() {
		super();
	
	}
	@Override
	public String toString() {
		return "BookLib [book_no=" + book_no + ", Book=" + Book + ", userdata=" + userdata + "]";
	}
	
	
	
}
