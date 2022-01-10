public class Main {

    public static void main(String[] args) {
        MyService myService = new MyService(); // создаём новый объект MyService из модуля 'service'
        System.out.println(myService.getMyEntity()); // забираем первоначальное значение myEntity из модуля 'db'
        // через сервис 'service'
        System.out.println(myService.setMyEntity(new MyEntity("second"))); // задаём новое значение myEntity
        // в модуле 'db' через сервис 'service'
        System.out.println(myService.getMyEntity()); // забираем результат myEntity из модуля 'db'
        // через сервис 'service'
    }
}