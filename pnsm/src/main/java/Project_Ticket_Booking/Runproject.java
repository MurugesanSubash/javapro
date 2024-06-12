package Project_Ticket_Booking;

public class Runproject {
    
    public static void main(String[] args) {
    Flight_Booking Pas = new Flight_Booking();
    Thread th = new Thread(Pas);
    th.start();

    Thread th1 = new Thread(Pas);
    th1.start();
    
    Thread th2 = new Thread(Pas);
    th2.start();

      // Thread jj = new Thread(){
      //   public void run(){
      //     Flight_Booking.JJJ();
      //   }
      // };
      // jj.setName("df");
      // jj.setPriority(1);
      // jj.start();

      // Thread jj1 = new Thread(){
      //   public void run(){
      //     Flight_Booking.JJJ();
      //   }
      // };
      // jj1.setName("df");
      // jj1.setPriority(10);
      // jj1.start();
      
    }
    
}
