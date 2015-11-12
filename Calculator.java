/**
 * Created by Тарас on 12.11.2015.
 */
public class Calculator {
    private int result;

    //суммируем аргументы
    public  void add (int ... params)
    {
        for (Integer param : params)
            this.result += param;
    }

    //получить результат суммирования
    public  int getResult ()
    {
        return this.result;
    }
    //Очистить результат вычисления
    public void cleanResult()
    {
        this.result = 0;
    }
}
