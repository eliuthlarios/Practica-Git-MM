public class Mamals {
    private String Name;
    private int MonthsOfLactancy;

    public String getName() {//getter
        return Name;
    }

    public void setName(String Name) {//setter
        this.Name = Name;
    }

    public int getMonthsOfLactancy() {//getter
        return MonthsOfLactancy;
    }

    public void setMonthsOfLactancy(int MonthsOfLactancy) {//setter
        this.MonthsOfLactancy = MonthsOfLactancy;
    }

    public Mamals(String Name, int MonthsOfLactancy) {//Constructor
        this.Name = Name;
        this.MonthsOfLactancy = MonthsOfLactancy;
    }

    public void Attack() {
        System.out.println("Im atacking");
    }


}