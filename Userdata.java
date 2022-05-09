package Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Member_Data")
public class Userdata {
	@Id
	private int lib_no;
	@Column
private String name;
	@Column
private int age;
	@Column
private String email;
	@Column
private long phoneno;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinTable(name="user_book",joinColumns= {@JoinColumn(name=" name")},inverseJoinColumns= {@JoinColumn(name="book_no",nullable=false)})
	private List <BookLib> booklib;
	

	public List<BookLib> getBooklib() {
		return booklib;
	}
	public void setBooklib(List<BookLib> booklib) {
		this.booklib = booklib;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
public int getLib_no() {
		return lib_no;
	}
	public void setLib_no(int lib_no) {
		this.lib_no = lib_no;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(int phoneno) {
	this.phoneno = phoneno;
}

@Override
public String toString() {
	return "Userdata [lib_no=" + lib_no + ", name=" + name + ", age=" + age + ", email=" + email + ", phoneno="
			+ phoneno + "]";
}
public Userdata() {
	super();
	// TODO Auto-generated constructor stub
}

public Userdata(int lib_no, String name, int age, String email, long phoneno) {
	super();
	this.lib_no = lib_no;
	this.name = name;
	this.age = age;
	this.email = email;
	this.phoneno = phoneno;
	//this.booklib = booklib;
}

}
