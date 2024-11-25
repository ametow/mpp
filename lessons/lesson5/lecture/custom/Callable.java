package lesson5.lecture.custom;

public interface Callable {
    double getPrise();
    double prise();

    default int gret() {
        return 0;
    }

    static int adf(){
        return 0;
    }
}
