package webapp.todo;

import java.util.Date;

import javax.validation.constraints.Size;

public class Todo {

  private int id;
  private String user;

  @Size(min = 6, message = "Enter at least 6 characters.")
  private String desc;
  private String name;
  private String category;
  private Date targetDate;
  private boolean isDone;



  public Todo(int id, String user, String desc, String name, String category, Date targetDate,
      boolean isDone) {
    super();
    this.id = id;
    this.user = user;
    this.desc = desc;
    this.name = name;
    this.category = category;
    this.targetDate = targetDate;
    this.isDone = isDone;
  }

  /**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return the user
   */
  public String getUser() {
    return user;
  }

  /**
   * @param user the user to set
   */
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * @return the desc
   */
  public String getDesc() {
    return desc;
  }

  /**
   * @param desc the desc to set
   */
  public void setDesc(String desc) {
    this.desc = desc;
  }

  /**
   * @return the targetDate
   */
  public Date getTargetDate() {
    return targetDate;
  }

  /**
   * @param targetDate the targetDate to set
   */
  public void setTargetDate(Date targetDate) {
    this.targetDate = targetDate;
  }

  /**
   * @return the isDone
   */
  public boolean isDone() {
    return isDone;
  }

  /**
   * @param isDone the isDone to set
   */
  public void setDone(boolean isDone) {
    this.isDone = isDone;
  }

  public Todo(String name, String category) {
    super();
    this.name = name;
    this.category = category;
  }

  public Todo() {
    // TODO Auto-generated constructor stub
    super();
    this.id = 0;
    this.user = "defaultUser";
    this.desc = "defaultDesc";
    this.name = "defaultName";
    this.category = "defaultCategory";
    this.targetDate = new Date();
    this.isDone = false;
  }

  public String getName() {
    return name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setName(String name) {
    this.name = name;
  }



  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return String.format(
        "Todo [id=%s, user=%s, desc=%s, name=%s, category=%s, targetDate=%s, isDone=%s]", id, user,
        desc, name, category, targetDate, isDone);
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Todo other = (Todo) obj;
    if (id != other.id)
      return false;
    return true;
  }



}
