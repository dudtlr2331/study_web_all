package step03;

public class Man {
   private String name;
   private String gender;
   private String job;
   private String tell;
   
   
   public Man() {
		this.setName("김준성");
		this.setGender("남자");
		this.setJob("백수");
		this.setTell(null);
  }
   public Man(String name) {
	  this();
	  this.setName(name);
}   
   public Man(String name, String gender) {
	this(name);
	this.setGender(gender);
}
   public Man(String name, String gender, String job) {
	this(name, gender);
	this.setJob(job);
}
   public Man(String name, String gender, String job, String tell) {
	this(name, gender, job);
	this.setTell(tell);
}



public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getGender() {
      return gender;
   }
   public void setGender(String gender) {
      this.gender = gender;
   }
   public String getJob() {
      return job;
   }
   public void setJob(String job) {
      this.job = job;
   }
   public String getTell() {
      return tell;
   }
   public void setTell(String tell) {
      this.tell = tell;
   }
   @Override
   public String toString() {
      return "Man [name=" + name + ", gender=" + gender + ", job=" + job + ", tell=" + tell + "]";
   }
}