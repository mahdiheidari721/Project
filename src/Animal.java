public class Animal {
    int X_position;
    int Y_position;
    void RandomWalk(){};
    void Voice(){};
    void WorkToDo(){};
    boolean isLive;
    int SizaInWareHouse;
    int CurrentTime;
    int time;
    int Producttime;
    int Productcurrenttime;

    public int getX_position() {
        return X_position;
    }

    public void setX_position(int x_position) {
        X_position = x_position;
    }

    public int getY_position() {
        return Y_position;
    }

    public void setY_position(int y_position) {
        Y_position = y_position;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public int getSizaInWareHouse() {
        return SizaInWareHouse;
    }

    public void setSizaInWareHouse(int sizaInWareHouse) {
        SizaInWareHouse = sizaInWareHouse;
    }

    public int getCurrentTime() {
        return CurrentTime;
    }

    public void setCurrentTime(int currentTime) {
        CurrentTime = currentTime;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getProducttime() {
        return Producttime;
    }

    public void setProducttime(int producttime) {
        Producttime = producttime;
    }

    public int getProductcurrenttime() {
        return Productcurrenttime;
    }

    public void setProductcurrenttime(int productcurrenttime) {
        Productcurrenttime = productcurrenttime;
    }
    //انهایی که تایم خالی دارند در واقع  نشان دهنده اون تایم اصلی برای انجام دادن سک عملیات هست
    //اونهایی که currrent دارند در واقع نشان دهنده مقدار زمان در لحظه است تا به متغیر time برسد تا یک کاری بکند
     //در اینجا ما یک کلاس بدر به نام Animal  خواهیم داشت و کلیه حیوانات از این کلاس ارث بری می کنند
    //زیر کلاس های این کلاس 3 کلاس هستند و به 3 دسته حیوانات اعلی حیوانات وحشی و حیوانات دفاع کننده از مزرعه تبدیل می شوند
    //و خب  برای حیوان ها متود های حرکت رندم و صدایی که از خودشون در می اورند و کاری که باید انجام بدهند(مثلا مرغ تخم می گذارد و شترمرغ بر ریزی می کند)
    //و دو متغیر سایز در انبار و زنده بودن را هم برای تمامی حیوانات تعریف کردیم
}
