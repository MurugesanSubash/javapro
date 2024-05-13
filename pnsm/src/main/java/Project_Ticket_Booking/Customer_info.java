package Project_Ticket_Booking;

public class Customer_info extends Flight_Info {

    public static Customer_info vVV;
    private String Name;
    private String ID_No;
    private int Age;
    private float time;
    private String Starting;
    private String Ending;
    private int Money;
    private String Status= "Pending";
    public Customer_info (String Name,String ID_No, int Age,float time,String Starting ,String Ending,int Money){
        this.Name = Name;
        this.ID_No = ID_No;
        this.Age=Age;
        this.time=time;
        this.Starting =Starting;
        this.Ending = Ending;
        this.Money =Money;
    }
    public String toString() {
        return "Name = " + Name + ", ID_No = " + ID_No + ", Age = " + Age + ", Fight time = " +time+ "|----> Travelling from "+ Starting + " To " + Ending + "|---->> Payment Status " +Status+"|---->> Prize "+ Money+"";
    }
    
    public int getMoney() {
        return Money;
    }
    public void setMoney(int money) {
        Money = money;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public float getTime() {
        return time;
    }
    public void setTime(float time) {
        this.time = time;
    }
    public String getStarting() {
        return Starting;
    }
    public void setStarting(String starting) {
        Starting = starting;
    }
    public String getEnding() {
        return Ending;
    }
    public void setEnding(String ending) {
        Ending = ending;
    }
    public String getName() {
        return Name;
    }
    public  void setName(String name) {
        Name = name;
    }
    public String getID_No() {
        return ID_No;
    }
    public void setID_No(String iD_No) {
        ID_No = iD_No;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    
}
