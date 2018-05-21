package initAndCleanup;

/**
 * Created by H.J
 * 2018/5/21
 * 终结条件
 */
class Book{
    private boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }
    void checkIn(){
        checkedOut = false;
    }
    protected void finalize() throws Throwable {
        if(checkedOut){
            System.out.println("Error : checked out");
            super.finalize();
        }
    }
}

public class TerminationCondition {
    public static void main(String[] args){
        Book novel = new Book(true);

        novel.checkIn();

        new Book(true);

        System.gc();

    }
}
