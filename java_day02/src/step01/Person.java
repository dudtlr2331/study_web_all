package step01;

public class Person {
	private String name;
	private int age;
	private char gender;
	private boolean hasAccount;
	private Account account;
	
	Person(String name, int age, char gender){
		this(name,age,gender,false,null);
	}
	Person(String name, int age, char gender,boolean hasAccount,Account account){
		name = this.name;
		age = this.age;
		gender = this.gender;
		hasAccount = this.hasAccount;
		account = this.account;
	}
	
	public String getName(){
		return this.name;
	}
	public void  setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return this.gender;
	}
	public void setGender(char gender) {
		this.gender = gender
	}
	public boolean isHasAccount() {
		return this.hasAccount;
	}
	public void setHasAccount(boolean hasAccount) {
		this.hasAccount = hasAccount;
	}
	public Account setAccount() {
		return this.Account;
	}
	public void setAccount(Account account) {
		this.account
	}
}
