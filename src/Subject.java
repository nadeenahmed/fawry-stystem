
public interface Subject {
User u = new User();
public void addObserver(User u);
public void removeObserver(User u);
public void notifyDiscount(User u);
public boolean notifyRefund();
}
