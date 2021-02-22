package Vehicle;

public class Vehicle {

    String type;

    int max_count;

    int curr_count;

    public Vehicle(String type, int max_count, int curr_count) {
        this.type = type;
        this.max_count = max_count;
        this.curr_count = curr_count;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMax_count() {
        return max_count;
    }

    public void setMax_count(int max_count) {
        this.max_count = max_count;
    }

    public int getCurr_count() {
        return curr_count;
    }

    public void setCurr_count(int curr_count) {
        this.curr_count = curr_count;
    }
}
