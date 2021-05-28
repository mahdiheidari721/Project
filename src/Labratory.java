public class Labratory {
    int X_Positin;
    int Y_Position;
    int Level;
    void WorkToDo(){};
    void TimeToDo(){};
    int Time;
    int CurrentTime;
    boolean IsBuyed;
    boolean Active;
    int InitialPrice(){
        return this.Level;
    }

    public int getX_Positin() {
        return X_Positin;
    }

    public void setX_Positin(int x_Positin) {
        X_Positin = x_Positin;
    }

    public int getY_Position() {
        return Y_Position;
    }

    public void setY_Position(int y_Position) {
        Y_Position = y_Position;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }

    public int getCurrentTime() {
        return CurrentTime;
    }

    public void setCurrentTime(int currentTime) {
        CurrentTime = currentTime;
    }

    public boolean isBuyed() {
        return IsBuyed;
    }

    public void setBuyed(boolean buyed) {
        IsBuyed = buyed;
    }
}
//این کلاس در واقع تمامی کلاس های لابراتوری را شامل می شود
// و تمام لابراتوری ها فیلد ها و متود های خود را
//از این کلاس به ارث می برند
//هر کلاس یه ورودی دارد یک خروحی و یک تایم انجام دادن آن عمل
//و هر لابراتوری یک لول و قیمت اولیه نیز دارد
