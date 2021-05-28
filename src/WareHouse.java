import java.util.ArrayList;

public class WareHouse {
    int Level;
  static final int Capacity = 200;
    int AllCapacity;
    int AvailabeCapacity;
    ArrayList<Product> Product=new ArrayList<>();
    ArrayList<Animal> Animal=new ArrayList<>();
    ArrayList<Product> RecentlySold=new ArrayList<>();
    boolean CanSellOrStore(){
        return true;
    }
    void Sell(){};
}
//این کلاس کلاس انبار ما می باشد و شامل یک سری خصوصیات هست
//خصوصیاتی شامل ظرفیت انبار که از ان بیشتر نمی توان در ان گنجاند
//و خب موقعی هم که انبار پر هست یا موتور فروش در مرحله ظی کردن مسیر هست
//اجازه ورود به انبار داده نیم شود
// و بایستی در ان یک سری متود های فروش گنجانده شود
//و لیستی از محصولات و حیوانات
//تا به محض فروختن یا اضافه کردن انها به انبار تغییرات لازمه را در
//انبار اعمال بکنیم.
