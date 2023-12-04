package homework35.task01;

public class Main {

  public static void main(String[] args) {
    LightBulb lightBulb = new LightBulb(5070894, "Bosch", 800,
        100, true, 15);
     //  Получаем информацию о лампочке
    System.out.println("Bar code: " + lightBulb.getBarCode());
    System.out.println("Manufacturer: " + lightBulb.getManufacturer());
    System.out.println("Brightness: " + lightBulb.getBrightness() + " lumens");
    System.out.println("Power: " + lightBulb.getPower() + " watts");
    System.out.println("Supports RGB: " + lightBulb.isRgb());
    System.out.println("Price: " +lightBulb.getPrice() + " $");

    lightBulb.setPrice(9.99);
    System.out.println("New price: " + lightBulb.getPrice() + "$");
  }
}
//Техническое Задание (ТЗ) для класса LightBulb:

//Название класса: LightBulb.

//Поля класса:

//barCode (тип String) - для хранения штрих-кода лампочки.
//manufacturer (тип String) - для хранения производителя лампочки.
//brightness (тип int) - для хранения яркости лампочки.
//rgb (тип boolean) - для отметки наличия поддержки RGB.
//price (тип double) - для хранения цены лампочки.
//Методы класса:

//Конструктор LightBulb с параметрами (barCode, manufacturer, brightness, rgb, price),
// инициализирующий объект класса.
//getPrice - возвращает цену лампочки.
//setPrice - устанавливает новую цену лампочки.
//getBarCode - возвращает штрих-код лампочки.
//setBarCode - устанавливает новый штрих-код лампочки.
//getManufacturer - возвращает производителя лампочки.
//getBrightness - возвращает яркость лампочки.
//isRgb - возвращает значение, указывающее наличие поддержки RGB.
//Краткое описание класса:

//Класс LightBulb представляет информацию о лампочке.
//Используется для хранения и управления основными характеристиками лампочки, такими как штрих-код,
// производитель, яркость, наличие поддержки RGB и цена.
//Основное использование:

//Класс LightBulb может быть использован в приложениях для умного дома,
// магазинных системах учета товаров, управления освещением и в других программных решениях,
// где требуется работа с информацией о лампочках.
//Пример использования:

//Создание объекта LightBulb с заданными параметрами, доступ к его свойствам и методам для
// получения и изменения информации о лампочке.
//Техническое задание содержит описание полей класса, их типы данных, доступные методы и их
// назначение, общее описание класса и его предполагаемое использование. Это руководство поможет
// другому человеку создать аналогичный класс LightBulb, следуя предоставленной спецификации.
